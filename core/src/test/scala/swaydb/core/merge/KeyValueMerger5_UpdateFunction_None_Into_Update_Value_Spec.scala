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
import swaydb.core.function.FunctionStore
import swaydb.serializers.Default._
import swaydb.serializers._

import scala.concurrent.duration._

class KeyValueMerger5_UpdateFunction_None_Into_Update_Value_Spec extends WordSpec with Matchers with CommonAssertions {

  /**
    * UpdateFunction(None) -> Update(None, None)
    */

  val incrementBy1FunctionId = randomCharacters()
  FunctionStore.put(incrementBy1FunctionId, inputBytes => inputBytes.readInt() + 1).assertGet shouldBe incrementBy1FunctionId

  "UpdateFunction(None) -> Update(None, None)" when {
    "Update(None, None)" in {
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, None, None)).mergeFailed.getMessage shouldBe "No old value specified"
    }
  }

  /**
    * UpdateFunction(None) -> Update(None, Some)
    */

  "UpdateFunction(None) -> Update(None, Some)" when {
    "Update(None, HasTimeLeft)" in {
      val deadline = 20.seconds.fromNow
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, None, deadline)).mergeFailed.getMessage shouldBe "No old value specified"
    }

    "Update(None, HasNoTimeLeft)" in {
      val deadline = 5.seconds.fromNow
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, None, deadline)).mergeFailed.getMessage shouldBe "No old value specified"
    }

    "Update(None, Expired)" in {
      val deadline = expiredDeadline()
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, None, deadline)).mergeFailed.getMessage shouldBe "No old value specified"
    }
  }

  /**
    * UpdateFunction(None) -> Update(Some, None)
    */

  "UpdateFunction(None) -> Update(Some, None)" when {
    "Update(Some, None)" in {
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, 2, None)).merge shouldBe Memory.Update(1, 3, None)
    }
  }

  "UpdateFunction(None) -> Update(Some, Some)" when {
    "Update(None, HasTimeLeft)" in {
      val deadline = 20.seconds.fromNow
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, 1, deadline)).merge shouldBe Memory.Update(1, 2, deadline)
    }

    "Update(None, HasNoTimeLeft)" in {
      val deadline = 5.seconds.fromNow
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, 1, deadline)).merge shouldBe Memory.Update(1, 2, deadline)
    }

    "Update(None, Expired)" in {
      val deadline = expiredDeadline()
      (Memory.UpdateFunction(1, incrementBy1FunctionId, None), Memory.Update(1, 1, deadline)).merge shouldBe Memory.Update(1, 2, deadline)
    }
  }

}
