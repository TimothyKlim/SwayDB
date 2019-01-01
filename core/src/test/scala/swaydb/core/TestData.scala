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

package swaydb.core

import java.util.concurrent.atomic.AtomicLong
import scala.concurrent.duration._
import scala.util.Random
import swaydb.compression.CompressionInternal
import swaydb.core.data.Value.{FromValue, RangeValue}
import swaydb.core.data._
import swaydb.core.function.FunctionStore
import swaydb.core.map.serializer.RangeValueSerializers._
import swaydb.data.slice.Slice
import swaydb.serializers.Default._
import swaydb.serializers._

trait TestData extends TryAssert {
  /**
    * Sequential time bytes generator.
    */
  private val timeCount = new AtomicLong(10)

  implicit def functionStore: FunctionStore

  def randomStringOption: Option[Slice[Byte]] =
    if (Random.nextBoolean())
      Some(randomCharacters())
    else
      None

  def randomDeadlineOption: Option[Deadline] =
    if (Random.nextBoolean())
      Some(randomDeadline())
    else
      None

  def randomNextTimeOption: Option[Time] =
    if (Random.nextBoolean())
      Some(nextTime)
    else
      None

  def randomPreviousTimeOption: Option[Time] =
    if (Random.nextBoolean())
      Some(previousTime)
    else
      None

  /**
    * Random return one of the older times used.
    * Randomly decrement by a random number (minimum decremented by 1)
    */
  def previousTime: Time =
    Time(timeCount.decrementAndGet())

  def nextTime: Time =
    Time(timeCount.incrementAndGet())

  def randomDeadline(): Deadline =
    if (Random.nextBoolean())
      randomIntMax(30).seconds.fromNow
    else
      0.seconds.fromNow - (randomIntMax(30) + 10).seconds

  def randomPutKeyValue(key: Slice[Byte],
                        value: Option[Slice[Byte]] = randomStringOption): Memory.Fixed =
    Memory.Put(key, value, randomDeadlineOption, ???)

  def randomRemoveKeyValue(key: Slice[Byte],
                           deadline: Option[Deadline] = randomDeadlineOption): Memory.Remove =
    Memory.Remove(key, deadline, None)

  def randomRequiresKeyFunction(): SwayFunction.RequiresKey =
    if (Random.nextBoolean())
      SwayFunction.Key {
        _ =>
          if (Random.nextBoolean())
            FunctionOutput.Remove
          else if (Random.nextBoolean())
            FunctionOutput.Expire(randomDeadline())
          else
            FunctionOutput.Update(randomStringOption, randomDeadlineOption)
      }
    else if (Random.nextBoolean())
      SwayFunction.KeyValue {
        (_, oldValue) =>
          if (Random.nextBoolean())
            FunctionOutput.Remove
          else if (Random.nextBoolean())
            FunctionOutput.Expire(randomDeadline())
          else
            FunctionOutput.Update(eitherOne(oldValue, randomStringOption), randomDeadlineOption)
      }
    else if (Random.nextBoolean())
      SwayFunction.KeyDeadline {
        (_, _) =>
          if (Random.nextBoolean())
            FunctionOutput.Remove
          else if (Random.nextBoolean())
            FunctionOutput.Expire(randomDeadline())
          else
            FunctionOutput.Update(randomStringOption, randomDeadlineOption)
      }
    else
      SwayFunction.KeyValueDeadline {
        (_, _, _) =>
          if (Random.nextBoolean())
            FunctionOutput.Remove
          else if (Random.nextBoolean())
            FunctionOutput.Expire(randomDeadline())
          else
            FunctionOutput.Update(randomStringOption, randomDeadlineOption)
      }

  def randomValueOnlyFunction(): SwayFunction.RequiresValueOnly =
    if (Random.nextBoolean())
      SwayFunction.Value {
        _ =>
          if (Random.nextBoolean())
            FunctionOutput.Remove
          else if (Random.nextBoolean())
            FunctionOutput.Expire(randomDeadline())
          else
            FunctionOutput.Update(randomStringOption, randomDeadlineOption)
      }
    else
      SwayFunction.ValueDeadline {
        (_, _) =>
          if (Random.nextBoolean())
            FunctionOutput.Remove
          else if (Random.nextBoolean())
            FunctionOutput.Expire(randomDeadline())
          else
            FunctionOutput.Update(randomStringOption, randomDeadlineOption)
      }

