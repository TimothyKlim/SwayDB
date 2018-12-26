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

package swaydb.core.data

import scala.concurrent.duration.{Deadline, FiniteDuration}
import scala.util.{Success, Try}
import swaydb.compression.CompressionInternal
import swaydb.core.group.compression.data.GroupHeader
import swaydb.core.group.compression.{GroupCompressor, GroupDecompressor, GroupKeyCompressor}
import swaydb.core.io.reader.Reader
import swaydb.core.map.serializer.{RangeValueSerializer, ValueSerializer}
import swaydb.core.queue.KeyValueLimiter
import swaydb.core.segment.format.a.entry.reader.lazyvalue._
import swaydb.core.segment.format.a.entry.writer._
import swaydb.core.segment.{SegmentCache, SegmentCacheInitializer}
import swaydb.core.util.Bytes
import swaydb.core.util.CollectionUtil._
import swaydb.data.order.KeyOrder
import swaydb.data.segment.MaxKey
import swaydb.data.slice.{Reader, Slice}

private[core] sealed trait KeyValue {
  def key: Slice[Byte]

  def keyLength =
    key.size

}

private[core] object KeyValue {

  /**
    * Read-only instances are only created for Key-values read from disk for Persistent Segments
    * and are stored in-memory after merge for Memory Segments.
    */
  sealed trait ReadOnly extends KeyValue {
    def indexEntryDeadline: Option[Deadline]
  }

  /**
    * Key-values that can be added to [[KeyValueLimiter]].
    *
    * These key-values can remain in memory depending on the cacheSize and are dropped or uncompressed on overflow.
    *
    * Only [[KeyValue.ReadOnly.Group]] && [[Persistent.SegmentResponse]] key-values are [[CacheAble]].
    *
    * Only [[Memory.Group]] key-values are uncompressed and every other key-value is dropped.
    */
  sealed trait CacheAble extends ReadOnly {
    def valueLength: Int
  }

  object ReadOnly {
    /**
      * An API response type expected from a [[swaydb.core.map.Map]] or [[swaydb.core.segment.Segment]].
      *
      * Key-value types like [[Group]] are processed within [[swaydb.core.map.Map]] or [[swaydb.core.segment.Segment]].
      */
    sealed trait SegmentResponse extends KeyValue with ReadOnly

    sealed trait Fixed extends SegmentResponse

    implicit class ReadOnlyFixedImplicit(overwrite: KeyValue.ReadOnly.Fixed) {
      def toFromValue: Try[Value.FromValue] =
        overwrite match {
          case remove: Persistent.Remove =>
            Success(Value.Remove(remove.deadline))

          case remove: Memory.Remove =>
            Success(Value.Remove(remove.deadline))

          case put: Memory.Put =>
            Success(Value.Put(put.value, put.deadline))

          case put: Persistent.Put =>
            put.getOrFetchValue.map(Value.Put(_, put.deadline))

          case update: Memory.Update =>
            Success(
              Value.Update(
                update.value,
                update.deadline
              )
            )

          case apply: Memory.Apply =>
            Success(Value.Apply(apply.applies))

          case apply: Persistent.Apply =>
            apply.getOrFetchApplies.map(Value.Apply)

          case update: Persistent.Update =>
            update.getOrFetchValueAndApplies map {
              case (value, applies) =>
                Value.Update(
                  value = value,
                  applies = applies,
                  deadline = update.deadline
                )
            }
        }

      def toRangeValue: Try[Value.RangeValue] =
        overwrite match {
          case remove: Persistent.Remove =>
            Success(Value.Remove(remove.deadline))

          case remove: Memory.Remove =>
            Success(Value.Remove(remove.deadline))

          case update: Memory.Update =>
            Success(Value.Update(update.value, update.deadline))

          case update: Persistent.Update =>
            update.getOrFetchValue.map(Value.Update(_, update.deadline))

          case update: Memory.Apply =>
            Success(Value.Apply(update.applies))

          case apply: Persistent.Apply =>
            apply.getOrFetchApplies.map(Value.Apply)

          case put: Memory.Put =>
            //range value cannot be put. need a type-safe way of handling this
            //            Success(Value.Update(put.value, put.deadline))
            ???

          case put: Persistent.Put =>
            //range value cannot be put. need a type-safe way of handling this
            //            put.getOrFetchValue.map(Value.Update(_, put.deadline))
            ???
        }
    }

    sealed trait Put extends KeyValue.ReadOnly.Fixed {
      def valueLength: Int

      def updateDeadline(deadline: Deadline): Put

      def deadline: Option[Deadline]

      def hasTimeLeft(): Boolean

      def isOverdue(): Boolean =
        !hasTimeLeft()

      def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean

      def getOrFetchValue: Try[Option[Slice[Byte]]]

    }

    sealed trait Remove extends KeyValue.ReadOnly.Fixed {
      def deadline: Option[Deadline]

      def updateDeadline(deadline: Deadline): Remove

      def hasTimeLeft(): Boolean

      def isOverdue(): Boolean =
        !hasTimeLeft()

      def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean

      def getOrFetchApplies: Try[Seq[Slice[Byte]]]

    }

    sealed trait Update extends KeyValue.ReadOnly.Fixed {
      def toPut(): KeyValue.ReadOnly.Put

      def toPut(deadline: Deadline): KeyValue.ReadOnly.Put

      def deadline: Option[Deadline]

      def hasTimeLeft(): Boolean

      def isOverdue(): Boolean =
        !hasTimeLeft()

      def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean

      def updateDeadline(deadline: Deadline): Fixed
    }

    sealed trait Apply extends KeyValue.ReadOnly.Fixed {
      def getOrFetchApplies: Try[Seq[Value.ApplyValue]]
    }

    object Range {
      implicit class RangeImplicit(range: KeyValue.ReadOnly.Range) {
        def contains(key: Slice[Byte])(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean = {
          import keyOrder._
          key >= range.fromKey && key < range.toKey
        }
      }
    }

    sealed trait Range extends KeyValue.ReadOnly with SegmentResponse {
      def fromKey: Slice[Byte]

      def toKey: Slice[Byte]

      def fetchFromValue: Try[Option[Value.FromValue]]

      def fetchRangeValue: Try[Value.RangeValue]

      def fetchFromAndRangeValue: Try[(Option[Value.FromValue], Value.RangeValue)]

      def fetchFromOrElseRangeValue: Try[Value] =
        fetchFromAndRangeValue map {
          case (fromValue, rangeValue) =>
            fromValue getOrElse rangeValue
        }
    }

    object Group {
      implicit class GroupImplicit(group: KeyValue.ReadOnly.Group) {
        def contains(key: Slice[Byte])(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean = {
          import keyOrder._
          key >= group.minKey && ((group.maxKey.inclusive && key <= group.maxKey.maxKey) || (!group.maxKey.inclusive && key < group.maxKey.maxKey))
        }

        def containsHigher(key: Slice[Byte])(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean = {
          import keyOrder._
          key >= group.minKey && key < group.maxKey.maxKey
        }
      }
    }

    sealed trait Group extends KeyValue.ReadOnly with CacheAble {
      def minKey: Slice[Byte]

      def maxKey: MaxKey

      def header(): Try[GroupHeader]

      def segmentCache(implicit keyOrder: KeyOrder[Slice[Byte]],
                       keyValueLimiter: KeyValueLimiter): SegmentCache

      def deadline: Option[Deadline]
    }
  }

  /**
    * Write-only instances are only created after a successful merge of key-values and are used to write to Persistent
    * and Memory Segments.
    */
  sealed trait WriteOnly extends KeyValue {
    //@formatter:off
    val isRemoveRange: Boolean
    val isRange: Boolean
    val isGroup: Boolean
    val hasRemove: Boolean
    val previous: Option[KeyValue.WriteOnly]
    def fullKey: Slice[Byte]
    def stats: Stats
    def deadline: Option[Deadline]
    def indexEntryBytes: Slice[Byte]
    def valueEntryBytes: Option[Slice[Byte]]
    //a flag that returns true if valueBytes are created for this or any of it's previous key-values indicating value slice is required.
    def hasValueEntryBytes: Boolean
    //start value offset is carried current value offset position.
    def currentStartValueOffsetPosition: Int
    def currentEndValueOffsetPosition: Int
    def nextStartValueOffsetPosition: Int =
      if(!hasValueEntryBytes && currentEndValueOffsetPosition == 0)
        0
      else
        currentEndValueOffsetPosition + 1
    def value: Option[Slice[Byte]]
    //@formatter:on

    def updateStats(falsePositiveRate: Double,
                    previous: Option[KeyValue.WriteOnly]): KeyValue.WriteOnly

    private def thisInScope = this

    def reverseIterator: Iterator[WriteOnly] =
      new Iterator[WriteOnly] {
        var currentPrevious: Option[KeyValue.WriteOnly] =
          Some(thisInScope)

        override def hasNext: Boolean =
          currentPrevious.isDefined

        override def next(): KeyValue.WriteOnly = {
          val next = currentPrevious.get
          currentPrevious = next.previous
          next
        }
      }

  }

  object WriteOnly {

    implicit class WriteOnlyImplicits(keyValues: Iterable[KeyValue.WriteOnly]) {
      def lastGroup(): Option[Transient.Group] =
        keyValues.iterator.foldLeftWhile(Option.empty[Transient.Group], _.isGroup) {
          case (_, group: Transient.Group) =>
            Some(group)
          case (previousGroup, _) =>
            previousGroup
        }

      def maxKey() =
        keyValues.last match {
          case range: Range =>
            MaxKey.Range(range.fromKey, range.toKey)
          case group: Group =>
            group.maxKey
          case fixed: Transient =>
            MaxKey.Fixed(fixed.key)
        }

      def minKey: Slice[Byte] =
        keyValues.head.key
    }

    sealed trait Fixed extends KeyValue.WriteOnly {

      def hasTimeLeft(): Boolean

      def isOverdue(): Boolean =
        !hasTimeLeft()
    }

    sealed trait Range extends KeyValue.WriteOnly {
      val isRange: Boolean = true

      def fromKey: Slice[Byte]

      def toKey: Slice[Byte]

      def fromValue: Option[Value.FromValue]

      def rangeValue: Value.RangeValue

      def fetchFromValue: Try[Option[Value.FromValue]]

      def fetchRangeValue: Try[Value.RangeValue]

      def fetchFromAndRangeValue: Try[(Option[Value.FromValue], Value.RangeValue)]
    }

    sealed trait Group extends KeyValue.WriteOnly {
      val isRange: Boolean = true

      def minKey: Slice[Byte]

      def maxKey: MaxKey

      def fullKey: Slice[Byte]

      def keyValues: Iterable[KeyValue.WriteOnly]

      def compressedKeyValues: Slice[Byte]
    }
  }

  type KeyValueTuple = (Slice[Byte], Option[Slice[Byte]])
}

private[swaydb] sealed trait Memory extends KeyValue.ReadOnly {

  def key: Slice[Byte]

}

private[swaydb] object Memory {
  sealed trait SegmentResponse extends Memory with KeyValue.ReadOnly.SegmentResponse

  implicit class MemoryImplicits(memory: Memory.Fixed) {
    def toFromValue: Value.FromValue =
      memory match {
        case put: Put =>
          Value.Put(put.value, put.deadline)

        case update: Update =>
          Value.Update(update.value, update.deadline)

        case remove: Remove =>
          Value.Remove(remove.deadline)

        case update: Memory.Apply =>
          Value.Apply(update.applies)

      }
  }

  sealed trait Fixed extends Memory.SegmentResponse with KeyValue.ReadOnly.Fixed

  object Put {
    def apply(key: Slice[Byte],
              value: Slice[Byte]): Put =
      new Put(key, Some(value), Slice.emptySeqBytes, None)

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAt: Deadline): Put =
      new Put(key, Some(value), Slice.emptySeqBytes, Some(removeAt))

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              removeAt: Deadline): Put =
      new Put(key, value, Slice.emptySeqBytes, Some(removeAt))

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAt: Option[Deadline]): Put =
      new Put(key, Some(value), Slice.emptySeqBytes, removeAt)

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              deadline: Option[Deadline]): Put =
      new Put(key, value, Slice.emptySeqBytes, deadline)

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAfter: FiniteDuration): Put =
      new Put(key, Some(value), Slice.emptySeqBytes, Some(removeAfter.fromNow))

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]]): Put =
      new Put(key, value, Slice.emptySeqBytes, None)

    def apply(key: Slice[Byte]): Put =
      new Put(key, None, Slice.emptySeqBytes, None)
  }

  case class Put(key: Slice[Byte],
                 value: Option[Slice[Byte]],
                 applies: Seq[Slice[Byte]],
                 deadline: Option[Deadline]) extends Memory.Fixed with KeyValue.ReadOnly.Put {

    override def indexEntryDeadline: Option[Deadline] = deadline

    override def valueLength: Int =
      value.map(_.size).getOrElse(0)

    override def updateDeadline(deadline: Deadline): Put =
      copy(deadline = Some(deadline))

    def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - minus).hasTimeLeft())

    override def getOrFetchValue: Try[Option[Slice[Byte]]] =
      Success(value)

    def getOrFetchApplies: Try[Seq[Slice[Byte]]] =
      Success(applies)

    def getOrFetchValueAndApplies: Try[(Option[Slice[Byte]], Seq[Slice[Byte]])] =
      Success(value, applies)
  }

  object Update {
    def apply(key: Slice[Byte],
              value: Slice[Byte]): Update =
      new Update(key, Some(value), Slice.emptySeqBytes, None)

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAt: Deadline): Update =
      new Update(key, Some(value), Slice.emptySeqBytes, Some(removeAt))

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAt: Option[Deadline]): Update =
      new Update(key, Some(value), Slice.emptySeqBytes, removeAt)

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              deadline: Option[Deadline]): Update =
      new Update(key, value, Slice.emptySeqBytes, deadline)

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAfter: FiniteDuration): Update =
      new Update(key, Some(value), Slice.emptySeqBytes, Some(removeAfter.fromNow))

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]]): Update =
      new Update(key, value, Slice.emptySeqBytes, None)

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              deadline: Deadline): Update =
      new Update(key, value, Slice.emptySeqBytes, Some(deadline))

    def apply(key: Slice[Byte]): Update =
      new Update(key, None, Slice.emptySeqBytes, None)
  }

  case class Update(key: Slice[Byte],
                    value: Option[Slice[Byte]],
                    applies: Seq[Slice[Byte]],
                    deadline: Option[Deadline]) extends KeyValue.ReadOnly.Update with Memory.Fixed {

    override def indexEntryDeadline: Option[Deadline] = deadline

    def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def updateDeadline(deadline: Deadline): Update =
      copy(deadline = Some(deadline))

    def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - minus).hasTimeLeft())

    override def toPut(): Memory.Put =
      Memory.Put(key, value, deadline)

    override def toPut(deadline: Deadline): Memory.Put =
      Memory.Put(key, value, deadline)
  }

  case class Apply(key: Slice[Byte],
                   applies: Seq[Value.ApplyValue]) extends KeyValue.ReadOnly.Apply with Memory.Fixed {

    override def indexEntryDeadline: Option[Deadline] = None

    override def getOrFetchApplies: Try[Seq[Value.ApplyValue]] =
      Success(applies)
  }

  object Remove {
    def apply(key: Slice[Byte]): Remove =
      new Remove(key, Slice.emptySeqBytes, None)

    def apply(key: Slice[Byte], deadline: Deadline): Remove =
      new Remove(key, Slice.emptySeqBytes, Some(deadline))

    def apply(key: Slice[Byte], deadline: Option[Deadline]): Remove =
      new Remove(key, Slice.emptySeqBytes, deadline)

    def apply(key: Slice[Byte], deadline: FiniteDuration): Remove =
      new Remove(key, Slice.emptySeqBytes, Some(deadline.fromNow))
  }

  case class Remove(key: Slice[Byte],
                    applies: Seq[Slice[Byte]],
                    deadline: Option[Deadline]) extends Memory.Fixed with KeyValue.ReadOnly.Remove {

    override def updateDeadline(deadline: Deadline): Remove =
      copy(deadline = Some(deadline))

    override def indexEntryDeadline: Option[Deadline] = deadline

    def hasTimeLeft(): Boolean =
      deadline.exists(_.hasTimeLeft())

    def hasTimeLeftAtLeast(atLeast: FiniteDuration): Boolean =
      deadline.exists(deadline => (deadline - atLeast).hasTimeLeft())

    override def getOrFetchApplies: Try[Seq[Slice[Byte]]] =
      Success(applies)
  }

  object Range {
    def apply(fromKey: Slice[Byte],
              toKey: Slice[Byte],
              fromValue: Value.FromValue,
              rangeValue: Value.RangeValue): Range =
      new Range(fromKey, toKey, Some(fromValue), rangeValue)
  }

  case class Range(fromKey: Slice[Byte],
                   toKey: Slice[Byte],
                   fromValue: Option[Value.FromValue],
                   rangeValue: Value.RangeValue) extends Memory.SegmentResponse with KeyValue.ReadOnly.Range {

    override def key: Slice[Byte] = fromKey

    override def indexEntryDeadline: Option[Deadline] = None

    override def fetchFromValue: Try[Option[Value.FromValue]] =
      Success(fromValue)

    override def fetchRangeValue: Try[Value.RangeValue] =
      Success(rangeValue)

    override def fetchFromAndRangeValue: Try[(Option[Value.FromValue], Value.RangeValue)] =
      Success(fromValue, rangeValue)

  }

  object Group {
    def apply(minKey: Slice[Byte],
              maxKey: MaxKey,
              compressedKeyValues: Slice[Byte],
              groupStartOffset: Int,
              deadline: Option[Deadline]): Memory.Group =
      new Group(
        minKey = minKey,
        maxKey = maxKey,
        deadline = deadline,
        valueLength = compressedKeyValues.size,
        groupDecompressor = GroupDecompressor(Reader(compressedKeyValues), groupStartOffset)
      )
  }

  case class Group(minKey: Slice[Byte],
                   maxKey: MaxKey,
                   deadline: Option[Deadline],
                   groupDecompressor: GroupDecompressor,
                   valueLength: Int) extends Memory with KeyValue.ReadOnly.Group {

    lazy val segmentCacheInitializer: SegmentCacheInitializer =
      new SegmentCacheInitializer(
        id = "Persistent.Group",
        minKey = minKey,
        maxKey = maxKey,
        unsliceKey = false,
        getFooter = groupDecompressor.footer,
        createReader = groupDecompressor.reader
      )

    override def indexEntryDeadline: Option[Deadline] = deadline

    override def key: Slice[Byte] = minKey

    def isValueDefined: Boolean =
      groupDecompressor.isIndexDecompressed()

    def segmentCache(implicit keyOrder: KeyOrder[Slice[Byte]],
                     keyValueLimiter: KeyValueLimiter): SegmentCache =
      segmentCacheInitializer.segmentCache

    def header() =
      groupDecompressor.header()

    def isHeaderDecompressed: Boolean =
      groupDecompressor.isHeaderDecompressed()

    def isIndexDecompressed: Boolean =
      groupDecompressor.isIndexDecompressed()

    def isValueDecompressed: Boolean =
      groupDecompressor.isValueDecompressed()

    def uncompress(): Memory.Group =
      copy(groupDecompressor = groupDecompressor.uncompress())
  }

}

