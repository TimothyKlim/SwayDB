///*
// * Copyright (C) 2018 Simer Plaha (@simerplaha)
// *
// * This file is a part of SwayDB.
// *
// * SwayDB is free software: you can redistribute it and/or modify
// * it under the terms of the GNU Affero General Public License as
// * published by the Free Software Foundation, either version 3 of the
// * License, or (at your option) any later version.
// *
// * SwayDB is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// * GNU Affero General Public License for more details.
// *
// * You should have received a copy of the GNU Affero General Public License
// * along with SwayDB. If not, see <https://www.gnu.org/licenses/>.
// */
//
//package swaydb.core.segment.format.a.entry
//
//import org.scalatest.WordSpec
//import scala.util.Random
//import swaydb.core.CommonAssertions
//import swaydb.core.data.Transient
//import swaydb.core.io.reader.Reader
//import swaydb.core.segment.format.a.entry.reader.EntryReader
//import swaydb.data.order.KeyOrder
//import swaydb.data.slice.Slice
//import swaydb.serializers.Default._
//import swaydb.serializers._
//
//class FixedEntryReaderWriterSpec extends WordSpec with CommonAssertions {
//
//  implicit val order = KeyOrder.default
//
//  "write and read single Fixed entry" in {
//    runThis(1000.times) {
//      val entry = randomFixedKeyValue(
//        key = randomIntMax(),
//        value = randomStringOption
//      ).toTransient
//      println("write: " + entry)
//
//      val read = EntryReader.read(Reader(entry.indexEntryBytes), entry.valueEntryBytes.map(Reader(_)).getOrElse(Reader.empty), 0, 0, 0, None).assertGet
//      //println("read:  " + read)
//      read shouldBe entry
//    }
//  }
//
//  "write and read two fixed entries" in {
//    runThis(1000.times) {
//      val keyValues = randomizedIntKeyValues(count = 1, addRandomGroups = false)
//      val previous = keyValues.head
//
//      val duplicateValues = if (Random.nextBoolean()) previous.value else randomStringOption
//      val duplicateDeadline = if (Random.nextBoolean()) previous.deadline else randomDeadlineOption
//      val next =
//        if (Random.nextBoolean())
//          Transient.Remove(
//            key = randomIntMax(),
//            deadline = duplicateDeadline,
//            previous = Some(previous),
//            0.1
//          )
//        else
//          Transient.Put(
//            key = randomIntMax(),
//            value = duplicateValues,
//            deadline = duplicateDeadline,
//            previous = Some(previous),
//            falsePositiveRate = 0.1,
//            compressDuplicateValues = true
//          )
//
//      println("previous: " + previous)
//      println("next: " + next)
//
//      val valueBytes = Slice((previous.valueEntryBytes ++ next.valueEntryBytes).toArray)
//
//      val previousRead = EntryReader.read(Reader(previous.indexEntryBytes), Reader(valueBytes), 0, 0, 0, None).assertGet
//      previousRead shouldBe previous
//
//      val read = EntryReader.read(Reader(next.indexEntryBytes), Reader(valueBytes), 0, 0, 0, Some(previousRead)).assertGet
//      //println("read:  " + read)
//      //println
//      read shouldBe next
//    }
//  }
//}
