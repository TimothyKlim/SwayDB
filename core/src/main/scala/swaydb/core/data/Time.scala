package swaydb.core.data

import swaydb.data.order.TimeOrder
import swaydb.data.slice.Slice

object Time {

  def >(upperTime: Option[Time], lowerTime: Option[Time])(implicit timeOrder: TimeOrder[Slice[Byte]]): Boolean = {
    import timeOrder._
    (upperTime, lowerTime) match {
      case (Some(upperTime), Some(lowerTime)) =>
        //if timeOne and timeTwo are the same this means the upper is already merged into lower so lower is greater.
        upperTime.time > lowerTime.time

      case (None, None) =>
        true

      case (None, Some(_)) =>
        true

      case (Some(_), None) =>
        true
    }
  }

  implicit class TimeOptionImplicits(time: Option[Time]) {
    def unslice() =
      time.map(_.unslice())

    def >(otherTime: Option[Time])(implicit timeOrder: TimeOrder[Slice[Byte]]): Boolean =
      Time > (time, otherTime)

  }
}

case class Time(time: Slice[Byte]) {
  def unslice(): Time =
    Time(time.unslice())
}