private[core] sealed trait Transient extends KeyValue.WriteOnly

private[core] object Transient {

  implicit class TransientImplicits(transient: Transient)(implicit keyOrder: KeyOrder[Slice[Byte]]) {
    def toMemory: Memory =
      transient match {
        case put: Transient.Put =>
          Memory.Put(put.key, put.value, put.deadline)

        case remove: Transient.Remove =>
          Memory.Remove(remove.key, remove.deadline)

        case update: Transient.Update =>
          Memory.Update(
            key = update.key,
            value = update.value,
            deadline = update.deadline
          )

        case update: Transient.Apply =>
          Memory.Apply(
            key = update.key,
            applies = update.applies
          )

        case range: Transient.Range =>
          Memory.Range(range.fromKey, range.toKey, range.fromValue, range.rangeValue)

        case group: Transient.Group =>
          Memory.Group(
            minKey = group.minKey,
            maxKey = group.maxKey,
            deadline = group.deadline,
            compressedKeyValues = group.compressedKeyValues.unslice(),
            groupStartOffset = 0
          )
      }

    def toMemoryResponse: Memory.SegmentResponse =
      transient match {
        case put: Transient.Put =>
          Memory.Put(put.key, put.value, put.deadline)

        case remove: Transient.Remove =>
          Memory.Remove(remove.key, remove.deadline)

        case apply: Transient.Apply =>
          Memory.Apply(apply.key, apply.applies)

        case update: Transient.Update =>
          Memory.Update(
            key = update.key,
            value = update.value,
            update.deadline
          )

        case range: Transient.Range =>
          Memory.Range(range.fromKey, range.toKey, range.fromValue, range.rangeValue)

        case _: Transient.Group =>
          //todo make this type-safe instead.
          throw new Exception("toMemoryResponse invoked on a Group")
      }
  }

  object Remove {

    def apply(key: Slice[Byte]): Remove =
      new Remove(
        key = key,
        falsePositiveRate = 0.1,
        applies = Slice.emptySeqBytes,
        previous = None,
        deadline = None
      )

    def apply(key: Slice[Byte],
              removeAfter: FiniteDuration,
              falsePositiveRate: Double): Remove =
      new Remove(
        key = key,
        falsePositiveRate = falsePositiveRate,
        previous = None,
        deadline = Some(removeAfter.fromNow),
        applies = Slice.emptySeqBytes,
      )

    def apply(key: Slice[Byte],
              falsePositiveRate: Double): Remove =
      new Remove(
        key = key,
        falsePositiveRate = falsePositiveRate,
        previous = None,
        deadline = None,
        applies = Slice.emptySeqBytes,
      )

    def apply(key: Slice[Byte],
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly]): Remove =
      new Remove(
        key = key,
        falsePositiveRate = falsePositiveRate,
        previous = previous,
        deadline = None,
        applies = Slice.emptySeqBytes,
      )

    def apply(key: Slice[Byte],
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly],
              deadline: Option[Deadline]): Remove =
      new Remove(
        key = key,
        deadline = deadline,
        previous = previous,
        falsePositiveRate = falsePositiveRate,
        applies = Slice.emptySeqBytes,
      )
  }

  case class Remove(key: Slice[Byte],
                    deadline: Option[Deadline],
                    previous: Option[KeyValue.WriteOnly],
                    applies: Seq[Slice[Byte]],
                    falsePositiveRate: Double) extends Transient with KeyValue.WriteOnly.Fixed {
    override val hasRemove: Boolean = true
    override val isRange: Boolean = false
    override val isGroup: Boolean = false
    override val isRemoveRange = false
    override val value: Option[Slice[Byte]] = None
    override val (indexEntryBytes, valueEntryBytes, currentStartValueOffsetPosition, currentEndValueOffsetPosition) =
      KeyValueEntryWriter.write(
        current = this,
        applies = applies,
        compressDuplicateValues = false
      )

    override def fullKey = key

    override val hasValueEntryBytes: Boolean = previous.exists(_.hasValueEntryBytes) || valueEntryBytes.exists(_.nonEmpty)
    override val stats =
      Stats(
        key = indexEntryBytes,
        value = None,
        falsePositiveRate = falsePositiveRate,
        isRemoveRange = isRemoveRange,
        isRange = isRange,
        isGroup = isGroup,
        bloomFiltersItemCount = 1,
        previous = previous,
        deadline = deadline
      )

    override def updateStats(falsePositiveRate: Double,
                             keyValue: Option[KeyValue.WriteOnly]): KeyValue.WriteOnly =
      this.copy(previous = keyValue, falsePositiveRate = falsePositiveRate)

    override def hasTimeLeft(): Boolean =
      deadline.exists(_.hasTimeLeft())

  }

  object Put {

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              falsePositiveRate: Double,
              previousMayBe: Option[KeyValue.WriteOnly]): Put =
      new Put(
        key = key,
        value = value,
        deadline = None,
        previous = previousMayBe,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = falsePositiveRate,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              falsePositiveRate: Double,
              previousMayBe: Option[KeyValue.WriteOnly],
              deadline: Option[Deadline],
              compressDuplicateValues: Boolean): Put =
      new Put(
        key = key,
        value = value,
        deadline = deadline,
        previous = previousMayBe,
        falsePositiveRate = falsePositiveRate,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = compressDuplicateValues
      )

    def apply(key: Slice[Byte]): Put =
      new Put(
        key = key,
        value = None,
        deadline = None,
        previous = None,
        falsePositiveRate = 0.1,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte]): Put =
      new Put(
        key = key,
        value = Some(value),
        deadline = None,
        previous = None,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAfter: FiniteDuration): Put =
      new Put(
        key = key,
        value = Some(value),
        deadline = Some(removeAfter.fromNow),
        previous = None,
        falsePositiveRate = 0.1,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              deadline: Deadline): Put =
      new Put(
        key = key,
        value = Some(value),
        deadline = Some(deadline),
        previous = None,
        falsePositiveRate = 0.1,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              removeAfter: FiniteDuration): Put =
      new Put(
        key = key,
        value = None,
        deadline = Some(removeAfter.fromNow),
        previous = None,
        falsePositiveRate = 0.1,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAfter: Option[FiniteDuration]): Put =
      new Put(
        key = key,
        value = Some(value),
        deadline = removeAfter.map(_.fromNow),
        previous = None,
        falsePositiveRate = 0.1,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              falsePositiveRate: Double): Put =
      new Put(
        key = key,
        value = Some(value),
        deadline = None,
        previous = None,
        falsePositiveRate = falsePositiveRate,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly]): Put =
      Put(
        key = key,
        value = None,
        falsePositiveRate = falsePositiveRate,
        previousMayBe = previous
      )

    def apply(key: Slice[Byte],
              previous: Option[KeyValue.WriteOnly],
              deadline: Option[Deadline],
              compressDuplicateValues: Boolean): Put =
      new Put(
        key = key,
        value = None,
        deadline = deadline,
        previous = previous,
        falsePositiveRate = 0.1,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = compressDuplicateValues
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly],
              compressDuplicateValues: Boolean): Put =
      new Put(
        key = key,
        value = Some(value),
        deadline = None,
        previous = previous,
        falsePositiveRate = falsePositiveRate,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = compressDuplicateValues
      )
  }

  case class Put(key: Slice[Byte],
                 value: Option[Slice[Byte]],
                 deadline: Option[Deadline],
                 previous: Option[KeyValue.WriteOnly],
                 applies: Seq[Slice[Byte]],
                 falsePositiveRate: Double,
                 compressDuplicateValues: Boolean) extends Transient with KeyValue.WriteOnly.Fixed {

    override val hasRemove: Boolean = previous.exists(_.hasRemove)
    override val isRemoveRange = false
    override val isGroup: Boolean = false
    override val isRange: Boolean = false

    val (indexEntryBytes, valueEntryBytes, currentStartValueOffsetPosition, currentEndValueOffsetPosition) =
      KeyValueEntryWriter.write(
        current = this,
        applies = applies,
        compressDuplicateValues = compressDuplicateValues
      )

    override val hasValueEntryBytes: Boolean =
      previous.exists(_.hasValueEntryBytes) || valueEntryBytes.exists(_.nonEmpty)

    val stats =
      Stats(
        key = indexEntryBytes,
        value = valueEntryBytes,
        falsePositiveRate = falsePositiveRate,
        isRemoveRange = isRemoveRange,
        isRange = isRange,
        isGroup = isGroup,
        bloomFiltersItemCount = 1,
        previous = previous,
        deadline = deadline
      )

    override def fullKey = key

    override def updateStats(falsePositiveRate: Double, previous: Option[KeyValue.WriteOnly]): KeyValue.WriteOnly =
      this.copy(falsePositiveRate = falsePositiveRate, previous = previous)

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

  }

  object Update {

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              falsePositiveRate: Double,
              previousMayBe: Option[KeyValue.WriteOnly]): Update =
      new Update(
        key = key,
        value = value,
        deadline = None,
        previous = previousMayBe,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = falsePositiveRate,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Option[Slice[Byte]],
              falsePositiveRate: Double,
              previousMayBe: Option[KeyValue.WriteOnly],
              deadline: Option[Deadline],
              compressDuplicateValues: Boolean): Update =
      new Update(
        key = key,
        value = value,
        deadline = deadline,
        previous = previousMayBe,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = falsePositiveRate,
        compressDuplicateValues = compressDuplicateValues
      )

    def apply(key: Slice[Byte]): Update =
      new Update(
        key = key,
        value = None,
        deadline = None,
        previous = None,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte]): Update =
      new Update(
        key = key,
        value = Some(value),
        deadline = None,
        previous = None,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAfter: FiniteDuration): Update =
      new Update(
        key = key,
        value = Some(value),
        deadline = Some(removeAfter.fromNow),
        previous = None,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              deadline: Deadline): Update =
      new Update(
        key = key,
        value = Some(value),
        deadline = Some(deadline),
        previous = None,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              removeAfter: FiniteDuration): Update =
      new Update(
        key = key,
        value = None,
        deadline = Some(removeAfter.fromNow),
        previous = None,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              removeAfter: Option[FiniteDuration]): Update =
      new Update(
        key = key,
        value = Some(value),
        deadline = removeAfter.map(_.fromNow),
        previous = None,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = 0.1,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              falsePositiveRate: Double): Update =
      new Update(
        key = key,
        value = Some(value),
        deadline = None,
        applies = Slice.emptySeqBytes,
        previous = None,
        falsePositiveRate = falsePositiveRate,
        compressDuplicateValues = true
      )

    def apply(key: Slice[Byte],
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly]): Update =
      Update(
        key = key,
        value = None,
        falsePositiveRate = falsePositiveRate,
        previousMayBe = previous
      )

    def apply(key: Slice[Byte],
              previous: Option[KeyValue.WriteOnly],
              deadline: Option[Deadline],
              compressDuplicateValues: Boolean): Update =
      new Update(
        key = key,
        value = None,
        deadline = deadline,
        applies = Slice.emptySeqBytes,
        previous = previous,
        falsePositiveRate = 0.1,
        compressDuplicateValues = compressDuplicateValues
      )

    def apply(key: Slice[Byte],
              value: Slice[Byte],
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly],
              compressDuplicateValues: Boolean): Update =
      new Update(
        key = key,
        value = Some(value),
        deadline = None,
        previous = previous,
        applies = Slice.emptySeqBytes,
        falsePositiveRate = falsePositiveRate,
        compressDuplicateValues = compressDuplicateValues
      )
  }

  case class Update(key: Slice[Byte],
                    value: Option[Slice[Byte]],
                    deadline: Option[Deadline],
                    previous: Option[KeyValue.WriteOnly],
                    applies: Seq[Slice[Byte]],
                    falsePositiveRate: Double,
                    compressDuplicateValues: Boolean) extends Transient with KeyValue.WriteOnly.Fixed {
    override val hasRemove: Boolean = previous.exists(_.hasRemove)
    override val isRemoveRange = false
    override val isGroup: Boolean = false
    override val isRange: Boolean = false

    val (indexEntryBytes, valueEntryBytes, currentStartValueOffsetPosition, currentEndValueOffsetPosition) =
      KeyValueEntryWriter.write(
        current = this,
        applies = applies,
        compressDuplicateValues = compressDuplicateValues
      )
    override val hasValueEntryBytes: Boolean = previous.exists(_.hasValueEntryBytes) || valueEntryBytes.exists(_.nonEmpty)

    val stats =
      Stats(
        key = indexEntryBytes,
        value = valueEntryBytes,
        falsePositiveRate = falsePositiveRate,
        isRemoveRange = isRemoveRange,
        isRange = isRange,
        isGroup = isGroup,
        bloomFiltersItemCount = 1,
        previous = previous,
        deadline = deadline
      )

    override def fullKey = key

    override def updateStats(falsePositiveRate: Double, previous: Option[KeyValue.WriteOnly]): Transient.Update =
      this.copy(falsePositiveRate = falsePositiveRate, previous = previous)

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

  }

  object Apply {
    def apply(key: Slice[Byte],
              applies: Seq[Value.ApplyValue],
              previous: Option[KeyValue.WriteOnly],
              falsePositiveRate: Double,
              compressDuplicateValues: Boolean): Apply = {
      val bytesRequired = ValueSerializer.bytesRequired(applies)
      val bytes = Slice.create[Byte](bytesRequired)
      ValueSerializer.write(applies)(bytes)

      new Apply(
        key = key,
        applies = applies,
        value = Some(bytes),
        previous = previous,
        falsePositiveRate = falsePositiveRate,
        compressDuplicateValues = compressDuplicateValues
      )
    }
  }

  case class Apply(key: Slice[Byte],
                   applies: Seq[Value.ApplyValue],
                   value: Option[Slice[Byte]],
                   previous: Option[KeyValue.WriteOnly],
                   falsePositiveRate: Double,
                   compressDuplicateValues: Boolean) extends Transient with KeyValue.WriteOnly.Fixed {
    override val hasRemove: Boolean = previous.exists(_.hasRemove)
    override val isRemoveRange = false
    override val isGroup: Boolean = false
    override val isRange: Boolean = false

    val (indexEntryBytes, valueEntryBytes, currentStartValueOffsetPosition, currentEndValueOffsetPosition) =
      KeyValueEntryWriter.write(
        current = this,
        applies = Slice.emptySeqBytes,
        compressDuplicateValues = compressDuplicateValues
      )
    override val hasValueEntryBytes: Boolean = previous.exists(_.hasValueEntryBytes) || valueEntryBytes.exists(_.nonEmpty)

    val stats =
      Stats(
        key = indexEntryBytes,
        value = valueEntryBytes,
        falsePositiveRate = falsePositiveRate,
        isRemoveRange = isRemoveRange,
        isRange = isRange,
        isGroup = isGroup,
        bloomFiltersItemCount = 1,
        previous = previous,
        deadline = deadline
      )

    override def fullKey = key

    override def updateStats(falsePositiveRate: Double, previous: Option[KeyValue.WriteOnly]): Transient.Apply =
      this.copy(falsePositiveRate = falsePositiveRate, previous = previous)

    override def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def deadline: Option[Deadline] = None
  }

  object Range {

    def apply[F <: Value.FromValue, R <: Value.RangeValue](fromKey: Slice[Byte],
                                                           toKey: Slice[Byte],
                                                           fromValue: Option[F],
                                                           rangeValue: R)(implicit rangeValueSerializer: RangeValueSerializer[Option[F], R]): Range =
      Range(
        fromKey = fromKey,
        toKey = toKey,
        fromValue = fromValue,
        rangeValue = rangeValue,
        falsePositiveRate = 0.1,
        previous = None
      )

    def apply[R <: Value.RangeValue](fromKey: Slice[Byte],
                                     toKey: Slice[Byte],
                                     rangeValue: R,
                                     falsePositiveRate: Double,
                                     previous: Option[KeyValue.WriteOnly])(implicit rangeValueSerializer: RangeValueSerializer[Unit, R]): Range = {
      val bytesRequired = rangeValueSerializer.bytesRequired((), rangeValue)
      val value = if (bytesRequired == 0) None else Some(Slice.create[Byte](bytesRequired))
      value.foreach(rangeValueSerializer.write((), rangeValue, _))
      val fullKey = Bytes.compressJoin(fromKey, toKey)
      new Range(
        fullKey = fullKey,
        fromKey = fromKey,
        toKey = toKey,
        fromValue = None,
        rangeValue = rangeValue,
        value = value,
        previous = previous,
        falsePositiveRate = falsePositiveRate
      )
    }

    def apply[F <: Value.FromValue, R <: Value.RangeValue](fromKey: Slice[Byte],
                                                           toKey: Slice[Byte],
                                                           fromValue: Option[F],
                                                           rangeValue: R,
                                                           falsePositiveRate: Double,
                                                           previous: Option[KeyValue.WriteOnly])(implicit rangeValueSerializer: RangeValueSerializer[Option[F], R]): Range = {
      val bytesRequired = rangeValueSerializer.bytesRequired(fromValue, rangeValue)
      val value = if (bytesRequired == 0) None else Some(Slice.create[Byte](bytesRequired))
      value.foreach(rangeValueSerializer.write(fromValue, rangeValue, _))
      val fullKey: Slice[Byte] = Bytes.compressJoin(fromKey, toKey)

      new Range(
        fromKey = fromKey,
        toKey = toKey,
        fullKey = fullKey,
        fromValue = fromValue,
        rangeValue = rangeValue,
        value = value,
        previous = previous,
        falsePositiveRate = falsePositiveRate
      )
    }
  }

  case class Range(fromKey: Slice[Byte],
                   toKey: Slice[Byte],
                   fullKey: Slice[Byte],
                   fromValue: Option[Value.FromValue],
                   rangeValue: Value.RangeValue,
                   value: Option[Slice[Byte]],
                   previous: Option[KeyValue.WriteOnly],
                   falsePositiveRate: Double) extends Transient with KeyValue.WriteOnly.Range {

    def key = fromKey

    override val hasRemove: Boolean = previous.exists(_.hasRemove)
    override val isRemoveRange = rangeValue.isRemove
    override val isGroup: Boolean = false
    override val deadline: Option[Deadline] = None

    val (indexEntryBytes, valueEntryBytes, currentStartValueOffsetPosition, currentEndValueOffsetPosition) =
      KeyValueEntryWriter.write(
        current = this,
        applies = Slice.emptySeqBytes,
        //It's highly likely that two sequential key-values within the same range have the same value after the range split occurs. So this is always set to true.
        compressDuplicateValues = true
      )

    override val hasValueEntryBytes: Boolean = previous.exists(_.hasValueEntryBytes) || valueEntryBytes.exists(_.nonEmpty)

    val stats =
      Stats(
        key = indexEntryBytes,
        value = valueEntryBytes,
        falsePositiveRate = falsePositiveRate,
        isRemoveRange = isRemoveRange,
        isRange = isRange,
        isGroup = isGroup,
        previous = previous,
        bloomFiltersItemCount = 1,
        deadline = None
      )

    override def updateStats(falsePositiveRate: Double, previous: Option[KeyValue.WriteOnly]): Transient.Range =
      this.copy(falsePositiveRate = falsePositiveRate, previous = previous)

    override def fetchFromValue: Try[Option[Value.FromValue]] =
      Success(fromValue)

    override def fetchRangeValue: Try[Value.RangeValue] =
      Success(rangeValue)

    override def fetchFromAndRangeValue: Try[(Option[Value.FromValue], Value.RangeValue)] =
      Success(fromValue, rangeValue)
  }

  object Group {

    def apply(keyValues: Iterable[KeyValue.WriteOnly],
              indexCompression: CompressionInternal,
              valueCompression: CompressionInternal,
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly]): Try[Option[Transient.Group]] =
      GroupCompressor.compress(
        keyValues = keyValues,
        indexCompressions = Seq(indexCompression),
        valueCompressions = Seq(valueCompression),
        falsePositiveRate = falsePositiveRate,
        previous = previous
      )

    def apply(keyValues: Iterable[KeyValue.WriteOnly],
              indexCompressions: Seq[CompressionInternal],
              valueCompressions: Seq[CompressionInternal],
              falsePositiveRate: Double,
              previous: Option[KeyValue.WriteOnly]): Try[Option[Transient.Group]] =
      GroupCompressor.compress(
        keyValues = keyValues,
        indexCompressions = indexCompressions,
        valueCompressions = valueCompressions,
        falsePositiveRate = falsePositiveRate,
        previous = previous
      )
  }

  case class Group(minKey: Slice[Byte],
                   maxKey: MaxKey,
                   fullKey: Slice[Byte],
                   compressedKeyValues: Slice[Byte],
                   //the deadline is the nearest deadline in the Group's key-values.
                   deadline: Option[Deadline],
                   keyValues: Iterable[KeyValue.WriteOnly],
                   previous: Option[KeyValue.WriteOnly],
                   falsePositiveRate: Double) extends Transient with KeyValue.WriteOnly.Group {

    override def key = minKey

    override val hasRemove: Boolean = previous.exists(_.hasRemove)
    override val isRemoveRange: Boolean = keyValues.last.stats.hasRemoveRange
    override val isRange: Boolean = keyValues.last.stats.hasRange
    override val isGroup: Boolean = true
    override val value: Option[Slice[Byte]] = Some(compressedKeyValues)
    val (indexEntryBytes, valueEntryBytes, currentStartValueOffsetPosition, currentEndValueOffsetPosition) =
      KeyValueEntryWriter.write(
        current = this,
        applies = Slice.emptySeqBytes,
        //it's highly unlikely that 2 groups after compression will have duplicate values.
        //compressDuplicateValues check is unnecessary since the value bytes of a group can be large.
        compressDuplicateValues = false
      )
    override val hasValueEntryBytes: Boolean = previous.exists(_.hasValueEntryBytes) || valueEntryBytes.exists(_.nonEmpty)

    val stats =
      Stats(
        key = indexEntryBytes,
        value = valueEntryBytes,
        falsePositiveRate = falsePositiveRate,
        isRemoveRange = isRemoveRange,
        isRange = isRange,
        isGroup = isGroup,
        previous = previous,
        bloomFiltersItemCount = keyValues.last.stats.bloomFilterItemsCount,
        deadline = deadline
      )

    override def updateStats(falsePositiveRate: Double, previous: Option[KeyValue.WriteOnly]): Transient.Group =
      this.copy(falsePositiveRate = falsePositiveRate, previous = previous)
  }
}