  def randomFunction(): SwayFunction =
    if (Random.nextBoolean())
      randomRequiresKeyFunction()
    else
      randomValueOnlyFunction()

  def randomFunctionId: Slice[Byte] = {
    val functionId: Slice[Byte] = randomCharacters(randomIntMax(100) + 1)
    functionStore.put(functionId, randomFunction())
    functionId
  }

  def randomApply(value: Option[Slice[Byte]] = randomStringOption,
                  deadline: Option[Deadline] = randomDeadlineOption,
                  time: Option[Time] = randomNextTimeOption,
                  includeFunctions: Boolean = true) =
    if (Random.nextBoolean())
      Value.Remove(deadline, time)
    else if (includeFunctions && Random.nextBoolean())
      Value.Function(randomFunctionId, time)
    else
      Value.Update(value, deadline, time)

  def randomApplies(max: Int = 5,
                    value: Option[Slice[Byte]] = randomStringOption,
                    deadline: Option[Deadline] = randomDeadlineOption,
                    includeFunctions: Boolean = true): Slice[Value.Apply] =
    Slice {
      (1 to (Random.nextInt(max) max 1)).map {
        _ =>
          randomApply(value, deadline, Some(previousTime), includeFunctions)
      } toArray
    }

  def randomFixedKeyValue(key: Slice[Byte],
                          value: Option[Slice[Byte]] = randomStringOption,
                          deadline: Option[Deadline] = randomDeadlineOption,
                          time: Option[Time] = randomNextTimeOption,
                          includePendingApply: Boolean = true,
                          includeFunctions: Boolean = true): Memory.Fixed =
    if (Random.nextBoolean())
      Memory.Put(key, value, deadline, time)
    else if (Random.nextBoolean())
      Memory.Remove(key, deadline, time)
    else if (includePendingApply && Random.nextBoolean())
      Memory.PendingApply(key, randomApplies(10, value, deadline, includeFunctions))
    else
      Memory.Update(key, value, deadline, time)

  def randomCompression(minCompressionPercentage: Double = Double.MinValue): CompressionInternal =
    CompressionInternal.random(minCompressionPercentage = minCompressionPercentage)

  def randomCompressionLZ4OrSnappy(minCompressionPercentage: Double = Double.MinValue): CompressionInternal =
    CompressionInternal.randomLZ4OrSnappy(minCompressionPercentage = minCompressionPercentage)

  def randomCompressionLZ4(minCompressionPercentage: Double = Double.MinValue): CompressionInternal =
    CompressionInternal.randomLZ4(minCompressionPercentage = minCompressionPercentage)

  def randomRangeKeyValue(from: Slice[Byte],
                          to: Slice[Byte],
                          fromValue: Option[FromValue] = randomFromValueOption(),
                          rangeValue: RangeValue = randomRangeValue()): Memory.Range =
    Memory.Range(from, to, fromValue, rangeValue)

  def randomRangeValueOption(from: Slice[Byte], to: Slice[Byte]): Option[Memory.Range] =
    if (Random.nextBoolean())
      Some(randomRangeKeyValue(from, to))
    else
      None

  def randomFromValueOption(): Option[Value.FromValue] =
    if (Random.nextBoolean())
      Some(randomFromValue())
    else
      None

  def randomFromValue(): Value.FromValue =
    if (Random.nextBoolean())
      Value.Put(randomStringOption, randomDeadlineOption, randomNextTimeOption)
    else
      randomRangeValue()

  def randomRangeValue(): Value.RangeValue =
    if (Random.nextBoolean())
      Value.Remove(randomDeadlineOption, randomNextTimeOption)
    else if (Random.nextBoolean())
      Value.Function(randomFunctionId, randomNextTimeOption)
    else if (Random.nextBoolean())
      Value.PendingApply(randomApplies())
    else
      Value.Update(randomStringOption, randomDeadlineOption, randomNextTimeOption)

