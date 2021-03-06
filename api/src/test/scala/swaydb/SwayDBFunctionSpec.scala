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

import swaydb.core.IOAssert._
import swaydb.core.RunThis._
import swaydb.core.TestBase
import swaydb.data.IO
import swaydb.serializers.Default._

class SwayDBFunctionSpec0 extends SwayDBFunctionSpec {
  override def newDB(): Map[Int, Int, IO] =
    swaydb.persistent.Map[Int, Int](randomDir).assertGet
}

class SwayDBFunctionSpec1 extends SwayDBFunctionSpec {

  override def newDB(): Map[Int, Int, IO] =
    swaydb.persistent.Map[Int, Int](randomDir, mapSize = 1.byte).assertGet
}

class SwayDBFunctionSpec2 extends SwayDBFunctionSpec {

  override def newDB(): Map[Int, Int, IO] =
    swaydb.memory.Map[Int, Int](mapSize = 1.byte).assertGet
}

class SwayDBFunctionSpec3 extends SwayDBFunctionSpec {
  override def newDB(): Map[Int, Int, IO] =
    swaydb.memory.Map[Int, Int]().assertGet
}

class SwayDBFunctionSpec4 extends SwayDBFunctionSpec {

  override def newDB(): Map[Int, Int, IO] =
    swaydb.memory.zero.Map[Int, Int](mapSize = 1.byte).assertGet
}

class SwayDBFunctionSpec5 extends SwayDBFunctionSpec {
  override def newDB(): Map[Int, Int, IO] =
    swaydb.memory.zero.Map[Int, Int]().assertGet
}

sealed trait SwayDBFunctionSpec extends TestBase {

  def newDB(): Map[Int, Int, IO]

  "SwayDB" should {
    "perform concurrent atomic updates to a single key" in {

      val db = newDB()

      db.put(1, 0).get

      val functionID = db.registerFunction(1, value => Apply.Update(value + 1))

      (1 to 1000).par foreach {
        _ =>
          db.applyFunction(1, functionID).get
      }

      db.get(1).get should contain(1000)

      db.closeDatabase().get
    }

    "perform concurrent atomic updates to multiple keys" in {

      val db = newDB()

      (1 to 1000) foreach {
        i =>
          db.put(i, 0).get
      }

      val functionID = db.registerFunction(1, value => Apply.Update(value + 1))

      (1 to 100).par foreach {
        _ =>
          (1 to 1000).par foreach {
            i =>
              db.applyFunction(i, functionID).get
          }
      }

      (1 to 1000).par foreach {
        i =>
          db.get(i).get should contain(100)
      }

      db.closeDatabase().get
    }

    "Nothing should not update data" in {

      val db = newDB()

      (1 to 1000) foreach {
        i =>
          db.put(i, 0).get
      }

      val functionID = db.registerFunction(1, value => Apply.Nothing)

      (1 to 100).par foreach {
        _ =>
          (1 to 1000).par foreach {
            i =>
              db.applyFunction(i, functionID).get
          }
      }

      (1 to 1000).par foreach {
        i =>
          db.get(i).get should contain(0)
      }

      db.closeDatabase().get
    }
  }
}
