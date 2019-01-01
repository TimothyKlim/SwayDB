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

package swaydb.core.merge

import scala.annotation.implicitNotFound
import scala.concurrent.duration.Deadline
import scala.util.{Failure, Success, Try}
import swaydb.core.data._
import swaydb.core.function.FunctionStore
import swaydb.core.segment.merge.MergeException
import swaydb.core.util.TryUtil._
import swaydb.data.order.TimeOrder
import swaydb.data.slice.Slice

@implicitNotFound("Type class implementation not found for KeyValueMerger of type ${N}, ${O}")
trait KeyValueMerger[N, O, R] {

  def apply(key: Option[Slice[Byte]],
            newKeyValue: N,
            oldKeyValue: O)(implicit timeOrder: TimeOrder[Slice[Byte]],
                            functionStore: FunctionStore): Try[R]

}

/**
  * Applies rules for merging key-values.
  *
  * If both new & old values have deadline set, a check is performed to see if new value's deadline is smaller then old.
  * If true, new deadline is accepted or else if the new value's deadline is greater than old, then a hasTimeLeftAtLeast
  * check is made on old value's deadline to see if enough time is available on old value to apply new deadline which accounts
  * for time required until the key-values are written to disk or in-memory.
  *
  * For example:
  * If old key-value is reaching deadline in 1.second and new key-values deadline is 1.day.
  * And suppose if the merge process took 2 seconds to write to disk, clients concurrently reading the old
  * record after the first 1.second would start receiving None for the expired value and then
  * after writing the new key-value to disk this key-value would re-appear again.
  * Therefore the time required to merge & writing key-values to disk or memory should also be considered
  * when merging key-values with deadlines set.
  */

