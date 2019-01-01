
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
sealed abstract class UpdateEntryId(override val id: Int) extends EntryId(id)
object UpdateEntryId extends EntryFormat {

  override val format: EntryId.Format = UpdateEntryId.FormatA

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
              object NoDeadline extends UpdateEntryId(21662) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21663) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21664) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21665) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21666) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21667) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21668) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21669) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21670) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(21671) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(21672) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21673) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21674) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21675) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21676) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21677) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21678) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21679) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21680) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(21681) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(21682) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21683) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21684) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21685) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21686) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21687) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21688) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21689) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21690) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(21691) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(21692) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21693) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21694) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21695) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21696) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21697) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21698) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21699) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21700) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(21701) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(21702) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(21703) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21704) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21705) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(21706) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21707) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(21708) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21709) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21710) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(21711) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(21712) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21713) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21714) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21715) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21716) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21717) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21718) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21719) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21720) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(21721) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(21722) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21723) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21724) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21725) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21726) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21727) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21728) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21729) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21730) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(21731) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(21732) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21733) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21734) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21735) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21736) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21737) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21738) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21739) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21740) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(21741) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(21742) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21743) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21744) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21745) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21746) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21747) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21748) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21749) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21750) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(21751) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(21752) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(21753) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21754) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21755) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(21756) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21757) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(21758) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21759) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21760) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(21761) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(21762) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21763) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21764) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21765) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21766) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21767) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21768) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21769) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21770) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(21771) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(21772) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21773) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21774) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21775) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21776) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21777) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21778) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21779) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21780) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(21781) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(21782) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21783) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21784) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21785) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21786) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21787) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21788) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21789) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21790) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(21791) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(21792) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21793) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21794) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21795) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21796) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21797) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21798) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21799) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21800) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(21801) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(21802) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(21803) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21804) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21805) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(21806) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21807) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(21808) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21809) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21810) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(21811) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(21812) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21813) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21814) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21815) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21816) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21817) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21818) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21819) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21820) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(21821) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(21822) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21823) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21824) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21825) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21826) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21827) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21828) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21829) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21830) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(21831) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(21832) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21833) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21834) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21835) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21836) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21837) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21838) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21839) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21840) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(21841) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(21842) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21843) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21844) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21845) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21846) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21847) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21848) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21849) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21850) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(21851) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(21852) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(21853) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21854) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21855) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(21856) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21857) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(21858) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21859) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21860) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(21861) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(21862) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(21863) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(21864) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(21865) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(21866) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(21867) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(21868) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(21869) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(21870) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(21871) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(21872) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(21873) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(21874) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(21875) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(21876) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(21877) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(21878) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(21879) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(21880) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(21881) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(21882) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21883) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21884) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21885) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21886) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21887) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21888) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21889) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21890) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(21891) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(21892) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21893) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21894) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21895) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21896) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21897) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21898) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21899) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21900) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(21901) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(21902) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21903) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21904) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21905) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21906) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21907) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21908) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21909) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21910) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(21911) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(21912) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21913) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21914) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21915) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21916) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21917) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21918) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21919) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21920) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(21921) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(21922) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(21923) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21924) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21925) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(21926) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21927) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(21928) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21929) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21930) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(21931) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(21932) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21933) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21934) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21935) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21936) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21937) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21938) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21939) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21940) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(21941) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(21942) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21943) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21944) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21945) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21946) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21947) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21948) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21949) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21950) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(21951) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(21952) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21953) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21954) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21955) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21956) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21957) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21958) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21959) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21960) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(21961) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(21962) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21963) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21964) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21965) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21966) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21967) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21968) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21969) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21970) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(21971) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(21972) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(21973) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21974) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21975) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(21976) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21977) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(21978) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21979) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21980) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(21981) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(21982) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21983) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21984) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21985) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21986) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21987) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21988) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21989) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(21990) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(21991) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(21992) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(21993) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(21994) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(21995) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(21996) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(21997) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(21998) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(21999) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22000) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22001) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22002) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22003) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22004) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22005) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22006) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22007) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22008) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22009) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22010) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22011) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22012) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22013) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22014) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22015) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22016) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22017) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22018) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22019) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22020) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22021) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22022) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22023) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22024) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22025) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22026) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22027) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22028) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22029) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22030) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22031) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22032) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22033) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22034) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22035) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22036) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22037) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22038) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22039) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22040) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22041) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22042) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22043) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22044) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22045) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22046) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22047) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22048) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22049) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22050) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22051) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22052) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22053) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22054) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22055) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22056) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22057) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22058) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22059) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22060) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22061) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22062) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22063) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22064) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22065) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22066) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22067) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22068) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22069) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22070) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22071) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22072) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22073) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22074) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22075) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22076) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22077) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22078) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22079) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22080) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22081) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(22082) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(22083) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(22084) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(22085) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(22086) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(22087) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(22088) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(22089) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(22090) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(22091) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(22092) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(22093) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(22094) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(22095) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(22096) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(22097) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(22098) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(22099) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(22100) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(22101) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22102) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22103) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22104) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22105) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22106) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22107) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22108) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22109) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22110) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22111) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22112) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22113) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22114) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22115) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22116) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22117) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22118) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22119) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22120) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22121) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22122) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22123) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22124) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22125) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22126) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22127) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22128) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22129) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22130) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22131) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22132) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22133) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22134) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22135) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22136) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22137) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22138) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22139) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22140) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22141) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22142) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22143) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22144) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22145) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22146) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22147) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22148) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22149) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22150) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22151) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22152) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22153) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22154) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22155) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22156) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22157) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22158) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22159) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22160) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22161) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22162) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22163) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22164) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22165) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22166) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22167) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22168) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22169) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22170) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22171) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22172) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22173) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22174) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22175) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22176) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22177) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22178) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22179) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22180) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22181) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22182) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22183) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22184) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22185) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22186) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22187) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22188) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22189) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22190) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22191) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22192) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22193) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22194) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22195) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22196) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22197) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22198) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22199) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22200) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22201) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22202) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22203) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22204) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22205) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22206) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22207) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22208) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22209) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22210) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22211) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22212) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22213) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22214) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22215) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22216) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22217) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22218) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22219) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22220) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22221) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22222) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22223) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22224) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22225) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22226) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22227) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22228) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22229) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22230) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22231) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22232) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22233) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22234) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22235) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22236) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22237) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22238) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22239) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22240) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22241) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22242) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22243) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22244) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22245) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22246) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22247) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22248) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22249) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22250) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22251) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22252) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22253) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22254) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22255) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22256) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22257) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22258) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22259) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22260) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22261) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22262) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22263) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22264) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22265) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22266) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22267) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22268) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22269) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22270) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22271) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22272) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22273) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22274) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22275) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22276) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22277) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22278) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22279) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22280) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22281) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22282) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22283) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22284) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22285) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22286) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22287) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22288) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22289) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22290) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22291) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22292) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22293) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22294) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22295) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22296) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22297) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22298) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22299) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22300) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22301) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(22302) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(22303) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(22304) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(22305) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(22306) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(22307) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(22308) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(22309) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(22310) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(22311) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(22312) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(22313) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(22314) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(22315) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(22316) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(22317) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(22318) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(22319) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(22320) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(22321) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22322) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22323) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22324) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22325) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22326) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22327) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22328) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22329) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22330) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22331) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22332) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22333) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22334) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22335) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22336) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22337) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22338) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22339) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22340) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22341) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22342) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22343) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22344) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22345) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22346) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22347) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22348) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22349) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22350) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22351) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22352) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22353) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22354) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22355) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22356) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22357) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22358) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22359) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22360) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22361) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22362) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22363) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22364) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22365) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22366) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22367) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22368) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22369) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22370) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22371) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22372) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22373) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22374) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22375) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22376) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22377) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22378) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22379) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22380) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22381) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22382) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22383) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22384) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22385) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22386) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22387) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22388) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22389) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22390) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22391) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22392) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22393) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22394) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22395) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22396) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22397) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22398) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22399) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22400) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22401) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22402) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22403) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22404) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22405) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22406) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22407) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22408) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22409) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22410) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22411) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22412) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22413) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22414) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22415) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22416) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22417) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22418) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22419) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22420) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22421) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22422) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22423) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22424) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22425) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22426) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22427) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22428) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22429) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22430) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22431) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22432) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22433) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22434) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22435) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22436) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22437) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22438) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22439) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22440) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22441) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22442) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22443) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22444) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22445) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22446) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22447) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22448) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22449) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22450) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22451) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22452) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22453) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22454) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22455) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22456) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22457) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22458) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22459) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22460) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22461) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22462) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22463) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22464) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22465) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22466) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22467) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22468) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22469) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22470) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22471) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22472) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22473) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22474) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22475) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22476) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22477) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22478) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22479) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22480) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22481) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22482) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22483) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22484) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22485) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22486) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22487) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22488) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22489) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22490) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22491) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22492) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22493) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22494) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22495) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22496) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22497) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22498) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22499) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22500) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22501) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22502) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22503) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22504) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22505) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22506) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22507) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22508) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22509) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22510) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22511) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22512) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22513) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22514) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22515) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22516) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22517) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22518) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22519) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22520) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22521) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(22522) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(22523) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(22524) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(22525) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(22526) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(22527) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(22528) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(22529) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(22530) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(22531) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(22532) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(22533) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(22534) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(22535) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(22536) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(22537) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(22538) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(22539) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(22540) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(22541) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22542) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22543) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22544) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22545) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22546) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22547) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22548) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22549) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22550) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22551) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22552) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22553) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22554) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22555) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22556) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22557) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22558) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22559) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22560) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22561) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22562) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22563) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22564) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22565) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22566) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22567) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22568) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22569) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22570) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22571) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22572) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22573) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22574) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22575) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22576) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22577) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22578) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22579) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22580) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22581) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22582) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22583) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22584) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22585) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22586) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22587) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22588) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22589) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22590) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22591) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22592) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22593) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22594) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22595) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22596) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22597) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22598) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22599) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22600) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22601) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22602) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22603) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22604) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22605) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22606) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22607) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22608) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22609) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22610) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22611) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22612) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22613) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22614) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22615) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22616) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22617) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22618) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22619) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22620) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22621) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22622) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22623) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22624) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22625) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22626) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22627) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22628) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22629) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22630) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22631) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22632) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22633) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22634) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22635) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22636) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22637) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22638) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22639) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22640) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22641) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22642) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22643) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22644) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22645) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22646) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22647) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22648) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22649) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22650) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22651) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22652) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22653) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22654) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22655) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22656) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22657) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22658) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22659) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22660) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22661) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22662) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22663) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22664) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22665) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22666) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22667) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22668) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22669) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22670) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22671) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22672) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22673) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22674) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22675) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22676) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22677) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22678) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22679) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22680) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22681) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22682) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22683) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22684) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22685) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22686) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22687) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22688) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22689) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22690) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22691) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22692) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22693) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22694) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22695) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22696) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22697) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22698) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22699) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22700) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22701) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22702) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22703) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22704) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22705) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22706) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22707) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22708) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22709) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22710) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22711) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22712) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22713) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22714) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22715) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22716) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22717) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22718) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22719) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22720) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22721) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22722) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22723) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22724) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22725) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22726) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22727) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22728) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22729) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22730) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22731) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22732) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22733) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22734) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22735) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22736) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22737) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22738) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22739) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22740) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22741) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(22742) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(22743) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(22744) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(22745) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(22746) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(22747) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(22748) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(22749) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(22750) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(22751) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(22752) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(22753) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(22754) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(22755) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(22756) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(22757) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(22758) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(22759) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(22760) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(22761) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22762) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22763) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22764) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22765) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22766) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22767) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22768) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22769) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22770) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22771) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22772) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22773) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22774) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22775) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22776) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22777) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22778) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22779) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22780) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22781) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22782) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22783) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22784) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22785) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22786) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22787) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22788) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22789) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22790) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22791) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22792) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22793) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22794) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22795) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22796) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22797) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22798) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22799) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22800) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22801) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22802) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22803) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22804) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22805) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22806) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22807) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22808) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22809) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22810) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22811) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22812) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22813) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22814) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22815) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22816) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22817) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22818) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22819) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22820) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22821) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22822) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22823) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22824) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22825) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22826) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22827) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22828) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22829) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22830) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22831) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22832) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22833) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22834) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22835) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22836) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22837) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22838) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22839) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22840) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22841) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22842) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22843) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22844) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22845) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22846) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22847) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22848) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22849) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22850) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22851) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22852) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22853) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22854) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22855) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22856) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22857) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22858) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22859) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22860) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22861) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22862) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22863) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22864) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22865) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22866) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22867) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22868) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22869) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22870) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22871) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22872) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22873) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22874) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22875) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22876) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22877) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22878) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22879) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22880) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22881) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22882) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22883) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22884) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22885) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22886) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22887) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22888) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22889) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22890) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22891) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22892) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22893) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22894) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22895) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22896) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22897) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22898) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22899) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22900) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22901) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22902) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22903) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22904) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22905) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22906) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22907) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22908) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22909) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22910) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22911) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(22912) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22913) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22914) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22915) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22916) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22917) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22918) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22919) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22920) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22921) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22922) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22923) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22924) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22925) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22926) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22927) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22928) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22929) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22930) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(22931) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(22932) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22933) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22934) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22935) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22936) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22937) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22938) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22939) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22940) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(22941) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(22942) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22943) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22944) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22945) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22946) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22947) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22948) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22949) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22950) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(22951) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22952) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(22953) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22954) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22955) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(22956) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22957) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(22958) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22959) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22960) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(22961) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(22962) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(22963) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(22964) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(22965) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(22966) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(22967) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(22968) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(22969) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(22970) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(22971) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(22972) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(22973) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(22974) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(22975) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(22976) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(22977) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(22978) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(22979) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(22980) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(22981) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(22982) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22983) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22984) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22985) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22986) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22987) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22988) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22989) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(22990) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(22991) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(22992) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(22993) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(22994) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(22995) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(22996) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(22997) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(22998) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(22999) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23000) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23001) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23002) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23003) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23004) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23005) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23006) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23007) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23008) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23009) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23010) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23011) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23012) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23013) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23014) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23015) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23016) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23017) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23018) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23019) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23020) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23021) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23022) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23023) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23024) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23025) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23026) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23027) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23028) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23029) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23030) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23031) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23032) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23033) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23034) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23035) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23036) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23037) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23038) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23039) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23040) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23041) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23042) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23043) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23044) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23045) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23046) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23047) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23048) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23049) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23050) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23051) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23052) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23053) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23054) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23055) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23056) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23057) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23058) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23059) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23060) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23061) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23062) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23063) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23064) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23065) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23066) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23067) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23068) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23069) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23070) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23071) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23072) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23073) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23074) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23075) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23076) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23077) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23078) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23079) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23080) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23081) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23082) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23083) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23084) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23085) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23086) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23087) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23088) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23089) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23090) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23091) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23092) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23093) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23094) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23095) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23096) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23097) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23098) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23099) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23100) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23101) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23102) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23103) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23104) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23105) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23106) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23107) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23108) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23109) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23110) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23111) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23112) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23113) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23114) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23115) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23116) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23117) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23118) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23119) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23120) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23121) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23122) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23123) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23124) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23125) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23126) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23127) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23128) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23129) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23130) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23131) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23132) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23133) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23134) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23135) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23136) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23137) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23138) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23139) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23140) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23141) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23142) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23143) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23144) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23145) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23146) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23147) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23148) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23149) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23150) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23151) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23152) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23153) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23154) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23155) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23156) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23157) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23158) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23159) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23160) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23161) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23162) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23163) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23164) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23165) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23166) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23167) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23168) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23169) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23170) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23171) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23172) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23173) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23174) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23175) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23176) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23177) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23178) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23179) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23180) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23181) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(23182) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(23183) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(23184) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(23185) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(23186) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(23187) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(23188) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(23189) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(23190) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(23191) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(23192) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(23193) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(23194) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(23195) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(23196) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(23197) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(23198) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(23199) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(23200) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(23201) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23202) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23203) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23204) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23205) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23206) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23207) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23208) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23209) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23210) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23211) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23212) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23213) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23214) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23215) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23216) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23217) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23218) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23219) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23220) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23221) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23222) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23223) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23224) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23225) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23226) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23227) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23228) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23229) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23230) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23231) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23232) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23233) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23234) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23235) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23236) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23237) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23238) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23239) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23240) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23241) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23242) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23243) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23244) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23245) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23246) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23247) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23248) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23249) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23250) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23251) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23252) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23253) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23254) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23255) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23256) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23257) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23258) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23259) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23260) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23261) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23262) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23263) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23264) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23265) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23266) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23267) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23268) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23269) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23270) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23271) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23272) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23273) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23274) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23275) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23276) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23277) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23278) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23279) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23280) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23281) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23282) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23283) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23284) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23285) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23286) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23287) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23288) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23289) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23290) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23291) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23292) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23293) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23294) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23295) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23296) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23297) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23298) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23299) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23300) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23301) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23302) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23303) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23304) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23305) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23306) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23307) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23308) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23309) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23310) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23311) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23312) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23313) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23314) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23315) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23316) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23317) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23318) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23319) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23320) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23321) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23322) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23323) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23324) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23325) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23326) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23327) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23328) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23329) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23330) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23331) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23332) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23333) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23334) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23335) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23336) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23337) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23338) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23339) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23340) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23341) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23342) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23343) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23344) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23345) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23346) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23347) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23348) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23349) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23350) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23351) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23352) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23353) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23354) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23355) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23356) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23357) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23358) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23359) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23360) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23361) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23362) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23363) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23364) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23365) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23366) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23367) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23368) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23369) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23370) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23371) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23372) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23373) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23374) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23375) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23376) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23377) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23378) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23379) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23380) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23381) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23382) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23383) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23384) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23385) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23386) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23387) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23388) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23389) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23390) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23391) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23392) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23393) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23394) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23395) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23396) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23397) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23398) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23399) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23400) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23401) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(23402) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(23403) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(23404) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(23405) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(23406) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(23407) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(23408) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(23409) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(23410) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(23411) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(23412) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(23413) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(23414) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(23415) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(23416) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(23417) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(23418) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(23419) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(23420) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(23421) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23422) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23423) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23424) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23425) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23426) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23427) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23428) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23429) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23430) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23431) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23432) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23433) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23434) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23435) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23436) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23437) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23438) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23439) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23440) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23441) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23442) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23443) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23444) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23445) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23446) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23447) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23448) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23449) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23450) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23451) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23452) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23453) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23454) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23455) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23456) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23457) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23458) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23459) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23460) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23461) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23462) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23463) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23464) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23465) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23466) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23467) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23468) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23469) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23470) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23471) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23472) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23473) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23474) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23475) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23476) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23477) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23478) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23479) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23480) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23481) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23482) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23483) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23484) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23485) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23486) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23487) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23488) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23489) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23490) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23491) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23492) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23493) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23494) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23495) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23496) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23497) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23498) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23499) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23500) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23501) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23502) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23503) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23504) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23505) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23506) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23507) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23508) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23509) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23510) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23511) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23512) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23513) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23514) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23515) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23516) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23517) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23518) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23519) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23520) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23521) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23522) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23523) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23524) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23525) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23526) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23527) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23528) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23529) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23530) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23531) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23532) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23533) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23534) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23535) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23536) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23537) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23538) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23539) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23540) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23541) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23542) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23543) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23544) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23545) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23546) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23547) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23548) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23549) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23550) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23551) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23552) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23553) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23554) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23555) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23556) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23557) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23558) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23559) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23560) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23561) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23562) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23563) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23564) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23565) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23566) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23567) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23568) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23569) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23570) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23571) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23572) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23573) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23574) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23575) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23576) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23577) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23578) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23579) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23580) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23581) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23582) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23583) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23584) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23585) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23586) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23587) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23588) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23589) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23590) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23591) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23592) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23593) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23594) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23595) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23596) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23597) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23598) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23599) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23600) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23601) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23602) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23603) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23604) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23605) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23606) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23607) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23608) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23609) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23610) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23611) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23612) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23613) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23614) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23615) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23616) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23617) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23618) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23619) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23620) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23621) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(23622) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(23623) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(23624) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(23625) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(23626) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(23627) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(23628) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(23629) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(23630) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(23631) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(23632) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(23633) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(23634) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(23635) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(23636) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(23637) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(23638) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(23639) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(23640) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(23641) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23642) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23643) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23644) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23645) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23646) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23647) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23648) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23649) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23650) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23651) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23652) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23653) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23654) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23655) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23656) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23657) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23658) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23659) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23660) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23661) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23662) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23663) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23664) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23665) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23666) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23667) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23668) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23669) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23670) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23671) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23672) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23673) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23674) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23675) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23676) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23677) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23678) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23679) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23680) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23681) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23682) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23683) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23684) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23685) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23686) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23687) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23688) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23689) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23690) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23691) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23692) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23693) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23694) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23695) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23696) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23697) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23698) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23699) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23700) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23701) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23702) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23703) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23704) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23705) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23706) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23707) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23708) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23709) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23710) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23711) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23712) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23713) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23714) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23715) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23716) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23717) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23718) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23719) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23720) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23721) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23722) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23723) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23724) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23725) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23726) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23727) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23728) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23729) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23730) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23731) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23732) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23733) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23734) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23735) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23736) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23737) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23738) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23739) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23740) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23741) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23742) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23743) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23744) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23745) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23746) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23747) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23748) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23749) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23750) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23751) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23752) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23753) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23754) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23755) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23756) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23757) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23758) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23759) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23760) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23761) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23762) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23763) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23764) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23765) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23766) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23767) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23768) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23769) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23770) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23771) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23772) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23773) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23774) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23775) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23776) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23777) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23778) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23779) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23780) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23781) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23782) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23783) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23784) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23785) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23786) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23787) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23788) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23789) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23790) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23791) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23792) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23793) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23794) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23795) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23796) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23797) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23798) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23799) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23800) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23801) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23802) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23803) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23804) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23805) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23806) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23807) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23808) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23809) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23810) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23811) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23812) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23813) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23814) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23815) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23816) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23817) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23818) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23819) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23820) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23821) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23822) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23823) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23824) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23825) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23826) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23827) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23828) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23829) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23830) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23831) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23832) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23833) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23834) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23835) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23836) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23837) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23838) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23839) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23840) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23841) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(23842) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(23843) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(23844) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(23845) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(23846) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(23847) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(23848) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(23849) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(23850) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(23851) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(23852) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(23853) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(23854) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(23855) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(23856) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(23857) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(23858) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(23859) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(23860) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(23861) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23862) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23863) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23864) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23865) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23866) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23867) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23868) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23869) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23870) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23871) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23872) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23873) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23874) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23875) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23876) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23877) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23878) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23879) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23880) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23881) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23882) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23883) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23884) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23885) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23886) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23887) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23888) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23889) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23890) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23891) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23892) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23893) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23894) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23895) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23896) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23897) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23898) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23899) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23900) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23901) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23902) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23903) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23904) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23905) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23906) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23907) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23908) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23909) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23910) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23911) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23912) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23913) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23914) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23915) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23916) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23917) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23918) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23919) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23920) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23921) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23922) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23923) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23924) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23925) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23926) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23927) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23928) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23929) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23930) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23931) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23932) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23933) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23934) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23935) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23936) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23937) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23938) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23939) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23940) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23941) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23942) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23943) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23944) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23945) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23946) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23947) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23948) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23949) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23950) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(23951) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(23952) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(23953) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23954) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23955) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(23956) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23957) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(23958) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23959) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23960) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(23961) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(23962) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23963) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23964) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23965) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23966) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23967) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23968) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23969) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23970) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(23971) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(23972) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23973) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23974) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23975) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23976) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23977) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23978) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23979) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23980) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(23981) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(23982) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23983) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23984) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23985) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23986) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23987) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23988) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23989) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(23990) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(23991) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(23992) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(23993) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(23994) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(23995) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(23996) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(23997) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(23998) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(23999) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24000) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(24001) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(24002) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(24003) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24004) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24005) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(24006) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24007) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(24008) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24009) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24010) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(24011) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(24012) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24013) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24014) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24015) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24016) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24017) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24018) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24019) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24020) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(24021) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(24022) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24023) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24024) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24025) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24026) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24027) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24028) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24029) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24030) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(24031) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(24032) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24033) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24034) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24035) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24036) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24037) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24038) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24039) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24040) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(24041) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(24042) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24043) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24044) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24045) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24046) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24047) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24048) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24049) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24050) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(24051) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(24052) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(24053) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24054) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24055) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(24056) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24057) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(24058) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24059) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24060) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(24061) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(24062) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(24063) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(24064) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(24065) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(24066) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(24067) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(24068) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(24069) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(24070) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(24071) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(24072) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(24073) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(24074) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(24075) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(24076) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(24077) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(24078) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(24079) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(24080) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(24081) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends UpdateEntryId(24082) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24083) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24084) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24085) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24086) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24087) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24088) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24089) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24090) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(24091) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(24092) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24093) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24094) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24095) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24096) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24097) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24098) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24099) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24100) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(24101) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(24102) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24103) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24104) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24105) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24106) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24107) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24108) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24109) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24110) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(24111) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(24112) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24113) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24114) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24115) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24116) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24117) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24118) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24119) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24120) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(24121) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(24122) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(24123) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24124) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24125) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(24126) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24127) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(24128) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24129) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24130) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(24131) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(24132) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24133) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24134) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24135) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24136) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24137) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24138) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24139) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24140) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(24141) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(24142) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24143) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24144) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24145) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24146) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24147) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24148) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24149) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24150) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(24151) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(24152) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24153) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24154) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24155) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24156) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24157) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24158) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24159) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24160) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(24161) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(24162) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24163) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24164) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24165) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24166) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24167) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24168) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24169) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24170) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(24171) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(24172) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(24173) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24174) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24175) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(24176) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24177) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(24178) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24179) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24180) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(24181) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(24182) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24183) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24184) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24185) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24186) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24187) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24188) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24189) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24190) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(24191) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(24192) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24193) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24194) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24195) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24196) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24197) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24198) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24199) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24200) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(24201) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(24202) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24203) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24204) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24205) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24206) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24207) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24208) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24209) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24210) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(24211) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(24212) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24213) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24214) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24215) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24216) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24217) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24218) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24219) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24220) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(24221) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(24222) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(24223) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24224) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24225) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(24226) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24227) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(24228) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24229) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24230) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(24231) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends UpdateEntryId(24232) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24233) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24234) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24235) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24236) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24237) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24238) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24239) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24240) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends UpdateEntryId(24241) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends UpdateEntryId(24242) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24243) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24244) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24245) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24246) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24247) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24248) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24249) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24250) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends UpdateEntryId(24251) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends UpdateEntryId(24252) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24253) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24254) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24255) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24256) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24257) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24258) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24259) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24260) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends UpdateEntryId(24261) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends UpdateEntryId(24262) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends UpdateEntryId(24263) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24264) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24265) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends UpdateEntryId(24266) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24267) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends UpdateEntryId(24268) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24269) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24270) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends UpdateEntryId(24271) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends UpdateEntryId(24272) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends UpdateEntryId(24273) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends UpdateEntryId(24274) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends UpdateEntryId(24275) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends UpdateEntryId(24276) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends UpdateEntryId(24277) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends UpdateEntryId(24278) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends UpdateEntryId(24279) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends UpdateEntryId(24280) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends UpdateEntryId(24281) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends UpdateEntryId(24282) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends UpdateEntryId(24283) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends UpdateEntryId(24284) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends UpdateEntryId(24285) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends UpdateEntryId(24286) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends UpdateEntryId(24287) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends UpdateEntryId(24288) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends UpdateEntryId(24289) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends UpdateEntryId(24290) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends UpdateEntryId(24291) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends UpdateEntryId(24292) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends UpdateEntryId(24293) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends UpdateEntryId(24294) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends UpdateEntryId(24295) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends UpdateEntryId(24296) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends UpdateEntryId(24297) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends UpdateEntryId(24298) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends UpdateEntryId(24299) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends UpdateEntryId(24300) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends UpdateEntryId(24301) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }
    }
  }

  override def keyIdsList: List[UpdateEntryId] = SealedList.list[UpdateEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}