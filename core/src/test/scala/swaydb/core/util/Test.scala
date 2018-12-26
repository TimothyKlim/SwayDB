package swaydb.core.util

import scala.collection.mutable.ListBuffer

object Test extends App {

  val one = ListBuffer(3, 4, 5, 6, 7, 10)
  val two = ListBuffer(1, 2, 3, 4, 5, 6)

  one.diff(two) foreach println

}
