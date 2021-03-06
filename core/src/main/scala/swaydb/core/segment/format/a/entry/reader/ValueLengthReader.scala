/*
 * Copyright (c) 2019 Simer Plaha (@simerplaha)
 *
 * This file is a part of SwayDB.
 *
 * SwayDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * SwayDB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with SwayDB. If not, see <https://www.gnu.org/licenses/>.
 */

package swaydb.core.segment.format.a.entry.reader

import scala.annotation.implicitNotFound
import swaydb.core.data.Persistent
import swaydb.core.segment.format.a.entry.id.EntryId
import swaydb.core.util.Bytes
import swaydb.data.IO
import swaydb.data.slice.{Reader, Slice}
import swaydb.data.util.ByteSizeOf

@implicitNotFound("Type class implementation not found for ValueLengthReader of type ${T}")
sealed trait ValueLengthReader[-T] {

  def read(indexReader: Reader,
           previous: Option[Persistent]): IO[Int]

}

object ValueLengthReader {

  private def readLength(indexReader: Reader,
                         previous: Option[Persistent],
                         commonBytes: Int): IO[Int] =
    previous.map(_.valueLength) map {
      previousValueLength =>
        indexReader.read(ByteSizeOf.int - commonBytes) map {
          valueLengthBytes =>
            Bytes.decompress(Slice.writeInt(previousValueLength), valueLengthBytes, commonBytes).readInt()
        }
    } getOrElse {
      IO.Failure(EntryReaderFailure.NoPreviousKeyValue)
    }

  implicit object ValueLengthOneCompressed extends ValueLengthReader[EntryId.ValueLength.OneCompressed] {
    override def read(indexReader: Reader,
                      previous: Option[Persistent]): IO[Int] =
      readLength(indexReader, previous, 1)
  }

  implicit object ValueLengthTwoCompressed extends ValueLengthReader[EntryId.ValueLength.TwoCompressed] {
    override def read(indexReader: Reader,
                      previous: Option[Persistent]): IO[Int] =
      readLength(indexReader, previous, 2)
  }

  implicit object ValueLengthThreeCompressed extends ValueLengthReader[EntryId.ValueLength.ThreeCompressed] {
    override def read(indexReader: Reader,
                      previous: Option[Persistent]): IO[Int] =
      readLength(indexReader, previous, 3)
  }

  implicit object ValueLengthFullyCompressed extends ValueLengthReader[EntryId.ValueLength.FullyCompressed] {
    override def read(indexReader: Reader,
                      previous: Option[Persistent]): IO[Int] =
      previous map {
        previous =>
          IO.Success(previous.valueLength)
      } getOrElse IO.Failure(EntryReaderFailure.NoPreviousKeyValue)
  }

  implicit object ValueLengthUncompressed extends ValueLengthReader[EntryId.ValueLength.Uncompressed] {
    override def read(indexReader: Reader,
                      previous: Option[Persistent]): IO[Int] =
      indexReader.readIntUnsigned()
  }

  implicit object ValueLengthReaderValueFullyCompressed extends ValueLengthReader[EntryId.Value.FullyCompressed] {
    override def read(indexReader: Reader,
                      previous: Option[Persistent]): IO[Int] =
      IO.zero
  }
  implicit object NoValue extends ValueLengthReader[EntryId.Value.NoValue] {
    override def read(indexReader: Reader,
                      previous: Option[Persistent]): IO[Int] =
      IO.zero
  }
}
