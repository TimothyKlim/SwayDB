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

class SegmentMerger6_Remove_Some_Into_Remove_Spec extends WordSpec with CommonAssertions {

  override implicit val keyOrder = KeyOrder.default
  implicit val compression = groupingStrategy

  /**
    * Remove Some -> Remove None
    */

  "Remove Some -> Remove None" when {
    "Remove None" in {
      (1 to 20) foreach {
        i =>
          val deadline = i.seconds.fromNow - 2.seconds
          assertMerge(
            newKeyValue = Memory.Remove(1, deadline),
            oldKeyValue = Memory.Remove(1, None),
            expected = Memory.Remove(1, None),
            lastLevelExpect = None,
            hasTimeLeftAtLeast = 10.seconds
          )
      }
    }
  }

  /**
    * Remove Some -> Remove Some
    */
  "Remove Some -> Remove Some" when {
    "Remove HasTimeLeft-Greater" in {
      val deadline = 30.seconds.fromNow
      val deadline2 = 20.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.Remove(1, deadline),
        oldKeyValue = Memory.Remove(1, deadline2),
        expected = Memory.Remove(1, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Remove HasTimeLeft-Lesser" in {
      val deadline = 15.seconds.fromNow
      val deadline2 = 20.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.Remove(1, deadline),
        oldKeyValue = Memory.Remove(1, deadline2),
        expected = Memory.Remove(1, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Remove HasNoTimeLeft-Greater" in {
      val deadline = 30.seconds.fromNow
      val deadline2 = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.Remove(1, deadline),
        oldKeyValue = Memory.Remove(1, deadline2),
        expected = Memory.Remove(1, deadline2),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Remove HasNoTimeLeft-Lesser" in {
      val deadline = 1.seconds.fromNow
      val deadline2 = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.Remove(1, deadline),
        oldKeyValue = Memory.Remove(1, deadline2),
        expected = Memory.Remove(1, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Remove Expired-Greater" in {
      val deadline = 30.seconds.fromNow
      val deadline2 = expiredDeadline()
      assertMerge(
        newKeyValue = Memory.Remove(1, deadline),
        oldKeyValue = Memory.Remove(1, deadline2),
        expected = Memory.Remove(1, deadline2),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Remove Expired-Lesser" in {
      val deadline2 = expiredDeadline()
      val deadline = deadline2 - 1.seconds
      assertMerge(
        newKeyValue = Memory.Remove(1, deadline),
        oldKeyValue = Memory.Remove(1, deadline2),
        expected = Memory.Remove(1, deadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }

}
