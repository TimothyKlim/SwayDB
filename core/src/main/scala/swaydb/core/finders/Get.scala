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

package swaydb.core.finders

import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}
import swaydb.core.data.{KeyValue, Value}
import swaydb.core.data.KeyValue.ReadOnly
import swaydb.core.function.FunctionStore
import swaydb.core.merge.KeyValueMerger
import swaydb.core.util.TryUtil
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice

object Get {

  def apply(key: Slice[Byte],
            getFromCurrentLevel: Slice[Byte] => Try[Option[KeyValue.ReadOnly.SegmentResponse]],
            getFromNextLevel: Slice[Byte] => Try[Option[KeyValue.ReadOnly.Put]])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                                                 timeOrder: TimeOrder[Slice[Byte]],
                                                                                 functionStore: FunctionStore): Try[Option[KeyValue.ReadOnly.Put]] = {

    @tailrec
    def returnSegmentResponse(current: KeyValue.ReadOnly.SegmentResponse): Try[Option[ReadOnly.Put]] =
      current match {
        case current: KeyValue.ReadOnly.Remove =>
          if (current.hasTimeLeft())
            getFromNextLevel(key) flatMap {
              case Some(next) =>
                for {
                  currentValue <- current.toValue()
                  nextValue <- next.toValue()
                  merged <- KeyValueMerger(Some(current.key), currentValue, nextValue)
                } yield {
                  merged.toMemoryPut(current.key)
                }
              case None =>
                TryUtil.successNone
            }
          else
            TryUtil.successNone

        case current: KeyValue.ReadOnly.Put =>
          if (current.hasTimeLeft())
            Success(Some(current))
          else
            TryUtil.successNone

        case current: KeyValue.ReadOnly.Update =>
          if (current.hasTimeLeft())
            getFromNextLevel(key) flatMap {
              case Some(next) =>
                for {
                  currentValue <- current.toValue()
                  nextValue <- next.toValue()
                  merged <- KeyValueMerger(Some(current.key), currentValue, nextValue)
                } yield {
                  merged.toMemoryPut(current.key)
                }
              case None =>
                TryUtil.successNone
            }
          else
            TryUtil.successNone

        case current: KeyValue.ReadOnly.Range =>
          current.fetchFromOrElseRangeValue match {
            case Success(value) =>
              returnSegmentResponse(value.toMemory(key))

            case Failure(exception) =>
              Failure(exception)
          }

        case current: KeyValue.ReadOnly.PendingApply =>
          getFromNextLevel(key) flatMap {
            case Some(next) =>
              for {
                currentValue <- current.toValue()
                nextValue <- next.toValue()
                merged <- KeyValueMerger(Some(current.key), currentValue, nextValue: Value.FromValue)
              } yield {
                merged.toMemoryPut(current.key)
              }
            case None =>
              TryUtil.successNone
          }
      }

    getFromCurrentLevel(key) flatMap {
      case Some(current) =>
        returnSegmentResponse(current)

      case None =>
        getFromNextLevel(key)
    }
  }
}
