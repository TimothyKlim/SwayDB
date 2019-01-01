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

class KeyValueMerger0_Update_Into_Remove_Spec extends WordSpec with Matchers with CommonAssertions {

  "Merge Update into Put" when {

    "times are in order" when {

      "Update(_) -> Remove(Some(_))" in {
        runThis(100.times) {
          val key = randomStringOption

          val newKeyValue = Memory.Update(key, randomStringOption, randomDeadlineOption, randomNextTimeOption)
          val oldKeyValue = Memory.Remove(key, Some(randomDeadline()), randomPreviousTimeOption)

          val expected = Memory.Update(key, newKeyValue.value, newKeyValue.deadline.orElse(oldKeyValue.deadline), newKeyValue.time)

          newKeyValue merge oldKeyValue shouldBe expected
        }
      }

      "Update(_) -> Remove(None)" in {
        runThis(100.times) {
          val key = randomStringOption

          val newKeyValue = Memory.Update(key, randomStringOption, randomDeadlineOption, randomNextTimeOption)
          val oldKeyValue = Memory.Remove(key, None, randomPreviousTimeOption)

          val expected = Memory.Remove(key, None, newKeyValue.time)

          newKeyValue merge oldKeyValue shouldBe expected
        }
      }
    }

    "times are not in order" in {

      runThis(100.times) {
        val key = randomStringOption

        val newKeyValue = Memory.Update(key, randomStringOption, randomDeadlineOption, Some(nextTime))
        val oldKeyValue = Memory.Remove(key, randomDeadlineOption, Some(nextTime))

        newKeyValue merge oldKeyValue shouldBe oldKeyValue
      }
    }
  }
}
