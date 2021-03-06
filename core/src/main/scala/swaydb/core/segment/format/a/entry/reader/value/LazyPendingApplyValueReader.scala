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

package swaydb.core.segment.format.a.entry.reader.value

import swaydb.core.data.Value
import swaydb.core.io.reader.Reader
import swaydb.core.map.serializer.ValueSerializer
import swaydb.data.IO
import swaydb.data.slice.{Reader, Slice}

object LazyPendingApplyValueReader {
  def apply(reader: Reader,
            offset: Int,
            length: Int): LazyPendingApplyValueReader =
    new LazyPendingApplyValueReader {
      override def valueReader: Reader = reader

      override def valueLength: Int = length

      override def valueOffset: Int = offset
    }
}

//GAH! Inheritance Yuk! Need to update this code.
trait LazyPendingApplyValueReader extends LazyValueReader {

  @volatile private var applyFunctions: Slice[Value.Apply] = _

  def getOrFetchApplies: IO[Slice[Value.Apply]] =
    if (applyFunctions == null)
      getOrFetchValue flatMap {
        case Some(valueBytes) =>
          ValueSerializer.read[Slice[Value.Apply]](valueBytes) map {
            applies =>
              this.applyFunctions = applies.map(_.unslice)
              applyFunctions
          }
        case None =>
          IO.Failure(new IllegalStateException(s"Failed to read ApplyValue's value"))
      }
    else
      IO.Success(applyFunctions)
}

object ActivePendingApplyValueReader {
  def apply(applies: Slice[Value.Apply]): ActivePendingApplyValueReader =
    new ActivePendingApplyValueReader(applies)
}

class ActivePendingApplyValueReader(applies: Slice[Value.Apply]) extends LazyPendingApplyValueReader {

  override def getOrFetchApplies: IO[Slice[Value.Apply]] = IO.Success(applies)

  override def valueReader: Reader = {
    val bytesRequires = ValueSerializer.bytesRequired(applies)
    val slice = Slice.create[Byte](bytesRequires)
    ValueSerializer.write(applies)(slice)
    Reader(slice)
  }

  override def valueLength: Int =
    ValueSerializer.bytesRequired(applies)

  override def valueOffset: Int =
    0
}
