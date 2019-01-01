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

package swaydb.core.segment.format.a.entry.reader

import swaydb.core.data.Persistent
import swaydb.core.segment.SegmentException
import swaydb.core.segment.format.a.entry.id._
import swaydb.core.segment.format.a.entry.reader.matchers._
import swaydb.data.slice.{Reader, Slice}
import scala.util.{Failure, Try}
import swaydb.data.order.KeyOrder

object EntryReader {

  def read(indexReader: Reader,
           valueReader: Reader,
           indexOffset: Int,
           nextIndexOffset: Int,
           nextIndexSize: Int,
           previous: Option[Persistent])(implicit keyOrder: KeyOrder[Slice[Byte]]): Try[Persistent] =
    indexReader.readIntUnsigned() flatMap {
      id =>
        if (PutEntryId.contains(id))
          PutKeyFullyCompressedEntryReader.read(
            id = id,
            indexReader = indexReader,
            valueReader = valueReader,
            indexOffset = indexOffset,
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            previous = previous
          ) orElse {
            PutKeyPartiallyCompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } orElse {
            PutKeyUncompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } getOrElse {
            Failure(SegmentException.InvalidEntryId(id))
          }
        else if (RemoveEntryId.contains(id))
          RemoveKeyFullyCompressedEntryReader.read(
            id = id,
            indexReader = indexReader,
            valueReader = valueReader,
            indexOffset = indexOffset,
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            previous = previous
          ) orElse {
            RemoveKeyPartiallyCompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } orElse {
            RemoveKeyUncompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } getOrElse {
            Failure(SegmentException.InvalidEntryId(id))
          }
        else if (UpdateEntryId.contains(id))
          UpdateKeyFullyCompressedEntryReader.read(
            id = id,
            indexReader = indexReader,
            valueReader = valueReader,
            indexOffset = indexOffset,
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            previous = previous
          ) orElse {
            UpdateKeyPartiallyCompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } orElse {
            UpdateKeyUncompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } getOrElse {
            Failure(SegmentException.InvalidEntryId(id))
          }
        else if (RangeEntryId.contains(id))
          RangeKeyFullyCompressedEntryReader.read(
            id = id,
            indexReader = indexReader,
            valueReader = valueReader,
            indexOffset = indexOffset,
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            previous = previous
          ) orElse {
            RangeKeyPartiallyCompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } orElse {
            RangeKeyUncompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } getOrElse {
            Failure(SegmentException.InvalidEntryId(id))
          }
        else if (GroupEntryId.contains(id))
          GroupKeyFullyCompressedEntryReader.read(
            id = id,
            indexReader = indexReader,
            valueReader = valueReader,
            indexOffset = indexOffset,
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            previous = previous
          ) orElse {
            GroupKeyPartiallyCompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } orElse {
            GroupKeyUncompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } getOrElse {
            Failure(SegmentException.InvalidEntryId(id))
          }
        else if (PendingApplyEntryId.contains(id))
          PendingApplyKeyFullyCompressedEntryReader.read(
            id = id,
            indexReader = indexReader,
            valueReader = valueReader,
            indexOffset = indexOffset,
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            previous = previous
          ) orElse {
            PendingApplyKeyPartiallyCompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } orElse {
            PendingApplyKeyUncompressedEntryReader.read(
              id = id,
              indexReader = indexReader,
              valueReader = valueReader,
              indexOffset = indexOffset,
              nextIndexOffset = nextIndexOffset,
              nextIndexSize = nextIndexSize,
              previous = previous
            )
          } getOrElse {
            Failure(SegmentException.InvalidEntryId(id))
          }
        else
          Failure(SegmentException.InvalidEntryId(id))
    }
}
