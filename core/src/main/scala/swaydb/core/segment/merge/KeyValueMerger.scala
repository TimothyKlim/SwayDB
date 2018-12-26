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

package swaydb.core.segment.merge

import scala.annotation.implicitNotFound
import swaydb.core.data.{KeyValue, Memory, Persistent, Value}
import swaydb.data.slice.Slice
import scala.concurrent.duration.FiniteDuration
import scala.util.{Success, Try}
import swaydb.core.data.KeyValue.ReadOnly

@implicitNotFound("Type class implementation not found for KeyValueMerger of type ${N}, ${O}")
sealed trait KeyValueMerger[N, O] {

  def applyValue(newKeyValue: N, oldKeyValue: O, hasTimeLeftAtLeast: FiniteDuration): Try[KeyValue.ReadOnly.Fixed]

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

//  def isApplied(newKeyValueApplies: Seq[Slice[Byte]], oldKeyValueApplies: Seq[Slice[Byte]]):


  /**
    * Put combination
    */
  implicit object PutOnPut extends KeyValueMerger[KeyValue.ReadOnly.Put, KeyValue.ReadOnly.Put] {
    override def applyValue(newKeyValue: ReadOnly.Put,
                            oldKeyValue: ReadOnly.Put,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Success(newKeyValue)
  }

  implicit object PutOnRemove extends KeyValueMerger[KeyValue.ReadOnly.Put, KeyValue.ReadOnly.Remove] {
    override def applyValue(newKeyValue: ReadOnly.Put,
                            oldKeyValue: ReadOnly.Remove,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Success(newKeyValue)
  }

  implicit object PutOnUpdate extends KeyValueMerger[KeyValue.ReadOnly.Put, KeyValue.ReadOnly.Update] {
    override def applyValue(newKeyValue: ReadOnly.Put,
                            oldKeyValue: ReadOnly.Update,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Success(newKeyValue)
  }

  implicit object PutOnApply extends KeyValueMerger[KeyValue.ReadOnly.Put, KeyValue.ReadOnly.Apply] {
    override def applyValue(newKeyValue: ReadOnly.Put,
                            oldKeyValue: ReadOnly.Apply,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Success(newKeyValue)
  }

  /**
    * Remove combination
    */
  implicit object RemoveOnPut extends KeyValueMerger[KeyValue.ReadOnly.Remove, KeyValue.ReadOnly.Put] {
    override def applyValue(newKeyValue: ReadOnly.Remove,
                            oldKeyValue: ReadOnly.Put,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Try {
        newKeyValue match {
          case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => //Remove without deadline always overwrites old key-value
            newKeyValue

          case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => //Remove Some (when deadline exists)
            oldKeyValue match {
              case Memory.Put(_, _, _, None) | Persistent.Put(_, None, _, _, _, _, _, _) => //Put Some - Put None
                if (newKeyValue.hasTimeLeft())
                  oldKeyValue.updateDeadline(deadline = newKeyValue.deadline.get)
                else
                  newKeyValue

              case Memory.Put(_, _, _, Some(_)) | Persistent.Put(_, Some(_), _, _, _, _, _, _) => //Put Some - Put Some
                if (newKeyValue.deadline.get <= oldKeyValue.deadline.get || oldKeyValue.hasTimeLeftAtLeast(hasTimeLeftAtLeast))
                  oldKeyValue.updateDeadline(deadline = newKeyValue.deadline.get)
                else
                  oldKeyValue
            }
        }
      }
  }

  implicit object RemoveOnRemove extends KeyValueMerger[KeyValue.ReadOnly.Remove, KeyValue.ReadOnly.Remove] {
    override def applyValue(newKeyValue: ReadOnly.Remove,
                            oldKeyValue: ReadOnly.Remove,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Try {
        newKeyValue match {
          case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => //Remove without deadline always overwrites old key-value
            newKeyValue

          case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => //Remove Some (when deadline exists)
            oldKeyValue match {
              case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => // Remove Some - Remove None
                oldKeyValue

              case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => // Remove Some - Remove Some
                if (newKeyValue.deadline.get <= oldKeyValue.deadline.get || oldKeyValue.hasTimeLeftAtLeast(hasTimeLeftAtLeast))
                  newKeyValue
                else
                  oldKeyValue
            }
        }
      }
  }

  implicit object RemoveOnUpdate extends KeyValueMerger[KeyValue.ReadOnly.Remove, KeyValue.ReadOnly.Update] {
    override def applyValue(newKeyValue: ReadOnly.Remove,
                            oldKeyValue: ReadOnly.Update,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Try {
        newKeyValue match {
          case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => //Remove without deadline always overwrites old key-value
            newKeyValue

          case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => //Remove Some (when deadline exists)
            oldKeyValue match {
              case Memory.Update(_, _, _, None) | Persistent.Update(_, None, _, _, _, _, _, _) => //Update Some - Update None
                oldKeyValue.updateDeadline(deadline = newKeyValue.deadline.get)

              case Memory.Update(_, _, _, Some(_)) | Persistent.Update(_, Some(_), _, _, _, _, _, _) => //Update Some - Update Some
                if (newKeyValue.deadline.get <= oldKeyValue.deadline.get || oldKeyValue.hasTimeLeftAtLeast(hasTimeLeftAtLeast))
                  oldKeyValue.updateDeadline(deadline = newKeyValue.deadline.get)
                else
                  oldKeyValue
            }
        }
      }
  }

  implicit object RemoveOnApply extends KeyValueMerger[KeyValue.ReadOnly.Remove, KeyValue.ReadOnly.Apply] {
    override def applyValue(newKeyValue: ReadOnly.Remove,
                            oldKeyValue: ReadOnly.Apply,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Try {
        newKeyValue match {
          case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => //Remove without deadline always overwrites old key-value
            newKeyValue

          case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => //Remove Some (when deadline exists)
            oldKeyValue.getOrFetchApplies.get.foldLeft(newKeyValue: KeyValue.ReadOnly.Fixed) {
              case (result, oldKeyValue) =>
                oldKeyValue match {
                  case update: Value.Update =>
                    //                    KeyValueMerger.applyValue(newKeyValue, update.toMemory(Slice.emptyBytes), hasTimeLeftAtLeast).get
                    ???
                  case function: Value.Function =>
                    //                    KeyValueMerger.applyValue(newKeyValue, function, hasTimeLeftAtLeast).get
                    ???

                }
            }
        }
      }
  }

  implicit object RemoveOnFunction extends KeyValueMerger[KeyValue.ReadOnly.Remove, Value.Function] {
    override def applyValue(newKeyValue: ReadOnly.Remove,
                            oldKeyValue: Value.Function,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Try {
        newKeyValue match {
          case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => //Remove without deadline always overwrites old key-value
            newKeyValue

          case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => //Remove Some (when deadline exists)
            ???
        }
      }
  }

  /**
    * Update combination
    */

  implicit object UpdateOnPut extends KeyValueMerger[KeyValue.ReadOnly.Update, KeyValue.ReadOnly.Put] {
    override def applyValue(newKeyValue: ReadOnly.Update,
                            oldKeyValue: ReadOnly.Put,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Try {
        newKeyValue match {
          case Memory.Update(_, _, _, None) | Persistent.Update(_, None, _, _, _, _, _, _) => //Update None without deadline always overwrites old key-value
            oldKeyValue match {
              case Memory.Put(_, _, _, None) | Persistent.Put(_, None, _, _, _, _, _, _) => //Put Some - Put None
                //                Memory.Put(oldKeyValue.key, newKeyValue.getOrFetchValue.get, oldKeyValue.deadline)
                ???

              case Memory.Put(_, _, _, Some(_)) | Persistent.Put(_, Some(_), _, _, _, _, _, _) => //Put Some - Put Some
                //                Memory.Put(oldKeyValue.key, newKeyValue.getOrFetchValue.get, oldKeyValue.deadline)
                ???

            }

          case Memory.Update(_, _, _, Some(_)) | Persistent.Update(_, Some(_), _, _, _, _, _, _) => //Update Some without deadline always overwrites old key-value
            oldKeyValue match {

              case Memory.Put(_, _, _, None) | Persistent.Put(_, None, _, _, _, _, _, _) => //Put Some - Put None
                //                Memory.Put(oldKeyValue.key, newKeyValue.getOrFetchValue.get, newKeyValue.deadline)
                ???

              case Memory.Put(_, _, _, Some(_)) | Persistent.Put(_, Some(_), _, _, _, _, _, _) => //Put Some - Put Some
                //                if (newKeyValue.deadline.get <= oldKeyValue.deadline.get || oldKeyValue.hasTimeLeftAtLeast(hasTimeLeftAtLeast))
                //                  Memory.Put(oldKeyValue.key, newKeyValue.getOrFetchValue.get, newKeyValue.deadline)
                //                else
                //                  Memory.Put(oldKeyValue.key, newKeyValue.getOrFetchValue.get, oldKeyValue.deadline)
                ???
            }
        }
      }
  }

  implicit object UpdateOnRemove extends KeyValueMerger[KeyValue.ReadOnly.Update, KeyValue.ReadOnly.Remove] {
    override def applyValue(newKeyValue: ReadOnly.Update,
                            oldKeyValue: ReadOnly.Remove,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      Try {
        newKeyValue match {
          case Memory.Update(_, _, _, None) | Persistent.Update(_, None, _, _, _, _, _, _) => //Update None without deadline always overwrites old key-value
            oldKeyValue match {
              case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => // Remove Some - Remove None
                oldKeyValue

              case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => // Remove Some - Remove Some
                if (oldKeyValue.hasTimeLeft())
                  newKeyValue.updateDeadline(oldKeyValue.deadline.get)
                else
                  oldKeyValue

            }

          case Memory.Update(_, _, _, Some(_)) | Persistent.Update(_, Some(_), _, _, _, _, _, _) => //Update Some without deadline always overwrites old key-value
            oldKeyValue match {
              case Memory.Remove(_, _, None) | Persistent.Remove(_, _, None, _, _, _) => // Remove Some - Remove None
                oldKeyValue

              case Memory.Remove(_, _, Some(_)) | Persistent.Remove(_, _, Some(_), _, _, _) => // Remove Some - Remove Some
                if (oldKeyValue.isOverdue())
                  oldKeyValue
                else if (newKeyValue.deadline.get <= oldKeyValue.deadline.get || oldKeyValue.hasTimeLeftAtLeast(hasTimeLeftAtLeast))
                  newKeyValue
                else
                  newKeyValue.updateDeadline(oldKeyValue.deadline.get)
            }
        }
      }
  }

  implicit object UpdateOnUpdate extends KeyValueMerger[KeyValue.ReadOnly.Update, KeyValue.ReadOnly.Update] {
    override def applyValue(newKeyValue: ReadOnly.Update,
                            oldKeyValue: ReadOnly.Update,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] = Try {
      newKeyValue match {
        case Memory.Update(_, _, _, None) | Persistent.Update(_, None, _, _, _, _, _, _) => //Update None without deadline always overwrites old key-value
          oldKeyValue match {
            case Memory.Update(_, _, _, None) | Persistent.Update(_, None, _, _, _, _, _, _) => //Update Some - Update None
              newKeyValue

            case Memory.Update(_, _, _, Some(_)) | Persistent.Update(_, Some(_), _, _, _, _, _, _) => //Update Some - Update Some
              newKeyValue.updateDeadline(oldKeyValue.deadline.get)

          }

        case Memory.Update(_, _, _, Some(_)) | Persistent.Update(_, Some(_), _, _, _, _, _, _) => //Update Some without deadline always overwrites old key-value
          oldKeyValue match {
            case Memory.Update(_, _, _, None) | Persistent.Update(_, None, _, _, _, _, _, _) => //Update Some - Update None
              newKeyValue

            case Memory.Update(_, _, _, Some(_)) | Persistent.Update(_, Some(_), _, _, _, _, _, _) => //Update Some - Update Some
              if (newKeyValue.deadline.get <= oldKeyValue.deadline.get || oldKeyValue.hasTimeLeftAtLeast(hasTimeLeftAtLeast))
                newKeyValue
              else
              //                Memory.Update(oldKeyValue.key, newKeyValue.getOrFetchValue.get, oldKeyValue.deadline)
                ???
          }
      }
    }
  }

  implicit object UpdateOnApply extends KeyValueMerger[KeyValue.ReadOnly.Update, KeyValue.ReadOnly.Apply] {
    override def applyValue(newKeyValue: ReadOnly.Update,
                            oldKeyValue: ReadOnly.Apply,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] = ???
  }

  /**
    * Update combination
    */

  implicit object ApplyOnPut extends KeyValueMerger[KeyValue.ReadOnly.Apply, KeyValue.ReadOnly.Put] {
    override def applyValue(newKeyValue: ReadOnly.Apply,
                            oldKeyValue: ReadOnly.Put,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] = ???
  }

  implicit object ApplyOnRemove extends KeyValueMerger[KeyValue.ReadOnly.Apply, KeyValue.ReadOnly.Remove] {
    override def applyValue(newKeyValue: ReadOnly.Apply,
                            oldKeyValue: ReadOnly.Remove,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] = ???
  }

  implicit object ApplyOnUpdate extends KeyValueMerger[KeyValue.ReadOnly.Apply, KeyValue.ReadOnly.Update] {
    override def applyValue(newKeyValue: ReadOnly.Apply,
                            oldKeyValue: ReadOnly.Update,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] = ???
  }

  implicit object ApplyOnApply extends KeyValueMerger[KeyValue.ReadOnly.Apply, KeyValue.ReadOnly.Apply] {
    override def applyValue(newKeyValue: ReadOnly.Apply,
                            oldKeyValue: ReadOnly.Apply,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] = ???
  }

  /**
    * Fixed into fixed
    */

  implicit object FixedIntoFixed extends KeyValueMerger[KeyValue.ReadOnly.Fixed, KeyValue.ReadOnly.Fixed] {
    override def applyValue(newKeyValue: ReadOnly.Fixed,
                            oldKeyValue: ReadOnly.Fixed,
                            hasTimeLeftAtLeast: FiniteDuration): Try[ReadOnly.Fixed] =
      (newKeyValue, oldKeyValue) match {
        //Put on others
        case (newKeyValue: KeyValue.ReadOnly.Put, oldKeyValue: KeyValue.ReadOnly.Put) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Put, oldKeyValue: KeyValue.ReadOnly.Remove) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Put, oldKeyValue: KeyValue.ReadOnly.Update) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Put, oldKeyValue: KeyValue.ReadOnly.Apply) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        //Remove on others
        case (newKeyValue: KeyValue.ReadOnly.Remove, oldKeyValue: KeyValue.ReadOnly.Put) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Remove, oldKeyValue: KeyValue.ReadOnly.Remove) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Remove, oldKeyValue: KeyValue.ReadOnly.Update) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Remove, oldKeyValue: KeyValue.ReadOnly.Apply) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        //Update on others
        case (newKeyValue: KeyValue.ReadOnly.Update, oldKeyValue: KeyValue.ReadOnly.Put) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Update, oldKeyValue: KeyValue.ReadOnly.Remove) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Update, oldKeyValue: KeyValue.ReadOnly.Update) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Update, oldKeyValue: KeyValue.ReadOnly.Apply) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        //Apply on others
        case (newKeyValue: KeyValue.ReadOnly.Apply, oldKeyValue: KeyValue.ReadOnly.Put) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Apply, oldKeyValue: KeyValue.ReadOnly.Remove) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Apply, oldKeyValue: KeyValue.ReadOnly.Update) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)

        case (newKeyValue: KeyValue.ReadOnly.Apply, oldKeyValue: KeyValue.ReadOnly.Apply) =>
          KeyValueMerger(newKeyValue, oldKeyValue, hasTimeLeftAtLeast)
      }
  }



  def applyValue(newValue: KeyValue.ReadOnly.Fixed,
                 oldValue: Value,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.FromValue] =
    KeyValueMerger(
      newValue,
      oldValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      hasTimeLeftAtLeast
    ).flatMap(_.toFromValue)

  def applyValue(newValue: Value,
                 oldValue: KeyValue.ReadOnly.Fixed,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.FromValue] =
    KeyValueMerger(
      newValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      oldValue,
      hasTimeLeftAtLeast
    ).flatMap(_.toFromValue)

  def applyValue(newValue: Value.RangeValue,
                 oldValue: Value.RangeValue,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.RangeValue] =
    KeyValueMerger(
      newValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      oldValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      hasTimeLeftAtLeast
    ).flatMap(_.toRangeValue)

  def applyValue(newValue: Value.FromValue,
                 oldValue: Value.RangeValue,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.FromValue] =
    KeyValueMerger(
      newValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      oldValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      hasTimeLeftAtLeast
    ).flatMap(_.toFromValue)

  def applyValue(newValue: Value.RangeValue,
                 oldValue: Value.FromValue,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.FromValue] =
    KeyValueMerger(
      newValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      oldValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      hasTimeLeftAtLeast
    ).flatMap(_.toFromValue)

  def applyValue(newValue: Value,
                 oldValue: Value.FromValue,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.FromValue] =
    KeyValueMerger(
      newValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      oldValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      hasTimeLeftAtLeast
    ).flatMap(_.toFromValue)

  def applyValue(newValue: Value,
                 oldValue: Value,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.FromValue] =
    KeyValueMerger(
      newValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      oldValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      hasTimeLeftAtLeast
    ).flatMap(_.toFromValue)

  def applyValue(newValue: Value.FromValue,
                 oldValue: Value,
                 hasTimeLeftAtLeast: FiniteDuration): Try[Value.FromValue] =
    KeyValueMerger(
      newValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      oldValue.toMemory(Slice.emptyBytes): KeyValue.ReadOnly.Fixed,
      hasTimeLeftAtLeast
    ).flatMap(_.toFromValue)

  def apply[N, O](newKeyValue: N,
                  oldKeyValue: O,
                  hasTimeLeftAtLeast: FiniteDuration)(implicit merger: KeyValueMerger[N, O]): Try[KeyValue.ReadOnly.Fixed] =
    merger.applyValue(
      newKeyValue = newKeyValue,
      oldKeyValue = oldKeyValue,
      hasTimeLeftAtLeast = hasTimeLeftAtLeast
    )

}
