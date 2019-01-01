package swaydb.core.segment.format.a.entry.reader.lazyvalue

import scala.util.{Failure, Success, Try}
import swaydb.core.data.Value
import swaydb.core.map.serializer.ValueSerializer
import swaydb.data.slice.{Reader, Slice}

object LazyApplyValueReader {
  def apply(reader: Reader,
            offset: Int,
            length: Int): LazyApplyValueReader =
    new LazyApplyValueReader {
      override val valueReader: Reader = reader

      override def valueLength: Int = offset

      override def valueOffset: Int = length
    }

}

//GAH! Inheritance Yuk! Need to update this code.
trait LazyApplyValueReader extends LazyValueReader {

  @volatile private var applyFunctions: Slice[Value.Apply] = _

  def getOrFetchApplies: Try[Slice[Value.Apply]] =
    if (applyFunctions == null)
      getOrFetchValue flatMap {
        case Some(valueBytes) =>
          ValueSerializer.read[Slice[Value.Apply]](valueBytes) map {
            applies =>
              this.applyFunctions = applies.map(_.unslice)
              applyFunctions
          }
        case None =>
          Failure(new IllegalStateException(s"Failed to read ApplyValue's value"))
      }
    else
      Success(applyFunctions)
}
