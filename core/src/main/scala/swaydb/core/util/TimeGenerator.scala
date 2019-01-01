package swaydb.core.util

import java.util.concurrent.atomic.AtomicLong
import swaydb.core.data.Time
import swaydb.data.slice.Slice

trait TimeGenerator {
  def nextTime: Time
}

object TimeGenerator {

  def createAtomicLong(startTime: Long): TimeGenerator =
    new AtomicLongTimeGenerator(new AtomicLong(startTime))

  def createNewAtomicLong(): TimeGenerator =
    createAtomicLong(0)

  private class AtomicLongTimeGenerator(time: AtomicLong) extends TimeGenerator {

    def nextTime: Time =
      Time(Slice.writeLong(time.incrementAndGet()))
  }

}
