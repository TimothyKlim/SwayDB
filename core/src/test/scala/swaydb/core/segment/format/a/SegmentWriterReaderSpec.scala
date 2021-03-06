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

package swaydb.core.segment.format.a

import java.util.concurrent.TimeUnit
import scala.concurrent.duration._
import scala.util.Random
import swaydb.core.CommonAssertions._
import swaydb.core.IOAssert._
import swaydb.core.RunThis._
import swaydb.core.TestData._
import swaydb.core.data.Value.{FromValue, RangeValue}
import swaydb.core.data._
import swaydb.core.group.compression.GroupCompressor
import swaydb.core.io.reader.Reader
import swaydb.core.segment.SegmentException.SegmentCorruptionException
import swaydb.core.util.BloomFilterUtil
import swaydb.core.{TestBase, TestData, TestLimitQueues, TestTimer}
import swaydb.data.IO
import swaydb.data.order.KeyOrder
import swaydb.data.slice.Slice
import swaydb.data.util.StorageUnits._
import swaydb.serializers.Default._
import swaydb.serializers._

class SegmentWriterReaderSpec extends TestBase {

  val keyValueCount = 100

  implicit val keyOrder: KeyOrder[Slice[Byte]] = KeyOrder.default
  implicit val keyValueLimiter = TestLimitQueues.keyValueLimiter

  implicit def testTimer: TestTimer = TestTimer.random

