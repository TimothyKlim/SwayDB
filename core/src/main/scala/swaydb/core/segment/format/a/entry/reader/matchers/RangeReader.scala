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

import swaydb.core.data.Persistent
import swaydb.core.segment.format.a.entry.id.EntryId
import swaydb.core.segment.format.a.entry.reader._
import swaydb.data.slice.Reader
import scala.util.Try
import swaydb.core.segment.format.a.entry.reader.lazyvalue.LazyRangeValueReader

object RangeReader {


  def reader[T <: EntryId](id: T,
                           indexReader: Reader,
                           valueReader: Reader,
                           indexOffset: Int,
                           nextIndexOffset: Int,
                           nextIndexSize: Int,
                           previous: Option[Persistent])(implicit keyReader: KeyReader[T],
                                                         valueOffsetReader: ValueOffsetReader[T],
                                                         valueLengthReader: ValueLengthReader[T],
                                                         valueBytesReader: ValueReader[T]): Try[Persistent.Range] =
    valueBytesReader.read(indexReader, previous) flatMap {
      valueOffsetAndLength =>
        keyReader.read(indexReader, previous) flatMap {
          key =>
            val valueOffset = valueOffsetAndLength.map(_._1).getOrElse(-1)
            val valueLength = valueOffsetAndLength.map(_._2).getOrElse(0)

            Persistent.Range(
              key = key,
              lazyRangeValueReader =
                LazyRangeValueReader(
                  reader = valueReader,
                  offset = valueOffset,
                  length = valueLength
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