  def randomCharacters(size: Int = 10) = Random.alphanumeric.take(size max 1).mkString

  def randomBytes(size: Int = 10) = Array.fill(size)(randomByte())

  def randomByteChunks(size: Int = 10, sizePerChunk: Int = 10): Seq[Slice[Byte]] =
    (1 to size) map {
      _ =>
        Slice(randomBytes(sizePerChunk))
    }

  def randomBytesSlice(size: Int = 10) = Slice(randomBytes(size))

  def randomByte() = (Random.nextInt(256) - 128).toByte

  //  implicit class ToTuple(keyValues: Slice[KeyValue]) {
  //    def tuple: Iterable[KeyValueResponse] =
  //      keyValues.map {
  //        keyValue =>
  //          (keyValue.key, keyValue.getOrFetchValue)
  //      }
  //  }

  def ints(numbers: Int): Int =
    (1 to numbers).foldLeft("") {
      case (concat, _) =>
        concat + Math.abs(Random.nextInt(9)).toString
    }.toInt

  def randomInt(minus: Int = 0) = Math.abs(Random.nextInt(Int.MaxValue)) - minus - 1

  def randomIntMax(max: Int = Int.MaxValue) =
    Math.abs(Random.nextInt(max))

  def randomIntMaxOption(max: Int = Int.MaxValue) =
    if (Random.nextBoolean())
      Some(randomIntMax(max))
    else
      None

  def randomIntKeyStringValues(count: Int = 5,
                               startId: Option[Int] = None,
                               valueSize: Int = 50,
                               nonValue: Boolean = false,
                               addRandomRemoves: Boolean = false,
                               addRandomRanges: Boolean = false,
                               addRandomRemoveDeadlines: Boolean = false,
                               addRandomPutDeadlines: Boolean = false): Slice[KeyValue.WriteOnly] =
    randomKeyValues(
      count = count,
      startId = startId,
      valueSize = Some(valueSize),
      nonValue = nonValue,
      addRandomRemoves = addRandomRemoves,
      addRandomRanges = addRandomRanges,
      addRandomRemoveDeadlines = addRandomRemoveDeadlines,
      addRandomPutDeadlines = addRandomPutDeadlines
    )

  def randomizedIntKeyValues(count: Int = 5,
                             startId: Option[Int] = None,
                             valueSize: Int = 50,
                             nonValue: Boolean = false,
                             addRandomRemoves: Boolean = Random.nextBoolean(),
                             addRandomRanges: Boolean = Random.nextBoolean(),
                             addRandomRemoveDeadlines: Boolean = Random.nextBoolean(),
                             addRandomPutDeadlines: Boolean = Random.nextBoolean(),
                             addRandomGroups: Boolean = Random.nextBoolean(),
                             addRandomTimes: Boolean = Random.nextBoolean()): Slice[KeyValue.WriteOnly] =
    randomKeyValues(
      count = count,
      startId = startId,
      valueSize = Some(valueSize),
      nonValue = nonValue,
      addRandomRemoves = addRandomRemoves,
      addRandomRanges = addRandomRanges,
      addRandomRemoveDeadlines = addRandomRemoveDeadlines,
      addRandomPutDeadlines = addRandomPutDeadlines,
      addRandomGroups = addRandomGroups,
      addRandomTimes = addRandomTimes
    )

  def groupsOnly(count: Int = 5,
                 startId: Option[Int] = None,
                 valueSize: Int = 50,
                 nonValue: Boolean = false): Slice[KeyValue.WriteOnly] =
    randomKeyValues(
      count = count,
      startId = startId,
      valueSize = Some(valueSize),
      nonValue = nonValue,
      addRandomGroups = true
    )

