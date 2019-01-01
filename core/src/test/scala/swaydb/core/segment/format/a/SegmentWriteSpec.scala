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

import java.nio.file._

import swaydb.configs.level.DefaultGroupingStrategy
import swaydb.core.data.Transient.Remove
import swaydb.core.data.Value.{FromValue, RangeValue}
import swaydb.core.data.{Memory, Value, _}
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.io.file.DBFile
import swaydb.core.io.reader.Reader
import swaydb.core.level.PathsDistributor
import swaydb.core.map.serializer.RangeValueSerializers._
import swaydb.core.queue.{KeyValueLimiter, SegmentOpenLimiter}
import swaydb.core.segment.SegmentException.CannotCopyInMemoryFiles
import swaydb.core.segment.format.a.{SegmentReader, SegmentWriter}
import swaydb.core.segment.merge.SegmentMerger
import swaydb.core.util.FileUtil._
import swaydb.core.util._
import swaydb.core.{TestBase, TestLimitQueues}
import swaydb.data.config.Dir
import swaydb.data.segment.MaxKey
import swaydb.data.segment.MaxKey.{Fixed, Range}
import swaydb.data.slice.Slice
import swaydb.data.util.StorageUnits._
import swaydb.data.order.KeyOrder
import swaydb.serializers.Default._
import swaydb.serializers._

import scala.collection.JavaConverters._
import scala.concurrent.duration._
import scala.util.{Random, Try}

//@formatter:off
class SegmentWriteSpec0 extends SegmentWriteSpec

class SegmentWriteSpec1 extends SegmentWriteSpec {
  override def levelFoldersCount = 10
  override def mmapSegmentsOnWrite = true
  override def mmapSegmentsOnRead = true
  override def level0MMAP = true
  override def appendixStorageMMAP = true
}

class SegmentWriteSpec2 extends SegmentWriteSpec {
  override def levelFoldersCount = 10
  override def mmapSegmentsOnWrite = false
  override def mmapSegmentsOnRead = false
  override def level0MMAP = false
  override def appendixStorageMMAP = false
}

class SegmentWriteSpec3 extends SegmentWriteSpec {
  override def inMemoryStorage = true
}
//@formatter:on

sealed trait SegmentWriteSpec extends TestBase with Benchmark {

  val keyValuesCount = 100

  implicit override val groupingStrategy: Option[KeyValueGroupingStrategyInternal] =
    randomCompressionOption(keyValuesCount)

  override implicit val keyOrder: KeyOrder[Slice[Byte]] = KeyOrder.default

  //  override def deleteFiles = false

  implicit val fileOpenLimiterImplicit: DBFile => Unit = TestLimitQueues.fileOpenLimiter
  implicit val keyValueLimiterImplicit: KeyValueLimiter = TestLimitQueues.keyValueLimiter

