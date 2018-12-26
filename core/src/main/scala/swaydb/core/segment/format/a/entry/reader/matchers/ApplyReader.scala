/*
 * Copyright (C) 2018 Simer Plaha (@simerplaha)
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

package swaydb.core.segment.format.a.entry.reader.matchers

import scala.util.Try
import swaydb.core.data.Persistent
import swaydb.core.segment.format.a.entry.id.EntryId
import swaydb.core.segment.format.a.entry.reader._
import swaydb.core.segment.format.a.entry.reader.lazyvalue.LazyApplyValueReader
import swaydb.data.slice.Reader

object ApplyReader {

  def reader[T <: EntryId](id: T,
                           indexReader: Reader,
                           valueReader: Reader,
                           indexOffset: Int,
                           nextIndexOffset: Int,
                           nextIndexSize: Int,
                           previous: Option[Persistent])(implicit keyReader: KeyReader[T],
                                                         valueOffsetReader: ValueOffsetReader[T],
                                                         valueLengthReader: ValueLengthReader[T],
                                                         valueBytesReader: ValueReader[T]): Try[Persistent.Apply] =
    valueBytesReader.read(indexReader, previous) flatMap {
      valueOffsetAndLength =>
        val valueOffset = valueOffsetAndLength.map(_._1).getOrElse(-1)
        val valueLength = valueOffsetAndLength.map(_._2).getOrElse(0)

        keyReader.read(indexReader, previous) map {
          key =>
            Persistent.Apply(
              _key = key,
              applyValueReader =
                LazyApplyValueReader(
                  valueReader = valueReader,
                  valueOffset = valueOffset,
                  valueLength = valueLength
                ),
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              indexOffset = indexOffset,
              valueOffset = valueOffset,
              valueLength = valueLength
            )
        }
    }

}