  def randomKeyValues(count: Int = 20,
                      startId: Option[Int] = None,
                      valueSize: Option[Int] = None,
                      nonValue: Boolean = false,
                      addRandomRemoves: Boolean = false,
                      addRandomRemoveDeadlines: Boolean = false,
                      addRandomPutDeadlines: Boolean = false,
                      addRandomRanges: Boolean = false,
                      addRandomGroups: Boolean = false,
                      addRandomTimes: Boolean = false): Slice[KeyValue.WriteOnly] = {
    //    println(
    //      s"""
    //        |nonValue : $nonValue
    //        |addRandomRemoves : $addRandomRemoves
    //        |addRandomRemoveDeadlines : $addRandomRemoveDeadlines
    //        |addRandomPutDeadlines : $addRandomPutDeadlines
    //        |addRandomRanges : $addRandomRanges
    //        |addRandomGroups : $addRandomGroups
    //      """.stripMargin)

    val slice = Slice.create[KeyValue.WriteOnly](count + 50) //extra space because addRandomRanges and random Groups can be added for Fixed and Range key-values in the same iteration.
    //            var key = 1
    var key = startId getOrElse randomInt(minus = count)
    val until = key + count
    var hasOne = false
    while (key < until || !hasOne) {
      hasOne = true
      if (nonValue) {
        slice add Transient.Put(
          key,
          previous = slice.lastOption,
          deadline = if (addRandomPutDeadlines && Random.nextBoolean()) Some(10.seconds.fromNow) else None,
          compressDuplicateValues = true,
          value = None,
          time = None,
          falsePositiveRate = 0.1
        )
        key = key + 1
      } else if ((addRandomRemoves || addRandomRanges || addRandomGroups) && Random.nextBoolean()) {
        if (addRandomRemoves) {
          slice add Transient.Remove(
            key = key: Slice[Byte],
            falsePositiveRate = 0.1,
            previous = slice.lastOption,
            deadline = if (addRandomRemoveDeadlines && Random.nextBoolean()) Some(10.seconds.fromNow) else None,
            time = if (addRandomTimes) randomNextTimeOption else None
          )

          key = key + 1
        }
        if (addRandomRanges) {
          //          val value: Slice[Byte] = valueSize.map(size => Random.nextString(size): Slice[Byte]).getOrElse(randomInt(): Slice[Byte])
          val toKey = key + 10
          slice add Transient.Range[FromValue, RangeValue](
            fromKey = key,
            toKey = toKey,
            fromValue = randomFromValueOption(),
            rangeValue = randomRangeValue(),
            previous = slice.lastOption,
            falsePositiveRate = 0.1
          )
          //randomly skip the Range's toKey for the next key.
          if (Random.nextBoolean())
            key = toKey
          else
            key = toKey + randomIntMax(5)
        }
        if (addRandomGroups) {
          //create a Random group with the inner key-values the same as count of this group.
          val groupKeyValues =
            randomKeyValues(
              count = randomIntMax((count max 10) min 50),
              startId = Some(key),
              valueSize = valueSize,
              nonValue = nonValue,
              addRandomRemoves = addRandomRemoves,
              addRandomRemoveDeadlines = addRandomRemoveDeadlines,
              addRandomPutDeadlines = addRandomPutDeadlines,
              addRandomRanges = addRandomRanges,
              addRandomTimes = addRandomTimes,
              addRandomGroups = false //do not create more inner groups.
            )

          val groupToAdd = Transient.Group(groupKeyValues, randomCompression(), randomCompression(), 0.1, previous = slice.lastOption).assertGet
          slice add groupToAdd
          //randomly skip the Group's toKey for the next key. Next key should not be the same as toKey so add a minimum of 1 to next key.
          if (Random.nextBoolean())
            key = groupToAdd.maxKey.maxKey.readInt() + 1
          else
            key = groupToAdd.maxKey.maxKey.readInt() + 1 + randomIntMax(5)
        }
      } else {
        //        val value: Slice[Byte] = valueSize.map(size => Random.nextString(size): Slice[Byte]).getOrElse(randomInt(): Slice[Byte])
        slice add Transient.Put(
          key = key: Slice[Byte],
          value = Some(key),
          falsePositiveRate = 0.1,
          previous = slice.lastOption,
          compressDuplicateValues = true,
          deadline = if (addRandomPutDeadlines && Random.nextBoolean()) Some(10.seconds.fromNow) else None,
          time = if (addRandomTimes) randomNextTimeOption else None
        )
        key = key + 1
      }
    }
    slice.close()
  }

