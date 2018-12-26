package swaydb.core.segment.format.a.entry.reader.lazyvalue

import scala.util.{Failure, Success, Try}
import swaydb.core.map.serializer.ValueSerializer
import swaydb.data.slice.{Reader, Slice}

object LazyAppliesReader {
  def apply(valueReader: Reader,
            valueOffset: Int,
            valueLength: Int): LazyAppliesReader =
    new LazyAppliesReader {
      override val valueReader: Reader = valueReader

      override def valueLength: Int = valueLength

      override def valueOffset: Int = valueOffset
    }

}

//GAH! Inheritance Yuk! Need to update this code.
trait LazyAppliesReader extends LazyValueReader {

  @volatile private var applies: Seq[Slice[Byte]] = _

  def getOrFetchApplies: Try[Seq[Slice[Byte]]] =
    if (applies == null)
      getOrFetchValue flatMap {
        case Some(fromAndRangeValueBytes) =>
          ValueSerializer.read[Seq[Slice[Byte]]](fromAndRangeValueBytes) map {
            applies =>
              this.applies = applies.unslice()
              this.applies
          }
        case None =>
          Failure(new IllegalStateException(s"Failed to read range's value"))
      }
    else
      Success(applies)
}
