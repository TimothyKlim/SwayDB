
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

package swaydb.core.segment.format.a.entry.id

/** ******************************************
  * ************ GENERATED CLASS *************
  * ******************************************/

import swaydb.core.segment.format.a.entry.id.EntryId._
import swaydb.core.util.PipeOps._
import swaydb.macros.SealedList

/**
  * This code is not used in actual production.
  *
  * It is a base template class for generating IDs for all other key-value type using
  * [[swaydb.core.segment.format.a.entry.generators.IdsGenerator]] which gives all key-values types unique ids.
  *
  * will remove that line for the target generated class.
  */
sealed abstract class RemoveEntryId(override val id: Int) extends EntryId(id)
object RemoveEntryId extends GeneratedEntryId {

  override val format: EntryId.Format.A = RemoveEntryId.FormatA

  sealed trait FormatA extends Format.A {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = FormatA.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = FormatA.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = FormatA.KeyUncompressed
  }
  object FormatA extends FormatA {
    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with FormatA {
      override val noValue: Value.NoValue = KeyPartiallyCompressed.NoValue
      override def valueFullyCompressed: Value.FullyCompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
      override def valueUncompressed: Value.Uncompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
    }
    object KeyPartiallyCompressed extends KeyPartiallyCompressed {
      sealed trait NoValue extends Value.NoValue with KeyPartiallyCompressed {
        override val noDeadline: Deadline.NoDeadline = NoValue.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = NoValue.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = NoValue.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = NoValue.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = NoValue.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = NoValue.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = NoValue.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = NoValue.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = NoValue.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = NoValue.DeadlineUncompressed
      }
      object NoValue extends NoValue {
        case object NoDeadline extends RemoveEntryId(1322) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(1323) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(1324) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(1325) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(1326) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(1327) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(1328) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(1329) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(1330) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(1331) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with FormatA {
      override val noValue: Value.NoValue = KeyUncompressed.NoValue
      override def valueFullyCompressed: Value.FullyCompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
      override def valueUncompressed: Value.Uncompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
    }
    object KeyUncompressed extends KeyUncompressed {
      sealed trait NoValue extends Value.NoValue with KeyUncompressed {
        override val noDeadline: Deadline.NoDeadline = NoValue.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = NoValue.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = NoValue.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = NoValue.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = NoValue.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = NoValue.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = NoValue.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = NoValue.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = NoValue.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = NoValue.DeadlineUncompressed
      }
      object NoValue extends NoValue {
        case object NoDeadline extends RemoveEntryId(1332) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(1333) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(1334) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(1335) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(1336) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(1337) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(1338) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(1339) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(1340) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(1341) with Deadline.Uncompressed with NoValue
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with FormatA {
      override val noValue: Value.NoValue = KeyFullyCompressed.NoValue
      override def valueFullyCompressed: Value.FullyCompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
      override def valueUncompressed: Value.Uncompressed = throw new Exception("Ugly! But this should never be called. Remove key-values do not have values.")
    }
    object KeyFullyCompressed extends KeyFullyCompressed {
      sealed trait NoValue extends Value.NoValue with KeyFullyCompressed {
        override val noDeadline: Deadline.NoDeadline = NoValue.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = NoValue.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = NoValue.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = NoValue.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = NoValue.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = NoValue.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = NoValue.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = NoValue.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = NoValue.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = NoValue.DeadlineUncompressed
      }
      object NoValue extends NoValue {
        case object NoDeadline extends RemoveEntryId(1342) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends RemoveEntryId(1343) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends RemoveEntryId(1344) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends RemoveEntryId(1345) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends RemoveEntryId(1346) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends RemoveEntryId(1347) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends RemoveEntryId(1348) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends RemoveEntryId(1349) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends RemoveEntryId(1350) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends RemoveEntryId(1351) with Deadline.Uncompressed with NoValue
      }
    }
  }

  override def keyIdsList: List[RemoveEntryId] = SealedList.list[RemoveEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}