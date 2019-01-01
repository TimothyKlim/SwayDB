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

import scala.annotation.implicitNotFound
import scala.util.{Failure, Try}
import swaydb.core.data.{KeyValue, Time}
import swaydb.core.segment.format.a.entry.id.EntryId
import swaydb.core.util.{Bytes, TryUtil}
import swaydb.data.slice.Reader

@implicitNotFound("Type class implementation not found for TimeReader of type ${T}")
sealed trait TimeReader[-T] {
  def read(indexReader: Reader,
           previous: Option[KeyValue.ReadOnly]): Try[Option[Time]]
}

/**
  * Time is always set for only Fixed key-values.
  * Group and Range key-values do not have time set.
  */
object TimeReader {

  implicit object NoTimeReader extends TimeReader[EntryId.Time.NoTime] {
    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Option[Time]] =
      TryUtil.successNone
  }

  implicit object UnCompressedTimeReader extends TimeReader[EntryId.Time.Uncompressed] {
    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Option[Time]] =
      indexReader.readIntUnsigned() flatMap {
        timeSize =>
          indexReader.read(timeSize) map {
            time =>
              Some(Time(time))
          }
      }
  }

  implicit object PartiallyCompressedTimeReader extends TimeReader[EntryId.Time.PartiallyCompressed] {

    def readTime(indexReader: Reader,
                 previousTime: Option[Time]): Try[Option[Time]] =
      previousTime map {
        previousTime =>
          indexReader.readIntUnsigned() flatMap {
            commonBytes =>
              indexReader.readIntUnsigned() flatMap {
                uncompressedBytes =>
                  indexReader.read(uncompressedBytes) map {
                    rightBytes =>
                      val timeBytes = Bytes.decompress(previousTime.time, rightBytes, commonBytes)
                      Some(Time(timeBytes))
                  }
              }
          }
      } getOrElse Failure(EntryReaderFailure.NoPreviousTime)

    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Option[Time]] =
      previous map {
        case previous: KeyValue.ReadOnly.Put =>
          readTime(indexReader, previous.time)

        case previous: KeyValue.ReadOnly.Remove =>
          readTime(indexReader, previous.time)

        case previous: KeyValue.ReadOnly.Update =>
          readTime(indexReader, previous.time)

        case _: KeyValue.ReadOnly.Range | _: KeyValue.ReadOnly.Group =>
          Failure(EntryReaderFailure.PreviousIsNotFixedKeyValue)

      } getOrElse {
        Failure(EntryReaderFailure.NoPreviousKeyValue)
      }
  }

  implicit object TimeFullyCompressedTimeReader extends TimeReader[EntryId.Time.FullyCompressed] {
    def readTime(indexReader: Reader,
                 previousTime: Option[Time]): Try[Option[Time]] =
      previousTime map {
        previousTime =>
          indexReader.readIntUnsigned() map {
            commonBytes =>
              Some(Time(previousTime.time.take(commonBytes)))
          }
      } getOrElse Failure(EntryReaderFailure.NoPreviousTime)

    override def read(indexReader: Reader,
                      previous: Option[KeyValue.ReadOnly]): Try[Option[Time]] =
      previous map {
        case previous: KeyValue.ReadOnly.Put =>
          readTime(indexReader, previous.time)

        case previous: KeyValue.ReadOnly.Remove =>
          readTime(indexReader, previous.time)

        case previous: KeyValue.ReadOnly.Update =>
          readTime(indexReader, previous.time)

        case _: KeyValue.ReadOnly.Range | _: KeyValue.ReadOnly.Group =>
          Failure(EntryReaderFailure.PreviousIsNotFixedKeyValue)

      } getOrElse {
        Failure(EntryReaderFailure.NoPreviousKeyValue)
      }
  }
}