  def randomIntKeys(count: Int = 20,
                    startId: Option[Int] = None): Slice[KeyValue.WriteOnly] =
    randomKeyValues(count = count, startId = startId, nonValue = true)

  def randomGroup(keyValues: Slice[KeyValue.WriteOnly] = randomizedIntKeyValues(),
                  keyCompression: CompressionInternal = randomCompression(),
                  valueCompression: CompressionInternal = randomCompression(),
                  falsePositiveRate: Double = 0.1,
                  previous: Option[KeyValue.WriteOnly] = None): Transient.Group =
    Transient.Group(
      keyValues = keyValues,
      indexCompression = keyCompression,
      valueCompression = valueCompression,
      falsePositiveRate = falsePositiveRate,
      previous = previous
    ).assertGet

  implicit class MemoryImplicits(memory: Memory.type) {

    /**
      * Memory.Put
      */
    def put(key: Slice[Byte],
            value: Slice[Byte]): Memory.Put =
      Memory.Put(key, Some(value), None, None)

    def put(key: Slice[Byte],
            value: Slice[Byte],
            removeAt: Deadline): Memory.Put =
      Memory.Put(key, Some(value), Some(removeAt), None)

    def put(key: Slice[Byte],
            value: Option[Slice[Byte]],
            removeAt: Deadline): Memory.Put =
      Memory.Put(key, value, Some(removeAt), None)

    def put(key: Slice[Byte],
            value: Slice[Byte],
            removeAt: Option[Deadline]): Memory.Put =
      Memory.Put(key, Some(value), removeAt, None)

    def put(key: Slice[Byte],
            value: Option[Slice[Byte]],
            deadline: Option[Deadline]): Memory.Put =
      Memory.Put(key, value, deadline, None)

    def put(key: Slice[Byte],
            value: Slice[Byte],
            removeAfter: FiniteDuration): Memory.Put =
      Memory.Put(key, Some(value), Some(removeAfter.fromNow), None)

    def put(key: Slice[Byte],
            value: Option[Slice[Byte]]): Memory.Put =
      Memory.Put(key, value, None, None)

    def put(key: Slice[Byte]): Memory.Put =
      Memory.Put(key, None, None, None)

    def put(key: Slice[Byte],
            value: Option[Slice[Byte]],
            deadline: Option[Deadline],
            time: Option[Time]): Memory.Put =
      Memory.Put(key, value, deadline, time)

    /**
      * Memory.Update
      */
    def update(key: Slice[Byte],
               value: Slice[Byte]): Memory.Update =
      Memory.Update(key, Some(value), None, None)

    def update(key: Slice[Byte],
               value: Slice[Byte],
               removeAt: Deadline): Memory.Update =
      Memory.Update(key, Some(value), Some(removeAt), None)

    def update(key: Slice[Byte],
               value: Option[Slice[Byte]],
               removeAt: Deadline): Memory.Update =
      Memory.Update(key, value, Some(removeAt), None)

    def update(key: Slice[Byte],
               value: Slice[Byte],
               removeAt: Option[Deadline]): Memory.Update =
      Memory.Update(key, Some(value), removeAt, None)

    def update(key: Slice[Byte],
               value: Option[Slice[Byte]],
               deadline: Option[Deadline]): Memory.Update =
      Memory.Update(key, value, deadline, None)

    def update(key: Slice[Byte],
               value: Slice[Byte],
               removeAfter: FiniteDuration): Memory.Update =
      Memory.Update(key, Some(value), Some(removeAfter.fromNow), None)

    def update(key: Slice[Byte],
               value: Option[Slice[Byte]]): Memory.Update =
      Memory.Update(key, value, None, None)

    def update(key: Slice[Byte]): Memory.Update =
      Memory.Update(key, None, None, None)

    def update(key: Slice[Byte],
               value: Option[Slice[Byte]],
               deadline: Option[Deadline],
               time: Option[Time]): Memory.Update =
      Memory.Update(key, value, deadline, time)

    /**
      * Memory.Remove
      */

    def remove(key: Slice[Byte]): Memory.Remove =
      Memory.Remove(key, None, None)

    def remove(key: Slice[Byte], deadline: Deadline): Memory.Remove =
      Memory.Remove(key, Some(deadline), None)

    def remove(key: Slice[Byte], deadline: FiniteDuration): Memory.Remove =
      Memory.Remove(key, Some(deadline.fromNow), None)

    def remove(key: Slice[Byte],
               deadline: Option[Deadline]): Memory.Remove =
      Memory.Remove(key, deadline, None)

    def remove(key: Slice[Byte],
               deadline: Option[Deadline],
               time: Option[Time]): Memory.Remove =
      Memory.Remove(key, deadline, time)
  }

