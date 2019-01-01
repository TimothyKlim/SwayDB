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

package swaydb.core.merge

import org.scalatest.{Matchers, WordSpec}
import swaydb.core.CommonAssertions
import swaydb.core.data.Memory
import swaydb.serializers.Default._
import swaydb.serializers._

class KeyValueMerger1_Remove_Spec extends WordSpec with Matchers with CommonAssertions {

  "Remove(None) -> _" should {
    "always return the new put overwriting the old key-value" in {
      runThis(100.times) {
        val key = randomStringOption

        val newKeyValue = Memory.Remove(key, None, randomNextTimeOption)

        val oldKeyValue = randomFixedKeyValue(key = key, time = Some(previousTime))

        newKeyValue merge oldKeyValue shouldBe newKeyValue
      }
    }
  }

  "Remove(Some) -> _" should {
    "always return the new put overwriting the old key-value" in {
      runThis(100.times) {
        val key = randomStringOption

        val newKeyValue = Memory.Remove(key, Some(randomDeadline()), randomNextTimeOption)
        val oldKeyValue = randomFixedKeyValue(key = key, time = Some(previousTime), includePendingApply = false)

        val mergeResult = newKeyValue merge oldKeyValue

        oldKeyValue match {
          case oldKeyValue: Memory.Put =>
            mergeResult shouldBe oldKeyValue.copy(deadline = newKeyValue.deadline.orElse(oldKeyValue.deadline), time = newKeyValue.time)

          case oldKeyValue: Memory.Update =>
            mergeResult shouldBe oldKeyValue.copy(deadline = newKeyValue.deadline.orElse(oldKeyValue.deadline), time = newKeyValue.time)

          case _: Memory.PendingApply =>
            //this is not tested here.
            throw new NotImplementedError("This is not tested here. See PendingApply test-cases")

          case oldKeyValue: Memory.Remove =>
            val expectedDeadline = if (oldKeyValue.deadline.isEmpty) None else newKeyValue.deadline
            mergeResult shouldBe newKeyValue.copy(deadline = expectedDeadline)

        }
      }
    }
  }
}