  "Segment" should {

    "create a Segment" in {
      assertOnSegment(
        keyValues = randomizedIntKeyValues(keyValuesCount).toMemory,

        assertionWithKeyValues =
          (keyValues, segment) => {
            assertReads(keyValues, segment)
            segment.minKey shouldBe keyValues.head.key
            segment.maxKey shouldBe {
              keyValues.last match {
                case _: Memory.Fixed =>
                  MaxKey.Fixed(keyValues.last.key)

                case group: Memory.Group =>
                  group.maxKey

                case range: Memory.Range =>
                  MaxKey.Range(range.fromKey, range.toKey)
              }
            }

            //ensure that min and max keys are slices
            segment.minKey.underlyingArraySize shouldBe 4
            segment.maxKey match {
              case Fixed(maxKey) =>
                maxKey.underlyingArraySize shouldBe 4

              case Range(fromKey, maxKey) =>
                fromKey.underlyingArraySize shouldBe 4
                maxKey.underlyingArraySize shouldBe 4
            }

            if (segment.getBloomFilter.assertGetOpt.isDefined)
              keyValues foreach {
                keyValue =>
                  segment.getBloomFilter.assertGet.mightContain(keyValue.key) shouldBe true
              }

            segment.close.assertGet
          }
      )
    }

    "set minKey & maxKey to be Fixed if the last key-value is a Fixed key-value" in {
      assertOnSegment(
        keyValues =
          Slice(randomRangeKeyValue(1, 10), randomFixedKeyValue(11)),
        assertion =
          segment => {
            segment.minKey shouldBe (1: Slice[Byte])
            segment.maxKey shouldBe MaxKey.Fixed(11)
            segment.close.assertGet
          }
      )
    }

    "set minKey & maxKey to be Range if the last key-value is a Range key-value" in {
      assertOnSegment(
        keyValues = Slice(randomFixedKeyValue(0), randomRangeKeyValue(1, 10)),
        assertion =
          segment => {
            segment.minKey shouldBe (0: Slice[Byte])
            segment.maxKey shouldBe MaxKey.Range(1, 10)
            segment.close.assertGet
          }
      )
    }

    "set minKey & maxKey to be Range if the last key-value is a Group and the Group's last key-value is Range" in {
      assertOnSegment(
        keyValues = Slice(randomFixedKeyValue(0), randomGroup(Slice(randomFixedKeyValue(2), randomRangeKeyValue(5, 10)).toTransient)).toMemory,
        assertion =
          segment => {
            segment.minKey shouldBe (0: Slice[Byte])
            segment.maxKey shouldBe MaxKey.Range(5, 10)
            segment.close.assertGet
          }
      )
    }

    "set minKey & maxKey to be Range if the last key-value is a Group and the Group's last key-value is Fixed" in {
      assertOnSegment(
        keyValues = Slice(randomFixedKeyValue(0), randomGroup(Slice(randomRangeKeyValue(5, 10), randomFixedKeyValue(20)).toTransient)).toMemory,
        assertion =
          segment => {
            segment.minKey shouldBe (0: Slice[Byte])
            segment.maxKey shouldBe MaxKey.Fixed(20)
            segment.close.assertGet
          }
      )
    }

    "set minKey & maxKey to be Range if the last key-value is a Group and the Group's last key-value is also another Group with range last key-Value" in {
      assertOnSegment(
        keyValues = Slice(randomFixedKeyValue(0), randomGroup(Slice(randomFixedKeyValue(2).toTransient, randomGroup(Slice(randomRangeKeyValue(5, 10).toTransient))).updateStats)).toMemory,
        assertion =
          segment => {
            segment.minKey shouldBe (0: Slice[Byte])
            segment.maxKey shouldBe MaxKey.Range(5, 10)
            segment.close.assertGet
          }
      )
    }

    "un-slice Segment's minKey & maxKey and also un-slice cache key-values" in {
      //assert that all key-values added to cache are not sub-slices.
      def assertCacheKeyValuesAreNotSubSlices(segment: Segment) = {
        segment.cache.asScala foreach {
          case (key, value: KeyValue.ReadOnly) =>
            key.underlyingArraySize shouldBe 1

            value match {
              case fixed: Memory.Fixed =>
                fixed match {
                  case Memory.Put(key, value, _, _) =>
                    key.underlyingArraySize shouldBe 1
                    value.foreach(_.underlyingArraySize shouldBe 1)
                  case Memory.Update(key, value, _, _) =>
                    key.underlyingArraySize shouldBe 1
                    value.foreach(_.underlyingArraySize shouldBe 1)

                  case Memory.Remove(key, _, _) =>
                    key.underlyingArraySize shouldBe 1

                }

              case Memory.Range(fromKey, toKey, fromValue, rangeValue) =>
                fromKey.underlyingArraySize shouldBe 1
                toKey.underlyingArraySize shouldBe 1

                fromValue foreach {
                  case Value.Put(value, _, _) =>
                    value.foreach(_.underlyingArraySize shouldBe 1)
                  case Value.Update(value, _, _) =>
                    value.foreach(_.underlyingArraySize shouldBe 1)
                  case Value.Remove(None, _) =>
                    ???
                }

                rangeValue match {
                  case Value.Update(value, _, _) =>
                    value.foreach(_.underlyingArraySize shouldBe 1)
                  case Value.Remove(None, _) =>
                    ???
                }

              case fixed: Persistent.Fixed =>
                fixed match {
                  case Persistent.Put(key, value, _, _, _, _, _, _, _) =>
                    key.underlyingArraySize shouldBe 1
                    fixed.getOrFetchValue.foreach(_.underlyingArraySize shouldBe 1)

                  case Persistent.Update(key, value, _, _, _, _, _, _, _) =>
                    key.underlyingArraySize shouldBe 1
                    fixed.getOrFetchValue.foreach(_.underlyingArraySize shouldBe 1)

                  case Persistent.Remove(key, _, _, _, _, _) =>
                    key.underlyingArraySize shouldBe 1

                }

              case range @ Persistent.Range(fromKey, toKey, _, _, _, _, _, _) =>
                fromKey.underlyingArraySize shouldBe 1
                toKey.underlyingArraySize shouldBe 1
                val (fromValue, rangeValue) = range.fetchFromAndRangeValue.assertGet
                fromValue foreach {
                  case Value.Put(value, _, _) =>
                    value.foreach(_.underlyingArraySize shouldBe 1)

                  case Value.Update(value, _, _) =>
                    value.foreach(_.underlyingArraySize shouldBe 1)

                  case Value.Remove(None, _) =>
                    ???
                }
                rangeValue match {
                  case Value.Update(value, _, _) =>
                    value.foreach(_.underlyingArraySize shouldBe 1)
                  case Value.Remove(None, _) =>
                    ???
                }
            }
        }
      }

      def assertMinAndMaxKeyAreNotSubSlices(segment: Segment) = {
        segment.minKey.underlyingArraySize shouldBe 1
        segment.maxKey match {
          case Fixed(maxKey) =>
            maxKey.underlyingArraySize shouldBe 1

          case Range(fromKey, maxKey) =>
            fromKey.underlyingArraySize shouldBe 1
            maxKey.underlyingArraySize shouldBe 1
        }
      }

      def assertKeyValuesAreSubSlices(keyValues: Slice[Memory],
                                      bytes: Slice[Byte]) =
        keyValues foreach {
          readKeyValue =>
            readKeyValue.key.underlyingArraySize should be > readKeyValue.key.unslice().size
            readKeyValue.key.underlyingArraySize shouldBe bytes.size

            readKeyValue match {
              case Memory.Range(fromKey, toKey, fromValue, rangeValue) =>
                fromKey.underlyingArraySize should be > readKeyValue.key.unslice().size
                fromKey.underlyingArraySize shouldBe bytes.size
              //toKey can be a sliced byte array since its compressed with fromKey.
              //                toKey.underlyingArraySize should be > readKeyValue.key.unslice().size
              //                toKey.underlyingArraySize shouldBe bytes.size
              case _ =>
            }
        }

      def doAssert(keyValues: Slice[KeyValue.WriteOnly]) = {
        val (bytes, _) = SegmentWriter.write(keyValues, 0.1).assertGet

        //read key-values so they are all part of the same byte array.
        val readKeyValues: Slice[Memory] = SegmentReader.readAll(SegmentReader.readFooter(Reader(bytes)).assertGet, Reader(bytes)).assertGet.toMemory

        //assert that readKeyValues keys are sub=slices of original large byte array.
        assertKeyValuesAreSubSlices(readKeyValues, bytes)

        //Create Segment with sub-slice key-values and assert min & maxKey and also check that cached key-values are un-sliced.
        assertOnSegment(
          keyValues = readKeyValues,
          assertion =
            segment => {
              assertMinAndMaxKeyAreNotSubSlices(segment)
              //if Persistent Segment, read all key-values from disk so that they get added to cache.
              if (persistent) assertGet(readKeyValues, segment)
              //assert key-values added to cache are un-sliced
              assertCacheKeyValuesAreNotSubSlices(segment)
            }
        )
      }

      doAssert(Slice(Transient.put("a", "a"), Transient.remove("b"), Transient.Range[FromValue, RangeValue]("c", "d", Some(Value.put("c")), Value.update("d"))).updateStats)
      doAssert(Slice(Transient.put("a", "a"), Transient.Range[FromValue, RangeValue]("b", "d", None, Value.remove(None, None)), Transient.put("e", "e"), Transient.remove("f")).updateStats)
      doAssert(Slice(Transient.put("a", "a"), Transient.put("b", "b"), Transient.put("c", "c"), Transient.Range[FromValue, RangeValue]("d", "z", Some(Value.put("d")), Value.remove(None, None))).updateStats)
      doAssert(Slice(Transient.Range[FromValue, RangeValue]("a", "b", None, Value.update("a")), Transient.put("b", "b"), Transient.put("c", "c"), Transient.Range[FromValue, RangeValue]("d", "z", Some(Value.put("d")), Value.update("d"))).updateStats)
    }

    "not create bloomFilter if the Segment has Remove range key-values and set hasRange to true" in {

      def doAssert(segment: Segment) = {
        segment.getBloomFilter.assertGetOpt shouldBe empty
        segment.hasRange.assertGet shouldBe true
        segment.close.assertGet
      }

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, None, Value.remove(randomDeadlineOption, None))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, Some(Value.remove(None, None)), Value.remove(randomDeadlineOption, None))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, Some(Value.update(None, randomDeadlineOption, None)), Value.remove(randomDeadlineOption, None))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, Some(Value.put(Some(1), randomDeadlineOption, None)), Value.remove(randomDeadlineOption, None))),
        assertion = doAssert(_)
      )

      //group can also have a range key-value which should have the same effect.
      assertOnSegment(
        keyValues = Slice(Memory.put(0), randomGroup(Slice(Memory.Range(1, 10, Some(Value.put(Some(1), randomDeadlineOption, None)), Value.remove(randomDeadlineOption, None))).toTransient).toMemory),
        assertion = doAssert(_)
      )
    }

    "create bloomFilter if the Segment has no Remove range key-values but has update range key-values. And set hasRange to true" in {
      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.put(1, 1), Memory.remove(2, randomDeadlineOption, None)),
        assertion =
          segment => {
            segment.getBloomFilter.assertGetOpt shouldBe defined
            segment.hasRange.assertGet shouldBe false
            segment.close.assertGet
          }
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, None, Value.update(10, randomDeadlineOption))),
        assertion =
          segment => {
            segment.getBloomFilter.assertGetOpt shouldBe defined
            segment.hasRange.assertGet shouldBe true
            segment.close.assertGet
          }
      )

      assertOnSegment(
        keyValues =
          Slice(
            Memory.put(0),
            randomGroup(Slice(Memory.Range(1, 10, Some(Value.put(Some(1), randomDeadlineOption, None)), Value.update(1, randomDeadlineOption))).toTransient).toMemory
          ),
        assertion =
          segment => {
            segment.getBloomFilter.assertGetOpt shouldBe defined
            segment.hasRange.assertGet shouldBe true
            segment.close.assertGet
          }
      )
    }

    "set hasRange to true if the Segment contains Range key-values" in {

      def doAssert(segment: Segment): Unit = {
        segment.hasRange.assertGet shouldBe true
        segment.close.assertGet
      }

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, None, Value.update(10))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, Some(Value.remove(None, None)), Value.update(10))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, Some(Value.put(1)), Value.update(10))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, None, Value.remove(None, None))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, Some(Value.remove(10.seconds.fromNow)), Value.remove(None, None))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(Memory.put(0), Memory.Range(1, 10, Some(Value.put(1)), Value.remove(None, None))),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = randomIntKeyValuesMemory(keyValuesCount, addRandomRemoves = true, addRandomRanges = true, addRandomPutDeadlines = true, addRandomRemoveDeadlines = true),
        assertion = doAssert(_)
      )

      assertOnSegment(
        keyValues = Slice(randomGroup(Slice(Memory.Range(1, 10, Some(Value.put(Some(1), randomDeadlineOption, None)), Value.update(1, randomDeadlineOption))).toTransient).toMemory),
        assertion = doAssert(_)
      )
    }

    "not overwrite a Segment if it already exists" in {
      if (memory) {
        //memory Segments do not check for overwrite. No tests required
      } else {
        val keyValues = randomKeyValues(keyValuesCount)
        val failedKeyValues = randomKeyValues(keyValuesCount, addRandomRemoves = true)
        val segment = TestSegment(keyValues).assertGet

        TestSegment(failedKeyValues, path = segment.path).failed.assertGet shouldBe a[FileAlreadyExistsException]

        //data remained unchanged
        assertReads(keyValues, segment)
        failedKeyValues foreach {
          keyValue =>
            segment.get(keyValue.key).assertGetOpt.isEmpty shouldBe true
        }
        assertBloom(keyValues, segment.getBloomFilter.assertGet)
      }
    }

    "initialise a segment that already exists" in {
      if (memory) {
        //memory Segments cannot re-initialise Segments after shutdown.
      } else {
        val keyValues = randomKeyValues(keyValuesCount, addRandomRemoves = true, addRandomGroups = true)
        val segmentFile = testSegmentFile

        val segment = TestSegment(keyValues, path = segmentFile).assertGet
        val reopenedSegment = segment.reopen

        //ensure that Segments opened for reads and lazily loaded.
        reopenedSegment.isOpen shouldBe false
        reopenedSegment.isFileDefined shouldBe false
        reopenedSegment.isCacheEmpty shouldBe true
        assertReads(keyValues, reopenedSegment)
        reopenedSegment.isOpen shouldBe true
        reopenedSegment.isFileDefined shouldBe true
        reopenedSegment.isCacheEmpty shouldBe false

        assertBloom(keyValues, reopenedSegment.getBloomFilter.assertGet)
      }
    }

    "initialise a segment that already exists but Segment info is unknown" in {
      if (memory) {
        //memory Segments cannot re-initialise Segments after shutdown.
      } else {
        val keyValues = randomizedIntKeyValues(10000)

        val segment = TestSegment(keyValues).assertGet
        val readSegment = Segment(segment.path, Random.nextBoolean(), Random.nextBoolean(), false, true).assertGet

        segment shouldBe readSegment
      }
    }

    "fail initialisation if the segment does not exist" in {
      if (memory) {
        //memory Segments do not get re-initialised
      } else {
        val segment = TestSegment().assertGet
        segment.delete.assertGet

        segment.tryReopen.failed.assertGet shouldBe a[NoSuchFileException]
      }
    }
  }

  "Segment.deleteSegments" should {
    "delete multiple segments" in {
      val segment1 = TestSegment(randomKeyValues(keyValuesCount, addRandomRemoves = true, addRandomRanges = true, addRandomPutDeadlines = true, addRandomRemoveDeadlines = true)).assertGet
      val segment2 = TestSegment(randomIntKeyStringValues(keyValuesCount, addRandomRemoves = true, addRandomRanges = true, addRandomPutDeadlines = true, addRandomRemoveDeadlines = true)).assertGet
      val segment3 = TestSegment(randomIntKeyStringValues(keyValuesCount, addRandomRemoves = true, addRandomRanges = true, addRandomPutDeadlines = true, addRandomRemoveDeadlines = true)).assertGet

      val deleted = Segment.deleteSegments(Seq(segment1, segment2, segment3))
      deleted.assertGet shouldBe 3

      //files should be closed
      segment1.isOpen shouldBe false
      segment2.isOpen shouldBe false
      segment3.isOpen shouldBe false

      segment1.isFileDefined shouldBe false
      segment2.isFileDefined shouldBe false
      segment3.isFileDefined shouldBe false

      segment1.existsOnDisk shouldBe false
      segment2.existsOnDisk shouldBe false
      segment3.existsOnDisk shouldBe false
    }
  }

  "Segment" should {
    "open a closed Segment on read and clear footer" in {
      val keyValues = randomKeyValues(50)
      val segment = TestSegment(keyValues).assertGet

      def close = {
        segment.close.assertGet
        if (levelStorage.persistent) {
          segment.isFileDefined shouldBe false
          segment.isOpen shouldBe false
          segment.isFooterDefined shouldBe false
        }
      }

      def open(keyValue: KeyValue.WriteOnly) = {
        segment.get(keyValue.key).assertGet shouldBe keyValue
        segment.isFileDefined shouldBe true
        segment.isOpen shouldBe true
        segment.isFooterDefined shouldBe true
      }

      keyValues foreach {
        keyValue =>
          close
          open(keyValue)
      }
    }

    "fail read and write operations on a Segment that does not exists" in {
      val keyValues = randomKeyValues(keyValuesCount, addRandomRemoves = true)
      val segment = TestSegment(keyValues).assertGet

      segment.delete.assertGet
      segment.isOpen shouldBe false
      segment.isFileDefined shouldBe false

      segment.existsOnDisk shouldBe false
      segment.get(keyValues.head.key).failed.assertGet shouldBe a[NoSuchFileException]
      segment.put(keyValues.toMemory, 1.mb, 0.1, 10.seconds, true).failed.assertGet shouldBe a[NoSuchFileException]
      segment.refresh(1.mb, 0.1, true).failed.assertGet shouldBe a[NoSuchFileException]
      segment.isOpen shouldBe false
      segment.isFileDefined shouldBe false
    }
  }

  "reopen closed channel for read when closed by LimitQueue" in {
    if (memory) {
      //memory Segments do not get closed via
    } else {
      implicit val segmentOpenLimit = SegmentOpenLimiter(1, 100.millisecond)
      val keyValues = randomizedIntKeyValues(keyValuesCount, addRandomGroups = false)
      val segment1 = TestSegment(keyValues)(keyOrder, keyValueLimiterImplicit, segmentOpenLimit).assertGet

      segment1.getHeadKeyValueCount().assertGet shouldBe keyValues.size
      segment1.isOpen shouldBe true

      //create another segment should close segment 1
      val segment2 = TestSegment(keyValues)(keyOrder, keyValueLimiterImplicit, segmentOpenLimit).assertGet
      segment2.getHeadKeyValueCount().assertGet shouldBe keyValues.size

      eventual(5.seconds) {
        //segment one is closed
        segment1.isOpen shouldBe false
      }
      //read one key value from Segment1 so that it's reopened and added to the cache. This will also remove Segment 2 from cache
      (segment1 get keyValues.head.key).assertGet shouldBe keyValues.head
      segment1.isOpen shouldBe true

      eventual(5.seconds) {
        //segment2 is closed
        segment2.isOpen shouldBe false
      }
    }
  }

  "Segment.delete" should {
    "close the channel and delete the file" in {
      val keyValues = randomizedIntKeyValues(keyValuesCount)
      val segment = TestSegment(keyValues).get
      assertReads(keyValues, segment) //populate the cache

      segment.cacheSize shouldBe keyValues.size
      segment.isFooterDefined shouldBe true //footer is set in-memory

      segment.delete.assertGet
      segment.cacheSize shouldBe keyValues.size //cache is not cleared
      if (persistent) {
        segment.isOpen shouldBe false
        segment.isFooterDefined shouldBe false //on delete in-memory footer is cleared
      }
      segment.existsOnDisk shouldBe false
    }
  }

  "Segment.copyTo" should {
    "copy the segment to a target path without deleting the original" in {
      if (memory) {
        val segment = TestSegment(randomKeyValues()).assertGet
        segment.copyTo(randomFilePath).failed.assertGet shouldBe CannotCopyInMemoryFiles(segment.path)
      } else {
        val keyValues = randomIntKeyStringValues(keyValuesCount, addRandomRemoves = true)
        val keyValuesReadOnly = keyValues

        val segment = TestSegment(keyValues).get
        val targetPath = createRandomIntDirectory.resolve(nextId + s".${Extension.Seg}")

        segment.copyTo(targetPath).assertGet
        segment.existsOnDisk shouldBe true

        val copiedSegment = segment.reopen(targetPath)
        copiedSegment.getAll().assertGet shouldBe keyValuesReadOnly
        copiedSegment.path shouldBe targetPath

        //original segment should still exist
        segment.getAll().assertGet shouldBe keyValuesReadOnly
      }
    }
  }

  "Segment.copyToPersist" should {
    "copy the segment and persist it to disk" in {
      val keyValues = randomizedIntKeyValues(keyValuesCount)
      val segment = TestSegment(keyValues).assertGet
      val levelPath = createNextLevelPath
      val segments =
        Segment.copyToPersist(
          segment = segment,
          fetchNextPath = levelPath.resolve(nextSegmentId),
          mmapSegmentsOnRead = levelStorage.mmapSegmentsOnRead,
          mmapSegmentsOnWrite = levelStorage.mmapSegmentsOnWrite,
          compressDuplicateValues = true,
          removeDeletes = false,
          minSegmentSize =
            if (persistent)
              keyValues.last.stats.segmentSize / 10
            else
              keyValues.last.stats.memorySegmentSize / 10,
          bloomFilterFalsePositiveRate = 0.1
        ).assertGet

      if (persistent)
        segments should have size 1
      else
        segments.size should be > 2

      segments.foreach(_.existsOnDisk shouldBe true)
      Segment.getAllKeyValues(0.1, segments).assertGet shouldBe keyValues
    }

    "copy the segment and persist it to disk when remove deletes is true" in {
      val keyValues = randomizedIntKeyValues(keyValuesCount)
      val segment = TestSegment(keyValues).assertGet
      val levelPath = createNextLevelPath

      val segments =
        Segment.copyToPersist(
          segment = segment,
          fetchNextPath = levelPath.resolve(nextSegmentId),
          mmapSegmentsOnRead = levelStorage.mmapSegmentsOnRead,
          mmapSegmentsOnWrite = levelStorage.mmapSegmentsOnWrite,
          removeDeletes = true,
          compressDuplicateValues = true,
          minSegmentSize =
            if (persistent)
              keyValues.last.stats.segmentSize / 10
            else
              keyValues.last.stats.memorySegmentSize / 10,
          bloomFilterFalsePositiveRate = 0.1
        ).assertGet

      segments.foreach(_.existsOnDisk shouldBe true)

      if (persistent)
        unzipGroups(Segment.getAllKeyValues(0.1, segments).assertGet) shouldBe unzipGroups(keyValues) //persistent Segments are simply copied and are not checked for removed key-values.
      else
        unzipGroups(Segment.getAllKeyValues(0.1, segments).assertGet) shouldBe unzipGroups(keyValues).collect { //memory Segments does a split/merge and apply lastLevel rules.
          case keyValue: Transient.Put =>
            keyValue
          case Transient.Range(fromKey, _, _, Some(Value.Put(fromValue, deadline, None)), _, _, _, _) if deadline.forall(_.hasTimeLeft()) =>
            Transient.put(fromKey, fromValue, 0.1, None, deadline, true)
        }.updateStats
    }

    "revert copy if Segment initialisation fails after copy" in {
      val keyValues = randomizedIntKeyValues(keyValuesCount)
      val segment = TestSegment(keyValues).assertGet
      val levelPath = createNextLevelPath
      val nextPath = levelPath.resolve(nextSegmentId)

      Files.createFile(nextPath) //path already taken.

      Segment.copyToPersist(
        segment = segment,
        fetchNextPath = nextPath,
        mmapSegmentsOnRead = levelStorage.mmapSegmentsOnRead,
        mmapSegmentsOnWrite = levelStorage.mmapSegmentsOnWrite,
        removeDeletes = true,
        compressDuplicateValues = true,
        minSegmentSize =
          if (persistent)
            keyValues.last.stats.segmentSize / 10
          else
            keyValues.last.stats.memorySegmentSize / 10,
        bloomFilterFalsePositiveRate = 0.1
      ).failed.assertGet shouldBe a[FileAlreadyExistsException]

      Files.size(nextPath) shouldBe 0
      if (persistent) segment.existsOnDisk shouldBe true //original Segment remains untouched

    }

    "revert copy of Key-values if creating at least one Segment fails" in {
      val keyValues = randomizedIntKeyValues(keyValuesCount).toMemory
      val levelPath = createNextLevelPath
      val nextSegmentId = nextId

      def nextPath = levelPath.resolve(IDGenerator.segmentId(nextId))

      Files.createFile(levelPath.resolve(IDGenerator.segmentId(nextSegmentId + 4))) //path already taken.

      levelStorage.dirs foreach {
        dir =>
          Files.createDirectories(dir.path)
          Try(Files.createFile(dir.path.resolve(IDGenerator.segmentId(nextSegmentId + 4)))) //path already taken.
      }

      val filesBeforeCopy = levelPath.files(Extension.Seg)
      filesBeforeCopy.size shouldBe 1

      Segment.copyToPersist(
        keyValues = keyValues,
        fetchNextPath = nextPath,
        mmapSegmentsOnRead = levelStorage.mmapSegmentsOnRead,
        mmapSegmentsOnWrite = levelStorage.mmapSegmentsOnWrite,
        removeDeletes = false,
        minSegmentSize = keyValues.toTransient.last.stats.segmentSize / 5,
        bloomFilterFalsePositiveRate = 0.1,
        compressDuplicateValues = true

      ).failed.assertGet shouldBe a[FileAlreadyExistsException]

      levelPath.files(Extension.Seg) shouldBe filesBeforeCopy
    }
  }

  "Segment.copyToMemory" should {
    "copy persistent segment and store it in Memory" in {

      val keyValues = randomizedIntKeyValues(keyValuesCount)
      val segment = TestSegment(keyValues).assertGet
      val levelPath = createNextLevelPath
      val segments =
        Segment.copyToMemory(
          segment = segment,
          fetchNextPath = levelPath.resolve(nextSegmentId),
          removeDeletes = false,
          compressDuplicateValues = true,
          minSegmentSize =
            if (persistent)
              keyValues.last.stats.segmentSize / 4
            else
              keyValues.last.stats.memorySegmentSize / 4,
          bloomFilterFalsePositiveRate = 0.1
        ).assertGet

      segments.size should be >= 2 //ensures that splits occurs. Memory Segments do not get written to disk without splitting.

      segments.foreach(_.existsOnDisk shouldBe false)
      Segment.getAllKeyValues(0.1, segments).assertGet shouldBe keyValues
    }

    "copy the segment and persist it to disk when removeDeletes is true" in {
      val keyValues = randomizedIntKeyValues(keyValuesCount)
      val segment = TestSegment(keyValues).assertGet
      val levelPath = createNextLevelPath

      val segments =
        Segment.copyToMemory(
          segment = segment,
          fetchNextPath = levelPath.resolve(nextSegmentId),
          removeDeletes = true,
          compressDuplicateValues = true,
          minSegmentSize = keyValues.last.stats.segmentSize / 20,
          bloomFilterFalsePositiveRate = 0.1
        ).assertGet

      segments.foreach(_.existsOnDisk shouldBe false)

      segments.size should be >= 2 //ensures that splits occurs. Memory Segments do not get written to disk without splitting.

      Segment.getAllKeyValues(0.1, segments).assertGet shouldBe unzipGroups(keyValues).collect {
        case keyValue: Transient.Put =>
          keyValue
        case Transient.Range(fromKey, _, _, Some(Value.Put(fromValue, deadline, None)), _, _, _, _) if deadline.forall(_.hasTimeLeft()) =>
          Transient.put(fromKey, fromValue, 0.1, None, deadline, true)
      }.updateStats
    }

  }

  "Segment.put" should {
    "return None for empty byte arrays for values" in {
      val deadline = 5.seconds.fromNow

      val segment =
        TestSegment(
          Slice(
            Transient.put(1, Slice.empty),
            //without deadline
            Transient.Range[FromValue, RangeValue](2, 3, None, Value.update(Slice.empty)),
            Transient.Range[FromValue, RangeValue](3, 4, Some(Value.put(Slice.empty)), Value.update(Slice.empty)),
            Transient.Range[FromValue, RangeValue](4, 5, Some(Value.remove(None, None)), Value.update(Slice.empty)),
            Transient.Range[FromValue, RangeValue](5, 6, Some(Value.put(Slice.empty)), Value.remove(None, None)),
            //with deadline
            Transient.Range[FromValue, RangeValue](6, 7, None, Value.update(Slice.empty, deadline)),
            Transient.Range[FromValue, RangeValue](7, 8, Some(Value.put(Slice.empty, deadline)), Value.update(Slice.empty, deadline)),
            Transient.Range[FromValue, RangeValue](8, 9, Some(Value.remove(deadline)), Value.update(Slice.empty, deadline)),
            Transient.Range[FromValue, RangeValue](9, 10, Some(Value.put(Slice.empty, deadline)), Value.remove(deadline))
          ).updateStats
        ).assertGet

      segment.get(1).assertGet.getOrFetchValue shouldBe None

      val range2 = segment.get(2).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range2.fetchFromValue.assertGetOpt shouldBe empty
      range2.fetchRangeValue.assertGet shouldBe Value.update(None, None, None)

      val range3 = segment.get(3).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range3.fetchFromValue.assertGet shouldBe Value.put(None, None, None)
      range3.fetchRangeValue.assertGet shouldBe Value.update(None, None, None)

      val range4 = segment.get(4).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range4.fetchFromValue.assertGet shouldBe Value.remove(None, None)
      range4.fetchRangeValue.assertGet shouldBe Value.update(None, None, None)

      val range5 = segment.get(5).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range5.fetchFromValue.assertGet shouldBe Value.put(None, None, None)
      range5.fetchRangeValue.assertGet shouldBe Value.remove(None, None)

      val range6 = segment.get(6).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range6.fetchFromValue.assertGetOpt shouldBe None
      range6.fetchRangeValue.assertGet shouldBe Value.update(None, Some(deadline), None)

      val range7 = segment.get(7).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range7.fetchFromValue.assertGet shouldBe Value.put(None, Some(deadline), None)
      range7.fetchRangeValue.assertGet shouldBe Value.update(None, Some(deadline), None)

      val range8 = segment.get(8).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range8.fetchFromValue.assertGet shouldBe Value.remove(Some(deadline), None)
      range8.fetchRangeValue.assertGet shouldBe Value.update(None, Some(deadline), None)

      val range9 = segment.get(9).assertGet.asInstanceOf[KeyValue.ReadOnly.Range]
      range9.fetchFromValue.assertGet shouldBe Value.put(None, Some(deadline), None)
      range9.fetchRangeValue.assertGet shouldBe Value.remove(deadline)
    }

    "reopen closed channel" in {
      val keyValue1 = Slice(Transient.put(5, Slice(randomBytes(100))))

      val segment = TestSegment(keyValue1).assertGet
      segment.close.assertGet
      if (persistent) segment.isOpen shouldBe false

      val keyValue2 = Slice(Memory.put(2, Slice(randomBytes(100))), Memory.put(3, Slice(randomBytes(100))))
      segment.put(keyValue2, 1.mb, 0.1, 10.seconds, true).assertGet
      if (persistent) segment.isOpen shouldBe true
    }

    "return a new segment with merged key values" in {
      val keyValues = Slice(Transient.put(1, 1))
      val segment = TestSegment(keyValues).assertGet

      val newKeyValues = Slice(Memory.put(2, 2))
      val newSegments = segment.put(newKeyValues, 4.mb, 0.1, 10.seconds, true).assertGet
      newSegments should have size 1

      val allReadKeyValues = Segment.getAllKeyValues(0.1, newSegments).assertGet

      val expectedKeyValues = SegmentMerger.merge(newKeyValues, keyValues.toMemory, 1.mb, false, forInMemory = memory, 0.1, true).assertGet
      expectedKeyValues should have size 1

      allReadKeyValues shouldBe expectedKeyValues.head
    }

    "return multiple new segments with merged key values" in {
      val keyValues = randomizedIntKeyValues(10000)
      val segment = TestSegment(keyValues).get

      val newKeyValues = randomizedIntKeyValues(10000)
      val newSegments = segment.put(newKeyValues.toMemory, 10.kb, 0.1, 10.seconds, true).assertGet
      newSegments.size should be > 1

      val allReadKeyValues = Segment.getAllKeyValues(0.1, newSegments).assertGet

      //give merge a very large size so that there are no splits (test convenience)
      val expectedKeyValues = SegmentMerger.merge(newKeyValues.toMemory, keyValues.toMemory, 10.mb, false, forInMemory = memory, 0.1,true).assertGet
      expectedKeyValues should have size 1

      //allReadKeyValues are read from multiple Segments so valueOffsets will be invalid so stats will be invalid
      allReadKeyValues shouldBe expectedKeyValues.head
    }

    "fail put and delete partially written batch Segments if there was a failure in creating one of them" in {
      if (memory) {
        // not for in-memory Segments
      } else {

        val keyValues = randomIntKeyStringValues(keyValuesCount)
        val segment = TestSegment(keyValues).get
        val newKeyValues = randomKeyValues(10000)

        val tenthSegmentId = {
          val segmentId = (segment.path.fileId.get._1 + 10).toSegmentFileId
          segment.path.getParent.resolve(segmentId)
        }

        //create a segment with the next id in sequence which should fail put with FileAlreadyExistsException
        val segmentToFailPut = TestSegment(path = tenthSegmentId).assertGet

        segment.put(newKeyValues.toMemory, 1.kb, 0.1, 10.seconds, true).failed.assertGet shouldBe a[FileAlreadyExistsException]

        //the folder should contain only the original segment and the segmentToFailPut
        segment.path.getParent.files(Extension.Seg) should contain only(segment.path, segmentToFailPut.path)
      }
    }

    "return new segment with deleted KeyValues if all keys were deleted and removeDeletes is false" in {
      val keyValues = Slice(
        Transient.put(1),
        Transient.put(2),
        Transient.put(3),
        Transient.put(4),
        Transient.Range[FromValue, RangeValue](5, 10, None, randomRangeValue())
      ).updateStats
      val segment = TestSegment(keyValues, removeDeletes = false).assertGet
      assertGet(keyValues, segment)

      val deleteKeyValues = Slice(Memory.remove(1), Memory.remove(2), Memory.remove(3), Memory.remove(4), Memory.Range(5, 10, None, Value.remove(None, None)))

      val deletedSegment = segment.put(deleteKeyValues, 4.mb, 0.1, 10.seconds, true).assertGet
      deletedSegment should have size 1
      val newDeletedSegment = deletedSegment.head
      unzipGroups(newDeletedSegment.getAll().assertGet) shouldBe deleteKeyValues

      assertGet(keyValues, segment)
      if (persistent) assertGet(keyValues, segment.reopen)
    }

    "return new segment with updated KeyValues if all keys values were updated to None" in {
      val keyValues = randomizedIntKeyValues(count = keyValuesCount, addRandomGroups = false)
      val segment = TestSegment(keyValues, removeDeletes = true).assertGet

      val updatedKeyValues = Slice.create[Memory](keyValues.size)
      keyValues.foreach(keyValue => updatedKeyValues add Memory.put(keyValue.key))

      val updatedSegments = segment.put(updatedKeyValues, 4.mb, 0.1, 10.seconds, true).assertGet
      updatedSegments should have size 1

      val newUpdatedSegment = updatedSegments.head
      unzipGroups(newUpdatedSegment.getAll().assertGet) shouldBe updatedKeyValues

      assertGet(updatedKeyValues, newUpdatedSegment)
    }

    "merge existing segment file with new KeyValues returning new segment file with updated KeyValues" in {
      val keyValues1 = randomKeyValues(count = 10)
      val segment1 = TestSegment(keyValues1).assertGet

      val keyValues2 = Slice.create[KeyValue.WriteOnly](10)
      keyValues1 foreach {
        keyValue =>
          keyValues2 add Transient.put(keyValue.key, value = randomInt(), previous = keyValues2.lastOption, falsePositiveRate = 0.1, compressDuplicateValues = true)
      }

      val segment2 = TestSegment(keyValues2).assertGet

      val mergedSegments = segment1.put(segment2.getAll().assertGet.toSlice, 4.mb, 0.1, 10.seconds, true).assertGet
      mergedSegments.size shouldBe 1
      val mergedSegment = mergedSegments.head

      //test merged segment should contain all
      keyValues2 foreach {
        keyValue =>
          (mergedSegment get keyValue.key).assertGet shouldBe keyValue
      }

      unzipGroups(mergedSegment.getAll().assertGet).size shouldBe keyValues2.size
    }

    "return no new segments if all the KeyValues in the Segment were deleted and if remove deletes is true" in {
      val keyValues = Slice(Transient.put(1), Transient.put(2), Transient.put(3), Transient.put(4), Transient.Range[FromValue, RangeValue](5, 10, None, Value.update(10))).updateStats
      val segment = TestSegment(keyValues, removeDeletes = true).assertGet

      val deleteKeyValues = Slice.create[Memory](keyValues.size)
      (1 to 4).foreach(key => deleteKeyValues add Memory.remove(key))
      deleteKeyValues add Memory.Range(5, 10, None, Value.remove(None, None))

      segment.put(deleteKeyValues, 4.mb, 0.1, 10.seconds, true).assertGet shouldBe empty
    }

    "slice Put range into slice with fromValue set to Remove" in {
      val keyValues = Slice(Transient.Range[FromValue, RangeValue](1, 10, None, Value.update(10))).updateStats
      val segment = TestSegment(keyValues, removeDeletes = false).assertGet

      val deleteKeyValues = Slice.create[Memory](10)
      (1 to 10).foreach(key => deleteKeyValues add Memory.remove(key))

      val removedRanges = segment.put(deleteKeyValues, 4.mb, 0.1, 10.seconds, true).assertGet.head.getAll().assertGet

      val expected: Seq[Memory] = (1 to 9).map(key => Memory.Range(key, key + 1, Some(Value.remove(None, None)), Value.update(10))) :+ Memory.remove(10)

      removedRanges shouldBe expected
    }

    "return 1 new segment with only 1 key-value if all the KeyValues in the Segment were deleted but 1" in {
      val keyValues = randomKeyValues(count = keyValuesCount)
      val segment = TestSegment(keyValues, removeDeletes = true).assertGet

      val deleteKeyValues = Slice.create[Remove](keyValues.size - 1)
      keyValues.drop(1).foreach(keyValue => deleteKeyValues add Transient.remove(keyValue.key))

      val newSegments = segment.put(deleteKeyValues.toMemory, 4.mb, 0.1, 10.seconds, true).assertGet
      newSegments.size shouldBe 1
      newSegments.head.getHeadKeyValueCount().assertGet shouldBe 1

      val newSegment = newSegments.head
      val keyValue = keyValues.head

      newSegment.get(keyValue.key).assertGet shouldBe keyValue

      newSegment.lower(keyValue.key).assertGetOpt shouldBe empty
      newSegment.higher(keyValue.key).assertGetOpt shouldBe empty
    }

    "distribute new Segments to multiple folders equally" in {
      implicit val groupingStrategy: Option[KeyValueGroupingStrategyInternal] = None

      val keyValues1 = Slice(Transient.put(1, 1), Transient.put(2, 2), Transient.put(3, 3), Transient.put(4, 4), Transient.put(5, 5), Transient.put(6, 6)).updateStats
      val segment = TestSegment(keyValues1).assertGet

      val keyValues2 = Slice(Memory.put(7, 7), Memory.put(8, 8), Memory.put(9, 9), Memory.put(10, 10), Memory.put(11, 11), Memory.put(12, 12))

      val dirs = (1 to 6) map (_ => Dir(createRandomIntDirectory, 1))

      val distributor = PathsDistributor(dirs, () => Seq(segment))
      val segments =
        if (persistent)
          segment.put(keyValues2, 60.bytes, 0.1, 10.seconds, true, distributor).assertGet
        else
          segment.put(keyValues2, 21.bytes, 0.1, 10.seconds, true, distributor).assertGet

      //all returned segments contain all the KeyValues ???
      //      segments should have size 6
      //      segments(0).getAll().assertGet shouldBe keyValues1.slice(0, 1).unslice()
      //      segments(1).getAll().assertGet shouldBe keyValues1.slice(2, 3).unslice()
      //      segments(2).getAll().assertGet shouldBe keyValues1.slice(4, 5).unslice()
      //      segments(3).getAll().assertGet shouldBe keyValues2.slice(0, 1).unslice()
      //      segments(4).getAll().assertGet shouldBe keyValues2.slice(2, 3).unslice()
      //      segments(5).getAll().assertGet shouldBe keyValues2.slice(4, 5).unslice()

      //all the paths are used to write Segments
      segments(0).path.getParent shouldBe dirs(0).path
      segments(1).path.getParent shouldBe dirs(1).path
      segments(2).path.getParent shouldBe dirs(2).path
      segments(3).path.getParent shouldBe dirs(3).path
      segments(4).path.getParent shouldBe dirs(4).path

      //all paths are used ???
      //      distributor.queuedPaths shouldBe empty
    }
  }

  "Segment.refresh" should {
    "return new Segment with Removed key-values removed" in {
      if (persistent) {
        val keyValues1 = (1 to 100).map(key => Transient.remove(key)).updateStats
        val segment = TestSegment(keyValues1).assertGet
        segment.getHeadKeyValueCount().assertGet shouldBe keyValues1.size

        val reopened = segment.reopen(segment.path, removeDeletes = true)
        reopened.getHeadKeyValueCount().assertGet shouldBe keyValues1.size
        reopened.refresh(1.mb, 0.1, true).assertGet shouldBe empty
      }
    }

    "return no new Segments if all the key-values in the Segment were expired" in {
      val keyValues1 = (1 to 100).map(key => Transient.put(key, key, 1.second)).updateStats
      val segment = TestSegment(keyValues1, removeDeletes = true).assertGet
      segment.getHeadKeyValueCount().assertGet shouldBe keyValues1.size

      sleep(3.seconds)
      segment.refresh(1.mb, 0.1, true).assertGet shouldBe empty
    }

    "return all key-values when removeDeletes is false" in {
      val keyValues1 = (1 to 100).map(key => Transient.put(key, key, 1.second)).updateStats
      val segment = TestSegment(keyValues1, removeDeletes = false).assertGet
      segment.getHeadKeyValueCount().assertGet shouldBe keyValues1.size

      sleep(3.seconds)
      val refresh = segment.refresh(1.mb, 0.1, true).assertGet
      refresh should have size 1
      refresh.head shouldContainAll keyValues1
    }
  }

  "Segment.split & then write" should {
    "succeed for non group key-values" in {
      val keyValues = randomKeyValues(1000)
      val result = SegmentMerger.split(keyValues, 100.mb, false, inMemoryStorage, 0.1, true).assertGet
      result should have size 1
      result.head should have size keyValues.size
      val (bytes, deadline) = SegmentWriter.write(result.head, 0.1).assertGet
      readAll(bytes).assertGet shouldBe keyValues
    }

    "succeed for grouped key-values" in {
      val keyValues = randomKeyValues(1000)
      val result = SegmentMerger.split(
        keyValues = keyValues,
        minSegmentSize = 100.mb,
        isLastLevel = false,
        forInMemory = inMemoryStorage,
        bloomFilterFalsePositiveRate = 0.1,
        compressDuplicateValues = true
      )(keyOrder, Some(KeyValueGroupingStrategyInternal(DefaultGroupingStrategy()))).assertGet
      result should have size 1
      result.head should have size 1

      val (bytes, deadline) = SegmentWriter.write(result.head, 0.1).assertGet
      readAll(bytes).assertGet shouldBe keyValues
    }
  }
}
