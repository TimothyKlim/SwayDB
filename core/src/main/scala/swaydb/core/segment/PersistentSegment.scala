/*
 * Copyright (C) 2018 Simer Plaha (@simerplaha)
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

import java.nio.file.Path
import java.util.concurrent.ConcurrentSkipListMap
import bloomfilter.mutable.BloomFilter
import com.typesafe.scalalogging.LazyLogging
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.data.{Persistent, _}
import swaydb.core.io.file.DBFile
import swaydb.core.io.reader.Reader
import swaydb.core.level.PathsDistributor
import swaydb.core.queue.KeyValueLimiter
import swaydb.core.segment.format.a.{SegmentFooter, SegmentReader}
import swaydb.core.segment.merge.SegmentMerger
import swaydb.core.util.TryUtil._
import swaydb.core.util._
import swaydb.data.config.Dir
import swaydb.data.segment.MaxKey
import swaydb.data.slice.{Reader, Slice}
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.{Deadline, FiniteDuration}
import scala.util.{Failure, Success, Try}
import swaydb.core.function.FunctionStore
import swaydb.data.order.{KeyOrder, TimeOrder}

private[segment] case class PersistentSegment(file: DBFile,
                                              mmapReads: Boolean,
                                              mmapWrites: Boolean,
                                              minKey: Slice[Byte],
                                              maxKey: MaxKey,
                                              segmentSize: Int,
                                              removeDeletes: Boolean,
                                              nearestExpiryDeadline: Option[Deadline])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                                                       timeOrder: TimeOrder[Slice[Byte]],
                                                                                       functionStore: FunctionStore,
                                                                                       keyValueLimiter: KeyValueLimiter,
                                                                                       fileOpenLimiter: DBFile => Unit,
                                                                                       compression: Option[KeyValueGroupingStrategyInternal],
                                                                                       ec: ExecutionContext) extends Segment with LazyLogging {

  def path = file.path

  private[segment] val cache = new ConcurrentSkipListMap[Slice[Byte], Persistent](keyOrder)

  @volatile private[segment] var footer = Option.empty[SegmentFooter]

  val segmentCache =
    new SegmentCache(
      id = file.path.toString,
      maxKey = maxKey,
      minKey = minKey,
      cache = cache,
      unsliceKey = true,
      getFooter = getFooter,
      createReader = () => Try(createReader())
    )

  def close: Try[Unit] =
    file.close map {
      _ =>
        footer = None
    }

  def isOpen: Boolean =
    file.isOpen

  def isFileDefined =
    file.isFileDefined

  private def createReader(): Reader =
    Reader(file)

  def delete: Try[Unit] = {
    logger.trace(s"{}: DELETING FILE", path)
    file.delete() recoverWith {
      case exception =>
        logger.error(s"{}: Failed to delete Segment file.", path, exception)
        Failure(exception)
    } map {
      _ =>
        footer = None
    }
  }

  def copyTo(toPath: Path): Try[Path] =
    file copyTo toPath

  /**
    * Default targetPath is set to this [[PersistentSegment]]'s parent directory.
    */
  def put(newKeyValues: Slice[KeyValue.ReadOnly],
          minSegmentSize: Long,
          bloomFilterFalsePositiveRate: Double,
          hasTimeLeftAtLeast: FiniteDuration,
          compressDuplicateValues: Boolean,
          targetPaths: PathsDistributor = PathsDistributor(Seq(Dir(path.getParent, 1)), () => Seq()))(implicit idGenerator: IDGenerator): Try[Slice[Segment]] =
    getAll() flatMap {
      currentKeyValues =>
        SegmentMerger.merge(
          newKeyValues = newKeyValues,
          oldKeyValues = currentKeyValues,
          minSegmentSize = minSegmentSize,
          forInMemory = false,
          isLastLevel = removeDeletes,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
          compressDuplicateValues = compressDuplicateValues
        ) flatMap {
          splits =>
            splits.tryMap(
              tryBlock =
                keyValues => {
                  Segment.persistent(
                    path = targetPaths.next.resolve(idGenerator.nextSegmentID),
                    mmapReads = mmapReads,
                    mmapWrites = mmapWrites,
                    keyValues = keyValues,
                    bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
                    removeDeletes = removeDeletes
                  )
                },

              recover =
                (segments: Slice[Segment], _: Failure[Slice[Segment]]) =>
                  segments foreach {
                    segmentToDelete =>
                      segmentToDelete.delete.failed foreach {
                        exception =>
                          logger.error(s"{}: Failed to delete Segment '{}' in recover due to failed put", path, segmentToDelete.path, exception)
                      }
                  }
            )
        }
    }

  def refresh(minSegmentSize: Long,
              bloomFilterFalsePositiveRate: Double,
              compressDuplicateValues: Boolean,
              targetPaths: PathsDistributor = PathsDistributor(Seq(Dir(path.getParent, 1)), () => Seq()))(implicit idGenerator: IDGenerator): Try[Slice[Segment]] =
    getAll() flatMap {
      currentKeyValues =>
        SegmentMerger.split(
          keyValues = currentKeyValues,
          minSegmentSize = minSegmentSize,
          forInMemory = false,
          isLastLevel = removeDeletes,
          bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
          compressDuplicateValues = compressDuplicateValues
        ) flatMap {
          splits =>
            splits.tryMap(
              tryBlock =
                keyValues =>
                  Segment.persistent(
                    path = targetPaths.next.resolve(idGenerator.nextSegmentID),
                    mmapReads = mmapReads,
                    mmapWrites = mmapWrites,
                    keyValues = keyValues,
                    bloomFilterFalsePositiveRate = bloomFilterFalsePositiveRate,
                    removeDeletes = removeDeletes
                  ),

              recover =
                (segments: Slice[Segment], _: Failure[Slice[Segment]]) =>
                  segments foreach {
                    segmentToDelete =>
                      segmentToDelete.delete.failed foreach {
                        exception =>
                          logger.error(s"{}: Failed to delete Segment '{}' in recover due to failed refresh", path, segmentToDelete.path, exception)
                      }
                  }
            )
        }
    }

  def getFooter(): Try[SegmentFooter] =
    footer.map(Success(_)) getOrElse {
      SegmentReader.readFooter(createReader()) map {
        segmentFooter =>
          footer = Some(segmentFooter)
          segmentFooter
      }
    }

  override def getBloomFilter: Try[Option[BloomFilter[Slice[Byte]]]] =
    segmentCache.getBloomFilter

  def getFromCache(key: Slice[Byte]): Option[Persistent] =
    segmentCache getFromCache key

  def mightContain(key: Slice[Byte]): Try[Boolean] =
    segmentCache mightContain key

  def get(key: Slice[Byte]): Try[Option[Persistent.SegmentResponse]] =
    segmentCache get key

  def lower(key: Slice[Byte]): Try[Option[Persistent.SegmentResponse]] =
    segmentCache lower key

  def higher(key: Slice[Byte]): Try[Option[Persistent.SegmentResponse]] =
    segmentCache higher key

  def getAll(addTo: Option[Slice[KeyValue.ReadOnly]] = None): Try[Slice[KeyValue.ReadOnly]] =
    segmentCache getAll addTo

  override def hasRange: Try[Boolean] =
    segmentCache.hasRange

  def getHeadKeyValueCount(): Try[Int] =
    segmentCache.getHeadKeyValueCount()

  def getBloomFilterKeyValueCount(): Try[Int] =
    segmentCache.getBloomFilterKeyValueCount()

  override def isFooterDefined: Boolean =
    footer.isDefined

  def existsOnDisk: Boolean =
    file.existsOnDisk

  def memory: Boolean =
    file.memory

  def persistent: Boolean =
    file.persistent

  def existsInMemory: Boolean =
    file.existsInMemory

  def notExistsOnDisk: Boolean =
    !file.existsOnDisk
}
