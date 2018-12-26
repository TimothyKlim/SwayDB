package swaydb.core.segment.format.a.entry.reader.lazyvalue

import scala.util.{Failure, Success, Try}
import swaydb.core.map.serializer.ValueSerializer
import swaydb.data.slice.{Reader, Slice}

object LazyValueAndFunctionsAppliesReader {

  def apply(valueReader: Reader,
                      valueOffset: Int,
                      valueLength: Int): LazyValueAndFunctionsAppliesReader =
    new LazyValueAndFunctionsAppliesReader {
      override val valueReader: Reader = valueReader

      override def valueLength: Int = valueLength

      override def valueOffset: Int = valueOffset
    }
}

//GAH! Inheritance Yuk! Need to update this code.
trait LazyValueAndFunctionsAppliesReader extends LazyValueReader {

  @volatile private var value: Option[Slice[Byte]] = _
  @volatile private var applies: Seq[Slice[Byte]] = _

  override def getOrFetchValue: Try[Option[Slice[Byte]]] =
    if (value == null)
      getOrFetchValueAndApplies.map(_._1)
    else
      Success(value)

  def getOrFetchApplies: Try[Seq[Slice[Byte]]] =
    if (applies == null)
      getOrFetchValueAndApplies.map(_._2)
    else
      Success(applies)

  def getOrFetchValueAndApplies: Try[(Option[Slice[Byte]], Seq[Slice[Byte]])] =
    if (value == null || applies == null)
      super.getOrFetchValue flatMap {
        case Some(fromAndRangeValueBytes) =>
          ValueSerializer.read[(Option[Slice[Byte]], Seq[Slice[Byte]])](fromAndRangeValueBytes) map {
            case (option, sequence) =>
              this.value = option.unslice()
              this.applies = sequence.unslice()
              (this.value, this.applies)
          }
        case None =>
          Failure(new IllegalStateException(s"Failed to read range's value"))
      }
    else
      Success(value, applies)
}
