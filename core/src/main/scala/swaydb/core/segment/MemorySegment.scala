/*
 * Copyright (c) 2019 Simer Plaha (@simerplaha)
 *
 * This file is a part of SwayDB.
 *
 * SwayDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * SwayDB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with SwayDB. If not, see <https://www.gnu.org/licenses/>.
 */

package swaydb.core.segment

import bloomfilter.mutable.BloomFilter
import com.typesafe.scalalogging.LazyLogging
import java.nio.file.Path
import java.util.concurrent.ConcurrentSkipListMap
import java.util.function.Consumer
import scala.collection.JavaConverters._
import scala.concurrent.duration.Deadline
import swaydb.core.data.Memory.{Group, SegmentResponse}
import swaydb.core.data._
import swaydb.core.function.FunctionStore
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.level.PathsDistributor
import swaydb.core.queue.{FileLimiter, FileLimiterItem, KeyValueLimiter}
import swaydb.core.segment.merge.SegmentMerger
import swaydb.core.util._
import swaydb.data.{IO, MaxKey}
import swaydb.data.IO._
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice

private[segment] case class MemorySegment(path: Path,
                                          minKey: Slice[Byte],
                                          maxKey: MaxKey[Slice[Byte]],
                                          segmentSize: Int,
                                          removeDeletes: Boolean,
                                          _hasRange: Boolean,
                                          _hasPut: Boolean,
                                          //only Memory Segment's need to know if there is a Group. Persistent Segments always get floor from cache when reading.
                                          _hasGroup: Boolean,
                                          private[segment] val cache: ConcurrentSkipListMap[Slice[Byte], Memory],
                                          bloomFilter: Option[BloomFilter[Slice[Byte]]],
                                          nearestExpiryDeadline: Option[Deadline])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                                                   timeOrder: TimeOrder[Slice[Byte]],
                                                                                   functionStore: FunctionStore,
                                                                                   groupingStrategy: Option[KeyValueGroupingStrategyInternal],
                                                                                   keyValueLimiter: KeyValueLimiter,
                                                                                   fileLimiter: FileLimiter) extends Segment with LazyLogging {

  @volatile private var deleted = false

  import keyOrder._

  /**
    * Adds the new Group to the queue only if it is not already in the Queue.
    *
    * This function is always invoked before reading the Group itself therefore if the header is not already
    * populated, it means that this is a newly fetched/decompressed Group and should be added to the [[keyValueLimiter]].
    *
    * [[keyValueLimiter]] never removes [[Memory.Group]] key-value but instead uncompressed and re-adds them to the skipList.
    */
  private def addToQueueMayBe(group: Memory.Group): IO[Unit] =
  //if the header is already decompressed then this Group is already in the Limit queue as the queue always
  //pre-reads the header
    if (group.isHeaderDecompressed)
      IO.unit
    else //else this is a new decompression, add to queue.
      keyValueLimiter.add(group, cache)

  override def put(newKeyValues: Slice[KeyValue.ReadOnly],
                   minSegmentSize: Long,
                   bloomFilterFalsePositiveRate: Double,
                   compressDuplicateValues: Boolean,
                   targetPaths: PathsDistributor)(implicit idGenerator: IDGenerator): IO[Slice[Segment]] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      getAll() flatMap {
        currentKeyValues =>
          SegmentMerger.merge(
            newKeyValues = newKeyValues,
            oldKeyValues = currentKeyValues,
            minSegmentSize = minSegmentSize,
            forInMemory = true,
            isLastLevel = removeDeletes,
            bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
            compressDuplicateValues = compressDuplicateValues
          ) flatMap {
            splits =>
              splits.mapIO[Segment](
                ioBlock =
                  keyValues => {
                    Segment.memory(
                      path = targetPaths.next.resolve(idGenerator.nextSegmentID),
                      keyValues = keyValues,
                      bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
                      removeDeletes = removeDeletes
                    )
                  },

                recover =
                  (segments: Slice[Segment], _: IO.Failure[Iterable[Segment]]) =>
                    segments foreach {
                      segmentToDelete =>
                        segmentToDelete.delete onFailureSideEffect {
                          exception =>
                            logger.error(s"{}: Failed to delete Segment '{}' in recover due to failed put", path, segmentToDelete.path, exception)
                        }
                    }
              )
          }
      }

  override def refresh(minSegmentSize: Long,
                       bloomFilterFalsePositiveRate: Double,
                       compressDuplicateValues: Boolean,
                       targetPaths: PathsDistributor)(implicit idGenerator: IDGenerator): IO[Slice[Segment]] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      getAll() flatMap {
        currentKeyValues =>
          SegmentMerger.split(
            keyValues = currentKeyValues,
            minSegmentSize = minSegmentSize,
            forInMemory = true,
            isLastLevel = removeDeletes,
            bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
            compressDuplicateValues = compressDuplicateValues
          ) flatMap {
            splits =>
              splits.mapIO[Segment](
                ioBlock =
                  keyValues =>
                    Segment.memory(
                      path = targetPaths.next.resolve(idGenerator.nextSegmentID),
                      keyValues = keyValues,
                      bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
                      removeDeletes = removeDeletes
                    ),

                recover =
                  (segments: Slice[Segment], _: IO.Failure[Iterable[Segment]]) =>
                    segments foreach {
                      segmentToDelete =>
                        segmentToDelete.delete onFailureSideEffect {
                          exception =>
                            logger.error(s"{}: Failed to delete Segment '{}' in recover due to failed put", path, segmentToDelete.path, exception)
                        }
                    }
              )
          }
      }

  override def copyTo(toPath: Path): IO[Path] =
    IO.Failure(IO.Error.Fatal(SegmentException.CannotCopyInMemoryFiles(path)))

  override def getFromCache(key: Slice[Byte]): Option[KeyValue.ReadOnly] =
    Option(cache.get(key))

  /**
    * Basic get does not perform floor checks on the cache which are only required if the Segment contains
    * range or groups.
    */
  private def doBasicGet(key: Slice[Byte]): IO[Option[Memory.SegmentResponse]] =
    Option(cache.get(key)) map {
      case response: Memory.SegmentResponse =>
        IO.Success(Some(response))
      case _: Memory.Group =>
        IO.Failure(new Exception("Get resulted in a Group when floorEntry should've fetched the Group instead."))
    } getOrElse {
      IO.none
    }

  override def get(key: Slice[Byte]): IO[Option[Memory.SegmentResponse]] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))

    else if (!_hasRange && !bloomFilter.forall(_.mightContain(key)))
      IO.none
    else
      maxKey match {
        case MaxKey.Fixed(maxKey) if key > maxKey =>
          IO.none

        case range: MaxKey.Range[Slice[Byte]] if key >= range.maxKey =>
          IO.none

        case _ =>
          if (_hasRange || _hasGroup)
            Option(cache.floorEntry(key)).map(_.getValue) match {
              case Some(range: Memory.Range) if range contains key =>
                IO.Success(Some(range))

              case Some(group: Memory.Group) if group contains key =>
                addToQueueMayBe(group) flatMap {
                  _ =>
                    group.segmentCache.get(key) flatMap {
                      case Some(persistent) =>
                        persistent.toMemoryResponseOption()

                      case None =>
                        IO.none
                    }
                }

              case _ =>
                doBasicGet(key)

            }
          else
            doBasicGet(key)
      }

  def mightContain(key: Slice[Byte]): IO[Boolean] =
    IO(bloomFilter.forall(_.mightContain(key)))

  override def lower(key: Slice[Byte]): IO[Option[Memory.SegmentResponse]] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      Option(cache.lowerEntry(key)) map {
        entry =>
          entry.getValue match {
            case response: Memory.SegmentResponse =>
              IO.Success(Some(response))
            case group: Memory.Group =>
              addToQueueMayBe(group) flatMap {
                _ =>
                  group.segmentCache.lower(key) flatMap {
                    case Some(persistent) =>
                      persistent.toMemoryResponseOption()
                    case None =>
                      IO.none
                  }
              }
          }
      } getOrElse {
        IO.none
      }

  /**
    * Basic get does not perform floor checks on the cache which are only required if the Segment contains
    * range or groups.
    */
  private def doBasicHigher(key: Slice[Byte]): IO[Option[Memory.SegmentResponse]] =
    Option(cache.higherEntry(key)).map(_.getValue) map {
      case response: Memory.SegmentResponse =>
        IO.Success(Some(response))
      case group: Memory.Group =>
        group.segmentCache.higher(key) flatMap {
          case Some(persistent) =>
            persistent.toMemoryResponseOption()
          case None =>
            IO.none
        }
    } getOrElse {
      IO.none
    }

  def floorHigherHint(key: Slice[Byte]): IO[Option[Slice[Byte]]] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      hasPut map {
        hasPut =>
          if (hasPut)
            if (key < minKey)
              Some(minKey)
            else if (key < maxKey.maxKey)
              Some(key)
            else
              None
          else
            None
      }

  override def higher(key: Slice[Byte]): IO[Option[Memory.SegmentResponse]] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else if (_hasRange || _hasGroup)
      Option(cache.floorEntry(key)).map(_.getValue) map {
        case floorRange: Memory.Range if floorRange contains key =>
          IO.Success(Some(floorRange))

        case floorGroup: Memory.Group if floorGroup containsHigher key =>
          addToQueueMayBe(floorGroup) flatMap {
            _ =>
              floorGroup.segmentCache.higher(key) flatMap {
                case Some(persistent) =>
                  persistent.toMemoryResponseOption()
                case None =>
                  IO.none
              } flatMap {
                higher =>
                  //Group's last key-value can be inclusive or exclusive and fromKey & toKey can be the same.
                  //So it's hard to know if the Group contain higher therefore a basicHigher is required if group returns None for higher.
                  if (higher.isDefined)
                    IO.Success(higher)
                  else
                    doBasicHigher(key)
              }
          }
        case _ =>
          doBasicHigher(key)
      } getOrElse {
        doBasicHigher(key)
      }
    else
      doBasicHigher(key)

  override def getAll(addTo: Option[Slice[KeyValue.ReadOnly]] = None): IO[Slice[KeyValue.ReadOnly]] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      IO {
        val slice = addTo getOrElse Slice.create[KeyValue.ReadOnly](cache.size())
        cache.values() forEach {
          new Consumer[Memory] {
            override def accept(value: Memory): Unit =
              slice add value
          }
        }
        slice
      }

  override def delete: IO[Unit] = {
    //cache should not be cleared.
    logger.trace(s"{}: DELETING FILE", path)
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      IO.Success {
        deleted = true
      }
  }

  override val close: IO[Unit] =
    IO.unit

  override def getBloomFilterKeyValueCount(): IO[Int] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      cache.values().asScala.foldLeftIO(0) {
        case (count, keyValue) =>
          keyValue match {
            case _: SegmentResponse =>
              IO.Success(count + 1)
            case group: Group =>
              group.header() map (count + _.bloomFilterItemsCount)
          }
      }

  override def getHeadKeyValueCount(): IO[Int] =
    if (deleted)
      IO.Failure(IO.Error.NoSuchFile(path))
    else
      IO.Success(cache.size())

  override def isOpen: Boolean =
    !deleted

  override def isFileDefined: Boolean =
    !deleted

  override def memory: Boolean =
    true

  override def persistent: Boolean =
    false

  override def existsOnDisk: Boolean =
    false

  override def getBloomFilter: IO[Option[BloomFilter[Slice[Byte]]]] =
    IO(bloomFilter)

  override def hasRange: IO[Boolean] =
    IO(_hasRange)

  override def hasPut: IO[Boolean] =
    IO(_hasPut)

  override def isFooterDefined: Boolean =
    !deleted

  override def deleteSegmentsEventually: Unit =
    fileLimiter.delete(this)
}
