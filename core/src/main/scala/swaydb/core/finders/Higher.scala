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
import swaydb.core.function.FunctionStore
import swaydb.core.merge.KeyValueMerger
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice

object Higher {

  /**
    * TO-DO - Use trampolining instead to reduce repeated boilerplate code.
    */
  def apply(key: Slice[Byte],
            higherFromCurrentLevel: Slice[Byte] => Try[Option[KeyValue.ReadOnly]],
            get: Slice[Byte] => Try[Option[KeyValue.ReadOnly.Put]],
            higherInNextLevel: Slice[Byte] => Try[Option[KeyValue.ReadOnly.Put]])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                                                  timeOrder: TimeOrder[Slice[Byte]],
                                                                                  functionStore: FunctionStore): Try[Option[KeyValue.ReadOnly.Put]] = {

    import keyOrder._

    //    println(s"${rootPath}: Higher for key: " + key.readInt())
    @tailrec
    def higher(key: Slice[Byte]): Try[Option[KeyValue.ReadOnly.Put]] =
      higherFromCurrentLevel(key) match {
        case Success(current) =>
          current match {
            case Some(current) =>
              current match {
                /** HIGHER FIXED FROM CURRENT LEVEL **/
                case current: KeyValue.ReadOnly.Fixed => //if the higher from the current Level is a Fixed key-value, fetch from next Level and return the highest.
                  higherInNextLevel(key) match {
                    case Success(next) =>
                      Min(current, next) match {
                        case found @ Success(Some(_)) =>
                          found

                        case Success(None) =>
                          higher(current.key)

                        case Failure(exception) =>
                          Failure(exception)
                      }

                    case Failure(exception) =>
                      Failure(exception)
                  }

                /** HIGHER RANGE FROM CURRENT LEVEL **/
                //example
                //10->20  (input keys)
                //10 - 20 (higher range from current Level)
                case current: KeyValue.ReadOnly.Range if key >= current.fromKey =>
                  current.fetchRangeValue match {
                    case Success(rangeValue) =>
                      if (Value.hasTimeLeft(rangeValue)) //if the current range is active fetch the highest from next Level and return highest from both Levels.
                        higherInNextLevel(key) match {
                          case Success(Some(next)) =>
                            //10->20       (input keys)
                            //10   -    20 (higher range)
                            //  11 -> 19   (higher possible keys from next)
                            if (next.key < current.toKey) //if the higher in next Level falls within the range
                              next.toValue() match {
                                case Success(nextValue) =>
                                  KeyValueMerger(Some(next.key), rangeValue, nextValue: Value.FromValue) match {
                                    case Success(current) =>
                                      //return applied value with next key-value as the current value.
                                      Min(current.toMemory(next.key), None) match {
                                        case found @ Success(Some(_)) =>
                                          found

                                        case Success(None) =>
                                          higher(next.key) //current.key or next.key (either one! they both are the same here)

                                        case Failure(exception) =>
                                          Failure(exception)
                                      }
                                    case Failure(exception) =>
                                      Failure(exception)
                                  }
                                case Failure(exception) =>
                                  Failure(exception)
                              }


                            //10->20
                            //10 - 20
                            //     20 ----to----> ∞
                            else //else next Level's higher key doesn't fall in the Range, get ceiling of toKey
                              get(current.toKey) match {
                                case Success(Some(ceiling)) =>
                                  Success(Some(ceiling))

                                case Success(None) =>
                                  higher(current.toKey)

                                case failed @ Failure(_) =>
                                  failed
                              }

                          case Success(None) => //if there is no underlying key in lower Levels, jump to the next highest key (toKey).
                            get(current.toKey) match {
                              case Success(Some(ceiling)) =>
                                Success(Some(ceiling))

                              case Success(None) =>
                                higher(current.toKey)

                              case failed @ Failure(_) =>
                                failed
                            }

                          case Failure(exception) =>
                            Failure(exception)
                        }

                      else //if the rangeValue is expired then the higher is ceiling of toKey
                        get(current.toKey) match {
                          case Success(Some(ceiling)) =>
                            Success(Some(ceiling))

                          case Success(None) =>
                            higher(current.toKey)

                          case failed @ Failure(_) =>
                            failed
                        }

                    case Failure(exception) =>
                      Failure(exception)
                  }

                //if the input key is smaller than this Level's higher Range's fromKey.
                //example:
                //0           (input key)
                //    10 - 20 (higher range)
                case current: KeyValue.ReadOnly.Range =>
                  higherInNextLevel(key) match {
                    case Success(next) =>
                      next match {
                        case someNext @ Some(next) =>
                          //0
                          //      10 - 20
                          //  1
                          if (next.key < current.fromKey)
                            Success(someNext)

                          //0
                          //      10 - 20
                          //      10
                          else if (next.key equiv current.fromKey)
                            current.fetchFromOrElseRangeValue match {
                              case Success(fromOrElseRangeValue) =>
                                next.toValue() match {
                                  case Success(nextValue) =>
                                    KeyValueMerger(Some(current.fromKey), fromOrElseRangeValue, nextValue: Value.FromValue) match {
                                      case Success(mergedCurrent) =>
                                        Min(mergedCurrent.toMemory(current.fromKey), None) match { //return applied value with next key-value as the current value.
                                          case found @ Success(Some(_)) =>
                                            found

                                          case Success(None) =>
                                            higher(next.key) //current.key or next.key (either one! they both are the same here)

                                          case Failure(exception) =>
                                            Failure(exception)
                                        }

                                      case Failure(exception) =>
                                        Failure(exception)
                                    }

                                  case Failure(exception) =>
                                    Failure(exception)
                                }

                              case Failure(exception) =>
                                Failure(exception)
                            }
                          //0
                          //      10  -  20
                          //        11-19
                          else if (next.key < current.toKey) //if the higher in next Level falls within the range.
                            current.fetchFromAndRangeValue match {
                              case Success((Some(fromValue), rangeValue)) => //if fromValue is set check if it qualifies as the next highest orElse return higher of fromKey
                                Min(fromValue.toMemory(current.fromKey): KeyValue.ReadOnly.Fixed, None) match {
                                  case found @ Success(Some(_)) =>
                                    found

                                  case Success(None) =>
                                    next.toValue() match {
                                      case Success(nextValue) =>
                                        KeyValueMerger(Some(next.key), rangeValue, nextValue: Value.FromValue) match {
                                          case Success(currentValue) =>
                                            Min(currentValue.toMemory(next.key), None) match { //return applied value with next key-value as the current value.
                                              case found @ Success(Some(_)) =>
                                                found

                                              case Success(None) =>
                                                higher(current.key)

                                              case Failure(exception) =>
                                                Failure(exception)
                                            }

                                          case Failure(exception) =>
                                            Failure(exception)
                                        }
                                      case Failure(exception) =>
                                        Failure(exception)
                                    }

                                  case Failure(exception) =>
                                    Failure(exception)
                                }

                              case Success((None, rangeValue)) => //if there is no frm key
                                next.toValue() match {
                                  case Success(nextValue) =>
                                    KeyValueMerger(Some(next.key), rangeValue, nextValue: Value.FromValue) match {
                                      case Success(current) =>
                                        Min(current.toMemory(next.key), None) match { //return applied value with next key-value as the current value.
                                          case found @ Success(Some(_)) =>
                                            found

                                          case Success(None) =>
                                            higher(next.key)

                                          case Failure(exception) =>
                                            Failure(exception)
                                        }

                                      case Failure(exception) =>
                                        Failure(exception)
                                    }
                                  case Failure(exception) =>
                                    Failure(exception)
                                }



                              case Failure(exception) =>
                                Failure(exception)
                            }

                          //0
                          //      10 - 20
                          //           20 ----to----> ∞
                          else //else if the higher in next Level does not fall within the range.
                            current.fetchFromValue match {
                              case Success(maybeFromValue) =>
                                maybeFromValue match {
                                  case Some(fromValue) =>
                                    //next does not need to supplied here because it's already know that 'next' is larger than fromValue and there is not the highest.
                                    //returnHigher will execute higher on fromKey if the the current does not result to a valid higher key-value.
                                    Min(fromValue.toMemory(current.fromKey), None) match { //return applied value with next key-value as the current value.
                                      case found @ Success(Some(_)) =>
                                        found

                                      case Success(None) =>
                                        get(current.toKey) match {
                                          case Success(Some(ceiling)) =>
                                            Success(Some(ceiling))

                                          case Success(None) =>
                                            higher(current.toKey)

                                          case failed @ Failure(_) =>
                                            failed
                                        }

                                      case Failure(exception) =>
                                        Failure(exception)
                                    }

                                  case None =>
                                    get(current.toKey) match {
                                      case Success(Some(ceiling)) =>
                                        Success(Some(ceiling))

                                      case Success(None) =>
                                        higher(current.toKey)

                                      case failed @ Failure(_) =>
                                        failed
                                    }
                                }

                              case Failure(exception) =>
                                Failure(exception)
                            }

                        //no higher key-value in the next Level. Return fromValue orElse jump to toKey.
                        case None =>
                          current.fetchFromValue match {
                            case Success(maybeFromValue) =>
                              maybeFromValue match {
                                case Some(fromValue) =>
                                  Min(fromValue.toMemory(current.fromKey), None) match {
                                    case found @ Success(Some(_)) =>
                                      found

                                    case Success(None) =>
                                      get(current.toKey) match {
                                        case Success(Some(ceiling)) =>
                                          Success(Some(ceiling))

                                        case Success(None) =>
                                          higher(current.toKey)

                                        case failed @ Failure(_) =>
                                          failed
                                      }

                                    case Failure(exception) =>
                                      Failure(exception)
                                  }
                                case None =>
                                  get(current.toKey) match {
                                    case Success(Some(ceiling)) =>
                                      Success(Some(ceiling))

                                    case Success(None) =>
                                      higher(current.toKey)

                                    case failed @ Failure(_) =>
                                      failed
                                  }
                              }
                            case Failure(exception) =>
                              Failure(exception)
                          }
                      }

                    case Failure(exception) =>
                      Failure(exception)
                  }
              }

            case None =>
              higherInNextLevel(key)
          }
        case Failure(exception) =>
          Failure(exception)
      }

    higher(key)
  }
}
