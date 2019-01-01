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

package swaydb

import swaydb.core.TestBase
import swaydb.serializers.Default._

class SwayDBSize_Persistent_Spec extends SwayDBSizeSpec {
  val keyValueCount: Int = 10000000

  override def newDB(): Map[Int, String] =
    SwayDB.persistent[Int, String](dir = randomDir).assertGet
}

class SwayDBSize_Memory_Spec extends SwayDBSizeSpec {
  val keyValueCount: Int = 10000000

  override def newDB(): Map[Int, String] =
    SwayDB.memory[Int, String]().assertGet
}

sealed trait SwayDBSizeSpec extends TestBase with TestBaseEmbedded {

  val keyValueCount: Int

  override def deleteFiles = false

  def newDB(): Map[Int, String]

  "return the size of key-values" in {
    val db = newDB()

    (1 to keyValueCount) foreach {
      i =>
        db.put(i, i.toString).assertGet
    }

    db.size shouldBe keyValueCount

  }
}
