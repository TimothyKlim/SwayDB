package swaydb.core.segment.format.a.entry.reader.lazyvalue

import scala.util.Try
import swaydb.data.slice.{Reader, Slice}

object LazyGroupValueReader {
  def apply(valueReader: Reader,
            valueOffset: Int,
            valueLength: Int): LazyGroupValueReader =
    new LazyGroupValueReader {
      override val valueReader: Reader = valueReader

      override def valueLength: Int = valueLength

      override def valueOffset: Int = valueOffset
    }
}

trait LazyGroupValueReader extends LazyValueReader {

  override def getOrFetchValue: Try[Option[Slice[Byte]]] =
    super.getOrFetchValue

  override def isValueDefined: Boolean =
    super.isValueDefined
}
