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
import swaydb.core.data.{Memory, Time}
import swaydb.serializers.Default._
import swaydb.serializers._

class KeyValueMerger2_Put_Spec extends WordSpec with Matchers with CommonAssertions {

  "Merging Put in any other older randomly selected key-value" should {
    "always return the new put overwriting the old key-value" in {

      runThis(100.times) {
        val key = randomStringOption

        val newKeyValue = Memory.put(key, randomStringOption, randomDeadlineOption, randomNextTimeOption)

        val oldKeyValue = randomFixedKeyValue(key = key, time = Some(previousTime))

        (newKeyValue, oldKeyValue).merge shouldBe newKeyValue
      }
    }
  }

  "Merging Put in any other newer randomly selected key-value" should {
    "always return the old key-value" in {
      runThis(100.times) {
        val key = randomStringOption

        //new but has older time than oldKeyValue
        val newKeyValue = Memory.Put(key, randomStringOption, randomDeadlineOption, Some(Time(Long.MinValue)))

        //oldKeyValue but it has a newer time.
        val oldKeyValue = randomFixedKeyValue(key = key, time = Some(nextTime))

        (newKeyValue, oldKeyValue).merge shouldBe oldKeyValue
      }
    }
  }
}
