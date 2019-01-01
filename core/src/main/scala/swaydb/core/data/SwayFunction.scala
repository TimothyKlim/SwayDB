package swaydb.core.data

import scala.concurrent.duration.Deadline
import swaydb.data.slice.Slice

sealed trait SwayFunction

object SwayFunction {
  sealed trait RequiresKey extends SwayFunction

  case class Key(f: Slice[Byte] => FunctionOutput) extends RequiresKey
  case class KeyValue(f: (Slice[Byte], Option[Slice[Byte]]) => FunctionOutput) extends RequiresKey
  case class KeyDeadline(f: (Slice[Byte], Option[Deadline]) => FunctionOutput) extends RequiresKey
  case class KeyValueDeadline(f: (Slice[Byte], Option[Slice[Byte]], Option[Deadline]) => FunctionOutput) extends RequiresKey

  case class Value(f: Option[Slice[Byte]] => FunctionOutput) extends SwayFunction
  case class ValueDeadline(f: (Option[Slice[Byte]], Option[Deadline]) => FunctionOutput) extends SwayFunction
}

sealed trait FunctionOutput {
  def toValue(): Value.RangeValue
}
object FunctionOutput {

  case object Remove extends FunctionOutput {
    def toValue(): Value.Remove =
      Value.Remove(None)
  }

  case class Expire(deadline: Deadline) extends FunctionOutput {
    def toValue(): Value.Remove =
      Value.Remove(deadline)
  }

  case class Update(value: Option[Slice[Byte]], deadline: Option[Deadline]) extends FunctionOutput {
    def toValue(): Value.Update =
      Value.Update(value, deadline)
  }
}