  "SegmentWriter" should {

    "writeBloomFilterAndGetNearestDeadline" in {
      runThis(10.times) {
        val keyValues = randomizedKeyValues(keyValueCount)
        val group = randomGroup(keyValues)
        val bloom = BloomFilterUtil.init(keyValues, TestData.falsePositiveRate)
        val deadline = SegmentWriter.writeBloomFilterAndGetNearestDeadline(group, bloom, None)

        if (keyValues.last.stats.hasRemoveRange)
          bloom shouldBe empty
        else
          assertBloom(keyValues, bloom.assertGet)

        deadline shouldBe nearestDeadline(keyValues)
      }
    }

    "convert empty KeyValues and not throw exception but return empty bytes" in {
      val (bytes, nearestDeadline) = SegmentWriter.write(Seq(), TestData.falsePositiveRate).assertGet
      bytes.isEmpty shouldBe true
      nearestDeadline shouldBe empty
    }

    "converting KeyValues to bytes and execute readAll and find on the bytes" in {
      def test(keyValues: Slice[KeyValue.WriteOnly]) = {
        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet
        bytes.isFull shouldBe true
        //in memory
        assertReads(keyValues, Reader(bytes))
        //on disk
        assertReads(keyValues, createFileChannelReader(bytes))
      }

      runThis(100.times) {
        val count = randomIntMax(4) max 1
        val keyValues = randomizedKeyValues(count, addRandomGroups = true)
        if (keyValues.nonEmpty) test(keyValues)
      }
    }

    "write and read a group" in {
      runThis(100.times) {
        val groupKeyValues = randomizedKeyValues(keyValueCount, addRandomGroups = false)
        val group = Transient.Group(groupKeyValues, randomCompression(), randomCompression(), TestData.falsePositiveRate, None).assertGet

        val (bytes, deadline) = SegmentWriter.write(Seq(group), TestData.falsePositiveRate).assertGet
        bytes.isFull shouldBe true

        val allKeyValuesForGroups = readAll(bytes).assertGet.asInstanceOf[Slice[KeyValue.ReadOnly.Group]].flatMap(_.segmentCache.getAll().assertGet)
        allKeyValuesForGroups shouldBe groupKeyValues.toMemory
      }
    }

    "write two sibling groups" in {
      runThis(100.times) {
        val group1KeyValues = randomizedKeyValues(keyValueCount)
        val group1 = Transient.Group(group1KeyValues, randomCompression(), randomCompression(), TestData.falsePositiveRate, None).assertGet

        val group2KeyValues = randomizedKeyValues(keyValueCount, startId = Some(group1.maxKey.maxKey.readInt() + 1))
        val group2 = Transient.Group(group2KeyValues, randomCompression(), randomCompression(), TestData.falsePositiveRate, Some(group1)).assertGet

        val (bytes, deadline) = SegmentWriter.write(Seq(group1, group2), TestData.falsePositiveRate).assertGet
        bytes.isFull shouldBe true

        val allBytes = readAll(bytes).assertGet
        allBytes.isInstanceOf[Slice[KeyValue.ReadOnly.Group]] shouldBe true

        val allKeyValuesForGroups = allBytes.asInstanceOf[Slice[KeyValue.ReadOnly.Group]].flatMap(_.segmentCache.getAll().assertGet)
        allKeyValuesForGroups shouldBe (group1KeyValues ++ group2KeyValues).toMemory
      }
    }

    "write child groups to a root group" in {
      runThis(100.times) {
        val group1KeyValues = randomizedKeyValues(keyValueCount)
        val group1 = Transient.Group(group1KeyValues, randomCompression(), randomCompressionLZ4OrSnappy(Double.MinValue), TestData.falsePositiveRate, None).assertGet

        val group2KeyValues = randomizedKeyValues(keyValueCount, startId = Some(group1.maxKey.maxKey.readInt() + 1))
        val group2 = Transient.Group(group2KeyValues, randomCompressionLZ4OrSnappy(Double.MinValue), randomCompression(), TestData.falsePositiveRate, Some(group1)).assertGet

        val group3KeyValues = randomizedKeyValues(keyValueCount, startId = Some(group2.maxKey.maxKey.readInt() + 1))
        val group3 = Transient.Group(group3KeyValues, randomCompression(), randomCompressionLZ4OrSnappy(Double.MinValue), TestData.falsePositiveRate, Some(group2)).assertGet

        //root group
        val group4KeyValues = Seq(group1, group2, group3).updateStats
        val group4 = Transient.Group(group4KeyValues, randomCompression(), randomCompression(), TestData.falsePositiveRate, None).assertGet

        val bytes = SegmentWriter.write(Seq(group4), TestData.falsePositiveRate).assertGet._1
        bytes.isFull shouldBe true

        val rootGroup = readAll(bytes).assertGet
        rootGroup should have size 1
        rootGroup.isInstanceOf[Slice[KeyValue.ReadOnly.Group]] shouldBe true

        val childGroups = rootGroup.head.asInstanceOf[KeyValue.ReadOnly.Group].segmentCache.getAll().assertGet
        childGroups.isInstanceOf[Slice[KeyValue.ReadOnly.Group]] shouldBe true

        val allKeyValuesForGroups = childGroups.asInstanceOf[Slice[KeyValue.ReadOnly.Group]].flatMap(_.segmentCache.getAll().assertGet)
        allKeyValuesForGroups shouldBe (group1KeyValues ++ group2KeyValues ++ group3KeyValues).toMemory
      }
    }

    "converting large KeyValues to bytes" in {
      runThis(10.times) {
        //increase the size of value to test it on larger values.
        val keyValues = randomizedKeyValues(valueSize = 1.kb, count = 100)

        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet
        bytes.isFull shouldBe true

        //in memory
        assertReads(keyValues, Reader(bytes))
        //on disk
        assertReads(keyValues, createFileChannelReader(bytes))
      }
    }

    "write and read Int min max key values" in {
      val keyValues = Slice(Transient.put(Int.MaxValue, Int.MinValue), Transient.put(Int.MinValue, Int.MaxValue)).updateStats

      val (bytes, deadline) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet
      deadline shouldBe empty

      //in memory
      assertReads(keyValues, Reader(bytes))
      //on disk
      assertReads(keyValues, createFileChannelReader(bytes))
    }

    "write and read Keys with None value to a Slice[Byte]" in {
      val setDeadlines = Random.nextBoolean()
      val keyValues = randomFixedNoneValue(keyValueCount, addRandomPutDeadlines = setDeadlines, addRandomUpdateDeadlines = setDeadlines, addRandomRemoveDeadlines = setDeadlines)

      keyValues foreach {
        keyValue =>
          keyValue.valueEntryBytes shouldBe empty
      }

      val (bytes, deadline) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

      if (!setDeadlines) deadline shouldBe empty

      //in memory
      assertReads(keyValues, Reader(bytes))
      //on disk
      assertReads(keyValues, createFileChannelReader(bytes))
    }

    "report Segment corruption if CRC check does not match when reading the footer" in {
      val keyValues = Slice(Transient.put(1)).updateStats

      val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

      SegmentReader.readFooter(Reader(bytes.drop(1))).failed.assertGet.exception shouldBe a[SegmentCorruptionException]
      SegmentReader.readFooter(Reader(bytes.dropRight(1))).failed.assertGet.exception shouldBe a[SegmentCorruptionException]
      SegmentReader.readFooter(Reader(bytes.slice(10, 20))).failed.assertGet.exception shouldBe a[SegmentCorruptionException]
    }
  }

