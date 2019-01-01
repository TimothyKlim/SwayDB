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

  object Remove {
    def apply(deadline: Deadline): Remove =
      new Remove(Some(deadline), None)

    def apply(deadline: Option[Deadline]): Remove =
      new Remove(deadline, None)
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

  object Put {

    def apply(value: Slice[Byte]): Put =
      new Put(Some(value), None, None)

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Put =
      new Put(value, Some(removeAfter), None)

    def apply(value: Slice[Byte], removeAfter: Deadline): Put =
      new Put(Some(value), Some(removeAfter), None)

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Put =
      new Put(value, removeAfter, None)

    def apply(value: Slice[Byte], duration: FiniteDuration): Put =
      new Put(Some(value), Some(duration.fromNow), None)

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Put =
      new Put(value, Some(duration.fromNow), None)
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

  object Update {

    def apply(value: Slice[Byte]): Update =
      new Update(Some(value), None, None)

    //    def apply(value: Slice[Byte], removeAfter: Deadline): Update =
    //      new Update(Some(value), Some(removeAfter), None)

    //    def apply(value: Slice[Byte], duration: FiniteDuration): Update =
    //      new Update(Some(value), Some(duration.fromNow), None)
    //
    //    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Update =
    //      new Update(value, Some(duration.fromNow), None)

    //    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Update =
    //      new Update(value, Some(removeAfter), None)

    def apply(value: Slice[Byte], deadline: Option[Deadline]): Update =
      new Update(
        value = Some(value),
        deadline = deadline,
        time = None,
      )

    def apply(value: Slice[Byte], removeAfter: Deadline): Update =
      new Update(
        value = Some(value),
        time = None,
        deadline = Some(removeAfter)
      )

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Update =
      new Update(
        value = value,
        time = None,
        deadline = removeAfter
      )

    def apply(value: Slice[Byte], duration: FiniteDuration): Update =
      new Update(
        value = Some(value),
        time = None,
        deadline = Some(duration.fromNow)
      )

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Update =
      new Update(
        value = value,
        time = None,
        deadline = Some(duration.fromNow)
      )

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Update =
      new Update(
        value = value,
        time = None,
        deadline = Some(removeAfter)
      )
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