private[core] object KeyValueMerger {

  /**
    * PUT
    */
  implicit object PutOnPut extends KeyValueMerger[Value.Put, Value.Put, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Put,
                       oldKeyValue: Value.Put)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                               functionStore: FunctionStore): Try[Value.Put] =
      if (newKeyValue.time > oldKeyValue.time)
        Success(newKeyValue)
      else
        Success(oldKeyValue)
  }

  implicit object PutOnRemove extends KeyValueMerger[Value.Put, Value.Remove, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Put,
                       oldKeyValue: Value.Remove)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.FromValue] =
      if (newKeyValue.time > oldKeyValue.time)
        Success(newKeyValue)
      else
        Success(oldKeyValue)
  }

  implicit object PutOnUpdate extends KeyValueMerger[Value.Put, Value.Update, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Put,
                       oldKeyValue: Value.Update)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.FromValue] =

      if (newKeyValue.time > oldKeyValue.time)
        Success(newKeyValue)
      else
        Success(oldKeyValue)
  }

  implicit object PutOnPendingApply extends KeyValueMerger[Value.Put, Value.PendingApply, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Put,
                       oldKeyValue: Value.PendingApply)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                        functionStore: FunctionStore): Try[Value.FromValue] =

      if (newKeyValue.time > oldKeyValue.time)
        oldKeyValue.applies.tryFoldLeft(newKeyValue: Value.FromValue) {
          (newKeyValue, oldKeyValue) =>
            val result = KeyValueMerger(
              key = key,
              newKeyValue = newKeyValue,
              oldKeyValue = oldKeyValue: Value.RangeValue
            )(FromValueOnRangeValue, timeOrder, functionStore)
            result
        }
      else
        Success(oldKeyValue)
  }

  implicit object PutOnFunction extends KeyValueMerger[Value.Put, Value.Function, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Put,
                       oldKeyValue: Value.Function)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                    functionStore: FunctionStore): Try[Value.FromValue] =

      if (newKeyValue.time > oldKeyValue.time)
        Success(newKeyValue)
      else
        Success(oldKeyValue)
  }

  /**
    * REMOVE
    */
  implicit object RemoveOnRemove extends KeyValueMerger[Value.Remove, Value.Remove, Value.Remove] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Remove,
                       oldKeyValue: Value.Remove)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.Remove] =
      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Remove(None, _), Value.Remove(_, _)) =>
            Success(newKeyValue)

          case (Value.Remove(Some(_), _), Value.Remove(None, _)) =>
            Success(oldKeyValue.copy(time = newKeyValue.time))

          case (Value.Remove(Some(_), _), Value.Remove(Some(_), _)) =>
            Success(newKeyValue)
        }
      else
        Success(oldKeyValue)
  }

  implicit object RemoveOnPut extends KeyValueMerger[Value.Remove, Value.Put, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Remove,
                       oldKeyValue: Value.Put)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                               functionStore: FunctionStore): Try[Value.FromValue] =

      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Remove(None, _), Value.Put(_, _, _)) =>
            Success(newKeyValue)

          case (Value.Remove(Some(newDeadline), newTime), Value.Put(oldValue, _, _)) =>
            Success(Value.Put(oldValue, Some(newDeadline), newTime))
        }
      else
        Success(oldKeyValue)
  }

  implicit object RemoveOnUpdate extends KeyValueMerger[Value.Remove, Value.Update, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Remove,
                       oldKeyValue: Value.Update)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.RangeValue] =

      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Remove(None, _), Value.Update(_, _, _)) =>
            Success(newKeyValue)

          case (Value.Remove(Some(newDeadline), newTime), Value.Update(oldValue, _, _)) =>
            Success(Value.Update(oldValue, Some(newDeadline), newTime))
        }
      else
        Success(oldKeyValue)
  }

  implicit object RemoveOnFunction extends KeyValueMerger[Value.Remove, Value.Function, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Remove,
                       oldKeyValue: Value.Function)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                    functionStore: FunctionStore): Try[Value.RangeValue] =
      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Remove(None, _), Value.Function(_, _)) =>
            Success(newKeyValue)

          case (Value.Remove(Some(_), _), Value.Function(_, _)) =>
            Success(Value.PendingApply(Slice(newKeyValue, oldKeyValue)))
        }
      else
        Success(oldKeyValue)
  }

  implicit object RemoveOnPendingApply extends KeyValueMerger[Value.Remove, Value.PendingApply, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Remove,
                       oldKeyValue: Value.PendingApply)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                        functionStore: FunctionStore): Try[Value.RangeValue] =

      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Remove(None, _), _: Value.PendingApply) =>
            Success(newKeyValue)

          case (Value.Remove(Some(_), _), Value.PendingApply(applies)) =>
            applies.tryFoldLeft(newKeyValue: Value.RangeValue) {
              (newKeyValue, oldKeyValue) =>
                KeyValueMerger(
                  key = key,
                  newKeyValue = newKeyValue,
                  oldKeyValue = oldKeyValue: Value.RangeValue
                )(RangeValueOnRangeValue, timeOrder, functionStore)
            }
        }
      else
        Success(oldKeyValue)
  }

  /**
    * Update
    */
  implicit object UpdateOnPut extends KeyValueMerger[Value.Update, Value.Put, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Update,
                       oldKeyValue: Value.Put)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                               functionStore: FunctionStore): Try[Value.FromValue] =
      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Update(newValue, None, newTime), Value.Put(_, None, _)) =>
            Success(Value.Put(newValue, None, newTime))

          case (Value.Update(newValue, Some(newDeadline), newTime), Value.Put(_, None, _)) =>
            Success(Value.Put(newValue, Some(newDeadline), newTime))

          case (Value.Update(newValue, None, newTime), Value.Put(_, Some(oldDeadline), _)) =>
            Success(Value.Put(newValue, Some(oldDeadline), newTime))

          case (Value.Update(newValue, Some(newDeadline), newTime), Value.Put(_, Some(_), _)) =>
            Success(Value.Put(newValue, Some(newDeadline), newTime))
        }
      else
        Success(oldKeyValue)
  }

  implicit object UpdateOnRemove extends KeyValueMerger[Value.Update, Value.Remove, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Update,
                       oldKeyValue: Value.Remove)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.RangeValue] =
      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Update(_, _, _), Value.Remove(None, _)) =>
            Success(oldKeyValue.copy(time = newKeyValue.time))

          case (Value.Update(newValue, None, newTime), Value.Remove(Some(oldDeadline), _)) =>
            Success(Value.Update(newValue, Some(oldDeadline), newTime))

          case (Value.Update(newValue, Some(newDeadline), newTime), Value.Remove(Some(_), _)) =>
            Success(Value.Update(newValue, Some(newDeadline), newTime))
        }
      else
        Success(oldKeyValue)
  }

  implicit object UpdateOnUpdate extends KeyValueMerger[Value.Update, Value.Update, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Update,
                       oldKeyValue: Value.Update)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.Update] =
      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Update(_, None, _), Value.Update(_, None, _)) =>
            Success(newKeyValue)

          case (Value.Update(_, Some(_), _), Value.Update(_, None, _)) =>
            Success(newKeyValue)

          case (Value.Update(newValue, None, newTime), Value.Update(_, Some(oldDeadline), _)) =>
            Success(Value.Update(newValue, Some(oldDeadline), newTime))

          case (Value.Update(newValue, Some(newDeadline), newTime), Value.Update(_, _, _)) =>
            Success(Value.Update(newValue, Some(newDeadline), newTime))
        }
      else
        Success(oldKeyValue)
  }

  implicit object UpdateOnFunction extends KeyValueMerger[Value.Update, Value.Function, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Update,
                       oldKeyValue: Value.Function)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                    functionStore: FunctionStore): Try[Value.RangeValue] =
      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (Value.Update(_, Some(_), _), _: Value.Function) =>
            Success(newKeyValue)

          case (Value.Update(_, None, _), _: Value.Function) =>
            //the function could be setting the deadline so key them both stashed.
            Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
        }
      else
        Success(newKeyValue)
  }

  implicit object UpdateOnPendingApply extends KeyValueMerger[Value.Update, Value.PendingApply, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Update,
                       oldKeyValue: Value.PendingApply)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                        functionStore: FunctionStore): Try[Value.RangeValue] =
      if (newKeyValue.time > oldKeyValue.applies.lastOption.flatMap(_.time))
        oldKeyValue.applies.tryFoldLeft(newKeyValue: Value.RangeValue) {
          (newKeyValue, oldKeyValue) =>
            KeyValueMerger(
              key = key,
              newKeyValue = newKeyValue,
              oldKeyValue = oldKeyValue: Value.RangeValue
            )(RangeValueOnRangeValue, timeOrder, functionStore)
        }
      else
        Success(oldKeyValue)
  }

  /**
    * Function
    */
  implicit object FunctionOnPut extends KeyValueMerger[Value.Function, Value.Put, Value.FromValue] {
    implicit class ToFromValue(output: FunctionOutput) {
      def toFromValue(oldDeadline: Option[Deadline]): Value.FromValue =
        output match {
          case FunctionOutput.Remove =>
            output.toValue()

          case _: FunctionOutput.Expire =>
            output.toValue()

          case FunctionOutput.Update(value, deadline) =>
            Value.Put(value, deadline.orElse(oldDeadline))
        }
    }

    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Function,
                       oldKeyValue: Value.Put)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                               functionStore: FunctionStore): Try[Value.FromValue] =
      (newKeyValue, oldKeyValue) match {
        case (Value.Function(function, _), oldKeyValue: Value.Put) =>
          if (newKeyValue.time > oldKeyValue.time)
            functionStore.get(function) match {
              case Some(functionId) =>
                functionId match {
                  case SwayFunction.Value(f) =>
                    Try(f(oldKeyValue.value).toFromValue(oldKeyValue.deadline))

                  case SwayFunction.ValueDeadline(f) =>
                    Try(f(oldKeyValue.value, oldKeyValue.deadline).toFromValue(oldKeyValue.deadline))

                  case SwayFunction.Key(f) =>
                    key.map(key => Try(f(key).toFromValue(oldKeyValue.deadline))) getOrElse {
                      MergeException.keyNotProvidedMergingIntoPutFailure
                    }

                  case SwayFunction.KeyValue(f) =>
                    key.map(key => Try(f(key, oldKeyValue.value).toFromValue(oldKeyValue.deadline))) getOrElse {
                      MergeException.keyNotProvidedMergingIntoPutFailure
                    }

                  case SwayFunction.KeyDeadline(f) =>
                    key.map(key => Try(f(key, oldKeyValue.deadline).toFromValue(oldKeyValue.deadline))) getOrElse {
                      MergeException.keyNotProvidedMergingIntoPutFailure
                    }

                  case SwayFunction.KeyValueDeadline(f) =>
                    key.map(key => Try(f(key, oldKeyValue.value, oldKeyValue.deadline).toFromValue(oldKeyValue.deadline))) getOrElse {
                      MergeException.keyNotProvidedMergingIntoPutFailure
                    }
                }

              case None =>
                Failure(MergeException.FunctionNotFound(function))
            }

          else
            Success(oldKeyValue)
      }
  }

  implicit object FunctionOnUpdate extends KeyValueMerger[Value.Function, Value.Update, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Function,
                       oldKeyValue: Value.Update)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.RangeValue] =
      (newKeyValue, oldKeyValue) match {
        case (Value.Function(function, _), oldKeyValue: Value.Update) =>
          if (newKeyValue.time > oldKeyValue.time)
            functionStore.get(function) match {
              case Some(functionId) =>
                functionId match {
                  case SwayFunction.Value(f) =>
                    Try(f(oldKeyValue.value).toValue())

                  case SwayFunction.ValueDeadline(f) =>
                    Try(f(oldKeyValue.value, oldKeyValue.deadline).toValue())

                  case SwayFunction.Key(f) =>
                    key.map(key => Try(f(key).toValue())) getOrElse {
                      Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
                    }

                  case SwayFunction.KeyValue(f) =>
                    key.map(key => Try(f(key, oldKeyValue.value).toValue())) getOrElse {
                      Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
                    }

                  case SwayFunction.KeyDeadline(f) =>
                    key.map(key => Try(f(key, oldKeyValue.deadline).toValue())) getOrElse {
                      Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
                    }

                  case SwayFunction.KeyValueDeadline(f) =>
                    key.map(key => Try(f(key, oldKeyValue.value, oldKeyValue.deadline).toValue())) getOrElse {
                      Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
                    }
                }

              case None =>
                Failure(MergeException.FunctionNotFound(function))
            }

          else
            Success(oldKeyValue)
      }
  }

  implicit object FunctionOnRemove extends KeyValueMerger[Value.Function, Value.Remove, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Function,
                       oldKeyValue: Value.Remove)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                  functionStore: FunctionStore): Try[Value.RangeValue] =
      if (newKeyValue.time > oldKeyValue.time)
        (newKeyValue, oldKeyValue) match {
          case (_: Value.Function, Value.Remove(None, _)) =>
            Success(oldKeyValue.copy(time = newKeyValue.time))

          case (Value.Function(function, _), Value.Remove(Some(_), _)) =>
            functionStore.get(function) match {
              case Some(functionId) =>
                functionId match {
                  case SwayFunction.Value(_) =>
                    //value is not known since remove has deadline set - PendingApply!
                    Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))

                  case SwayFunction.ValueDeadline(_) =>
                    //value is not known since remove has deadline set - PendingApply!
                    Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))

                  case SwayFunction.Key(f) =>
                    key.map(key => Try(f(key).toValue())) getOrElse {
                      Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
                    }

                  case SwayFunction.KeyValue(f) =>
                    //value is not known since remove has deadline set - PendingApply!
                    Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))

                  case SwayFunction.KeyDeadline(f) =>
                    key.map(key => Try(f(key, oldKeyValue.deadline).toValue())) getOrElse {
                      Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
                    }

                  case SwayFunction.KeyValueDeadline(f) =>
                    //value is not known since remove has deadline set - PendingApply!
                    Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
                }

              case None =>
                Failure(MergeException.FunctionNotFound(function))
            }

        }
      else
        Success(oldKeyValue)
  }

  implicit object FunctionOnFunction extends KeyValueMerger[Value.Function, Value.Function, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Function,
                       oldKeyValue: Value.Function)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                    functionStore: FunctionStore): Try[Value.RangeValue] =
      (newKeyValue, oldKeyValue) match {
        case (newKeyValue: Value.Function, oldKeyValue: Value.Function) =>
          if (newKeyValue.time > oldKeyValue.time)
            Success(Value.PendingApply(Slice(oldKeyValue, newKeyValue)))
          else
            Success(oldKeyValue)
      }
  }

  implicit object FunctionOnPendingApply extends KeyValueMerger[Value.Function, Value.PendingApply, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.Function,
                       oldKeyValue: Value.PendingApply)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                        functionStore: FunctionStore): Try[Value.RangeValue] =
      if (newKeyValue.time > oldKeyValue.time)
        oldKeyValue.applies.tryFoldLeft(newKeyValue: Value.RangeValue) {
          (newKeyValue, oldKeyValue) =>
            KeyValueMerger(
              key = key,
              newKeyValue = newKeyValue,
              oldKeyValue = oldKeyValue: Value.RangeValue
            )(RangeValueOnRangeValue, timeOrder, functionStore)
        }
      else
        Success(oldKeyValue)
  }

  /**
    * PendingApply
    */
  implicit object PendingApplyOnFromValue extends KeyValueMerger[Value.PendingApply, Value.FromValue, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.PendingApply,
                       oldKeyValue: Value.FromValue)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                     functionStore: FunctionStore): Try[Value.FromValue] =
    //merge the last/oldest keyValue from PendingApply onto oldKeyValue.
      oldKeyValue match {
        case oldKeyValue: Value.RangeValue =>
          //oldKeyValue is a RangeValue result will also be a RangeValue, call RangeValue into RangeValue merger.
          KeyValueMerger(key, newKeyValue: Value.RangeValue, oldKeyValue)

        case oldKeyValue: Value.Put =>
          //if oldKeyValue is a put, one by one merge new applies into this put dropping the last tail apply entry.
          newKeyValue.applies.lastOption match {
            case Some(lastApply) =>
              KeyValueMerger(key, lastApply: Value.RangeValue, oldKeyValue: Value.FromValue)(RangeValueOnFromValue, timeOrder, functionStore) flatMap {
                case result: Value.Put =>
                  //try collapsing pending key-values since the old key-value is a put.
                  newKeyValue.applies.dropRight(1).reverse.toIterable.tryFoldLeft(result: Value.FromValue) {
                    case (oldKeyValue, newKeyValue) =>
                      KeyValueMerger(key, newKeyValue: Value.RangeValue, oldKeyValue)
                  }

                case Value.PendingApply(newApplies) =>
                  //if merging returned another PendingApply then simply add the result into existing newKeyValue/PendingApply.
                  Success(newKeyValue.copy(applies = newKeyValue.applies.dropRight(1) ++ newApplies))

                //if it returned a single key-value drop and append the new merged result.
                case result: Value.Apply =>
                  Success(newKeyValue.copy(applies = newKeyValue.applies.dropRight(1) ++ Slice(result)))
              }

            case None =>
              Success(oldKeyValue.copy(time = newKeyValue.time.orElse(oldKeyValue.time)))
          }
      }
  }

  /**
    * PendingApply
    */
  implicit object PendingApplyOnRangeValue extends KeyValueMerger[Value.PendingApply, Value.RangeValue, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.PendingApply,
                       oldKeyValue: Value.RangeValue)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                      functionStore: FunctionStore): Try[Value.RangeValue] =
    //merge the last/oldest keyValue from PendingApply onto oldKeyValue.
      newKeyValue.applies.lastOption match {
        case Some(lastApply) =>
          KeyValueMerger(key, lastApply: Value.RangeValue, oldKeyValue) flatMap {
            case Value.PendingApply(newApplies) =>
              //if merging returned another PendingApply then simply add the result into existing newKeyValue/PendingApply.
              Success(newKeyValue.copy(applies = newKeyValue.applies.dropRight(1) ++ newApplies))

            //if it returned a single key-value drop and append the new merged result.
            case applyResult: Value.Apply =>
              Success(newKeyValue.copy(applies = newKeyValue.applies.dropRight(1) ++ Slice(applyResult)))
          }

        case None =>
          oldKeyValue match {
            case oldKeyValue: Value.Remove =>
              Success(oldKeyValue.copy(time = newKeyValue.time))

            case oldKeyValue: Value.Update =>
              Success(oldKeyValue.copy(time = newKeyValue.time))

            case oldKeyValue: Value.Function =>
              Success(oldKeyValue.copy(time = newKeyValue.time))

            case oldKeyValue: Value.PendingApply =>
              Success(oldKeyValue)
          }
      }
  }
  /**
    * Generic - RangeValue
    *
    * Always avoid invoking this if the type is known. Do not make this implicit!
    */
  implicit object FromValueOnFromValue extends KeyValueMerger[Value.FromValue, Value.FromValue, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.FromValue,
                       oldKeyValue: Value.FromValue)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                     functionStore: FunctionStore): Try[Value.FromValue] =
      (newKeyValue, oldKeyValue) match {
        /**
          * PUT ON COMBINATIONS
          */
        case (newKeyValue: Value.Put, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.Put) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        /**
          * REMOVE ON COMBINATIONS
          */
        case (newKeyValue: Value.Remove, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.Put) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        /**
          * UPDATE ON COMBINATIONS
          */
        case (newKeyValue: Value.Update, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.Put) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        /**
          * FUNCTION ON COMBINATIONS
          */
        case (newKeyValue: Value.Function, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.Put) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        /**
          * PendingApply on everything else
          */
        case (newKeyValue: Value.PendingApply, oldKeyValue: Value.FromValue) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)
      }
  }

  /**
    * Generic - RangeValue
    *
    * Always avoid invoking this if the type is known. Do not make this implicit!
    */
  implicit object RangeValueOnRangeValue extends KeyValueMerger[Value.RangeValue, Value.RangeValue, Value.RangeValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.RangeValue,
                       oldKeyValue: Value.RangeValue)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                      functionStore: FunctionStore): Try[Value.RangeValue] =
      (newKeyValue, oldKeyValue) match {
        /**
          * REMOVE ON COMBINATIONS
          */
        case (newKeyValue: Value.Remove, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        /**
          * UPDATE ON COMBINATIONS
          */
        case (newKeyValue: Value.Update, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        /**
          * FUNCTION ON COMBINATIONS
          */
        case (newKeyValue: Value.Function, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        /**
          * PendingApply on everything else
          */
        case (newKeyValue: Value.PendingApply, oldKeyValue: Value.RangeValue) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)
      }
  }

  /**
    * Generic - RangeValue
    *
    * Always avoid invoking this if the type is known. Do not make this implicit!
    */
  implicit object RangeValueOnFromValue extends KeyValueMerger[Value.RangeValue, Value.FromValue, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.RangeValue,
                       oldKeyValue: Value.FromValue)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                     functionStore: FunctionStore): Try[Value.FromValue] =
      (newKeyValue, oldKeyValue) match {
        case (newKeyValue: Value.FromValue, oldKeyValue: Value.RangeValue) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Remove, oldKeyValue: Value.Put) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Update, oldKeyValue: Value.Put) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Function, oldKeyValue: Value.Put) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.PendingApply, oldKeyValue: Value.FromValue) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)
      }

  }

  /**
    * Generic - RangeValue
    *
    * Always avoid invoking this if the type is known. Do not make this implicit!
    */
  implicit object FromValueOnRangeValue extends KeyValueMerger[Value.FromValue, Value.RangeValue, Value.FromValue] {
    override def apply(key: Option[Slice[Byte]],
                       newKeyValue: Value.FromValue,
                       oldKeyValue: Value.RangeValue)(implicit timeOrder: TimeOrder[Slice[Byte]],
                                                      functionStore: FunctionStore): Try[Value.FromValue] =
      (newKeyValue, oldKeyValue) match {
        case (newKeyValue: Value.RangeValue, oldKeyValue: Value.RangeValue) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.Remove) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.Update) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.Function) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)

        case (newKeyValue: Value.Put, oldKeyValue: Value.PendingApply) =>
          KeyValueMerger(key, newKeyValue, oldKeyValue)
      }

  }

  def apply[N <: Value, O <: Value, R <: Value](key: Option[Slice[Byte]],
                                                newKeyValue: N,
                                                oldKeyValue: O)(implicit merger: KeyValueMerger[N, O, R],
                                                                timeOrder: TimeOrder[Slice[Byte]],
                                                                functionStore: FunctionStore): Try[R] =
    merger.apply(
      key = key,
      newKeyValue = newKeyValue,
      oldKeyValue = oldKeyValue
    )

}
