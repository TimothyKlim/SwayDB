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

package swaydb

import scala.concurrent.duration._
import swaydb.core.TestBase
import swaydb.serializers.Default._
import swaydb.core.IOAssert._
import swaydb.core.CommonAssertions._
import swaydb.core.RunThis._
import swaydb.data.IO

class SwayDBRemoveSpec0 extends SwayDBRemoveSpec {
  val keyValueCount: Int = 1000

  override def newDB(): Map[Int, String, IO] =
    swaydb.persistent.Map[Int, String](dir = randomDir).assertGet
}

class SwayDBRemoveSpec1 extends SwayDBRemoveSpec {

  val keyValueCount: Int = 1000

  override def newDB(): Map[Int, String, IO] =
    swaydb.persistent.Map[Int, String](randomDir, mapSize = 1.byte, segmentSize = 10.bytes).assertGet
}

class SwayDBRemoveSpec2 extends SwayDBRemoveSpec {

  val keyValueCount: Int = 10000

  override def newDB(): Map[Int, String, IO] =
    swaydb.memory.Map[Int, String](mapSize = 1.byte, segmentSize = 10.bytes).assertGet
}

class SwayDBRemoveSpec3 extends SwayDBRemoveSpec {
  val keyValueCount: Int = 10000

  override def newDB(): Map[Int, String, IO] =
    swaydb.memory.Map[Int, String]().assertGet
}

class SwayDBRemoveSpec4 extends SwayDBRemoveSpec {

  val keyValueCount: Int = 10000

  override def newDB(): Map[Int, String, IO] =
    swaydb.memory.zero.Map[Int, String](mapSize = 1.byte).assertGet
}

class SwayDBRemoveSpec5 extends SwayDBRemoveSpec {
  val keyValueCount: Int = 10000

  override def newDB(): Map[Int, String, IO] =
    swaydb.memory.zero.Map[Int, String]().assertGet
}

sealed trait SwayDBRemoveSpec extends TestBaseEmbedded {

  val keyValueCount: Int

  def newDB(): Map[Int, String, IO]

  "Remove" when {
    "Put" in {
      val db = newDB()

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Put & Remove" in {
      val db = newDB()

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Put & Update" in {
      val db = newDB()

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated").assertGet),
        right = db.update(1, keyValueCount, value = "updated").assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Put & Expire" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 3.seconds.fromNow)

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline)
      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Put & Put" in {
      val db = newDB()

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }
      (1 to keyValueCount) foreach { i => db.put(i, i.toString + " replaced").assertGet }

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }
  }

  "Remove" when {
    "Update" in {
      val db: Map[Int, String, IO] = newDB()

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated").assertGet),
        right = db.update(1, keyValueCount, value = "updated").assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Update & Remove" in {
      val db = newDB()

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated").assertGet),
        right = db.update(1, keyValueCount, value = "updated").assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Update & Update" in {
      val db = newDB()

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated 1").assertGet),
        right = db.update(1, keyValueCount, value = "updated 1").assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated 2").assertGet),
        right = db.update(1, keyValueCount, value = "updated 2").assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Update & Expire" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 3.seconds.fromNow)
      val deadline2 = eitherOne(expiredDeadline(), 5.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated 1").assertGet),
        right = db.update(1, keyValueCount, value = "updated 1").assertGet
      )

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline2)
      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Update & Put" in {
      val db = newDB()

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated 1").assertGet),
        right = db.update(1, keyValueCount, value = "updated 1").assertGet
      )

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }
  }

  "Remove" when {
    "Remove" in {
      val db = newDB()

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Remove & Remove" in {
      val db = newDB()
      //if the deadline is either expired or delay it does not matter in this case because the underlying key-values are removed.

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Remove & Update" in {
      val db = newDB()

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated").assertGet),
        right = db.update(1, keyValueCount, value = "updated").assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Remove & Expire" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 3.seconds.fromNow)
      val deadline2 = eitherOne(expiredDeadline(), 5.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline)
      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Remove & Put" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 3.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline)
      doAssertEmpty(db)

      db.closeDatabase().get
    }
  }

  "Remove" when {
    "Expire" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 2.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline)
      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Expire & Remove" in {
      val db = newDB()
      //if the deadline is either expired or delay it does not matter in this case because the underlying key-values are removed.
      val deadline = eitherOne(expiredDeadline(), 2.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline)
      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Expire & Update" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 2.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.update(i, value = "updated").assertGet),
        right = db.update(1, keyValueCount, value = "updated").assertGet
      )
      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline)
      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Expire & Expire" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 2.seconds.fromNow)
      val deadline2 = eitherOne(expiredDeadline(), 4.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline2).assertGet),
        right = db.expire(1, keyValueCount, deadline2).assertGet
      )

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline2)
      doAssertEmpty(db)

      db.closeDatabase().get
    }

    "Expire & Put" in {
      val db = newDB()

      val deadline = eitherOne(expiredDeadline(), 2.seconds.fromNow)
      val deadline2 = eitherOne(expiredDeadline(), 4.seconds.fromNow)

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.expire(i, deadline).assertGet),
        right = db.expire(1, keyValueCount, deadline).assertGet
      )

      (1 to keyValueCount) foreach { i => db.put(i, i.toString).assertGet }

      eitherOne(
        left = (1 to keyValueCount) foreach (i => db.remove(i).assertGet),
        right = db.remove(1, keyValueCount).assertGet
      )

      doAssertEmpty(db)
      sleep(deadline2)
      doAssertEmpty(db)

      db.closeDatabase().get
    }
  }
}