  implicit class TransientImplicits(transient: Transient.type) {

    /**
      * Transient.Remove
      *
      * @param key
      * @return
      */
    def remove(key: Slice[Byte]): Transient.Remove =
      Transient.Remove(
        key = key,
        falsePositiveRate = 0.1,
        time = None,
        previous = None,
        deadline = None
      )

    def remove(key: Slice[Byte],
               removeAfter: FiniteDuration,
               falsePositiveRate: Double): Transient.Remove =
      Transient.Remove(
        key = key,
        falsePositiveRate = falsePositiveRate,
        previous = None,
        deadline = Some(removeAfter.fromNow),
        time = None
      )

    def remove(key: Slice[Byte],
               falsePositiveRate: Double): Transient.Remove =
      Transient.Remove(
        key = key,
        falsePositiveRate = falsePositiveRate,
        previous = None,
        deadline = None,
        time = None
      )

    def remove(key: Slice[Byte],
               falsePositiveRate: Double,
               previous: Option[KeyValue.WriteOnly]): Transient.Remove =
      Transient.Remove(
        key = key,
        falsePositiveRate = falsePositiveRate,
        previous = previous,
        deadline = None,
        time = None
      )

    def remove(key: Slice[Byte],
               falsePositiveRate: Double,
               previous: Option[KeyValue.WriteOnly],
               deadline: Option[Deadline]): Transient.Remove =
      Transient.Remove(
        key = key,
        deadline = deadline,
        previous = previous,
        falsePositiveRate = falsePositiveRate,
        time = None
      )

    def put(key: Slice[Byte],
            value: Option[Slice[Byte]],
            falsePositiveRate: Double,
            previousMayBe: Option[KeyValue.WriteOnly]): Transient.Put =
      Transient.Put(
        key = key,
        value = value,
        deadline = None,
        time = None,
        previous = previousMayBe,
        falsePositiveRate = falsePositiveRate,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            value: Option[Slice[Byte]],
            falsePositiveRate: Double,
            previousMayBe: Option[KeyValue.WriteOnly],
            deadline: Option[Deadline],
            compressDuplicateValues: Boolean): Transient.Put =
      Transient.Put(
        key = key,
        value = value,
        deadline = deadline,
        previous = previousMayBe,
        falsePositiveRate = falsePositiveRate,
        time = None,
        compressDuplicateValues = compressDuplicateValues
      )

    def put(key: Slice[Byte]): Transient.Put =
      Transient.Put(
        key = key,
        value = None,
        deadline = None,
        previous = None,
        falsePositiveRate = 0.1,
        time = None,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            value: Slice[Byte]): Transient.Put =
      Transient.Put(
        key = key,
        value = Some(value),
        deadline = None,
        previous = None,
        time = None,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            value: Slice[Byte],
            removeAfter: FiniteDuration): Transient.Put =
      Transient.Put(
        key = key,
        value = Some(value),
        deadline = Some(removeAfter.fromNow),
        previous = None,
        falsePositiveRate = 0.1,
        time = None,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            value: Slice[Byte],
            deadline: Deadline): Transient.Put =
      Transient.Put(
        key = key,
        value = Some(value),
        deadline = Some(deadline),
        previous = None,
        falsePositiveRate = 0.1,
        time = None,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            removeAfter: FiniteDuration): Transient.Put =
      Transient.Put(
        key = key,
        value = None,
        deadline = Some(removeAfter.fromNow),
        previous = None,
        falsePositiveRate = 0.1,
        time = None,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            value: Slice[Byte],
            removeAfter: Option[FiniteDuration]): Transient.Put =
      Transient.Put(
        key = key,
        value = Some(value),
        deadline = removeAfter.map(_.fromNow),
        previous = None,
        falsePositiveRate = 0.1,
        time = None,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            value: Slice[Byte],
            falsePositiveRate: Double): Transient.Put =
      Transient.Put(
        key = key,
        value = Some(value),
        deadline = None,
        previous = None,
        falsePositiveRate = falsePositiveRate,
        time = None,
        compressDuplicateValues = true
      )

    def put(key: Slice[Byte],
            previous: Option[KeyValue.WriteOnly],
            deadline: Option[Deadline],
            compressDuplicateValues: Boolean): Transient.Put =
      Transient.Put(
        key = key,
        value = None,
        deadline = deadline,
        previous = previous,
        falsePositiveRate = 0.1,
        time = None,
        compressDuplicateValues = compressDuplicateValues
      )

    def put(key: Slice[Byte],
            value: Slice[Byte],
            falsePositiveRate: Double,
            previous: Option[KeyValue.WriteOnly],
            compressDuplicateValues: Boolean): Transient.Put =
      Transient.Put(
        key = key,
        value = Some(value),
        deadline = None,
        previous = previous,
        falsePositiveRate = falsePositiveRate,
        time = None,
        compressDuplicateValues = compressDuplicateValues
      )

  }

