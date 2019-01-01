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

package swaydb.core.map.serializer

import org.scalatest.{Matchers, WordSpec}
import swaydb.core.{CommonAssertions, TryAssert}
import swaydb.core.data.Value.{FromValue, RangeValue}
import swaydb.core.data.Value
import swaydb.data.slice.Slice
import swaydb.serializers.Default._
import swaydb.serializers._
import scala.concurrent.duration._

class RangeValueSerializerSpec extends WordSpec with Matchers with TryAssert with CommonAssertions {

  import RangeValueSerializers._

  def doAssert[R <: RangeValue](rangeValue: R, expectedId: RangeValueId)(implicit serializer: RangeValueSerializer[Unit, R]) = {
    val bytesRequired = RangeValueSerializer.bytesRequired((), rangeValue)
    //    rangeId shouldBe expectedId.id
    val bytes = Slice.create[Byte](bytesRequired)

    RangeValueSerializer.write((), rangeValue)(bytes)
    bytes.isFull shouldBe true

    RangeValueSerializer.read(bytes).assertGet shouldBe ((Option.empty[FromValue], rangeValue))

    //also assert option Serializer
    def doAssertOption(rangeValue: RangeValue, expectedId: RangeValueId) = {
      val bytesRequired = RangeValueSerializer.bytesRequired(Option.empty[FromValue], rangeValue)(RangeValueSerializers.OptionRangeValueSerializer)
      //    rangeId shouldBe expectedId.id
      val bytes = Slice.create[Byte](bytesRequired)

      RangeValueSerializer.write(Option.empty[FromValue], rangeValue)(bytes)(RangeValueSerializers.OptionRangeValueSerializer)
      bytes.isFull shouldBe true

      RangeValueSerializer.read(bytes).assertGet shouldBe ((None, rangeValue))
    }

    doAssertOption(rangeValue, expectedId)
  }

  "Serialize Remove range" should {

    "Remove None" in {
      doAssert(Value.Remove(None, randomNextTimeOption), swaydb.core.map.serializer.RemoveRange)
    }

    "Remove Some" in {
      doAssert(Value.remove(1.second.fromNow), swaydb.core.map.serializer.RemoveRange)
    }
  }

  "Serialize Update range" should {

    "Update None None" in {
      doAssert(Value.Update(None, None, randomNextTimeOption), swaydb.core.map.serializer.UpdateRange)
    }

    "Update None Some" in {
      doAssert(Value.update(None, 1.second), swaydb.core.map.serializer.UpdateRange)
    }

    "Update Some None" in {
      doAssert(Value.update(1, None), swaydb.core.map.serializer.UpdateRange)
    }

    "Update Some Some" in {
      doAssert(Value.update(1, 1.hour.fromNow), swaydb.core.map.serializer.UpdateRange)
    }
  }

  //also assert option Serializer
  def doAssertOption(fromValue: FromValue, rangeValue: RangeValue, expectedId: RangeValueId) = {
    val bytesRequired = RangeValueSerializer.bytesRequired(Option(fromValue), rangeValue)(RangeValueSerializers.OptionRangeValueSerializer)
    //    rangeId shouldBe expectedId.id
    val bytes = Slice.create[Byte](bytesRequired)
    RangeValueSerializer.write(Option(fromValue), rangeValue)(bytes)(RangeValueSerializers.OptionRangeValueSerializer)
    RangeValueSerializer.read(bytes).assertGet shouldBe ((Some(fromValue), rangeValue))
  }

