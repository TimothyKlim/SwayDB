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
  def deadline: Option[Deadline]
  def hasTimeLeft(): Boolean
  def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean
  def unslice: Value
//  def appliedFunctions: Seq[Slice[Byte]]
  //@formatter:on

  def isOverdue(): Boolean =
    !hasTimeLeft()
}

private[swaydb] object Value {

  private[swaydb] sealed trait FromValue extends Value {
    def unslice: FromValue
  }
  private[swaydb] sealed trait RangeValue extends Value {
    def unslice: RangeValue
  }
  private[swaydb] sealed trait ApplyValue extends FromValue with RangeValue {
    def unslice: ApplyValue
  }

  implicit class RangeValueImplicits(value: Value.RangeValue) {
    /**
      * @return An Value key-value with it's byte arrays sliced.
      *         If the sliced byte array is empty, it set the value to None.
      */

    def toMemory(key: Slice[Byte]): Memory.Fixed =
      value match {
        case Value.Remove(applies, deadline) =>
          Memory.Remove(key, applies, deadline)

        case Value.Update(value, applies, deadline) =>
          Memory.Update(key, value, applies, deadline)

        case Value.Apply(applies) =>
          Memory.Apply(key, applies)

        case function: Value.Function =>
          Memory.Apply(key, Seq(function))
      }
  }

  implicit class ValueImplicits(value: Value) {
    /**
      * @return An Value key-value with it's byte arrays sliced.
      *         If the sliced byte array is empty, it set the value to None.
      */
    def toMemory(key: Slice[Byte]): Memory.Fixed =
      value match {
        case Value.Remove(applies, deadline) =>
          Memory.Remove(key, applies, deadline)

        case Value.Put(value, applies, deadline) =>
          Memory.Put(key, value, applies, deadline)

        case Value.Update(value, applies, deadline) =>
          Memory.Update(key, value, applies, deadline)

        case Value.Apply(applies) =>
          Memory.Apply(key, applies)

        case function: Value.Function =>
          Memory.Apply(key, Seq(function))
      }
  }

  object Remove {
    def apply(deadline: Deadline): Remove =
      new Remove(Slice.emptySeqBytes, Some(deadline))

    def apply(deadline: Option[Deadline]): Remove =
      new Remove(Slice.emptySeqBytes, deadline)
  }

  case class Remove(applies: Seq[Slice[Byte]],
                    deadline: Option[Deadline]) extends FromValue with RangeValue {

    override val isRemove: Boolean = true

    override def hasTimeLeft(): Boolean =
      deadline.exists(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.exists(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Remove =
      Remove(deadline = deadline, applies = applies.unslice())
  }

  object Put {
    def apply(value: Slice[Byte]): Put =
      new Put(Some(value), applies = Slice.emptySeqBytes, None)

    def apply(value: Slice[Byte], removeAfter: Deadline): Put =
      new Put(Some(value), applies = Slice.emptySeqBytes, Some(removeAfter))

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Put =
      new Put(value, applies = Slice.emptySeqBytes, removeAfter)

    def apply(value: Slice[Byte], duration: FiniteDuration): Put =
      new Put(Some(value), applies = Slice.emptySeqBytes, Some(duration.fromNow))

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Put =
      new Put(value, applies = Slice.emptySeqBytes, Some(duration.fromNow))

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Put =
      new Put(value, applies = Slice.emptySeqBytes, Some(removeAfter))
  }

  case class Put(value: Option[Slice[Byte]],
                 applies: Seq[Slice[Byte]],
                 deadline: Option[Deadline]) extends FromValue {

    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Put =
      Put(value = value.unslice(), applies.unslice(), deadline)
  }

  object Update {
    def apply(value: Slice[Byte]): Update =
      new Update(
        value = Some(value),
        applies = Slice.emptySeqBytes,
        deadline = None
      )

    def apply(value: Slice[Byte], deadline: Option[Deadline]): Update =
      new Update(
        value = Some(value),
        applies = Slice.emptySeqBytes,
        deadline = deadline
      )

    def apply(value: Slice[Byte], removeAfter: Deadline): Update =
      new Update(
        value = Some(value),
        applies = Slice.emptySeqBytes,
        deadline = Some(removeAfter)
      )

    def apply(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Update =
      new Update(
        value = value,
        applies = Slice.emptySeqBytes,
        deadline = removeAfter
      )

    def apply(value: Slice[Byte], duration: FiniteDuration): Update =
      new Update(
        value = Some(value),
        applies = Slice.emptySeqBytes,
        deadline = Some(duration.fromNow)
      )

    def apply(value: Option[Slice[Byte]], duration: FiniteDuration): Update =
      new Update(
        value = value,
        applies = Slice.emptySeqBytes,
        deadline = Some(duration.fromNow)
      )

    def apply(value: Option[Slice[Byte]])(removeAfter: Deadline): Update =
      new Update(
        value = value,
        applies = Slice.emptySeqBytes,
        deadline = Some(removeAfter)
      )
  }

  case class Update(value: Option[Slice[Byte]],
                    applies: Seq[Slice[Byte]],
                    deadline: Option[Deadline]) extends ApplyValue {

    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Update =
      Update(value = value.unslice(), applies.unslice(), deadline)
  }

  case class Function(id: Slice[Byte],
                      function: Slice[Byte]) extends ApplyValue {

    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Function =
      Function(id.unslice(), function.unslice())

    override def deadline: Option[Deadline] = None
  }

  case class Apply(applies: Seq[ApplyValue]) extends FromValue with RangeValue {
    override val isRemove: Boolean = false

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def hasTimeLeftWithGrace(grace: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - grace).hasTimeLeft())

    def unslice(): Value.Apply =
      Apply(applies.map(_.unslice))

    override def deadline: Option[Deadline] = None
  }
}
