package swaydb.data.order

import swaydb.data.slice.Slice

object TimeOrder {
  val long = new TimeOrder[Slice[Byte]] {
    override def compare(x: Slice[Byte], y: Slice[Byte]): Int =
      x.readLong() compare y.readLong()
  }
}

trait TimeOrder[T] extends Ordering[T]
