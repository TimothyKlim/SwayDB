
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
sealed abstract class PutEntryId(override val id: Int) extends EntryId(id)
object PutEntryId extends EntryFormat {

  override val format: EntryId.Format = PutEntryId.FormatA

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
              object NoDeadline extends PutEntryId(0) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(3) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(4) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(5) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(6) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(7) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(8) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(9) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(10) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(11) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(12) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(13) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(14) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(15) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(16) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(17) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(18) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(19) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(20) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(21) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(22) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(23) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(24) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(25) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(26) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(27) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(28) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(29) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(30) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(31) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(32) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(33) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(34) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(35) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(36) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(37) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(38) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(39) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(40) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(41) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(42) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(43) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(44) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(45) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(46) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(47) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(48) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(49) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(50) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(51) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(52) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(53) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(54) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(55) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(56) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(57) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(58) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(59) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(60) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(61) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(62) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(63) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(64) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(65) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(66) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(67) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(68) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(69) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(70) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(71) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(72) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(73) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(74) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(75) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(76) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(77) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(78) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(79) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(80) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(81) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(82) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(83) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(84) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(85) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(86) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(87) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(88) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(89) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(90) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(91) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(92) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(93) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(94) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(95) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(96) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(97) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(98) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(99) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(100) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(101) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(102) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(103) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(104) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(105) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(106) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(107) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(108) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(109) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(110) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(111) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(112) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(113) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(114) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(115) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(116) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(117) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(118) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(119) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(120) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(121) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(122) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(123) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(124) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(125) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(126) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(127) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(128) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(129) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(130) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(131) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(132) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(133) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(134) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(135) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(136) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(137) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(138) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(139) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(140) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(141) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(142) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(143) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(144) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(145) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(146) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(147) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(148) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(149) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(150) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(151) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(152) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(153) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(154) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(155) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(156) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(157) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(158) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(159) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(160) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(161) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(162) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(163) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(164) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(165) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(166) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(167) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(168) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(169) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(170) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(171) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(172) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(173) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(174) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(175) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(176) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(177) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(178) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(179) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(180) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(181) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(182) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(183) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(184) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(185) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(186) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(187) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(188) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(189) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(190) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(191) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(192) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(193) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(194) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(195) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(196) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(197) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(198) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(199) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(200) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(201) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(202) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(203) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(204) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(205) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(206) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(207) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(208) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(209) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(210) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(211) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(212) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(213) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(214) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(215) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(216) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(217) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(218) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(219) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(220) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(221) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(222) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(223) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(224) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(225) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(226) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(227) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(228) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(229) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(230) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(231) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(232) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(233) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(234) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(235) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(236) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(237) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(238) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(239) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(240) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(241) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(242) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(243) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(244) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(245) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(246) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(247) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(248) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(249) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(250) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(251) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(252) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(253) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(254) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(255) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(256) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(257) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(258) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(259) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(260) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(261) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(262) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(263) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(264) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(265) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(266) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(267) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(268) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(269) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(270) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(271) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(272) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(273) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(274) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(275) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(276) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(277) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(278) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(279) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(280) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(281) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(282) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(283) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(284) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(285) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(286) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(287) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(288) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(289) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(290) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(291) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(292) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(293) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(294) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(295) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(296) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(297) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(298) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(299) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(300) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(301) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(302) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(303) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(304) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(305) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(306) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(307) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(308) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(309) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(310) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(311) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(312) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(313) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(314) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(315) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(316) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(317) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(318) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(319) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(320) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(321) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(322) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(323) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(324) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(325) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(326) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(327) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(328) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(329) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(330) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(331) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(332) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(333) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(334) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(335) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(336) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(337) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(338) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(339) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(340) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(341) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(342) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(343) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(344) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(345) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(346) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(347) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(348) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(349) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(350) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(351) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(352) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(353) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(354) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(355) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(356) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(357) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(358) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(359) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(360) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(361) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(362) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(363) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(364) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(365) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(366) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(367) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(368) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(369) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(370) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(371) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(372) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(373) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(374) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(375) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(376) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(377) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(378) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(379) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(380) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(381) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(382) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(383) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(384) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(385) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(386) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(387) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(388) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(389) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(390) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(391) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(392) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(393) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(394) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(395) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(396) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(397) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(398) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(399) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(400) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(401) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(402) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(403) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(404) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(405) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(406) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(407) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(408) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(409) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(410) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(411) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(412) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(413) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(414) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(415) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(416) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(417) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(418) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(419) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(420) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(421) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(422) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(423) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(424) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(425) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(426) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(427) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(428) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(429) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(430) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(431) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(432) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(433) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(434) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(435) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(436) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(437) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(438) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(439) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(440) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(441) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(442) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(443) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(444) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(445) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(446) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(447) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(448) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(449) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(450) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(451) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(452) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(453) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(454) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(455) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(456) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(457) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(458) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(459) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(460) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(461) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(462) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(463) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(464) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(465) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(466) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(467) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(468) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(469) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(470) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(471) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(472) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(473) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(474) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(475) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(476) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(477) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(478) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(479) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(480) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(481) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(482) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(483) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(484) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(485) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(486) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(487) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(488) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(489) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(490) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(491) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(492) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(493) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(494) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(495) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(496) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(497) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(498) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(499) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(500) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(501) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(502) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(503) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(504) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(505) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(506) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(507) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(508) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(509) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(510) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(511) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(512) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(513) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(514) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(515) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(516) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(517) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(518) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(519) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(520) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(521) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(522) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(523) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(524) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(525) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(526) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(527) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(528) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(529) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(530) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(531) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(532) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(533) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(534) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(535) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(536) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(537) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(538) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(539) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(540) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(541) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(542) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(543) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(544) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(545) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(546) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(547) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(548) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(549) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(550) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(551) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(552) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(553) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(554) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(555) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(556) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(557) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(558) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(559) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(560) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(561) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(562) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(563) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(564) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(565) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(566) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(567) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(568) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(569) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(570) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(571) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(572) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(573) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(574) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(575) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(576) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(577) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(578) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(579) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(580) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(581) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(582) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(583) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(584) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(585) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(586) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(587) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(588) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(589) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(590) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(591) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(592) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(593) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(594) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(595) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(596) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(597) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(598) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(599) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(600) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(601) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(602) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(603) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(604) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(605) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(606) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(607) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(608) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(609) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(610) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(611) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(612) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(613) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(614) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(615) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(616) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(617) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(618) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(619) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(620) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(621) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(622) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(623) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(624) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(625) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(626) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(627) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(628) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(629) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(630) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(631) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(632) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(633) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(634) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(635) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(636) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(637) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(638) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(639) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(640) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(641) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(642) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(643) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(644) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(645) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(646) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(647) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(648) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(649) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(650) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(651) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(652) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(653) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(654) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(655) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(656) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(657) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(658) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(659) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(660) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(661) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(662) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(663) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(664) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(665) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(666) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(667) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(668) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(669) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(670) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(671) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(672) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(673) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(674) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(675) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(676) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(677) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(678) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(679) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(680) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(681) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(682) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(683) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(684) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(685) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(686) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(687) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(688) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(689) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(690) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(691) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(692) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(693) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(694) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(695) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(696) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(697) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(698) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(699) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(700) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(701) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(702) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(703) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(704) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(705) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(706) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(707) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(708) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(709) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(710) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(711) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(712) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(713) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(714) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(715) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(716) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(717) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(718) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(719) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(720) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(721) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(722) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(723) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(724) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(725) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(726) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(727) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(728) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(729) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(730) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(731) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(732) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(733) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(734) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(735) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(736) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(737) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(738) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(739) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(740) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(741) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(742) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(743) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(744) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(745) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(746) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(747) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(748) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(749) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(750) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(751) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(752) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(753) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(754) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(755) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(756) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(757) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(758) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(759) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(760) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(761) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(762) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(763) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(764) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(765) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(766) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(767) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(768) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(769) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(770) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(771) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(772) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(773) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(774) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(775) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(776) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(777) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(778) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(779) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(780) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(781) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(782) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(783) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(784) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(785) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(786) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(787) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(788) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(789) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(790) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(791) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(792) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(793) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(794) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(795) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(796) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(797) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(798) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(799) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(800) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(801) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(802) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(803) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(804) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(805) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(806) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(807) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(808) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(809) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(810) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(811) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(812) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(813) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(814) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(815) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(816) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(817) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(818) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(819) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(820) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(821) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(822) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(823) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(824) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(825) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(826) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(827) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(828) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(829) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(830) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(831) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(832) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(833) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(834) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(835) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(836) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(837) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(838) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(839) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(840) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(841) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(842) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(843) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(844) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(845) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(846) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(847) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(848) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(849) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(850) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(851) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(852) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(853) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(854) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(855) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(856) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(857) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(858) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(859) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(860) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(861) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(862) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(863) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(864) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(865) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(866) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(867) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(868) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(869) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(870) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(871) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(872) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(873) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(874) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(875) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(876) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(877) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(878) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(879) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(880) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(881) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(882) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(883) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(884) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(885) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(886) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(887) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(888) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(889) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(890) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(891) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(892) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(893) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(894) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(895) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(896) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(897) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(898) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(899) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(900) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(901) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(902) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(903) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(904) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(905) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(906) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(907) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(908) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(909) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(910) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(911) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(912) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(913) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(914) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(915) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(916) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(917) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(918) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(919) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(920) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(921) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(922) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(923) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(924) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(925) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(926) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(927) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(928) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(929) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(930) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(931) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(932) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(933) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(934) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(935) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(936) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(937) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(938) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(939) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(940) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(941) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(942) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(943) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(944) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(945) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(946) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(947) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(948) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(949) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(950) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(951) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(952) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(953) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(954) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(955) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(956) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(957) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(958) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(959) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(960) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(961) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(962) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(963) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(964) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(965) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(966) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(967) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(968) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(969) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(970) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(971) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(972) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(973) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(974) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(975) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(976) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(977) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(978) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(979) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(980) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(981) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(982) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(983) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(984) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(985) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(986) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(987) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(988) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(989) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(990) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(991) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(992) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(993) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(994) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(995) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(996) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(997) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(998) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(999) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1000) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1001) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1002) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1003) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1004) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1005) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1006) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1007) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1008) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1009) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1010) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1011) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1012) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1013) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1014) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1015) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1016) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1017) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1018) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1019) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1020) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1021) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1022) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1023) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1024) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1025) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1026) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1027) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1028) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1029) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1030) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1031) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1032) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1033) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1034) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1035) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1036) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1037) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1038) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1039) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1040) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1041) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1042) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1043) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1044) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1045) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1046) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1047) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1048) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1049) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1050) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1051) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1052) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1053) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1054) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1055) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1056) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1057) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1058) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1059) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1060) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1061) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1062) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1063) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1064) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1065) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1066) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1067) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1068) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1069) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1070) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1071) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1072) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1073) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1074) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1075) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1076) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1077) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1078) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1079) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(1080) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(1081) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(1082) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(1083) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(1084) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(1085) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(1086) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(1087) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(1088) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(1089) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(1090) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(1091) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(1092) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(1093) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(1094) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(1095) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(1096) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(1097) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(1098) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(1099) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(1100) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1101) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1102) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1103) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1104) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1105) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1106) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1107) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1108) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1109) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1110) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1111) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1112) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1113) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1114) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1115) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1116) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1117) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1118) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1119) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1120) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1121) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1122) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1123) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1124) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1125) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1126) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1127) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1128) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1129) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1130) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1131) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1132) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1133) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1134) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1135) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1136) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1137) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1138) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1139) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1140) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1141) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1142) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1143) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1144) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1145) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1146) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1147) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1148) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1149) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1150) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1151) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1152) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1153) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1154) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1155) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1156) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1157) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1158) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1159) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1160) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1161) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1162) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1163) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1164) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1165) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1166) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1167) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1168) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1169) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1170) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1171) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1172) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1173) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1174) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1175) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1176) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1177) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1178) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1179) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1180) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1181) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1182) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1183) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1184) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1185) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1186) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1187) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1188) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1189) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1190) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1191) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1192) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1193) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1194) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1195) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1196) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1197) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1198) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1199) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1200) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1201) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1202) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1203) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1204) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1205) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1206) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1207) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1208) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1209) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1210) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1211) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1212) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1213) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1214) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1215) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1216) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1217) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1218) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1219) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1220) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1221) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1222) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1223) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1224) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1225) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1226) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1227) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1228) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1229) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1230) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1231) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1232) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1233) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1234) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1235) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1236) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1237) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1238) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1239) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1240) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1241) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1242) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1243) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1244) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1245) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1246) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1247) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1248) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1249) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1250) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1251) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1252) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1253) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1254) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1255) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1256) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1257) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1258) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1259) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1260) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1261) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1262) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1263) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1264) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1265) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1266) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1267) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1268) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1269) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1270) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1271) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1272) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1273) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1274) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1275) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1276) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1277) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1278) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1279) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1280) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1281) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1282) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1283) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1284) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1285) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1286) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1287) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1288) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1289) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1290) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1291) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1292) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1293) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1294) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1295) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1296) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1297) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1298) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1299) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(1300) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(1301) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(1302) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(1303) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(1304) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(1305) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(1306) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(1307) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(1308) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(1309) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(1310) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(1311) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(1312) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(1313) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(1314) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(1315) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(1316) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(1317) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(1318) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(1319) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(1320) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1321) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1322) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1323) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1324) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1325) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1326) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1327) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1328) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1329) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1330) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1331) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1332) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1333) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1334) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1335) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1336) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1337) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1338) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1339) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1340) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1341) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1342) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1343) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1344) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1345) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1346) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1347) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1348) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1349) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1350) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1351) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1352) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1353) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1354) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1355) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1356) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1357) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1358) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1359) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1360) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1361) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1362) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1363) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1364) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1365) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1366) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1367) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1368) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1369) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1370) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1371) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1372) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1373) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1374) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1375) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1376) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1377) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1378) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1379) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1380) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1381) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1382) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1383) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1384) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1385) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1386) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1387) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1388) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1389) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1390) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1391) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1392) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1393) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1394) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1395) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1396) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1397) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1398) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1399) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1400) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1401) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1402) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1403) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1404) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1405) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1406) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1407) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1408) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1409) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1410) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1411) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1412) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1413) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1414) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1415) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1416) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1417) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1418) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1419) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1420) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1421) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1422) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1423) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1424) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1425) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1426) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1427) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1428) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1429) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1430) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1431) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1432) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1433) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1434) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1435) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1436) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1437) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1438) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1439) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1440) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1441) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1442) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1443) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1444) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1445) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1446) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1447) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1448) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1449) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1450) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1451) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1452) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1453) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1454) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1455) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1456) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1457) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1458) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1459) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1460) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1461) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1462) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1463) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1464) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1465) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1466) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1467) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1468) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1469) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1470) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1471) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1472) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1473) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1474) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1475) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1476) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1477) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1478) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1479) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1480) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1481) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1482) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1483) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1484) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1485) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1486) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1487) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1488) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1489) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1490) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1491) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1492) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1493) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1494) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1495) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1496) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1497) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1498) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1499) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1500) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1501) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1502) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1503) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1504) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1505) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1506) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1507) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1508) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1509) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1510) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1511) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1512) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1513) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1514) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1515) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1516) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1517) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1518) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1519) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(1520) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(1521) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(1522) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(1523) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(1524) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(1525) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(1526) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(1527) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(1528) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(1529) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(1530) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(1531) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(1532) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(1533) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(1534) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(1535) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(1536) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(1537) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(1538) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(1539) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(1540) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1541) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1542) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1543) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1544) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1545) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1546) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1547) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1548) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1549) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1550) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1551) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1552) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1553) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1554) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1555) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1556) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1557) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1558) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1559) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1560) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1561) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1562) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1563) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1564) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1565) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1566) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1567) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1568) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1569) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1570) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1571) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1572) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1573) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1574) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1575) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1576) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1577) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1578) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1579) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1580) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1581) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1582) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1583) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1584) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1585) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1586) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1587) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1588) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1589) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1590) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1591) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1592) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1593) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1594) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1595) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1596) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1597) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1598) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1599) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1600) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1601) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1602) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1603) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1604) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1605) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1606) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1607) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1608) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1609) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1610) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1611) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1612) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1613) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1614) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1615) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1616) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1617) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1618) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1619) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1620) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1621) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1622) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1623) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1624) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1625) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1626) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1627) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1628) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1629) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1630) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1631) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1632) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1633) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1634) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1635) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1636) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1637) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1638) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1639) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1640) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1641) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1642) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1643) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1644) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1645) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1646) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1647) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1648) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1649) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1650) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1651) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1652) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1653) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1654) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1655) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1656) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1657) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1658) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1659) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1660) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1661) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1662) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1663) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1664) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1665) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1666) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1667) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1668) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1669) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1670) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1671) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1672) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1673) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1674) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1675) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1676) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1677) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1678) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1679) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1680) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1681) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1682) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1683) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1684) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1685) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1686) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1687) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1688) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1689) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1690) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1691) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1692) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1693) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1694) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1695) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1696) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1697) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1698) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1699) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1700) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1701) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1702) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1703) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1704) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1705) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1706) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1707) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1708) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1709) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1710) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1711) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1712) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1713) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1714) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1715) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1716) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1717) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1718) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1719) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1720) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1721) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1722) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1723) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1724) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1725) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1726) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1727) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1728) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1729) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1730) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1731) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1732) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1733) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1734) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1735) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1736) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1737) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1738) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1739) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(1740) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(1741) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(1742) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(1743) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(1744) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(1745) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(1746) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(1747) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(1748) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(1749) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(1750) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(1751) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(1752) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(1753) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(1754) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(1755) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(1756) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(1757) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(1758) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(1759) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(1760) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1761) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1762) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1763) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1764) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1765) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1766) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1767) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1768) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1769) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1770) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1771) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1772) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1773) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1774) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1775) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1776) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1777) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1778) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1779) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1780) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1781) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1782) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1783) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1784) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1785) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1786) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1787) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1788) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1789) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1790) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1791) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1792) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1793) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1794) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1795) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1796) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1797) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1798) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1799) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1800) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1801) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1802) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1803) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1804) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1805) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1806) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1807) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1808) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1809) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1810) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1811) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1812) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1813) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1814) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1815) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1816) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1817) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1818) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1819) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1820) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1821) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1822) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1823) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1824) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1825) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1826) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1827) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1828) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1829) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1830) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1831) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1832) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1833) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1834) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1835) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1836) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1837) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1838) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1839) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1840) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1841) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1842) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1843) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1844) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1845) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1846) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1847) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1848) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1849) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1850) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1851) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1852) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1853) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1854) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1855) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1856) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1857) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1858) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1859) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1860) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1861) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1862) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1863) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1864) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1865) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1866) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1867) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1868) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1869) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1870) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1871) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1872) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1873) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1874) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1875) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1876) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1877) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1878) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1879) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1880) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1881) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1882) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1883) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1884) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1885) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1886) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1887) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1888) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1889) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1890) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1891) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1892) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1893) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1894) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1895) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1896) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1897) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1898) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1899) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1900) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1901) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1902) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1903) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1904) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1905) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1906) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1907) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1908) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1909) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(1910) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1911) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1912) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1913) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1914) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1915) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1916) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1917) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1918) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1919) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1920) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1921) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1922) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1923) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1924) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1925) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1926) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1927) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1928) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1929) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(1930) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(1931) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(1932) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(1933) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(1934) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(1935) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(1936) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(1937) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(1938) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(1939) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(1940) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(1941) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(1942) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(1943) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(1944) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(1945) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(1946) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(1947) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(1948) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(1949) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(1950) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(1951) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(1952) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(1953) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(1954) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(1955) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(1956) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(1957) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(1958) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(1959) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(1960) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(1961) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(1962) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(1963) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(1964) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(1965) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(1966) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(1967) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(1968) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(1969) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(1970) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(1971) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(1972) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(1973) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(1974) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(1975) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(1976) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(1977) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(1978) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(1979) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(1980) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(1981) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(1982) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(1983) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(1984) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(1985) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(1986) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(1987) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(1988) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(1989) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(1990) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(1991) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(1992) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(1993) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(1994) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(1995) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(1996) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(1997) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(1998) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(1999) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2000) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2001) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2002) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2003) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2004) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2005) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2006) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2007) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2008) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2009) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2010) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2011) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2012) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2013) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2014) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2015) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2016) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2017) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2018) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2019) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2020) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2021) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2022) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2023) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2024) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2025) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2026) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2027) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2028) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2029) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2030) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2031) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2032) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2033) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2034) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2035) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2036) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2037) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2038) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2039) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2040) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2041) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2042) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2043) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2044) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2045) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2046) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2047) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2048) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2049) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2050) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2051) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2052) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2053) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2054) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2055) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2056) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2057) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2058) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2059) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2060) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2061) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2062) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2063) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2064) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2065) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2066) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2067) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2068) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2069) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2070) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2071) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2072) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2073) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2074) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2075) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2076) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2077) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2078) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2079) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2080) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2081) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2082) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2083) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2084) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2085) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2086) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2087) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2088) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2089) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2090) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2091) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2092) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2093) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2094) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2095) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2096) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2097) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2098) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2099) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2100) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2101) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2102) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2103) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2104) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2105) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2106) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2107) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2108) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2109) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2110) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2111) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2112) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2113) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2114) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2115) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2116) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2117) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2118) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2119) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2120) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2121) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2122) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2123) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2124) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2125) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2126) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2127) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2128) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2129) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2130) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2131) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2132) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2133) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2134) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2135) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2136) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2137) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2138) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2139) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2140) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2141) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2142) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2143) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2144) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2145) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2146) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2147) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2148) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2149) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2150) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2151) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2152) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2153) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2154) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2155) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2156) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2157) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2158) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2159) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2160) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2161) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2162) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2163) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2164) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2165) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2166) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2167) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2168) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2169) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2170) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2171) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2172) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2173) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2174) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2175) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2176) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2177) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2178) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2179) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(2180) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(2181) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(2182) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(2183) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(2184) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(2185) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(2186) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(2187) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(2188) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(2189) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(2190) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(2191) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(2192) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(2193) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(2194) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(2195) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(2196) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(2197) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(2198) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(2199) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(2200) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2201) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2202) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2203) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2204) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2205) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2206) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2207) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2208) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2209) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2210) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2211) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2212) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2213) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2214) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2215) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2216) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2217) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2218) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2219) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2220) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2221) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2222) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2223) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2224) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2225) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2226) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2227) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2228) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2229) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2230) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2231) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2232) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2233) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2234) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2235) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2236) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2237) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2238) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2239) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2240) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2241) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2242) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2243) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2244) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2245) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2246) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2247) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2248) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2249) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2250) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2251) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2252) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2253) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2254) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2255) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2256) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2257) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2258) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2259) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2260) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2261) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2262) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2263) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2264) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2265) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2266) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2267) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2268) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2269) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2270) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2271) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2272) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2273) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2274) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2275) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2276) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2277) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2278) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2279) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2280) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2281) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2282) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2283) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2284) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2285) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2286) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2287) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2288) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2289) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2290) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2291) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2292) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2293) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2294) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2295) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2296) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2297) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2298) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2299) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2300) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2301) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2302) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2303) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2304) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2305) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2306) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2307) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2308) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2309) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2310) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2311) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2312) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2313) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2314) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2315) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2316) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2317) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2318) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2319) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2320) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2321) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2322) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2323) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2324) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2325) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2326) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2327) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2328) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2329) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2330) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2331) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2332) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2333) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2334) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2335) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2336) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2337) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2338) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2339) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2340) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2341) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2342) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2343) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2344) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2345) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2346) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2347) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2348) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2349) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2350) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2351) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2352) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2353) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2354) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2355) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2356) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2357) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2358) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2359) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2360) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2361) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2362) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2363) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2364) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2365) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2366) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2367) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2368) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2369) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2370) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2371) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2372) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2373) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2374) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2375) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2376) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2377) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2378) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2379) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2380) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2381) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2382) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2383) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2384) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2385) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2386) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2387) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2388) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2389) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2390) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2391) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2392) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2393) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2394) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2395) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2396) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2397) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2398) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2399) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(2400) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(2401) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(2402) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(2403) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(2404) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(2405) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(2406) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(2407) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(2408) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(2409) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(2410) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(2411) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(2412) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(2413) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(2414) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(2415) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(2416) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(2417) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(2418) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(2419) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends PutEntryId(2420) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2421) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2422) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2423) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2424) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2425) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2426) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2427) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2428) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2429) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2430) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2431) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2432) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2433) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2434) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2435) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2436) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2437) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2438) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2439) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2440) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2441) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2442) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2443) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2444) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2445) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2446) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2447) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2448) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2449) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2450) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2451) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2452) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2453) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2454) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2455) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2456) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2457) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2458) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2459) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2460) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2461) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2462) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2463) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2464) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2465) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2466) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2467) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2468) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2469) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2470) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2471) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2472) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2473) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2474) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2475) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2476) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2477) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2478) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2479) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2480) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2481) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2482) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2483) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2484) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2485) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2486) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2487) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2488) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2489) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2490) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2491) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2492) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2493) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2494) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2495) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2496) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2497) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2498) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2499) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2500) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2501) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2502) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2503) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2504) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2505) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2506) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2507) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2508) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2509) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2510) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2511) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2512) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2513) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2514) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2515) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2516) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2517) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2518) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2519) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2520) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2521) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2522) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2523) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2524) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2525) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2526) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2527) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2528) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2529) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2530) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2531) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2532) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2533) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2534) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2535) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2536) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2537) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2538) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2539) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2540) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2541) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2542) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2543) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2544) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2545) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2546) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2547) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2548) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2549) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2550) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2551) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2552) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2553) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2554) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2555) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2556) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2557) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2558) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2559) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2560) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2561) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2562) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2563) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2564) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2565) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2566) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2567) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2568) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2569) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends PutEntryId(2570) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends PutEntryId(2571) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends PutEntryId(2572) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends PutEntryId(2573) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends PutEntryId(2574) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends PutEntryId(2575) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends PutEntryId(2576) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends PutEntryId(2577) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends PutEntryId(2578) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends PutEntryId(2579) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends PutEntryId(2580) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends PutEntryId(2581) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends PutEntryId(2582) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends PutEntryId(2583) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends PutEntryId(2584) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends PutEntryId(2585) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends PutEntryId(2586) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends PutEntryId(2587) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends PutEntryId(2588) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends PutEntryId(2589) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends PutEntryId(2590) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends PutEntryId(2591) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends PutEntryId(2592) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends PutEntryId(2593) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends PutEntryId(2594) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends PutEntryId(2595) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends PutEntryId(2596) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends PutEntryId(2597) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends PutEntryId(2598) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends PutEntryId(2599) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends PutEntryId(2600) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends PutEntryId(2601) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends PutEntryId(2602) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends PutEntryId(2603) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends PutEntryId(2604) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends PutEntryId(2605) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends PutEntryId(2606) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends PutEntryId(2607) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends PutEntryId(2608) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends PutEntryId(2609) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends PutEntryId(2610) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends PutEntryId(2611) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends PutEntryId(2612) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends PutEntryId(2613) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends PutEntryId(2614) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends PutEntryId(2615) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends PutEntryId(2616) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends PutEntryId(2617) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends PutEntryId(2618) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends PutEntryId(2619) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends PutEntryId(2620) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends PutEntryId(2621) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends PutEntryId(2622) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends PutEntryId(2623) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends PutEntryId(2624) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends PutEntryId(2625) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends PutEntryId(2626) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends PutEntryId(2627) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends PutEntryId(2628) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends PutEntryId(2629) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends PutEntryId(2630) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends PutEntryId(2631) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends PutEntryId(2632) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends PutEntryId(2633) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends PutEntryId(2634) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends PutEntryId(2635) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends PutEntryId(2636) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends PutEntryId(2637) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends PutEntryId(2638) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends PutEntryId(2639) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }
    }
  }

  override def keyIdsList: List[PutEntryId] = SealedList.list[PutEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}