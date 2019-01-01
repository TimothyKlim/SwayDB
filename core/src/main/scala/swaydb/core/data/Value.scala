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

package swaydb.core.data

import scala.concurrent.duration.{Deadline, FiniteDuration}
import swaydb.data.slice.Slice

private[swaydb] sealed trait Value {

  //@formatter:off
  def isRemove: Boolean
  def notRemove: Boolean = !isRemove
  def unslice: Value
  def time: Option[Time]
  //@formatter:on
}

private[swaydb] object Value {

  def hasTimeLeft(rangeValue: Value.RangeValue): Boolean =
    rangeValue match {
      case remove: Value.Remove =>
        remove.deadline.exists(_.hasTimeLeft())
      case update: Value.Update =>
        update.deadline.forall(_.hasTimeLeft())
      case _: Value.Function =>
        true
      case _: Value.PendingApply =>
        true
    }

  def hasTimeLeft(fromValue: Value.FromValue): Boolean =
    fromValue match {
      case rangeValue: RangeValue =>
        hasTimeLeft(rangeValue)
      case put: Put =>
        put.deadline.forall(_.hasTimeLeft())
    }

  private[swaydb] sealed trait RangeValue extends FromValue {
    def unslice: RangeValue
  }
  private[swaydb] sealed trait FromValue extends Value {
    def unslice: FromValue

    def toMemory(key: Slice[Byte]): Memory.Fixed

    def toMemoryPut(key: Slice[Byte]): Option[Memory.Put]
  }

  private[swaydb] sealed trait Apply extends RangeValue {
    def unslice: Apply

    def time: Option[Time]
  }

  case class Remove(deadline: Option[Deadline],
                    time: Option[Time]) extends RangeValue with Apply {

    override val isRemove: Boolean = true

    def unslice(): Value.Remove =
      Remove(deadline = deadline, time = time.map(_.unslice()))

    def hasTimeLeft(): Boolean =
      deadline.exists(_.hasTimeLeft())

    override def toMemory(key: Slice[Byte]): Memory.Remove =
      Memory.Remove(key, deadline, time)

    override def toMemoryPut(key: Slice[Byte]): Option[Memory.Put] =
      None
  }


  case class Put(value: Option[Slice[Byte]],
                 deadline: Option[Deadline],
                 time: Option[Time]) extends FromValue {

    override val isRemove: Boolean = false

    def unslice(): Value.Put =
      Put(value = value.unslice(), deadline, time.map(_.unslice()))

    def toMemory(key: Slice[Byte]): Memory.Put =
      Memory.Put(key, value, deadline, time)

    override def toMemoryPut(key: Slice[Byte]): Option[Memory.Put] =
      Some(toMemory(key))

    def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())
  }

  case class Update(value: Option[Slice[Byte]],
                    deadline: Option[Deadline],
                    time: Option[Time]) extends RangeValue with Apply {

    override val isRemove: Boolean = false

    def unslice(): Value.Update =
      Update(value = value.unslice(), deadline, time.map(_.unslice()))

    def toMemory(key: Slice[Byte]): Memory.Update =
      Memory.Update(key, value, deadline, time)

    def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def toMemoryPut(key: Slice[Byte]): Option[Memory.Put] =
      None
  }

  case class Function(function: Slice[Byte],
                      time: Option[Time]) extends RangeValue with Apply {

    override val isRemove: Boolean = false

    def unslice(): Function =
      Function(function.unslice(), time.map(_.unslice()))

    def toMemory(key: Slice[Byte]): Memory.PendingApply =
      Memory.PendingApply(key, Slice(this))

    override def toMemoryPut(key: Slice[Byte]): Option[Memory.Put] =
      None
  }

  case class PendingApply(applies: Slice[Value.Apply]) extends RangeValue {
    def time = applies.lastOption.flatMap(_.time)

    override val isRemove: Boolean = false

    def unslice(): Value.PendingApply =
      PendingApply(applies.map(_.unslice))

    def toMemory(key: Slice[Byte]): Memory.PendingApply =
      Memory.PendingApply(key, applies)

    override def toMemoryPut(key: Slice[Byte]): Option[Memory.Put] =
      None
  }
}
