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
import swaydb.core.segment.format.a.entry.reader.lazyvalue.LazyAppliesReader
import swaydb.data.slice.Reader

object RemoveReader {

  def reader[T <: EntryId](id: T,
                           valueReader: Reader,
                           indexReader: Reader,
                           indexOffset: Int,
                           nextIndexOffset: Int,
                           nextIndexSize: Int,
                           previous: Option[Persistent])(implicit keyReader: KeyReader[T],
                                                         valueOffsetReader: ValueOffsetReader[T],
                                                         valueLengthReader: ValueLengthReader[T],
                                                         valueBytesReader: ValueReader[T],
                                                         deadlineReader: DeadlineReader[T]): Try[Persistent.Remove] =
    deadlineReader.read(indexReader, previous) flatMap {
      deadline =>
        valueBytesReader.read(indexReader, previous) flatMap {
          valueOffsetAndLength =>
            keyReader.read(indexReader, previous) map {
              key =>
                val valueOffset = valueOffsetAndLength.map(_._1).getOrElse(-1)
                val valueLength = valueOffsetAndLength.map(_._2).getOrElse(0)

                Persistent.Remove(
                  _key = key,
                  indexOffset = indexOffset,
                  nextIndexOffset = nextIndexOffset,
                  nextIndexSize = nextIndexSize,
                  deadline = deadline,
                  appliesReader =
                    LazyAppliesReader(
                      valueReader = valueReader,
                      valueOffset = valueOffset,
                      valueLength = valueLength
                    ),

                )
            }
        }

    }

}
