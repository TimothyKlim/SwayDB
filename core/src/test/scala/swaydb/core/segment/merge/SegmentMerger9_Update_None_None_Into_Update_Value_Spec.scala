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

class SegmentMerger9_Update_None_None_Into_Update_Value_Spec extends WordSpec with CommonAssertions {

  override implicit val keyOrder = KeyOrder.default
  implicit val compression = groupingStrategy

  /**
    * Update None None -> Update None None
    */
  "Update None None -> Update None None" when {
    "Update None None" in {
      assertMerge(
        newKeyValue = Memory.update(1, None, None),
        oldKeyValue = Memory.update(1, None, None),
        expected = Memory.update(1, None, None),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }

  /**
    * Update None None -> Update None Some
    */
  "Update None None -> Update None Some" when {
    "Update None HasTimeLeft" in {
      val deadline = 20.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.update(1, None, None),
        oldKeyValue = Memory.update(1, None, deadline),
        expected = Memory.update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Update None HasNoTimeLeft" in {
      val deadline = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.update(1, None, None),
        oldKeyValue = Memory.update(1, None, deadline),
        expected = Memory.update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Update None Expired" in {
      val deadline = expiredDeadline()
      assertMerge(
        newKeyValue = Memory.update(1, None, None),
        oldKeyValue = Memory.update(1, None, deadline),
        expected = Memory.update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }


  /**
    * Update None None -> Update Some None
    */
  "Update None None -> Update Some None" when {
    "Update Some None" in {
      assertMerge(
        newKeyValue = Memory.update(1, None, None),
        oldKeyValue = Memory.update(1, 1, None),
        expected = Memory.update(1, None, None),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }

  /**
    * Update None None -> Update Some Some
    */
  "Update None None -> Update Some Some" when {
    "Update Some HasTimeLeft-Greater" in {
      val deadline = 30.seconds.fromNow
      val deadline2 = 20.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.update(1, None, deadline),
        oldKeyValue = Memory.update(1, 1, deadline2),
        expected = Memory.update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Update Some HasTimeLeft-Lesser" in {
      val deadline = 20.seconds.fromNow
      val deadline2 = 30.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.update(1, None, deadline),
        oldKeyValue = Memory.update(1, 1, deadline2),
        expected = Memory.update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Update Some HasNoTimeLeft-Greater" in {
      val deadline = 30.seconds.fromNow
      val deadline2 = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.update(1, None, deadline),
        oldKeyValue = Memory.update(1, 1, deadline2),
        expected = Memory.update(1, None, deadline2),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Update Some HasNoTimeLeft-Lesser" in {
      val deadline = 1.seconds.fromNow
      val deadline2 = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.update(1, None, deadline),
        oldKeyValue = Memory.update(1, 1, deadline2),
        expected = Memory.update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Update Some Expired-Greater" in {
      val deadline = 30.seconds.fromNow
      val deadline2 = expiredDeadline()
      assertMerge(
        newKeyValue = Memory.update(1, None, deadline),
        oldKeyValue = Memory.update(1, 1, deadline2),
        expected = Memory.update(1, None, deadline2),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Update Some Expired-Lesser" in {
      val deadline2 = expiredDeadline()
      val deadline = deadline2 - 1.seconds
      assertMerge(
        newKeyValue = Memory.update(1, None, deadline),
        oldKeyValue = Memory.update(1, 1, deadline2),
        expected = Memory.update(1, None, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }


}
