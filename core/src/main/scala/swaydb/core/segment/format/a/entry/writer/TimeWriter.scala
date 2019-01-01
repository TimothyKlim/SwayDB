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

package swaydb.core.segment.format.a.entry.writer

import swaydb.core.data.KeyValue.WriteOnly
import swaydb.core.data.{KeyValue, Time, Transient}
import swaydb.core.segment.format.a.entry.id.EntryId
import swaydb.core.util.Bytes._
import swaydb.data.slice.Slice

object TimeWriter {

  private def getTime(keyValue: KeyValue.WriteOnly) =
    keyValue match {
      case keyValue: WriteOnly.Fixed =>
        keyValue match {
          case keyValue: Transient.Remove =>
            keyValue.time
          case keyValue: Transient.Put =>
            keyValue.time
          case keyValue: Transient.Update =>
            keyValue.time
          case _: Transient.PendingApply =>
            None
        }
      case _: WriteOnly.Range =>
        None
      case _: WriteOnly.Group =>
        None
    }

  def write(current: KeyValue.WriteOnly,
            currentTime: Option[Time],
            compressDuplicateValues: Boolean,
            entryId: EntryId.Key,
            plusSize: Int): (Slice[Byte], Option[Slice[Byte]], Int, Int) = {
    currentTime map {
      currentTime =>
        current.previous.flatMap(getTime) flatMap {
          previousTime =>
            compress(previous = previousTime.time, next = currentTime.time, minimumCommonBytes = 2) map {
              case (_, remainingBytes) if remainingBytes.isEmpty =>

                val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
                  ValueWriter.write(
                    current = current,
                    compressDuplicateValues = compressDuplicateValues,
                    entryId = entryId.timeFullyCompressed,
                    plusSize = plusSize + sizeOf(currentTime.time.size)
                  )

                val bytes =
                  indexBytes
                    .addIntUnsigned(currentTime.time.size)

                (bytes, valueBytes, valueStartOffset, valueEndOffset)

              case (commonBytes, remainingBytes) =>
                val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
                  ValueWriter.write(
                    current = current,
                    compressDuplicateValues = compressDuplicateValues,
                    entryId = entryId.timePartiallyCompressed,
                    plusSize = plusSize + sizeOf(commonBytes) + remainingBytes.size
                  )

                val bytes =
                  indexBytes
                    .addIntUnsigned(commonBytes)
                    .addAll(remainingBytes)

                (bytes, valueBytes, valueStartOffset, valueEndOffset)
            }
        } getOrElse {
          //no common prefixes or no previous write without compression
          val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
            ValueWriter.write(
              current = current,
              compressDuplicateValues = compressDuplicateValues,
              entryId = entryId.timeUncompressed,
              plusSize = plusSize + currentTime.time.size
            )

          val bytes =
            indexBytes
              .addAll(currentTime.time)

          (bytes, valueBytes, valueStartOffset, valueEndOffset)
        }

    } getOrElse {
      val (indexBytes, valueBytes, valueStartOffset, valueEndOffset) =
        ValueWriter.write(
          current = current,
          compressDuplicateValues = compressDuplicateValues,
          entryId = entryId.noTime,
          plusSize = plusSize
        )

      (indexBytes, valueBytes, valueStartOffset, valueEndOffset)

    }
  }
}