private[core] sealed trait Persistent extends KeyValue.ReadOnly with KeyValue.CacheAble {

  val indexOffset: Int
  val nextIndexOffset: Int
  val nextIndexSize: Int

  def key: Slice[Byte]

  def isValueDefined: Boolean

  def valueLength: Int

  def valueOffset: Int

  /**
    * This function is NOT thread-safe and is mutable. It should always be invoke at the time of creation
    * and before inserting into the Segment's cache.
    */
  def unsliceKey: Unit
}

private[core] object Persistent {

  implicit class PersistentResponseImplicits(persistent: Persistent.SegmentResponse) {
    def toMemoryResponseOption(): Try[Option[Memory.SegmentResponse]] =
      toMemoryResponse() map (Some(_))

    def toMemoryResponse(): Try[Memory.SegmentResponse] =
      persistent match {
        case fixed: Persistent.Fixed =>
          fixed match {
            case remove: Persistent.Remove =>
              Try {
                Memory.Remove(
                  key = remove.key,
                  deadline = remove.deadline
                )
              }
            case put: Persistent.Put =>
              put.getOrFetchValue map {
                value =>
                  Memory.Put(
                    key = put.key,
                    value = value,
                    put.deadline
                  )
              }

            case update: Persistent.Update =>
              update.getOrFetchValueAndApplies map {
                case (value, applies) =>
                  Memory.Update(
                    key = update.key,
                    value = value,
                    applies = applies,
                    deadline = update.deadline
                  )
              }

            case apply: Persistent.Apply =>
              apply.getOrFetchApplies map {
                applies =>
                  Memory.Apply(
                    key = apply.key,
                    applies = applies
                  )
              }
          }
        case range: Persistent.Range =>
          range.fetchFromAndRangeValue map {
            case (fromValue, rangeValue) =>
              Memory.Range(
                fromKey = range.fromKey,
                toKey = range.toKey,
                fromValue = fromValue,
                rangeValue = rangeValue
              )
          }
      }
  }

  sealed trait SegmentResponse extends KeyValue.ReadOnly.SegmentResponse with Persistent

  sealed trait Fixed extends Persistent.SegmentResponse with KeyValue.ReadOnly.Fixed

  case class Remove(private var _key: Slice[Byte],
                    private val appliesReader: LazyAppliesReader,
                    deadline: Option[Deadline],
                    indexOffset: Int,
                    nextIndexOffset: Int,
                    nextIndexSize: Int) extends Persistent.Fixed with KeyValue.ReadOnly.Remove {
    override val valueLength: Int = 0
    override val isValueDefined: Boolean = true

    def key = _key

    override def indexEntryDeadline: Option[Deadline] = deadline

    override def unsliceKey(): Unit =
      _key = _key.unslice()

    override def updateDeadline(deadline: Deadline): Remove =
      copy(deadline = Some(deadline))

    def hasTimeLeft(): Boolean =
      deadline.exists(_.hasTimeLeft())

    def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean =
      deadline.exists(deadline => (deadline - minus).hasTimeLeft())

    override val valueOffset: Int = 0

    override def getOrFetchApplies: Try[Seq[Slice[Byte]]] =
      appliesReader.getOrFetchApplies
  }

  case class Put(private var _key: Slice[Byte],
                 deadline: Option[Deadline],
                 private val lazyValueReader: LazyValueAndFunctionsAppliesReader,
                 nextIndexOffset: Int,
                 nextIndexSize: Int,
                 indexOffset: Int,
                 valueOffset: Int,
                 valueLength: Int) extends Persistent.Fixed with KeyValue.ReadOnly.Put {
    override def unsliceKey: Unit =
      _key = _key.unslice()

    override def key: Slice[Byte] =
      _key

    override def indexEntryDeadline: Option[Deadline] = deadline

    override def updateDeadline(deadline: Deadline): Put =
      copy(deadline = Some(deadline))

    def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - minus).hasTimeLeft())

    override def getOrFetchValue: Try[Option[Slice[Byte]]] =
      lazyValueReader.getOrFetchValue

    override def isValueDefined: Boolean =
      lazyValueReader.isValueDefined

    def getOrFetchApplies: Try[Seq[Slice[Byte]]] =
      lazyValueReader.getOrFetchApplies

    def getOrFetchValueAndApplies: Try[(Option[Slice[Byte]], Seq[Slice[Byte]])] =
      lazyValueReader.getOrFetchValueAndApplies
  }

  case class Update(private var _key: Slice[Byte],
                    deadline: Option[Deadline],
                    private val lazyValueReader: LazyValueAndFunctionsAppliesReader,
                    nextIndexOffset: Int,
                    nextIndexSize: Int,
                    indexOffset: Int,
                    valueOffset: Int,
                    valueLength: Int) extends Persistent.Fixed with KeyValue.ReadOnly.Update {
    override def unsliceKey: Unit =
      _key = _key.unslice()

    override def key: Slice[Byte] =
      _key

    override def indexEntryDeadline: Option[Deadline] = deadline

    def hasTimeLeft(): Boolean =
      deadline.forall(_.hasTimeLeft())

    override def updateDeadline(deadline: Deadline): Update =
      copy(deadline = Some(deadline))

    def hasTimeLeftAtLeast(minus: FiniteDuration): Boolean =
      deadline.forall(deadline => (deadline - minus).hasTimeLeft())

    override def toPut(): Persistent.Put =
      Persistent.Put(
        _key = key,
        deadline = deadline,
        lazyValueReader = lazyValueReader,
        nextIndexOffset = nextIndexOffset,
        nextIndexSize = nextIndexSize,
        indexOffset = indexOffset,
        valueOffset = valueOffset,
        valueLength = valueLength
      )

    override def toPut(deadline: Deadline): Persistent.Put =
      Persistent.Put(
        _key = key,
        deadline = Some(deadline),
        lazyValueReader = lazyValueReader,
        nextIndexOffset = nextIndexOffset,
        nextIndexSize = nextIndexSize,
        indexOffset = indexOffset,
        valueOffset = valueOffset,
        valueLength = valueLength
      )

    override def isValueDefined: Boolean =
      lazyValueReader.isValueDefined

    def getOrFetchApplies: Try[Seq[Slice[Byte]]] =
      lazyValueReader.getOrFetchApplies

    def getOrFetchValueAndApplies: Try[(Option[Slice[Byte]], Seq[Slice[Byte]])] =
      lazyValueReader.getOrFetchValueAndApplies

    def getOrFetchValue: Try[Option[Slice[Byte]]] =
      lazyValueReader.getOrFetchValue
  }

  case class Apply(private var _key: Slice[Byte],
                   private val applyValueReader: LazyApplyValueReader,
                   nextIndexOffset: Int,
                   nextIndexSize: Int,
                   indexOffset: Int,
                   valueOffset: Int,
                   valueLength: Int) extends Persistent.Fixed with KeyValue.ReadOnly.Apply {
    override def unsliceKey: Unit =
      _key = _key.unslice()

    override def key: Slice[Byte] =
      _key

    override def isValueDefined: Boolean =
      applyValueReader.isValueDefined

    override def indexEntryDeadline: Option[Deadline] = None

    override def getOrFetchApplies: Try[Seq[Value.ApplyValue]] =
      applyValueReader.getOrFetchApplies
  }

  object Range {
    def apply(key: Slice[Byte],
              lazyRangeValueReader: LazyRangeValueReader,
              nextIndexOffset: Int,
              nextIndexSize: Int,
              indexOffset: Int,
              valueOffset: Int,
              valueLength: Int): Try[Persistent.Range] =
      Bytes.decompressJoin(key) map {
        case (fromKey, toKey) =>
          Range(
            _fromKey = fromKey,
            _toKey = toKey,
            lazyRangeValueReader = lazyRangeValueReader,
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            indexOffset = indexOffset,
            valueOffset = valueOffset,
            valueLength = valueLength
          )
      }
  }

  case class Range(private var _fromKey: Slice[Byte],
                   private var _toKey: Slice[Byte],
                   private val lazyRangeValueReader: LazyRangeValueReader,
                   nextIndexOffset: Int,
                   nextIndexSize: Int,
                   indexOffset: Int,
                   valueOffset: Int,
                   valueLength: Int) extends Persistent.SegmentResponse with KeyValue.ReadOnly.Range {

    def fromKey = _fromKey

    def toKey = _toKey

    override def indexEntryDeadline: Option[Deadline] = None

    override def unsliceKey: Unit = {
      this._fromKey = _fromKey.unslice()
      this._toKey = _toKey.unslice()
    }

    override def key: Slice[Byte] =
      _fromKey

    override def fetchFromValue: Try[Option[Value.FromValue]] =
      lazyRangeValueReader.fetchFromValue

    override def fetchRangeValue: Try[Value.RangeValue] =
      lazyRangeValueReader.fetchRangeValue

    override def fetchFromAndRangeValue: Try[(Option[Value.FromValue], Value.RangeValue)] =
      lazyRangeValueReader.fetchFromAndRangeValue

    override def isValueDefined: Boolean =
      lazyRangeValueReader.isValueDefined
  }

  object Group {
    def apply(key: Slice[Byte],
              valueReader: Reader,
              lazyGroupValueReader: LazyGroupValueReader,
              nextIndexOffset: Int,
              nextIndexSize: Int,
              indexOffset: Int,
              valueLength: Int,
              valueOffset: Int,
              deadline: Option[Deadline]): Try[Group] =
      GroupKeyCompressor.decompress(key) map {
        case (minKey, maxKey) =>
          Group(
            _minKey = minKey,
            _maxKey = maxKey,
            lazyGroupValueReader = lazyGroupValueReader,
            groupDecompressor = GroupDecompressor(valueReader.copy(), valueOffset),
            valueReader = valueReader.copy(),
            nextIndexOffset = nextIndexOffset,
            nextIndexSize = nextIndexSize,
            indexOffset = indexOffset,
            valueOffset = valueOffset,
            valueLength = valueLength,
            deadline = deadline
          )
      }
  }

  case class Group(private var _minKey: Slice[Byte],
                   private var _maxKey: MaxKey,
                   private val groupDecompressor: GroupDecompressor,
                   private val lazyGroupValueReader: LazyGroupValueReader,
                   valueReader: Reader,
                   nextIndexOffset: Int,
                   nextIndexSize: Int,
                   indexOffset: Int,
                   valueOffset: Int,
                   valueLength: Int,
                   deadline: Option[Deadline]) extends Persistent with KeyValue.ReadOnly.Group {

    lazy val segmentCacheInitializer =
      new SegmentCacheInitializer(
        id = "Persistent.Group",
        minKey = minKey,
        maxKey = maxKey,
        //persistent key-value's key do not have be sliced either because the decompressed bytes are still in memory.
        //slicing will just use more memory. On memory overflow the Group itself will get dropped and hence all the
        //key-values inside the group's SegmentCache will also be GC'd.
        unsliceKey = false,
        getFooter = groupDecompressor.footer,
        createReader = groupDecompressor.reader
      )

    override def indexEntryDeadline: Option[Deadline] = deadline

    override def key: Slice[Byte] =
      _minKey

    override def minKey: Slice[Byte] =
      _minKey

    override def maxKey: MaxKey =
      _maxKey

    override def unsliceKey: Unit = {
      this._minKey = _minKey.unslice()
      this._maxKey = _maxKey.unslice()
    }

    def isIndexDecompressed: Boolean =
      groupDecompressor.isIndexDecompressed()

    def isValueDecompressed: Boolean =
      groupDecompressor.isValueDecompressed()

    def isHeaderDecompressed: Boolean =
      groupDecompressor.isHeaderDecompressed()

    def header() =
      groupDecompressor.header()

    /**
      * On uncompressed a new Group is returned. It would be much efficient if the Group's old [[SegmentCache]]'s skipList's
      * key-values are also still passed to the new Group in a thread-safe manner.
      */
    def uncompress(): Persistent.Group =
      copy(groupDecompressor = groupDecompressor.uncompress(), valueReader = valueReader.copy())

    def segmentCache(implicit keyOrder: KeyOrder[Slice[Byte]],
                     keyValueLimiter: KeyValueLimiter): SegmentCache =
      segmentCacheInitializer.segmentCache

    override def isValueDefined: Boolean =
      lazyGroupValueReader.isValueDefined

  }
}
