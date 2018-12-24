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

package swaydb.core.level.zero

import java.util.concurrent.ConcurrentSkipListMap
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.data.{Memory, Transient}
import swaydb.core.map.{MapEntry, SkipListMerge}
import swaydb.core.segment.merge.{KeyValueMerger, SegmentMerger}
import swaydb.data.slice.Slice
import scala.collection.JavaConverters._
import scala.concurrent.duration.FiniteDuration
import swaydb.data.order.KeyOrder

object LevelZeroSkipListMerge {
  def apply(hasTimeLeftAtLeast: FiniteDuration): LevelZeroSkipListMerge =
    new LevelZeroSkipListMerge(hasTimeLeftAtLeast)
}

/**
  * When inserting key-values that alter existing Range key-values in the skipList, they should be inserted into the skipList atomically and should only
  * replace existing keys if all the new inserts have overwritten all the key ranges in the conflicting Range key-value.
  *
  * reverse on the merge results ensures that changes happen atomically.
  */
class LevelZeroSkipListMerge(val hasTimeLeftAtLeast: FiniteDuration) extends SkipListMerge[Slice[Byte], Memory.SegmentResponse] {

  implicit val groupingStrategy: Option[KeyValueGroupingStrategyInternal] = None

  //.get is no good. Memory key-values will never result in failure since they do not perform IO (no side-effects).
  //But this is a temporary solution until applyValue is updated to accept type classes to perform side effect.
  def applyValue(newKeyValue: Memory.Fixed,
                 oldKeyValue: Memory.Fixed,
                 hasTimeLeftAtLeast: FiniteDuration): Memory.Fixed =
    KeyValueMerger.applyValue(newKeyValue, oldKeyValue, hasTimeLeftAtLeast).get.asInstanceOf[Memory.Fixed]

  /**
    * Inserts a [[Memory.Fixed]] key-value into skipList.
    */
  def insert(insert: Memory.Fixed,
             skipList: ConcurrentSkipListMap[Slice[Byte], Memory.SegmentResponse])(implicit keyOrder: KeyOrder[Slice[Byte]]): Unit = {
    import keyOrder._
    Option(skipList.floorEntry(insert.key)) match {
      case Some(floorEntry) =>
        floorEntry.getValue match {
          //if floor entry for input Fixed entry & if they keys match, do applyValue else simply add the new key-value.
          case floor: Memory.Fixed if floor.key equiv insert.key =>
            skipList.put(insert.key, applyValue(insert, floor, hasTimeLeftAtLeast))

          //if the floor entry is a range try to do a merge.
          case floorRange: Memory.Range if insert.key < floorRange.toKey =>
            //Gah! performing a .get here. Although .get should never fail in this case because both the input key-values are in-memory and do not perform IO.
            //This should still be done properly.
            SegmentMerger.merge(insert, floorRange, hasTimeLeftAtLeast).reverse foreach {
              case transient: Transient =>
                skipList.put(transient.key, transient.toMemoryResponse.get)
            }

          case _ =>
            skipList.put(insert.key, insert)
        }

      //if there is no floor, simply put.
      case None =>
        skipList.put(insert.key, insert)
    }
  }

  /**
    * Inserts the input [[Memory.Range]] key-value into skipList and always maintaining the previous state of
    * the skipList before applying the new state so that all read queries read the latest write.
    */
  def insert(insert: Memory.Range,
             skipList: ConcurrentSkipListMap[Slice[Byte], Memory.SegmentResponse])(implicit keyOrder: KeyOrder[Slice[Byte]]): Unit = {
    import keyOrder._
    //get the start position of this range to fetch the range's start and end key-values for the skipList.
    val startKey = Option(skipList.floorEntry(insert.fromKey)) map {
      floorEntry =>
        floorEntry.getValue match {
          case range: Memory.Range if insert.fromKey < range.toKey =>
            range.fromKey

          case _ =>
            insert.fromKey
        }
    } getOrElse insert.fromKey

    val conflictingKeyValues = skipList.subMap(startKey, true, insert.toKey, false)
    if (conflictingKeyValues.isEmpty) {
      skipList.put(insert.key, insert)
    } else {
      val oldKeyValues = Slice(conflictingKeyValues.values().asScala.toArray)
      val mergedKeyValues = SegmentMerger.merge(Slice(insert), oldKeyValues, hasTimeLeftAtLeast)
      //while inserting also clear any conflicting key-values that are not replaced by new inserts.
      mergedKeyValues.reverse.foldLeft(Option.empty[Slice[Byte]]) {
        case (previousInsertedKey, transient: Transient) =>
          skipList.put(transient.key, transient.toMemoryResponse.get)
          //remove any entries that are greater than transient.key to the previously inserted entry.
          val toKey = previousInsertedKey.getOrElse(conflictingKeyValues.lastKey())
          if (transient.key < toKey)
            conflictingKeyValues.subMap(transient.key, false, toKey, previousInsertedKey.isEmpty).clear()
          Some(transient.key)
      }
    }
  }

  override def insert(insertKey: Slice[Byte],
                      insertValue: Memory.SegmentResponse,
                      skipList: ConcurrentSkipListMap[Slice[Byte], Memory.SegmentResponse])(implicit keyOrder: KeyOrder[Slice[Byte]]): Unit =
    insertValue match {
      //if insert value is fixed, check the floor entry
      case insertValue: Memory.Fixed =>
        insert(insertValue, skipList)

      //slice the skip list to keep on the range's key-values.
      //if the insert is a Range stash the edge non-overlapping key-values and keep only the ranges in the skipList
      //that fall within the inserted range before submitting fixed values to the range for further splits.
      case insertRange: Memory.Range =>
        insert(insertRange, skipList)
    }

  override def insert(entry: MapEntry[Slice[Byte], Memory.SegmentResponse],
                      skipList: ConcurrentSkipListMap[Slice[Byte], Memory.SegmentResponse])(implicit keyOrder: KeyOrder[Slice[Byte]]): Unit =
    entry match {
      case MapEntry.Put(key, value: Memory.SegmentResponse) =>
        insert(key, value, skipList)

      case MapEntry.Remove(_) =>
        entry applyTo skipList

      case _ =>
        entry.entries.foreach(insert(_, skipList))
    }
}
