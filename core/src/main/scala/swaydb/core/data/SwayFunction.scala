package swaydb.core.data

import scala.concurrent.duration.Deadline
import swaydb.data.slice.Slice

sealed trait SwayFunction

object SwayFunction {
  sealed trait RequiresKey extends SwayFunction
  sealed trait RequiresValueOnly extends SwayFunction

  case class Key(f: Slice[Byte] => FunctionOutput) extends RequiresKey
  case class KeyValue(f: (Slice[Byte], Option[Slice[Byte]]) => FunctionOutput) extends RequiresKey
  case class KeyDeadline(f: (Slice[Byte], Option[Deadline]) => FunctionOutput) extends RequiresKey
  case class KeyValueDeadline(f: (Slice[Byte], Option[Slice[Byte]], Option[Deadline]) => FunctionOutput) extends RequiresKey

  case class Value(f: Option[Slice[Byte]] => FunctionOutput) extends RequiresValueOnly
  case class ValueDeadline(f: (Option[Slice[Byte]], Option[Deadline]) => FunctionOutput) extends RequiresValueOnly
}

sealed trait FunctionOutput {
  def toValue(time: Option[Time]): Value.RangeValue
}
object FunctionOutput {

  case object Remove extends FunctionOutput {
    def toValue(time: Option[Time]): Value.Remove =
      Value.Remove(None, time)
  }

  case class Expire(deadline: Deadline) extends FunctionOutput {
    def toValue(time: Option[Time]): Value.Remove =
      Value.Remove(Some(deadline), time)
  }

  case class Update(value: Option[Slice[Byte]], deadline: Option[Deadline]) extends FunctionOutput {
    def toValue(time: Option[Time]): Value.Update =
      Value.Update(value, deadline, time)
  }
}
