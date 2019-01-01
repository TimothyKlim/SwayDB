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
object TemplateEntryId extends EntryFormat {

  override val format: EntryId.Format = TemplateEntryId.FormatA

  trait FormatA extends Format.A {
    override val keyPartiallyCompressed: Key.PartiallyCompressed = FormatA.KeyPartiallyCompressed
    override val keyFullyCompressed: Key.FullyCompressed = FormatA.KeyFullyCompressed
    override val keyUncompressed: Key.Uncompressed = FormatA.KeyUncompressed
  }
  object FormatA extends FormatA {

    trait KeyPartiallyCompressed extends Key.PartiallyCompressed with FormatA {
      override val noTime: Time.NoTime = KeyPartiallyCompressed.NoTime
      override val timeFullyCompressed: Time.FullyCompressed = KeyPartiallyCompressed.TimeFullyCompressed
      override val timePartiallyCompressed: Time.PartiallyCompressed = KeyPartiallyCompressed.TimePartiallyCompressed
      override val timeUncompressed: Time.Uncompressed = KeyPartiallyCompressed.TimeUncompressed
    }
    object KeyPartiallyCompressed extends KeyPartiallyCompressed {

      trait NoTime extends Time.NoTime with KeyPartiallyCompressed {
        override val noValue: Value.NoValue = NoTime.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = NoTime.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = NoTime.ValueUncompressed
      }
      object NoTime extends NoTime {

        trait ValueUncompressed extends Value.Uncompressed with NoTime {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with NoTime {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with NoTime {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimeFullyCompressed extends Time.FullyCompressed with KeyPartiallyCompressed {
        override val noValue: Value.NoValue = TimeFullyCompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimeFullyCompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimeFullyCompressed.ValueUncompressed
      }
      object TimeFullyCompressed extends TimeFullyCompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimeFullyCompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimeFullyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimeFullyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimePartiallyCompressed extends Time.PartiallyCompressed with KeyPartiallyCompressed {
        override val noValue: Value.NoValue = TimePartiallyCompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimePartiallyCompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimePartiallyCompressed.ValueUncompressed
      }
      object TimePartiallyCompressed extends TimePartiallyCompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimePartiallyCompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimePartiallyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimePartiallyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimeUncompressed extends Time.Uncompressed with KeyPartiallyCompressed {
        override val noValue: Value.NoValue = TimeUncompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimeUncompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimeUncompressed.ValueUncompressed
      }
      object TimeUncompressed extends TimeUncompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimeUncompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimeUncompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimeUncompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }
    }

    trait KeyFullyCompressed extends Key.FullyCompressed with FormatA {
      override val noTime: Time.NoTime = KeyFullyCompressed.NoTime
      override val timeFullyCompressed: Time.FullyCompressed = KeyFullyCompressed.TimeFullyCompressed
      override val timePartiallyCompressed: Time.PartiallyCompressed = KeyFullyCompressed.TimePartiallyCompressed
      override val timeUncompressed: Time.Uncompressed = KeyFullyCompressed.TimeUncompressed
    }
    object KeyFullyCompressed extends KeyFullyCompressed {

      trait NoTime extends Time.NoTime with KeyFullyCompressed {
        override val noValue: Value.NoValue = NoTime.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = NoTime.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = NoTime.ValueUncompressed
      }
      object NoTime extends NoTime {

        trait ValueUncompressed extends Value.Uncompressed with NoTime {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with NoTime {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with NoTime {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimeFullyCompressed extends Time.FullyCompressed with KeyFullyCompressed {
        override val noValue: Value.NoValue = TimeFullyCompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimeFullyCompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimeFullyCompressed.ValueUncompressed
      }
      object TimeFullyCompressed extends TimeFullyCompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimeFullyCompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimeFullyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimeFullyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimePartiallyCompressed extends Time.PartiallyCompressed with KeyFullyCompressed {
        override val noValue: Value.NoValue = TimePartiallyCompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimePartiallyCompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimePartiallyCompressed.ValueUncompressed
      }
      object TimePartiallyCompressed extends TimePartiallyCompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimePartiallyCompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimePartiallyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimePartiallyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimeUncompressed extends Time.Uncompressed with KeyFullyCompressed {
        override val noValue: Value.NoValue = TimeUncompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimeUncompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimeUncompressed.ValueUncompressed
      }
      object TimeUncompressed extends TimeUncompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimeUncompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimeUncompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimeUncompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }
    }

    trait KeyUncompressed extends Key.Uncompressed with FormatA {
      override val noTime: Time.NoTime = KeyUncompressed.NoTime
      override val timeFullyCompressed: Time.FullyCompressed = KeyUncompressed.TimeFullyCompressed
      override val timePartiallyCompressed: Time.PartiallyCompressed = KeyUncompressed.TimePartiallyCompressed
      override val timeUncompressed: Time.Uncompressed = KeyUncompressed.TimeUncompressed
    }
    object KeyUncompressed extends KeyUncompressed {

