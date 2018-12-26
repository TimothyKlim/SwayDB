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

package swaydb.core.map

import swaydb.core.TestBase
import swaydb.core.data.Memory
import swaydb.core.io.file.IO
import swaydb.core.level.zero.LevelZeroSkipListMerge
import swaydb.core.util.FileUtil._
import swaydb.data.accelerate.{Accelerator, Level0Meter}
import swaydb.data.config.RecoveryMode
import swaydb.data.slice.Slice
import swaydb.data.util.StorageUnits._
import swaydb.data.order.KeyOrder

import scala.concurrent.duration._

class MapsStressSpec extends TestBase {

  override implicit val keyOrder: KeyOrder[Slice[Byte]] = KeyOrder.default

  import swaydb.core.map.serializer.LevelZeroMapEntryReader._
  import swaydb.core.map.serializer.LevelZeroMapEntryWriter._

  implicit val skipListMerger = LevelZeroSkipListMerge(10.seconds)

  val keyValueCount = 100

  "Maps.persistent" should {
    "initialise and recover over 1000 maps persistent map and on reopening them should recover state all 1000 persisted maps" in {
      val keyValues = randomIntKeyValues(keyValueCount)

      //disable braking
      val acceleration =
        (meter: Level0Meter) => {
          Accelerator(meter.currentMapSize, None)
        }

      def testWrite(maps: Maps[Slice[Byte], Memory.SegmentResponse]) = {
        keyValues foreach {
          keyValue =>
            maps.write(MapEntry.Put(keyValue.key, Memory.Put(keyValue.key, keyValue.value))).assertGet
        }
      }

      def testRead(maps: Maps[Slice[Byte], Memory.SegmentResponse]) = {
        keyValues foreach {
          keyValue =>
            maps.get(keyValue.key).assertGet shouldBe Memory.Put(keyValue.key, keyValue.value)
        }
      }

      val dir1 = IO.createDirectoryIfAbsent(testDir.resolve(1.toString))
      val dir2 = IO.createDirectoryIfAbsent(testDir.resolve(2.toString))

      val map1 = Maps.persistent[Slice[Byte], Memory.SegmentResponse](dir1, mmap = true, 1.byte, acceleration, RecoveryMode.ReportFailure).assertGet
      testWrite(map1)
      testRead(map1)

      val map2 = Maps.persistent[Slice[Byte], Memory.SegmentResponse](dir2, mmap = true, 1.byte, acceleration, RecoveryMode.ReportFailure).assertGet
      testWrite(map2)
      testRead(map2)

      val map3 = Maps.memory(1.byte, acceleration)
      testWrite(map3)
      testRead(map3)

      def reopen = {
        val open1 = Maps.persistent[Slice[Byte], Memory.SegmentResponse](dir1, mmap = false, 1.byte, acceleration, RecoveryMode.ReportFailure).assertGet
        testRead(open1)
        val open2 = Maps.persistent[Slice[Byte], Memory.SegmentResponse](dir2, mmap = true, 1.byte, acceleration, RecoveryMode.ReportFailure).assertGet
        testRead(open2)

        open1.close.assertGet
        open2.close.assertGet
      }

      reopen
      reopen //reopen again

      map1.close.assertGet
      map2.close.assertGet
      map2.close.assertGet

      println("total number of maps recovered: " + dir1.folders.size)
    }

  }
}
