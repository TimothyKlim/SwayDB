package swaydb.core.segment.format.a.entry.reader.lazyvalue

import scala.util.{Failure, Success, Try}
import swaydb.core.segment.format.a.SegmentReader
import swaydb.data.slice.{Reader, Slice}

private[lazyvalue] trait LazyValueReader {

  @volatile var valueOption: Option[Slice[Byte]] = _

  val valueReader: Reader

  def valueLength: Int

  def valueOffset: Int

  //tries fetching the value from the given reader
  private def fetchValue(reader: Reader): Try[Option[Slice[Byte]]] =
    if (valueOption == null)
      SegmentReader.readBytes(valueOffset, valueLength, reader) map {
        value =>
          valueOption = value
          value
      } recoverWith {
        case ex =>
          Failure(ex)
      }
    else
      Success(valueOption)

  def getOrFetchValue: Try[Option[Slice[Byte]]] =
    fetchValue(valueReader)

  def isValueDefined: Boolean =
    valueOption != null

  def getValue: Option[Slice[Byte]] =
    valueOption
}
