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
sealed abstract class TemplateEntryId(override val id: Int) extends EntryId(id)
object TemplateEntryId extends GeneratedEntryId {

  override val format: EntryId.Format.A = TemplateEntryId.FormatA

  sealed trait FormatA extends Format.A {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = FormatA.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = FormatA.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = FormatA.KeyUncompressed
  }
  object FormatA extends FormatA {

    sealed trait KeyPartiallyCompressed extends Key.PartiallyCompressed with FormatA {
      override val noValue: Value.NoValue = KeyPartiallyCompressed.NoValue
      override val valueFullyCompressed: Value.FullyCompressed = KeyPartiallyCompressed.ValueFullyCompressed
      override val valueUncompressed: Value.Uncompressed = KeyPartiallyCompressed.ValueUncompressed
    }
    object KeyPartiallyCompressed extends KeyPartiallyCompressed {
      sealed trait ValueUncompressed extends Value.Uncompressed with KeyPartiallyCompressed {
        override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
        override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
        override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
        override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
      }
      object ValueUncompressed extends ValueUncompressed {

        sealed trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
        }
        object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
        }
        object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
        }
        object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
        }
        object ValueOffsetUncompressed extends ValueOffsetUncompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }
      }

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
        case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
      }

      sealed trait ValueFullyCompressed extends Value.FullyCompressed with KeyPartiallyCompressed {
        override val noDeadline: Deadline.NoDeadline = ValueFullyCompressed.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = ValueFullyCompressed.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueFullyCompressed.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueFullyCompressed.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = ValueFullyCompressed.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueFullyCompressed.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = ValueFullyCompressed.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueFullyCompressed.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueFullyCompressed.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = ValueFullyCompressed.DeadlineUncompressed
      }
      object ValueFullyCompressed extends ValueFullyCompressed {
        case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyUncompressed extends Key.Uncompressed with FormatA {
      override val noValue: Value.NoValue = KeyUncompressed.NoValue
      override val valueFullyCompressed: Value.FullyCompressed = KeyUncompressed.ValueFullyCompressed
      override val valueUncompressed: Value.Uncompressed = KeyUncompressed.ValueUncompressed
    }
    object KeyUncompressed extends KeyUncompressed {

      sealed trait ValueUncompressed extends Value.Uncompressed with KeyUncompressed {
        override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
        override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
        override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
        override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
      }
      object ValueUncompressed extends ValueUncompressed {

        sealed trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
        }
        object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
        }
        object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
        }
        object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
        }
        object ValueOffsetUncompressed extends ValueOffsetUncompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }
      }

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
        case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
      }

      sealed trait ValueFullyCompressed extends Value.FullyCompressed with KeyUncompressed {
        override val noDeadline: Deadline.NoDeadline = ValueFullyCompressed.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = ValueFullyCompressed.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueFullyCompressed.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueFullyCompressed.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = ValueFullyCompressed.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueFullyCompressed.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = ValueFullyCompressed.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueFullyCompressed.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueFullyCompressed.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = ValueFullyCompressed.DeadlineUncompressed
      }
      object ValueFullyCompressed extends ValueFullyCompressed {
        case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }

    sealed trait KeyFullyCompressed extends Key.FullyCompressed with FormatA {
      override val noValue: Value.NoValue = KeyFullyCompressed.NoValue
      override val valueFullyCompressed: Value.FullyCompressed = KeyFullyCompressed.ValueFullyCompressed
      override val valueUncompressed: Value.Uncompressed = KeyFullyCompressed.ValueUncompressed
    }
    object KeyFullyCompressed extends KeyFullyCompressed {
      sealed trait ValueUncompressed extends Value.Uncompressed with KeyFullyCompressed {
        override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
        override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
        override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
        override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
      }
      object ValueUncompressed extends ValueUncompressed {

        sealed trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
        }
        object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
        }
        object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
        }
        object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }

        sealed trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
          override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
          override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
          override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
          override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
          override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
        }
        object ValueOffsetUncompressed extends ValueOffsetUncompressed {
          sealed trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthOneCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthOneCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthOneCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthOneCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthOneCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthOneCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthOneCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthOneCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthOneCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthOneCompressed.DeadlineUncompressed
          }

          object ValueLengthOneCompressed extends ValueLengthOneCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
          }

          sealed trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthTwoCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthTwoCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthTwoCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthTwoCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthTwoCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthTwoCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthTwoCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthTwoCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthTwoCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthTwoCompressed.DeadlineUncompressed
          }

          object ValueLengthTwoCompressed extends ValueLengthTwoCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
          }

          sealed trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthThreeCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthThreeCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthThreeCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthThreeCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthThreeCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthThreeCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthThreeCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthThreeCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthThreeCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthThreeCompressed.DeadlineUncompressed
          }

          object ValueLengthThreeCompressed extends ValueLengthThreeCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
          }

          sealed trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthFullyCompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthFullyCompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthFullyCompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthFullyCompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthFullyCompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthFullyCompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthFullyCompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthFullyCompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthFullyCompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthFullyCompressed.DeadlineUncompressed
          }

          object ValueLengthFullyCompressed extends ValueLengthFullyCompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
          }

          sealed trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
            override val noDeadline: Deadline.NoDeadline = ValueLengthUncompressed.NoDeadline
            override val deadlineOneCompressed: Deadline.OneCompressed = ValueLengthUncompressed.DeadlineOneCompressed
            override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueLengthUncompressed.DeadlineTwoCompressed
            override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueLengthUncompressed.DeadlineThreeCompressed
            override val deadlineFourCompressed: Deadline.FourCompressed = ValueLengthUncompressed.DeadlineFourCompressed
            override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueLengthUncompressed.DeadlineFiveCompressed
            override val deadlineSixCompressed: Deadline.SixCompressed = ValueLengthUncompressed.DeadlineSixCompressed
            override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueLengthUncompressed.DeadlineSevenCompressed
            override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueLengthUncompressed.DeadlineFullyCompressed
            override val deadlineUncompressed: Deadline.Uncompressed = ValueLengthUncompressed.DeadlineUncompressed
          }

          object ValueLengthUncompressed extends ValueLengthUncompressed {
            case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
          }
        }
      }

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
        case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
      }

      sealed trait ValueFullyCompressed extends Value.FullyCompressed with KeyFullyCompressed {
        override val noDeadline: Deadline.NoDeadline = ValueFullyCompressed.NoDeadline
        override val deadlineOneCompressed: Deadline.OneCompressed = ValueFullyCompressed.DeadlineOneCompressed
        override val deadlineTwoCompressed: Deadline.TwoCompressed = ValueFullyCompressed.DeadlineTwoCompressed
        override val deadlineThreeCompressed: Deadline.ThreeCompressed = ValueFullyCompressed.DeadlineThreeCompressed
        override val deadlineFourCompressed: Deadline.FourCompressed = ValueFullyCompressed.DeadlineFourCompressed
        override val deadlineFiveCompressed: Deadline.FiveCompressed = ValueFullyCompressed.DeadlineFiveCompressed
        override val deadlineSixCompressed: Deadline.SixCompressed = ValueFullyCompressed.DeadlineSixCompressed
        override val deadlineSevenCompressed: Deadline.SevenCompressed = ValueFullyCompressed.DeadlineSevenCompressed
        override val deadlineFullyCompressed: Deadline.FullyCompressed = ValueFullyCompressed.DeadlineFullyCompressed
        override val deadlineUncompressed: Deadline.Uncompressed = ValueFullyCompressed.DeadlineUncompressed
      }
      object ValueFullyCompressed extends ValueFullyCompressed {
        case object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[TemplateEntryId] = SealedList.list[TemplateEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}