  "SegmentReader.readFooter" should {
    "set hasRange to false when Segment contains no Range key-value" in {
      runThis(100.times) {
        val keyValues = randomizedKeyValues(keyValueCount, addRandomRanges = false, addRandomGroups = true)

        val (bytes, deadline) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

        val footer: SegmentFooter = SegmentReader.readFooter(Reader(bytes)).get
        footer.keyValueCount shouldBe keyValues.size
        //      footer.startIndexOffset shouldBe keyValues.head.stats.toValueOffset + 1
        footer.hasRange shouldBe false
        val bloomFilter = footer.bloomFilter.assertGet
        assertBloom(keyValues, bloomFilter)

        footer.crc should be > 0L
      }
    }

    "set hasRange to true and hasRemoveRange to false when Segment does not contain Remove range or function or pendingApply with function or remove but has other ranges" in {
      def doAssert(keyValues: Slice[KeyValue.WriteOnly]) = {
        val expectedHasRemoveRange =
          unzipGroups(keyValues).exists {
            case _: Transient.Remove => true
            case _: Transient.Put => false
            case _: Transient.Update => false
            case _: Transient.Function => true
            case range: Transient.Range =>
              range.rangeValue match {
                case _: Value.Remove => true
                case _: Value.Update => false
                case _: Value.Function => true
                case Value.PendingApply(applies) =>
                  applies exists {
                    case _: Value.Remove => true
                    case _: Value.Update => false
                    case _: Value.Function => true
                  }
              }
            case apply: Transient.PendingApply =>
              apply.applies exists {
                case _: Value.Remove => true
                case _: Value.Update => false
                case _: Value.Function => true
              }
          }

        keyValues.last.stats.hasRemoveRange shouldBe expectedHasRemoveRange

        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

        val footer: SegmentFooter = SegmentReader.readFooter(Reader(bytes)).get
        footer.keyValueCount shouldBe keyValues.size
        footer.keyValueCount shouldBe keyValues.size
        //        footer.startIndexOffset shouldBe keyValues.last.stats.toValueOffset + 1
        footer.hasRange shouldBe true
        if (!expectedHasRemoveRange) {
          val bloomFilter = footer.bloomFilter.assertGet
          assertBloom(keyValues, bloomFilter)
          IO(bloomFilter.mightContain(randomBytesSlice(100)) shouldBe false)
        }

        footer.crc should be > 0L
      }

      runThis(100.times) {
        doAssert(randomizedKeyValues(keyValueCount, addRandomRangeRemoves = false, addRandomRanges = true, startId = Some(1)))
      }
    }

    "set hasRange & hasRemoveRange to true and not create bloomFilter when Segment contains Remove range key-value" in {
      def doAssert(keyValues: Slice[KeyValue.WriteOnly]) = {
        keyValues.last.stats.hasRemoveRange shouldBe true

        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

        val footer: SegmentFooter = SegmentReader.readFooter(Reader(bytes)).get
        footer.keyValueCount shouldBe keyValues.size
        footer.keyValueCount shouldBe keyValues.size
        footer.hasRange shouldBe true
        //bloom filters do
        footer.bloomFilter shouldBe empty
        footer.crc should be > 0L
      }

      runThis(100.times) {
        val keyValues =
          randomizedKeyValues(keyValueCount, startId = Some(1)) ++
            Seq(
              eitherOne(
                left = Transient.Group(Slice(randomFixedKeyValue(10), randomRangeKeyValue(12, 15, rangeValue = Value.remove(randomDeadlineOption))).toTransient, randomCompression(), randomCompression(), TestData.falsePositiveRate, None).assertGet,
                right = Transient.Range.create[FromValue, RangeValue](20, 21, randomFromValueOption(), Value.remove(randomDeadlineOption))
              )
            )

        doAssert(keyValues.updateStats)
      }
    }

    "create bloomFilter when Segment not does contains Remove range key-value but contains a Group" in {
      def doAssert(keyValues: Slice[KeyValue.WriteOnly]) = {
        keyValues.last.stats.hasRemoveRange shouldBe false

        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

        val footer: SegmentFooter = SegmentReader.readFooter(Reader(bytes)).get
        footer.keyValueCount shouldBe keyValues.size
        footer.keyValueCount shouldBe keyValues.size
        footer.hasRange shouldBe true
        //bloom filters do
        val bloomFilter = footer.bloomFilter.assertGet
        assertBloom(keyValues, bloomFilter)
        IO(bloomFilter.mightContain(randomBytesSlice(100)) shouldBe false)
        footer.crc should be > 0L
      }

      runThis(100.times) {
        doAssert(
          Slice(
            randomFixedKeyValue(1).toTransient,
            randomFixedKeyValue(2).toTransient,
            Transient.Group(Slice(randomFixedKeyValue(10), randomRangeKeyValue(12, 15, rangeValue = Value.update(1))).toTransient, randomCompression(), randomCompression(), TestData.falsePositiveRate, None).assertGet
          ).updateStats
        )
      }
    }

    "set hasRange to false when there are no ranges" in {
      def doAssert(keyValues: Slice[KeyValue.WriteOnly]) = {
        keyValues.last.stats.hasRemoveRange shouldBe false

        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

        val footer: SegmentFooter = SegmentReader.readFooter(Reader(bytes)).get
        footer.keyValueCount shouldBe keyValues.size
        footer.keyValueCount shouldBe keyValues.size
        footer.hasRange shouldBe false
        //bloom filters do
        val bloomFilter = footer.bloomFilter.assertGet
        assertBloom(keyValues, bloomFilter)
        IO(bloomFilter.mightContain(randomBytesSlice(100)) shouldBe false)
        footer.crc should be > 0L

      }

      runThis(100.times) {
        doAssert(
          randomizedKeyValues(keyValueCount, addRandomRanges = false, addRandomRangeRemoves = false)
        )
      }
    }

    "set hasRange to true when only the group contains range" in {
      val keyCompression = randomCompression()
      val valueCompression = randomCompression()

      def doAssert(keyValues: Slice[KeyValue.WriteOnly]) = {
        keyValues.last.stats.hasRemoveRange shouldBe false

        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

        val footer: SegmentFooter = SegmentReader.readFooter(Reader(bytes)).get
        footer.keyValueCount shouldBe keyValues.size
        footer.keyValueCount shouldBe keyValues.size
        footer.hasRange shouldBe true
        //bloom filters do
        val bloomFilter = footer.bloomFilter.assertGet
        assertBloom(keyValues, bloomFilter)
        IO(bloomFilter.mightContain(randomBytesSlice(100)) shouldBe false)
        footer.crc should be > 0L

        keyValues foreach {
          case group: Transient.Group =>
            assertGroup(group, keyCompression, Some(valueCompression))
          case _ =>
        }

      }

      runThis(100.times) {
        doAssert(
          Slice(
            randomFixedKeyValue(1).toTransient,
            randomFixedKeyValue(2).toTransient,
            Transient.Group(
              keyValues = Slice(randomPutKeyValue(10, Some("val")), randomRangeKeyValue(from = 12, to = 15, rangeValue = Value.update(1))).toTransient,
              indexCompression = keyCompression,
              valueCompression = valueCompression,
              falsePositiveRate = TestData.falsePositiveRate,
              previous = None
            ).assertGet
          ).updateStats
        )
      }
    }

    "set hasRemoveRange to true, hasGroup to true & not create bloomFilter when only the group contains remove range" in {
      val keyCompression = randomCompression()
      val valueCompression = randomCompression()

      def doAssert(keyValues: Slice[KeyValue.WriteOnly]) = {
        keyValues.last.stats.hasRemoveRange shouldBe true

        val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

        val footer: SegmentFooter = SegmentReader.readFooter(Reader(bytes)).get
        footer.keyValueCount shouldBe keyValues.size
        footer.keyValueCount shouldBe keyValues.size
        footer.hasRange shouldBe true
        //bloom filters do
        footer.bloomFilter shouldBe empty
        footer.crc should be > 0L

        keyValues foreach {
          case group: Transient.Group =>
            assertGroup(group, keyCompression, Some(valueCompression))
          case _ =>
        }
      }

      runThis(100.times) {
        doAssert(
          Slice(
            randomFixedKeyValue(1).toTransient,
            randomFixedKeyValue(2).toTransient,
            Transient.Group(Slice(randomPutKeyValue(10, Some("val")), randomRangeKeyValue(12, 15, rangeValue = Value.remove(None))).toTransient, keyCompression, valueCompression, TestData.falsePositiveRate, None).assertGet
          ).updateStats
        )
      }
    }
  }