  implicit class ValueRemoveData(remove: Value.type) {

    def remove(deadline: Option[Deadline],
               time: Option[Time]): Value.Remove =
      Value.Remove(deadline, time)

    def remove(deadline: Deadline): Value.Remove =
      Value.Remove(Some(deadline), None)

    def remove(deadline: Option[Deadline]): Value.Remove =
      Value.Remove(deadline, None)

    def put(value: Option[Slice[Byte]],
            deadline: Option[Deadline],
            time: Option[Time]): Value.Put =
      Value.Put(Some(value), deadline, time)

    def put(value: Slice[Byte]): Value.Put =
      Value.Put(Some(value), None, None)

    def put(value: Option[Slice[Byte]])(removeAfter: Deadline): Value.Put =
      Value.Put(value, Some(removeAfter), None)

    def put(value: Slice[Byte], removeAfter: Deadline): Value.Put =
      Value.Put(Some(value), Some(removeAfter), None)

    def put(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Value.Put =
      Value.Put(value, removeAfter, None)

    def put(value: Slice[Byte], duration: FiniteDuration): Value.Put =
      Value.Put(Some(value), Some(duration.fromNow), None)

    def put(value: Option[Slice[Byte]], duration: FiniteDuration): Value.Put =
      Value.Put(value, Some(duration.fromNow), None)

    def update(value: Option[Slice[Byte]],
               deadline: Option[Deadline],
               time: Option[Time]): Value.Update =
      Value.Update(Some(value), deadline, time)

    def update(value: Slice[Byte]): Value.Update =
      Value.Update(Some(value), None, None)

    def update(value: Slice[Byte], deadline: Option[Deadline]): Value.Update =
      Value.Update(Some(value), deadline, None)

    def update(value: Option[Slice[Byte]])(removeAfter: Deadline): Value.Update =
      Value.Update(value, Some(removeAfter), None)

    def update(value: Slice[Byte], removeAfter: Deadline): Value.Update =
      Value.Update(Some(value), Some(removeAfter), None)

    def update(value: Option[Slice[Byte]], removeAfter: Option[Deadline]): Value.Update =
      Value.Update(value, removeAfter, None)

    def update(value: Slice[Byte], duration: FiniteDuration): Value.Update =
      Value.Update(Some(value), Some(duration.fromNow), None)

    def update(value: Option[Slice[Byte]], duration: FiniteDuration): Value.Update =
      Value.Update(value, Some(duration.fromNow), None)
  }
}

