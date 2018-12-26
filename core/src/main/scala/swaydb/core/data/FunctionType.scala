package swaydb.core.data

import scala.concurrent.duration.Deadline
import swaydb.data.slice.Slice

sealed trait FunctionType
object FunctionType {
  case class FromKey(f: (Slice[Byte], Option[Deadline]) => (Option[Slice[Byte]], Option[Deadline])) extends FunctionType
  case class FromKeyValue(f: (Slice[Byte], Option[Slice[Byte]], Option[Deadline]) => (Option[Slice[Byte]], Option[Deadline])) extends FunctionType
}