  "SegmentReader.find" should {
    "get key-values using KeyMatcher.Get" in {
      val keyValues =
        Slice(
          Transient.put(1, "one"),
          Transient.put(2, "two"),
          Transient.update(3, "three"),
          randomFunctionKeyValue(4).toTransient,
          Transient.remove(Int.MaxValue - 1000),
          Transient.Range.create[FromValue, RangeValue](Int.MaxValue - 900, Int.MaxValue - 800, None, Value.update(10)),
          Transient.Group(Slice(randomPutKeyValue(Int.MaxValue - 600, Some("val")), randomRangeKeyValue(Int.MaxValue - 500, Int.MaxValue - 400, rangeValue = Value.remove(None))).toTransient, randomCompression(), randomCompression(), TestData.falsePositiveRate, None).assertGet
        ).updateStats

      val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet
      val footer = SegmentReader.readFooter(Reader(bytes)).assertGet

      /**
        * @param index                          keyValue at index
        * @param expectedIndexOffset            if it's the first key-value indexOffset is footer's startIndexOffset else
        *                                       it's previously read key-values nextIndexOffset
        * @param expectedKeyUnderlyingArraySize if compressed with previous it's expected to be 4 else unsliced.
        * @return the found key-value
        */
      def find(index: Int, expectedIndexOffset: Int, expectedKeyUnderlyingArraySize: Int): Persistent = {
        val foundKeyValue = SegmentReader.find(KeyMatcher.Get(keyValues(index).key), None, Reader(bytes)).assertGet
        foundKeyValue.getOrFetchValue shouldBe keyValues(index).getOrFetchValue

        foundKeyValue.key.underlyingArraySize shouldBe expectedKeyUnderlyingArraySize
        foundKeyValue.key.toArray shouldBe keyValues(index).key.toArray
        //value is a slice of bytes array and not. Remove does not have a value.
        if (!foundKeyValue.isInstanceOf[Persistent.Remove]) foundKeyValue.getOrFetchValue.assertGet.underlyingArraySize shouldBe bytes.size
        foundKeyValue.indexOffset shouldBe expectedIndexOffset
        foundKeyValue
      }

      //first
      var found = find(0, footer.startIndexOffset, bytes.size)

      //second
      found = find(1, found.nextIndexOffset, 4)

      //third
      found = find(2, found.nextIndexOffset, 4)

      //third
      found = find(3, found.nextIndexOffset, 4)

      //third
      found = find(4, found.nextIndexOffset, bytes.size)

      //FOURTH KEY
      val foundKeyValue4 = SegmentReader.find(KeyMatcher.Get(keyValues(5).key), None, Reader(bytes)).assertGet.asInstanceOf[Persistent.Range]
      foundKeyValue4.getOrFetchValue shouldBe keyValues(5).getOrFetchValue
      foundKeyValue4.fromKey shouldBe (Int.MaxValue - 900: Slice[Byte])
      foundKeyValue4.toKey shouldBe (Int.MaxValue - 800: Slice[Byte])
      //4 has common bytes with 3rd key-value. It will be sliced.
      foundKeyValue4.key.underlyingArraySize shouldBe 8
      foundKeyValue4.fromKey.underlyingArraySize shouldBe 8 //fromKey is unsliced
      foundKeyValue4.toKey.underlyingArraySize shouldBe 4 //toKey shares common bytes with fromKey so it will be unsliced.

      foundKeyValue4.key.toArray shouldBe keyValues(5).key.toArray
      //value is a slice of bytes array and not
      foundKeyValue4.indexOffset shouldBe found.nextIndexOffset

      //FIFTH KEY
      val foundKeyValue5 = SegmentReader.find(KeyMatcher.Get(keyValues(6).key), None, Reader(bytes)).assertGet.asInstanceOf[Persistent.Group]
      foundKeyValue5.getOrFetchValue shouldBe keyValues(6).getOrFetchValue
      foundKeyValue5.minKey shouldBe (Int.MaxValue - 600: Slice[Byte])
      foundKeyValue5.maxKey shouldBe keyValues.maxKey()
      //5 has common bytes with 4rd key-value. It will be sliced.
      foundKeyValue5.key.underlyingArraySize shouldBe GroupCompressor.buildCompressedKey(Slice(foundKeyValue5).toTransient)._3.size
      foundKeyValue5.minKey.underlyingArraySize shouldBe GroupCompressor.buildCompressedKey(Slice(foundKeyValue5).toTransient)._3.size //fromKey is unsliced
      foundKeyValue5.maxKey.maxKey.underlyingArraySize shouldBe 4 //toKey shares common bytes with fromKey so it will be unsliced.

      foundKeyValue5.key.toArray shouldBe keyValues(6).key.toArray
      //value is a slice of bytes array and not
      foundKeyValue5.indexOffset shouldBe foundKeyValue4.nextIndexOffset
    }

    "get key-values using KeyMatcher.Lower" in {
      val keyValues =
        Slice(
          Transient.put(1, "one"),
          Transient.put(2, "two", 10.days),
          Transient.update(3, "three"),
          randomFunctionKeyValue(4).toTransient,
          Transient.remove(Int.MaxValue - 10),
          Transient.Range.create[FromValue, RangeValue](Int.MaxValue - 9, Int.MaxValue, None, Value.update(10))
        ).updateStats

      val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

      //FIRST
      SegmentReader.find(KeyMatcher.Lower(keyValues.head.key), None, Reader(bytes)).assertGetOpt shouldBe empty

      //SECOND
      val foundKeyValue2 = SegmentReader.find(KeyMatcher.Lower(keyValues(1).key), None, Reader(bytes)).assertGet
      foundKeyValue2.getOrFetchValue shouldBe keyValues.head.getOrFetchValue
      foundKeyValue2.key shouldBe keyValues.head.key
      //ensure value is unsliced
      foundKeyValue2.getOrFetchValue.assertGet.underlyingArraySize shouldBe bytes.size

      //THIRD
      val foundKeyValue3 = SegmentReader.find(KeyMatcher.Lower(keyValues(2).key), None, Reader(bytes)).assertGet
      foundKeyValue3.getOrFetchValue shouldBe keyValues(1).getOrFetchValue
      foundKeyValue3.key shouldBe keyValues(1).key
      //ensure value is unsliced
      foundKeyValue3.getOrFetchValue.assertGet.underlyingArraySize shouldBe bytes.size

      //Fourth
      val foundKeyValue4 = SegmentReader.find(KeyMatcher.Lower(keyValues(3).key), None, Reader(bytes)).assertGet
      foundKeyValue4.getOrFetchValue shouldBe keyValues(2).getOrFetchValue
      foundKeyValue4.key shouldBe keyValues(2).key
      //ensure value is unsliced
      foundKeyValue4.getOrFetchValue.assertGet.underlyingArraySize shouldBe bytes.size

      //Fifth
      val foundKeyValue5 = SegmentReader.find(KeyMatcher.Lower(keyValues(4).key), None, Reader(bytes)).assertGet
      foundKeyValue5.getOrFetchValue shouldBe keyValues(3).getOrFetchValue
      foundKeyValue5.key shouldBe keyValues(3).key
      //ensure value is unsliced
      foundKeyValue5.getOrFetchValue.assertGet.underlyingArraySize shouldBe bytes.size

      //Sixth
      val sixth = keyValues(5).asInstanceOf[Transient.Range]
      val foundKeyValue4FromKey = SegmentReader.find(KeyMatcher.Lower(sixth.fromKey), None, Reader(bytes)).assertGet
      foundKeyValue4FromKey.getOrFetchValue shouldBe empty //lower is Remove
      foundKeyValue4FromKey.key shouldBe keyValues(4).key

      val sixthToKey = SegmentReader.find(KeyMatcher.Lower(sixth.toKey), None, Reader(bytes)).assertGet.asInstanceOf[Persistent.Range]
      sixthToKey.getOrFetchValue shouldBe sixth.getOrFetchValue //lower is Self
      sixthToKey.fromKey shouldBe sixth.fromKey
      sixthToKey.toKey shouldBe sixth.toKey
    }

    "get key-values using KeyMatcher.Higher" in {
      val keyValues =
        Slice(
          Transient.put(1, "one"),
          Transient.put(2, "two", 2.days),
          Transient.update(3, "three"),
          randomFunctionKeyValue(4).toTransient,
          Transient.remove(Int.MaxValue - 10),
          Transient.Range.create[FromValue, RangeValue](Int.MaxValue - 9, Int.MaxValue, None, Value.update(10))
        ).updateStats

      val (bytes, _) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet

      val foundKeyValue1 = SegmentReader.find(KeyMatcher.Higher(keyValues.head.key), None, Reader(bytes)).assertGet
      foundKeyValue1 shouldBe keyValues(1)
      //ensure value is unsliced
      foundKeyValue1.getOrFetchValue.assertGet.underlyingArraySize shouldBe bytes.size

      //SECOND
      val foundKeyValue2 = SegmentReader.find(KeyMatcher.Higher(keyValues(1).key), None, Reader(bytes)).assertGet
      foundKeyValue2 shouldBe keyValues(2)
      //ensure value is unsliced

      //THIRD
      val foundKeyValue3 = SegmentReader.find(KeyMatcher.Higher(keyValues(2).key), None, Reader(bytes)).assertGet
      foundKeyValue3 shouldBe keyValues(3)
      //ensure value is unsliced
      foundKeyValue3.getOrFetchValue.assertGet.underlyingArraySize shouldBe bytes.size

      val foundKeyValue4 = SegmentReader.find(KeyMatcher.Higher(keyValues(3).key), None, Reader(bytes)).assertGet
      foundKeyValue4 shouldBe keyValues(4)
      //ensure value is unsliced
      foundKeyValue4.getOrFetchValue shouldBe empty

      val foundKeyValue5 = SegmentReader.find(KeyMatcher.Higher(keyValues(4).key), None, Reader(bytes)).assertGet
      foundKeyValue5 shouldBe keyValues(5)

      val fourth = keyValues(5).asInstanceOf[Transient.Range]
      val foundKeyValue4FromKey = SegmentReader.find(KeyMatcher.Higher(fourth.fromKey), None, Reader(bytes)).assertGet.asInstanceOf[Persistent.Range]
      foundKeyValue4FromKey.getOrFetchValue shouldBe fourth.getOrFetchValue //lower is Remove
      foundKeyValue4FromKey.fromKey shouldBe fourth.fromKey
      foundKeyValue4FromKey.toKey shouldBe fourth.toKey

      SegmentReader.find(KeyMatcher.Higher(fourth.toKey), None, Reader(bytes)).assertGetOpt shouldBe empty
    }

    "return nearest deadline" in {
      runThis(100.times) {

        //create sequential deadline and randomly select one on call.
        def deadlines = Random.shuffle((1 to 10).toList).map(i => Deadline(new FiniteDuration(i, TimeUnit.SECONDS)))

        //may be get the next deadline
        def nextDeadline =
          eitherOne(
            left = None,
            right = Some(deadlines.head)
          )

        //create a fixed or range key-value
        def randomFixedOrRangeKeyValues(key: Double) =
          eitherOne(
            left =
              randomFixedKeyValue(
                key = key,
                deadline = nextDeadline
              ),
            right =
              randomRangeKeyValue(
                from = key,
                to = key + 0.1,
                fromValue = eitherOne(None, Some(randomFromValue(deadline = nextDeadline))),
                rangeValue = randomRangeValue(deadline = nextDeadline)
              )
          )

        //create a fixed key-value or a group with fixed-key value
        def randomKeyValueWithDeadline(key: Int) =
          eitherOne(
            left = randomFixedOrRangeKeyValues(key).toTransient,
            right =
              randomGroup(
                Slice(
                  randomFixedOrRangeKeyValues(key),
                  randomFixedOrRangeKeyValues(key + 0.4),
                  randomFixedOrRangeKeyValues(key + 0.8)
                ).toTransient
              )
          )

        val keyValuesWithDeadline = (1 to 10) map randomKeyValueWithDeadline

        val actualNearestDeadline =
          SegmentWriter.write(
            keyValues = keyValuesWithDeadline.updateStats,
            bloomFilterFalsePositiveRate = TestData.falsePositiveRate
          ).assertGet._2

        actualNearestDeadline shouldBe nearestDeadline(keyValuesWithDeadline.toSlice)
      }
    }
  }

