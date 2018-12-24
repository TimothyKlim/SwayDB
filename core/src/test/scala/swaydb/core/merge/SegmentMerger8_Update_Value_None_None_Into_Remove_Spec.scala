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

import org.scalatest.WordSpec
import swaydb.core.CommonAssertions
import swaydb.core.data.Memory
import swaydb.data.order.KeyOrder
import swaydb.serializers.Default._
import swaydb.serializers._

import scala.concurrent.duration._

class SegmentMerger8_Update_Value_None_None_Into_Remove_Spec extends WordSpec with CommonAssertions {

  override implicit val keyOrder = KeyOrder.default
  implicit val compression = groupingStrategy

  /**
    * Update None None -> Remove None
    */
  "Update None None -> Remove None" when {
    "Remove None" in {
      assertMerge(
        newKeyValue = Memory.Update(1, None, None),
        oldKeyValue = Memory.Remove(1, None),
        expected = Memory.Remove(1, None),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }

  /**
    * Update None None -> Remove Some
    */
  "Update None None -> Remove Some" when {
    "Remove HasTimeLeft" in {
      val deadline = 20.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.Update(1, None, None),
        oldKeyValue = Memory.Remove(1, deadline),
        expected = Memory.Update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Remove HasNoTimeLeft" in {
      val deadline = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.Update(1, None, None),
        oldKeyValue = Memory.Remove(1, deadline),
        expected = Memory.Update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Remove Expired" in {
      val deadline = expiredDeadline()
      assertMerge(
        newKeyValue = Memory.Update(1, None, None),
        oldKeyValue = Memory.Remove(1, deadline),
        expected = Memory.Remove(1, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }


}
