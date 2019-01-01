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

class SegmentMerger6_Remove_Some_Into_Put_Spec extends WordSpec with CommonAssertions {

  override implicit val keyOrder = KeyOrder.default
  implicit val compression = groupingStrategy

  /**
    * Remove Some -> Put None None
    */

  "Remove Expired -> Put None None" when {
    "Put None None" in {
      (1 to 20) foreach {
        i =>
          val deadline = i.seconds.fromNow - 21.seconds
          assertMerge(
            newKeyValue = Memory.remove(1, deadline),
            oldKeyValue = Memory.put(1, None, None),
            expected = Memory.remove(1, deadline),
            lastLevelExpect = None,
            hasTimeLeftAtLeast = 10.seconds
          )
      }

    }
  }

  "Remove HasTimeLeft -> Put None None" when {
    "Put None None" in {
      (1 to 20) foreach {
        i =>
          val deadline = i.seconds.fromNow
          assertMerge(
            newKeyValue = Memory.remove(1, deadline),
            oldKeyValue = Memory.put(1, None, None),
            expected = Memory.put(1, None, deadline),
            lastLevelExpect = Memory.put(1, None, deadline),
            hasTimeLeftAtLeast = 10.seconds
          )
      }

    }
  }

  /**
    * Remove Some -> Put Some None
    */
  "Remove Expired -> Put Some None" when {
    "Put Some None" in {
      (1 to 20) foreach {
        i =>
          val deadline = i.seconds.fromNow - 21.seconds
          assertMerge(
            newKeyValue = Memory.remove(1, deadline),
            oldKeyValue = Memory.put(1, i.toString, None),
            expected = Memory.remove(1, deadline),
            lastLevelExpect = None,
            hasTimeLeftAtLeast = 10.seconds
          )
      }

    }
  }

  "Remove HasTimeLeft -> Put Some None" when {
    "Put Some None" in {
      (1 to 20) foreach {
        i =>
          val deadline = i.seconds.fromNow
          assertMerge(
            newKeyValue = Memory.remove(1, deadline),
            oldKeyValue = Memory.put(1, i.toString, None),
            expected = Memory.put(1, i.toString, deadline),
            lastLevelExpect = Memory.put(1, i.toString, deadline),
            hasTimeLeftAtLeast = 10.seconds
          )
      }

    }
  }

  /**
    * Remove Some -> Put None Some
    */
  "Remove Some -> Put None Some" when {
    "Put None HasTimeLeft-Greater" in {
      val newDeadline = 20.seconds.fromNow
      val oldDeadline = 15.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, None, oldDeadline),
        expected = Memory.put(1, None, newDeadline),
        lastLevelExpect = Some(Memory.put(1, None, newDeadline)),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put None HasTimeLeft-Lesser" in {
      val newDeadline = 10.seconds.fromNow
      val oldDeadline = 15.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, None, oldDeadline),
        expected = Memory.put(1, None, newDeadline),
        lastLevelExpect = Some(Memory.put(1, None, newDeadline)),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put None HasNoTimeLeft-Greater" in {
      val newDeadline = 20.seconds.fromNow
      val oldDeadline = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, None, oldDeadline),
        expected = Memory.put(1, None, oldDeadline),
        lastLevelExpect = Memory.put(1, None, oldDeadline),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put None HasNoTimeLeft-Lesser" in {
      val newDeadline = 1.seconds.fromNow
      val oldDeadline = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, None, oldDeadline),
        expected = Memory.put(1, None, newDeadline),
        lastLevelExpect = Some(Memory.put(1, None, newDeadline)),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put None Expired-Greater" in {
      val newDeadline = 20.seconds.fromNow
      val oldDeadline = expiredDeadline()
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, None, oldDeadline),
        expected = Memory.put(1, None, oldDeadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put None Expired-Lesser" in {
      val oldDeadline = expiredDeadline()
      val newDeadline = oldDeadline - 10.seconds
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, None, oldDeadline),
        expected = Memory.put(1, None, newDeadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }

  /**
    * Remove Some -> Put Some Some
    */
  "Remove Some -> Put Some Some" when {
    "Put Some HasTimeLeft-Greater" in {
      val newDeadline = 20.seconds.fromNow
      val oldDeadline = 15.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, 1, oldDeadline),
        expected = Memory.put(1, 1, newDeadline),
        lastLevelExpect = Memory.put(1, 1, newDeadline),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put Some HasTimeLeft-Lesser" in {
      val newDeadline = 10.seconds.fromNow
      val oldDeadline = 15.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, 1, oldDeadline),
        expected = Memory.put(1, 1, newDeadline),
        lastLevelExpect = Memory.put(1, 1, newDeadline),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put Some HasNoTimeLeft-Greater" in {
      val newDeadline = 20.seconds.fromNow
      val oldDeadline = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, 1, oldDeadline),
        expected = Memory.put(1, 1, oldDeadline),
        lastLevelExpect = Memory.put(1, 1, oldDeadline),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put Some HasNoTimeLeft-Lesser" in {
      val newDeadline = 1.seconds.fromNow
      val oldDeadline = 2.seconds.fromNow
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, 1, oldDeadline),
        expected = Memory.put(1, 1, newDeadline),
        lastLevelExpect = Memory.put(1, 1, newDeadline),
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put Some Expired-Greater" in {
      val newDeadline = 20.seconds.fromNow
      val oldDeadline = expiredDeadline()
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, 1, oldDeadline),
        expected = Memory.put(1, 1, oldDeadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }

    "Put Some Expired-Lesser" in {
      val oldDeadline = expiredDeadline()
      val newDeadline = oldDeadline - 10.seconds
      assertMerge(
        newKeyValue = Memory.remove(1, newDeadline),
        oldKeyValue = Memory.put(1, 1, oldDeadline),
        expected = Memory.put(1, 1, newDeadline),
        lastLevelExpect = None,
        hasTimeLeftAtLeast = 10.seconds
      )
    }
  }
}
