package swaydb.core.segment.format.a.entry.reader.lazyvalue

import scala.util.{Failure, Success, Try}
import swaydb.core.data.Value
import swaydb.core.map.serializer.ValueSerializer
import swaydb.data.slice.Reader

object LazyApplyValueReader {
  def apply(valueReader: Reader,
            valueOffset: Int,
            valueLength: Int): LazyApplyValueReader =
    new LazyApplyValueReader {
      override val valueReader: Reader = valueReader

      override def valueLength: Int = valueLength

      override def valueOffset: Int = valueOffset
    }

}

//GAH! Inheritance Yuk! Need to update this code.
trait LazyApplyValueReader extends LazyValueReader {

  @volatile private var applyFunctions: Seq[Value.ApplyValue] = _

  def getOrFetchApplies: Try[Seq[Value.ApplyValue]] =
    if (applyFunctions == null)
      getOrFetchValue flatMap {
        case Some(valueBytes) =>
          ValueSerializer.read[Seq[Value.ApplyValue]](valueBytes) map {
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
