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

package swaydb.core.map.serializer

import swaydb.macros.SealedList

import scala.util.{Failure, Success, Try}

sealed trait RangeValueId {
  val id: Int
}

//Single
case object RemoveRange extends RangeValueId {
  override val id: Int = 0
}

case object PutRange extends RangeValueId {
  override val id: Int = 1
}

case object UpdateRange extends RangeValueId {
  override val id: Int = 2
}

case object ApplyRange extends RangeValueId {
  override val id: Int = 3
}

//Remove
case object RemoveRemoveRange extends RangeValueId {
  override val id: Int = 4
}

case object RemoveUpdateRange extends RangeValueId {
  override val id: Int = 5
}

case object RemoveApplyRange extends RangeValueId {
  override val id: Int = 6
}

//Put
case object PutUpdateRange extends RangeValueId {
  override val id: Int = 7
}

case object PutRemoveRange extends RangeValueId {
  override val id: Int = 8
}

case object PutApplyRange extends RangeValueId {
  override val id: Int = 9
}

//Update
case object UpdateRemoveRange extends RangeValueId {
  override val id: Int = 10
}

case object UpdateUpdateRange extends RangeValueId {
  override val id: Int = 11
}

case object UpdateApplyRange extends RangeValueId {
  override val id: Int = 12
}

//Apply
case object ApplyApplyRange extends RangeValueId {
  override val id: Int = 13
}

case object ApplyRemoveRange extends RangeValueId {
  override val id: Int = 14
}

case object ApplyUpdateRange extends RangeValueId {
  override val id: Int = 15
}

object RangeValueId {
  val ids = SealedList.list[RangeValueId] map {
    rangeId =>
      rangeId.id -> rangeId
  } toMap

  def apply(id: Int): Try[RangeValueId] =
    ids.get(id).map(Success(_)).getOrElse(Failure(new Exception(s"Invalid ${this.getClass.getSimpleName}: $id")))
}
