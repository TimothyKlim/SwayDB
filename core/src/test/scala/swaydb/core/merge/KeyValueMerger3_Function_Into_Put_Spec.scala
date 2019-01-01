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
import swaydb.core.data.{FunctionOutput, Memory, SwayFunction, Value}
import swaydb.data.slice.Slice
import swaydb.serializers.Default._
import swaydb.serializers._

class KeyValueMerger3_Function_Into_Put_Spec extends WordSpec with Matchers with CommonAssertions {

  "Merge Update Function into Put" when {

    "times are in order" in {
      runThis(100.times) {
        val key = randomStringOption

        val functionOutput = FunctionOutput.Update(randomStringOption, randomDeadlineOption)
        val functionValue = Value.Function(randomBytes(), Some(nextTime))

        functionStore.put(functionValue.function, SwayFunction.Key(_ => functionOutput))

        val newKeyValue = Memory.PendingApply(key, Slice(functionValue))
        val oldKeyValue = Memory.Put(key, randomStringOption, randomDeadlineOption, randomPreviousTimeOption)

        val expected = Memory.Put(key, functionOutput.value, functionOutput.deadline.orElse(oldKeyValue.deadline), newKeyValue.time)

        newKeyValue merge oldKeyValue shouldBe expected
      }
    }
  }

  "Merge Remove Function into Put" when {

    "times are in order" in {
      runThis(100.times) {
        val key = randomStringOption

        val functionValue = Value.Function(randomBytes(), Some(nextTime))

        functionStore.put(functionValue.function, SwayFunction.Key(_ => FunctionOutput.Remove))

        val newKeyValue = Memory.PendingApply(key, Slice(functionValue))
        val oldKeyValue = Memory.Put(key, randomStringOption, randomDeadlineOption, randomPreviousTimeOption)

        newKeyValue merge oldKeyValue shouldBe Memory.Remove(key, None, functionValue.time)
      }
    }
  }

  "Merge Expire Function into Put" when {

    "times are in order" in {
      runThis(100.times) {
        val key = randomStringOption

        val functionOutput = FunctionOutput.Expire(randomDeadline())
        val functionValue = Value.Function(randomBytes(), Some(nextTime))

        functionStore.put(functionValue.function, SwayFunction.Key(_ => functionOutput))

        val newKeyValue = Memory.PendingApply(key, Slice(functionValue))
        val oldKeyValue = Memory.Put(key, randomStringOption, randomDeadlineOption, randomPreviousTimeOption)

        val expected = oldKeyValue.copy(deadline = Some(functionOutput.deadline), time = newKeyValue.time)

        newKeyValue merge oldKeyValue shouldBe expected
      }
    }
  }


  "Merge all functions into Put" when {
    "times are not in order" in {
        runThis(100.times) {
          val key = randomStringOption

          val newKeyValue = Memory.PendingApply(key, Slice(Value.Function(randomFunctionId, Some(previousTime))))
          val oldKeyValue = Memory.Put(key, randomStringOption, randomDeadlineOption, Some(nextTime))

          newKeyValue merge oldKeyValue shouldBe oldKeyValue
        }
    }
  }
}
