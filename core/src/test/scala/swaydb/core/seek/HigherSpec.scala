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

package swaydb.core.seek

import org.scalatest.{Matchers, WordSpec}
import swaydb.core.CommonAssertions._
import swaydb.core.RunThis._
import swaydb.core.TestData._
import swaydb.core.IOAssert._
import swaydb.core.data.Value
import swaydb.core.{TestData, TestTimer}
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.serializers.Default._
import swaydb.serializers._

class HigherSpec extends WordSpec with Matchers {

  implicit val keyOrder = KeyOrder.default
  implicit val timeOrder = TimeOrder.long
  implicit val functionStore = TestData.functionStore
  implicit val time = TestTimer.Empty

  "higherFromValue" in {
    runThis(100.times) {
      Higher.higherFromValue(key = 1, fromKey = 2, fromValue = None) shouldBe empty
      Higher.higherFromValue(key = 2, fromKey = 1, fromValue = None) shouldBe empty

      Higher.higherFromValue(key = 2, fromKey = 1, fromValue = randomFromValueOption(addPut = false)) shouldBe empty
      Higher.higherFromValue(key = 1, fromKey = 2, fromValue = randomFromValueOption(addPut = false)) shouldBe empty

      Higher.higherFromValue(key = 2, fromKey = 1, fromValue = Some(Value.put(randomStringOption, Some(expiredDeadline())))) shouldBe empty
      Higher.higherFromValue(key = 1, fromKey = 2, fromValue = Some(Value.put(randomStringOption, Some(expiredDeadline())))) shouldBe empty

      val put = Value.put(randomStringOption, randomDeadlineOption(false))
      Higher.higherFromValue(key = 2, fromKey = 1, fromValue = Some(put)) shouldBe empty
      Higher.higherFromValue(key = 1, fromKey = 2, fromValue = Some(put)).assertGet shouldBe put.toMemory(2)
    }
  }

}