      trait NoTime extends Time.NoTime with KeyUncompressed {
        override val noValue: Value.NoValue = NoTime.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = NoTime.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = NoTime.ValueUncompressed
      }
      object NoTime extends NoTime {

        trait ValueUncompressed extends Value.Uncompressed with NoTime {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with NoTime {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with NoTime {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimeFullyCompressed extends Time.FullyCompressed with KeyUncompressed {
        override val noValue: Value.NoValue = TimeFullyCompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimeFullyCompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimeFullyCompressed.ValueUncompressed
      }
      object TimeFullyCompressed extends TimeFullyCompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimeFullyCompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimeFullyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimeFullyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimePartiallyCompressed extends Time.PartiallyCompressed with KeyUncompressed {
        override val noValue: Value.NoValue = TimePartiallyCompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimePartiallyCompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimePartiallyCompressed.ValueUncompressed
      }
      object TimePartiallyCompressed extends TimePartiallyCompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimePartiallyCompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimePartiallyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimePartiallyCompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }

      trait TimeUncompressed extends Time.Uncompressed with KeyUncompressed {
        override val noValue: Value.NoValue = TimeUncompressed.NoValue
        override val valueFullyCompressed: Value.FullyCompressed = TimeUncompressed.ValueFullyCompressed
        override val valueUncompressed: Value.Uncompressed = TimeUncompressed.ValueUncompressed
      }
      object TimeUncompressed extends TimeUncompressed {

        trait ValueUncompressed extends Value.Uncompressed with TimeUncompressed {
          override val valueOffsetOneCompressed: ValueOffset.OneCompressed = ValueUncompressed.ValueOffsetOneCompressed
          override val valueOffsetTwoCompressed: ValueOffset.TwoCompressed = ValueUncompressed.ValueOffsetTwoCompressed
          override val valueOffsetThreeCompressed: ValueOffset.ThreeCompressed = ValueUncompressed.ValueOffsetThreeCompressed
          override val valueOffsetUncompressed: ValueOffset.Uncompressed = ValueUncompressed.ValueOffsetUncompressed
        }
        object ValueUncompressed extends ValueUncompressed {

          trait ValueOffsetOneCompressed extends ValueOffset.OneCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetOneCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetOneCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetOneCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetOneCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetOneCompressed.ValueLengthUncompressed
          }
          object ValueOffsetOneCompressed extends ValueOffsetOneCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetOneCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetTwoCompressed extends ValueOffset.TwoCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetTwoCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetTwoCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetTwoCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetTwoCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetTwoCompressed.ValueLengthUncompressed
          }
          object ValueOffsetTwoCompressed extends ValueOffsetTwoCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetTwoCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetThreeCompressed extends ValueOffset.ThreeCompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetThreeCompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetThreeCompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetThreeCompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetThreeCompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetThreeCompressed.ValueLengthUncompressed
          }
          object ValueOffsetThreeCompressed extends ValueOffsetThreeCompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetThreeCompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }

          trait ValueOffsetUncompressed extends ValueOffset.Uncompressed with ValueUncompressed {
            override val valueLengthOneCompressed: ValueLength.OneCompressed = ValueOffsetUncompressed.ValueLengthOneCompressed
            override val valueLengthTwoCompressed: ValueLength.TwoCompressed = ValueOffsetUncompressed.ValueLengthTwoCompressed
            override val valueLengthThreeCompressed: ValueLength.ThreeCompressed = ValueOffsetUncompressed.ValueLengthThreeCompressed
            override val valueLengthFullyCompressed: ValueLength.FullyCompressed = ValueOffsetUncompressed.ValueLengthFullyCompressed
            override val valueLengthUncompressed: ValueLength.Uncompressed = ValueOffsetUncompressed.ValueLengthUncompressed
          }
          object ValueOffsetUncompressed extends ValueOffsetUncompressed {
            trait ValueLengthOneCompressed extends ValueLength.OneCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthOneCompressed
            }

            trait ValueLengthTwoCompressed extends ValueLength.TwoCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthTwoCompressed
            }

            trait ValueLengthThreeCompressed extends ValueLength.ThreeCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthThreeCompressed
            }

            trait ValueLengthFullyCompressed extends ValueLength.FullyCompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthFullyCompressed
            }

            trait ValueLengthUncompressed extends ValueLength.Uncompressed with ValueOffsetUncompressed {
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
              object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueLengthUncompressed
            }
          }
        }

        trait NoValue extends Value.NoValue with TimeUncompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with NoValue
        }

        trait ValueFullyCompressed extends Value.FullyCompressed with TimeUncompressed {
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
          object NoDeadline extends TemplateEntryId(-1) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends TemplateEntryId(-1) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends TemplateEntryId(-1) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends TemplateEntryId(-1) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends TemplateEntryId(-1) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends TemplateEntryId(-1) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends TemplateEntryId(-1) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends TemplateEntryId(-1) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends TemplateEntryId(-1) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends TemplateEntryId(-1) with Deadline.Uncompressed with ValueFullyCompressed
        }
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