  "writing key-values with duplicate values" should {
    "use the same valueOffset and not create duplicate values" in {
      runThis(1000.times) {
        //make sure the first byte in the value is not the same as the key (just for the this test).
        val fixedValue: Slice[Byte] = Slice(11.toByte) ++ randomBytesSlice(randomIntMax(50)).drop(1)

        def fixed =
          Seq(
            Memory.put(1, fixedValue),
            Memory.update(2, fixedValue),
            Memory.put(3, fixedValue),
            Memory.put(4, fixedValue),
            Memory.update(5, fixedValue),
            Memory.put(6, fixedValue),
            Memory.update(7, fixedValue),
            Memory.update(8, fixedValue),
            Memory.put(9, fixedValue),
            Memory.update(10, fixedValue)
          ).toTransient

        val applies = randomApplies(deadline = None)

        def pendingApply: Slice[Transient] =
          Seq(
            Memory.PendingApply(1, applies),
            Memory.PendingApply(2, applies),
            Memory.PendingApply(3, applies),
            Memory.PendingApply(4, applies),
            Memory.PendingApply(5, applies),
            Memory.PendingApply(6, applies),
            Memory.PendingApply(7, applies)
          ).toTransient

        val keyValues =
          eitherOne(
            left = fixed,
            right = pendingApply
          )

        //get the first value for either fixed or range.
        //this value is only expected to be written ones.
        val value = keyValues.head.value.assertGet

        val (bytes, deadline) = SegmentWriter.write(keyValues, TestData.falsePositiveRate).assertGet
        //      println(bytes)

        deadline shouldBe empty

        //only the bytes of the first value should be set and the next byte should be the start of index
        //as values are not duplicated
        bytes.take(value.size) shouldBe value
        //drop the first value bytes that are value bytes and the next value bytes (value of the next key-value) should not be value bytes.
        bytes.drop(value.size).take(value.size) should not be value

        val readKeyValues = readAll(bytes).assertGet
        readKeyValues should have size keyValues.size

        //assert that all valueOffsets of all key-values are the same
        readKeyValues.foldLeft(Option.empty[Int]) {
          case (previousOffsetOption, fixed: Persistent.Fixed) =>
            previousOffsetOption match {
              case Some(previousOffset) =>
                fixed.valueOffset shouldBe previousOffset
                fixed.valueLength shouldBe value.size
                previousOffsetOption

              case None =>
                Some(fixed.valueOffset)
            }

          case keyValue =>
            fail(s"Got: ${keyValue.getClass.getSimpleName}. Didn't expect any other key-value other than Put")
        }
      }
    }
  }
}
