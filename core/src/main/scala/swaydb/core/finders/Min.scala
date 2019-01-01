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

import swaydb.core.data.KeyValue
import swaydb.core.util.TryUtil
import swaydb.data.slice.Slice
import scala.util.{Failure, Success, Try}
import swaydb.core.function.FunctionStore
import swaydb.core.merge.KeyValueMerger
import swaydb.data.order.{KeyOrder, TimeOrder}

object Min {

  /**
    * Given two key-values returns the smallest [[KeyValue.ReadOnly.Put]] else None.
    *
    * @return Minimum of both key-values. None is returned if the key-value(s) are expired or removed.
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
              //      3  or  5
              else if (next.key > current.key)
                Success(Some(current))
              //    2
              //0
              else //else higher from next is smaller
                Success(Some(next))
            } else { // current Level's put is expired. If the next Level's key is smaller, return it.
              //       2
              //0 or 1
              if (next.key < current.key)
                Success(Some(next))
              //     2
              //     2 or 5
              // else if next Level's higher is equal to greater than this Level's higher.
              // equals should also be ignored because current Level's expired removed Put has overwritten next Level's Put.
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
              //0
              else if (next.key < current.key)
                Success(Some(next))
              //    2
              //         5
              else
                TryUtil.successNone
            } else { //higher remove from current is expired.
              //    2
              //0
              //if the higher from next is smaller than current Remove. return it.
              if (next.key < current.key)
                Success(Some(next))
              //     2
              //     2 or 5
              // else if next Level's higher is equal to greater than this Level's higher.
              // equals should also be ignored because current Level's expired removed Put has overwritten next Level's Put.
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
              //0
              else if (next.key < current.key)
                Success(Some(next))

              //    2
              //         5
              else
                TryUtil.successNone
            } else { //higher update from current is expired.
              //    2
              //0
              //if the higher from next is smaller than current Remove. return it.
              if (next.key < current.key)
                Success(Some(next))
              //     2
              //     2 or 5
              // else if next Level's higher is equal to greater than this Level's higher.
              // equals should also be ignored because current Level's expired Update has deleted the Put from the lower Level.
              else
                TryUtil.successNone
            }

          case None =>
            TryUtil.successNone
        }
    }
  }
}