  def doAssert[F <: FromValue, R <: RangeValue](fromValue: F, rangeValue: R, expectedId: RangeValueId)(implicit serializer: RangeValueSerializer[F, R]) = {
    val bytesRequired = RangeValueSerializer.bytesRequired(fromValue, rangeValue)
    //    rangeId shouldBe expectedId.id
    val bytes = Slice.create[Byte](bytesRequired)
    RangeValueSerializer.write(fromValue, rangeValue)(bytes)
    RangeValueSerializer.read(bytes).assertGet shouldBe ((Some(fromValue), rangeValue))

    doAssertOption(fromValue, rangeValue, expectedId)
  }
//
//  "Serialize Remove Remove range" should {
//
//    "Remove None Remove None" in {
//      doAssert(Value.remove(None, randomNextTimeOption), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.RemoveRemoveRange)
//    }
//
//    "Remove None Remove Some" in {
//      doAssert(Value.remove(None, randomNextTimeOption), Value.remove(10.seconds.fromNow), swaydb.core.map.serializer.RemoveRemoveRange)
//    }
//
//    "Remove Some Remove None" in {
//      doAssert(Value.remove(10.seconds.fromNow), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.RemoveRemoveRange)
//    }
//
//    "Remove Some Remove Some" in {
//      doAssert(Value.remove(10.seconds.fromNow), Value.remove(5.seconds.fromNow), swaydb.core.map.serializer.RemoveRemoveRange)
//    }
//  }
//
//  "Serialize Remove Update range" should {
//
//    //Remove None
//    "Remove None Update None None" in {
//      doAssert(Value.remove(None, randomNextTimeOption), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//
//    "Remove None Update None Some" in {
//      doAssert(Value.remove(None, randomNextTimeOption), Value.update(None, 10.seconds), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//
//    "Remove None Update Some None" in {
//      doAssert(Value.remove(None, randomNextTimeOption), Value.update(1, None), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//
//    "Remove None Update Some Some" in {
//      doAssert(Value.remove(None, randomNextTimeOption), Value.update(1, 10.seconds), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//    //Remove Some
//
//    "Remove Some Update None None" in {
//      doAssert(Value.remove(1.second.fromNow), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//
//    "Remove Some Update None Some" in {
//      doAssert(Value.remove(1.second.fromNow), Value.update(None, 10.seconds), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//
//    "Remove Some Update Some None" in {
//      doAssert(Value.remove(1.second.fromNow), Value.update(1, None), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//
//    "Remove Some Update Some Some" in {
//      doAssert(Value.remove(1.second.fromNow), Value.update(1, 10.seconds), swaydb.core.map.serializer.RemoveUpdateRange)
//    }
//
//  }
//
//  "Serialize Put Remove range" should {
//
//    //Put None None
//    "Put None None Remove None" in {
//      doAssert(Value.put(None, None, randomNextTimeOption), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//    //Put None None
//    "Put None None Remove Some" in {
//      doAssert(Value.put(None, None, randomNextTimeOption), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//    //Put None Some
//    "Put None Some Remove None" in {
//      doAssert(Value.put(None, 1.second), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//    //Put None Some
//    "Put None Some Remove Some" in {
//      doAssert(Value.put(None, 1.second), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//    //Put None None
//    "Put Some None Remove None" in {
//      doAssert(Value.put(1), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//    //Put None None
//    "Put Some None Remove Some" in {
//      doAssert(Value.put(1), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//    //Put Some Some
//    "Put Some Some Remove None" in {
//      doAssert(Value.put(1, 1.second), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//    //Put Some Some
//    "Put Some Some Remove Some" in {
//      doAssert(Value.put(1, 1.second), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.PutRemoveRange)
//    }
//
//  }
//
//  "Serialize Put Update range" should {
//
//    //Put None None
//    "Put None None Update None None" in {
//      doAssert(Value.put(None, None, randomNextTimeOption), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put None None Update None Some" in {
//      doAssert(Value.put(None, None, randomNextTimeOption), Value.update(None, 1.second), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put None None Update Some None" in {
//      doAssert(Value.put(None, None, randomNextTimeOption), Value.update(1), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put None None Update Some Some" in {
//      doAssert(Value.put(None, None, randomNextTimeOption), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    //Put None Some
//    "Put None Some Update None None" in {
//      doAssert(Value.put(None, 1.second), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put None Some Update None Some" in {
//      doAssert(Value.put(None, 2.second), Value.update(None, 1.second), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put None Some Update Some None" in {
//      doAssert(Value.put(None, 3.second), Value.update(1), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put None Some Update Some Some" in {
//      doAssert(Value.put(None, 4.second), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    //Put Some None
//    "Put Some None Update None None" in {
//      doAssert(Value.put(1), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put Some None Update None Some" in {
//      doAssert(Value.put(2), Value.update(None, 1.second), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put Some None Update Some None" in {
//      doAssert(Value.put(3), Value.update(1), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put Some None Update Some Some" in {
//      doAssert(Value.put(4), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    //Put Some Some
//    "Put Some Some Update None None" in {
//      doAssert(Value.put(1, 1.second), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put Some Some Update None Some" in {
//      doAssert(Value.put(2, 2.seconds), Value.update(None, 1.second), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put Some Some Update Some None" in {
//      doAssert(Value.put(3, 3.seconds), Value.update(1), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//    "Put Some Some Update Some Some" in {
//      doAssert(Value.put(4, 4.seconds), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.PutUpdateRange)
//    }
//
//  }
//
//  "Serialize Update Remove range" should {
//
//    //Update None None
//    "Update None None Remove None" in {
//      doAssert(Value.update(None, None, randomNextTimeOption), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//    //Update None None
//    "Update None None Remove Some" in {
//      doAssert(Value.update(None, None, randomNextTimeOption), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//    //Update None Some
//    "Update None Some Remove None" in {
//      doAssert(Value.update(None, 1.second), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//    //Update None Some
//    "Update None Some Remove Some" in {
//      doAssert(Value.update(None, 1.second), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//    //Update None None
//    "Update Some None Remove None" in {
//      doAssert(Value.update(1), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//    //Update None None
//    "Update Some None Remove Some" in {
//      doAssert(Value.update(1), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//    //Update Some Some
//    "Update Some Some Remove None" in {
//      doAssert(Value.update(1, 1.second), Value.remove(None, randomNextTimeOption), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//    //Update Some Some
//    "Update Some Some Remove Some" in {
//      doAssert(Value.update(1, 1.second), Value.remove(2.seconds.fromNow), swaydb.core.map.serializer.UpdateRemoveRange)
//    }
//
//  }
//
//  "Serialize Update Update range" should {
//
//    //Update None None
//    "Update None None Update None None" in {
//      doAssert(Value.update(None, None, randomNextTimeOption), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update None None Update None Some" in {
//      doAssert(Value.update(None, None, randomNextTimeOption), Value.update(None, 1.second), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update None None Update Some None" in {
//      doAssert(Value.update(None, None, randomNextTimeOption), Value.update(1), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update None None Update Some Some" in {
//      doAssert(Value.update(None, None, randomNextTimeOption), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    //Update None Some
//    "Update None Some Update None None" in {
//      doAssert(Value.update(None, 1.second), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update None Some Update None Some" in {
//      doAssert(Value.update(None, 2.second), Value.update(None, 1.second), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update None Some Update Some None" in {
//      doAssert(Value.update(None, 3.second), Value.update(1), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update None Some Update Some Some" in {
//      doAssert(Value.update(None, 4.second), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    //Update Some None
//    "Update Some None Update None None" in {
//      doAssert(Value.update(1), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update Some None Update None Some" in {
//      doAssert(Value.update(2), Value.update(None, 1.second), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update Some None Update Some None" in {
//      doAssert(Value.update(3), Value.update(1), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update Some None Update Some Some" in {
//      doAssert(Value.update(4), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    //Update Some Some
//    "Update Some Some Update None None" in {
//      doAssert(Value.update(1, 1.second), Value.update(None, None, randomNextTimeOption), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update Some Some Update None Some" in {
//      doAssert(Value.update(2, 2.seconds), Value.update(None, 1.second), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update Some Some Update Some None" in {
//      doAssert(Value.update(3, 3.seconds), Value.update(1), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//    "Update Some Some Update Some Some" in {
//      doAssert(Value.update(4, 4.seconds), Value.update(1, 5.second.fromNow), swaydb.core.map.serializer.UpdateUpdateRange)
//    }
//
//  }

}
