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

package swaydb.core.segment.format.a.entry.writer

import scala.concurrent.duration.Deadline
import swaydb.core.segment.format.a.entry.id.EntryId.GetDeadlineId
import swaydb.core.segment.format.a.entry.id.{EntryId, TransientToEntryId}
import swaydb.core.util.Bytes._
import swaydb.core.util.TimeUtil._
import swaydb.data.slice.Slice

object DeadlineWriter {

  private def applyDeadlineId(bytesCompressed: Int,
                              getDeadlineId: GetDeadlineId): EntryId.Deadline =
    if (bytesCompressed == 1)
      getDeadlineId.deadlineOneCompressed
    else if (bytesCompressed == 2)
      getDeadlineId.deadlineTwoCompressed
    else if (bytesCompressed == 3)
      getDeadlineId.deadlineThreeCompressed
    else if (bytesCompressed == 4)
      getDeadlineId.deadlineFourCompressed
    else if (bytesCompressed == 5)
      getDeadlineId.deadlineFiveCompressed
    else if (bytesCompressed == 6)
      getDeadlineId.deadlineSixCompressed
    else if (bytesCompressed == 7)
      getDeadlineId.deadlineSevenCompressed
    else if (bytesCompressed == 8)
      getDeadlineId.deadlineFullyCompressed
    else
      throw new Exception(s"Fatal exception: deadlineBytesCompressed = $bytesCompressed")

  def write(current: Option[Deadline],
            previous: Option[Deadline],
            getDeadlineId: GetDeadlineId,
            plusSize: Int)(implicit id: TransientToEntryId[_]): Slice[Byte] =
    current map {
      currentDeadline =>
        //fetch the previous deadline bytes
        previous flatMap {
          previousDeadline =>
            val currentDeadlineBytes = currentDeadline.toBytes
            val previousDeadlineBytes = previousDeadline.toBytes
            compress(previous = previousDeadlineBytes, next = currentDeadlineBytes, minimumCommonBytes = 1) map {
              case (deadlineCommonBytes, deadlineUncompressedBytes) =>

                val deadlineId = applyDeadlineId(deadlineCommonBytes, getDeadlineId)
                val adjustedToEntryIdDeadlineId = id.id.adjustToEntryId(deadlineId.id)

                Slice.create[Byte](sizeOf(adjustedToEntryIdDeadlineId) + deadlineUncompressedBytes.size + plusSize)
                  .addIntUnsigned(adjustedToEntryIdDeadlineId)
                  .addAll(deadlineUncompressedBytes)
            }
        } getOrElse {
          //if previous deadline bytes do not exist or minimum compression was not met then write uncompressed deadline.
          val currentDeadlineUnsignedBytes = currentDeadline.toLongUnsignedBytes
          val deadlineId = getDeadlineId.deadlineUncompressed.id
          val adjustedToEntryIdDeadlineId = id.id.adjustToEntryId(deadlineId)

          Slice.create[Byte](sizeOf(adjustedToEntryIdDeadlineId) + currentDeadlineUnsignedBytes.size + plusSize)
            .addIntUnsigned(adjustedToEntryIdDeadlineId)
            .addAll(currentDeadlineUnsignedBytes)
        }
    } getOrElse {
      //if current key-value has no deadline.
      val deadlineId = getDeadlineId.noDeadline.id
      val adjustedToEntryIdDeadlineId = id.id.adjustToEntryId(deadlineId)

      Slice.create[Byte](sizeOf(adjustedToEntryIdDeadlineId) + plusSize)
        .addIntUnsigned(adjustedToEntryIdDeadlineId)
    }
}
