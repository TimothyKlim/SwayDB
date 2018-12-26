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

import swaydb.core.segment.format.a.entry.id.EntryId._
import swaydb.core.util.PipeOps._
import swaydb.macros.SealedList

/**
  * This code is not used in actual production.
  *
  * It is a base template class for generating IDs for all other key-value type using
  * [[swaydb.core.segment.format.a.entry.generators.IdsGenerator]] which gives all key-values types unique ids.
  *
  * Commenting anything with "remove this"
  * will remove that line for the target generated class.
  */
sealed abstract class TemplateRemoveEntryId(override val id: Int) extends EntryId(id)
object TemplateRemoveEntryId extends GeneratedEntryId {

  override val format: EntryId.Format.A = TemplateRemoveEntryId.FormatA

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
        case object NoDeadline extends TemplateRemoveEntryId(-1) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends TemplateRemoveEntryId(-1) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends TemplateRemoveEntryId(-1) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends TemplateRemoveEntryId(-1) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends TemplateRemoveEntryId(-1) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends TemplateRemoveEntryId(-1) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends TemplateRemoveEntryId(-1) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends TemplateRemoveEntryId(-1) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends TemplateRemoveEntryId(-1) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends TemplateRemoveEntryId(-1) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends TemplateRemoveEntryId(-1) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends TemplateRemoveEntryId(-1) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends TemplateRemoveEntryId(-1) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends TemplateRemoveEntryId(-1) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends TemplateRemoveEntryId(-1) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends TemplateRemoveEntryId(-1) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends TemplateRemoveEntryId(-1) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends TemplateRemoveEntryId(-1) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends TemplateRemoveEntryId(-1) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends TemplateRemoveEntryId(-1) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends TemplateRemoveEntryId(-1) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends TemplateRemoveEntryId(-1) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends TemplateRemoveEntryId(-1) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends TemplateRemoveEntryId(-1) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends TemplateRemoveEntryId(-1) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends TemplateRemoveEntryId(-1) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends TemplateRemoveEntryId(-1) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends TemplateRemoveEntryId(-1) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends TemplateRemoveEntryId(-1) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends TemplateRemoveEntryId(-1) with Deadline.Uncompressed with NoValue
      }
    }
  }

  override def keyIdsList: List[TemplateRemoveEntryId] = SealedList.list[TemplateRemoveEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}
