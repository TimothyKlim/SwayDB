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

import scala.util.{Failure, Success, Try}
import swaydb.core.data.KeyValue
import swaydb.core.function.FunctionStore
import swaydb.core.merge.KeyValueMerger
import swaydb.core.util.TryUtil
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice

object Max {

  /**
    * Given two key-values returns the highest [[KeyValue.ReadOnly.Put]] else None.
    *
    * @return Maximum of both key-values. None is returned if the key-value(s) are expired or removed.
    *
    */
  def apply(current: KeyValue.ReadOnly.Fixed,
            next: Option[KeyValue.ReadOnly.Put])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                 timeOrder: TimeOrder[Slice[Byte]],
                                                 functionStore: FunctionStore): Try[Option[KeyValue.ReadOnly.Put]] = {
    import keyOrder._
    current match {
      case current: KeyValue.ReadOnly.Put =>
        next match {
          case Some(next) =>
            if (current.hasTimeLeft()) {
              if (current.key equiv next.key)
                current.toValue() flatMap {
                  currentValue =>
                    next.toValue() flatMap {
                      nextValue =>
                        KeyValueMerger(Some(next.key), currentValue, nextValue) flatMap {
                          result =>
                            result.toMemoryPut(next.key) match {
                              case result @ Some(_) =>
                                Success(result)
                              case None =>
                                Failure(new Exception("toMemoryPut returned None"))
                            }
                        }
                    }
                }
              //      3  or  5 (current)
              //    2          (next)
              else if (current.key > next.key)
                Success(Some(current))
              //0          (current)
              //    2      (next)
              else //else next is highest
                Success(Some(next))
            } else {
              //0 or 1      (current)
              //       2    (next)
              if (next.key > current.key)
                Success(Some(next))
              //     2
              //     2
              else
                TryUtil.successNone
            }

          case None =>
            if (current.hasTimeLeft())
              Success(Some(current))
            else
              TryUtil.successNone
        }

      case current: KeyValue.ReadOnly.Remove =>
        next match {
          case Some(next) =>
            if (current.hasTimeLeft()) {
              //    2
              //    2
              if (current.key equiv next.key)
                current.toValue() flatMap {
                  currentValue =>
                    next.toValue() flatMap {
                      nextValue =>
                        KeyValueMerger(Some(next.key), currentValue, nextValue) flatMap {
                          result =>
                            result.toMemoryPut(next.key) match {
                              case result @ Some(_) =>
                                Success(result)
                              case None =>
                                Failure(new Exception("toMemoryPut returned None"))
                            }
                        }
                    }
                }
              //    2
              //         5
              else if (next.key > current.key)
                Success(Some(next))
              //    2
              //0
              else
                TryUtil.successNone
            } else { //lower remove from current is expired.
              //    2
              //        5
              if (next.key > current.key)
                Success(Some(next))
              //     2
              //0 or 2
              else
                TryUtil.successNone
            }

          case None =>
            TryUtil.successNone
        }

      case current: KeyValue.ReadOnly.Update =>
        next match {
          case Some(next) =>
            if (current.hasTimeLeft()) {
              //    2
              //    2
              if (next.key equiv current.key)
                current.toValue() flatMap {
                  currentValue =>
                    next.toValue() flatMap {
                      nextValue =>
                        KeyValueMerger(Some(next.key), currentValue, nextValue) flatMap {
                          result =>
                            result.toMemoryPut(next.key) match {
                              case result @ Some(_) =>
                                Success(result)
                              case None =>
                                Failure(new Exception("toMemoryPut returned None"))
                            }
                        }
                    }
                }

              //    2
              //         5
              else if (next.key > current.key)
                Success(Some(next))
              //    2
              //0
              else
                TryUtil.successNone
            } else { //lower update from current is expired.
              //    2
              //         5
              if (next.key > current.key)
                Success(Some(next))
              //     2
              //0 or 2
              else
                TryUtil.successNone
            }

          case None =>
            TryUtil.successNone
        }
    }
  }

}
