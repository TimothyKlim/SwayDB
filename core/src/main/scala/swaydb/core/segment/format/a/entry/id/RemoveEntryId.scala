
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
object RemoveEntryId extends EntryFormat {

  override val format: EntryId.Format = RemoveEntryId.FormatA

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
              object NoDeadline extends RemoveEntryId(19023) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19024) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19025) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19026) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19027) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19028) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19029) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19030) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19031) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19032) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19033) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19034) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19035) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19036) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19037) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19038) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19039) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19040) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19041) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19042) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19043) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19044) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19045) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19046) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19047) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19048) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19049) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19050) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19051) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19052) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19053) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19054) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19055) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19056) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19057) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19058) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19059) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19060) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19061) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19062) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19063) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19064) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19065) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19066) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19067) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19068) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19069) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19070) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19071) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19072) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19073) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19074) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19075) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19076) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19077) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19078) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19079) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19080) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19081) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19082) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19083) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19084) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19085) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19086) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19087) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19088) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19089) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19090) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19091) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19092) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19093) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19094) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19095) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19096) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19097) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19098) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19099) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19100) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19101) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19102) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19103) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19104) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19105) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19106) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19107) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19108) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19109) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19110) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19111) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19112) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19113) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19114) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19115) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19116) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19117) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19118) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19119) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19120) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19121) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19122) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19123) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19124) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19125) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19126) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19127) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19128) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19129) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19130) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19131) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19132) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19133) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19134) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19135) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19136) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19137) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19138) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19139) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19140) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19141) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19142) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19143) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19144) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19145) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19146) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19147) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19148) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19149) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19150) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19151) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19152) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19153) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19154) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19155) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19156) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19157) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19158) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19159) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19160) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19161) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19162) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19163) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19164) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19165) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19166) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19167) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19168) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19169) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19170) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19171) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19172) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19173) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19174) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19175) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19176) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19177) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19178) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19179) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19180) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19181) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19182) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19183) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19184) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19185) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19186) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19187) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19188) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19189) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19190) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19191) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19192) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19193) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19194) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19195) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19196) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19197) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19198) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19199) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19200) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19201) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19202) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19203) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19204) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19205) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19206) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19207) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19208) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19209) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19210) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19211) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19212) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19213) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19214) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19215) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19216) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19217) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19218) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19219) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19220) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19221) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19222) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(19223) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(19224) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(19225) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(19226) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(19227) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(19228) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(19229) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(19230) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(19231) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(19232) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(19233) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(19234) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(19235) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(19236) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(19237) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(19238) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(19239) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(19240) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(19241) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(19242) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19243) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19244) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19245) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19246) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19247) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19248) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19249) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19250) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19251) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19252) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19253) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19254) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19255) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19256) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19257) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19258) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19259) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19260) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19261) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19262) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19263) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19264) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19265) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19266) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19267) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19268) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19269) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19270) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19271) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19272) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19273) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19274) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19275) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19276) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19277) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19278) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19279) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19280) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19281) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19282) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19283) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19284) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19285) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19286) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19287) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19288) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19289) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19290) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19291) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19292) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19293) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19294) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19295) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19296) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19297) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19298) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19299) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19300) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19301) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19302) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19303) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19304) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19305) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19306) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19307) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19308) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19309) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19310) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19311) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19312) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19313) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19314) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19315) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19316) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19317) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19318) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19319) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19320) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19321) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19322) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19323) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19324) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19325) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19326) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19327) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19328) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19329) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19330) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19331) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19332) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19333) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19334) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19335) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19336) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19337) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19338) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19339) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19340) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19341) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19342) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19343) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19344) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19345) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19346) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19347) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19348) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19349) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19350) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19351) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19352) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19353) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19354) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19355) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19356) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19357) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19358) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19359) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19360) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19361) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19362) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19363) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19364) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19365) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19366) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19367) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19368) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19369) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19370) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19371) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19372) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19373) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19374) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19375) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19376) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19377) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19378) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19379) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19380) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19381) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19382) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19383) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19384) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19385) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19386) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19387) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19388) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19389) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19390) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19391) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19392) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19393) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19394) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19395) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19396) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19397) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19398) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19399) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19400) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19401) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19402) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19403) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19404) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19405) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19406) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19407) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19408) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19409) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19410) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19411) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19412) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19413) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19414) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19415) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19416) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19417) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19418) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19419) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19420) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19421) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19422) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19423) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19424) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19425) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19426) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19427) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19428) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19429) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19430) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19431) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19432) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19433) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19434) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19435) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19436) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19437) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19438) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19439) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19440) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19441) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19442) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(19443) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(19444) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(19445) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(19446) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(19447) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(19448) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(19449) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(19450) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(19451) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(19452) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(19453) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(19454) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(19455) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(19456) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(19457) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(19458) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(19459) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(19460) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(19461) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(19462) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19463) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19464) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19465) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19466) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19467) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19468) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19469) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19470) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19471) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19472) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19473) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19474) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19475) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19476) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19477) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19478) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19479) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19480) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19481) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19482) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19483) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19484) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19485) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19486) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19487) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19488) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19489) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19490) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19491) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19492) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19493) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19494) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19495) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19496) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19497) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19498) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19499) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19500) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19501) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19502) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19503) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19504) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19505) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19506) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19507) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19508) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19509) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19510) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19511) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19512) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19513) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19514) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19515) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19516) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19517) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19518) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19519) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19520) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19521) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19522) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19523) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19524) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19525) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19526) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19527) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19528) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19529) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19530) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19531) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19532) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19533) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19534) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19535) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19536) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19537) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19538) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19539) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19540) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19541) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19542) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19543) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19544) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19545) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19546) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19547) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19548) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19549) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19550) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19551) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19552) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19553) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19554) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19555) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19556) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19557) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19558) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19559) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19560) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19561) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19562) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19563) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19564) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19565) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19566) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19567) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19568) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19569) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19570) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19571) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19572) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19573) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19574) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19575) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19576) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19577) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19578) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19579) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19580) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19581) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19582) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19583) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19584) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19585) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19586) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19587) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19588) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19589) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19590) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19591) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19592) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19593) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19594) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19595) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19596) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19597) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19598) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19599) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19600) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19601) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19602) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19603) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19604) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19605) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19606) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19607) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19608) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19609) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19610) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19611) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19612) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19613) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19614) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19615) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19616) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19617) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19618) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19619) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19620) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19621) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19622) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19623) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19624) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19625) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19626) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19627) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19628) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19629) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19630) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19631) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19632) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19633) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19634) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19635) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19636) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19637) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19638) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19639) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19640) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19641) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19642) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19643) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19644) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19645) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19646) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19647) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19648) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19649) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19650) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19651) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19652) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19653) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19654) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19655) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19656) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19657) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19658) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19659) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19660) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19661) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19662) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(19663) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(19664) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(19665) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(19666) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(19667) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(19668) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(19669) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(19670) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(19671) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(19672) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(19673) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(19674) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(19675) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(19676) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(19677) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(19678) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(19679) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(19680) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(19681) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(19682) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19683) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19684) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19685) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19686) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19687) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19688) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19689) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19690) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19691) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19692) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19693) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19694) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19695) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19696) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19697) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19698) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19699) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19700) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19701) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19702) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19703) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19704) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19705) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19706) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19707) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19708) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19709) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19710) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19711) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19712) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19713) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19714) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19715) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19716) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19717) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19718) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19719) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19720) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19721) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19722) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19723) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19724) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19725) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19726) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19727) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19728) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19729) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19730) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19731) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19732) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19733) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19734) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19735) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19736) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19737) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19738) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19739) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19740) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19741) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19742) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19743) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19744) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19745) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19746) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19747) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19748) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19749) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19750) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19751) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19752) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19753) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19754) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19755) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19756) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19757) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19758) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19759) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19760) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19761) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19762) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19763) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19764) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19765) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19766) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19767) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19768) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19769) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19770) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19771) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19772) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19773) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19774) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19775) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19776) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19777) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19778) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19779) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19780) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19781) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19782) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19783) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19784) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19785) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19786) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19787) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19788) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19789) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19790) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19791) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19792) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19793) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19794) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19795) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19796) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19797) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19798) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19799) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19800) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19801) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19802) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19803) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19804) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19805) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19806) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19807) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19808) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19809) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19810) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19811) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19812) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19813) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19814) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19815) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19816) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19817) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19818) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19819) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19820) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19821) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19822) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19823) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19824) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19825) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19826) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19827) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19828) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19829) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19830) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19831) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19832) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19833) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19834) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19835) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19836) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19837) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19838) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19839) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19840) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19841) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19842) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19843) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19844) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19845) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19846) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19847) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19848) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19849) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19850) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19851) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19852) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19853) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19854) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19855) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19856) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19857) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19858) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19859) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19860) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19861) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19862) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19863) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19864) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19865) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19866) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19867) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19868) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19869) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19870) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19871) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19872) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19873) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19874) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19875) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19876) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19877) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19878) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19879) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19880) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19881) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19882) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(19883) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(19884) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(19885) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(19886) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(19887) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(19888) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(19889) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(19890) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(19891) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(19892) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(19893) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(19894) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(19895) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(19896) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(19897) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(19898) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(19899) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(19900) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(19901) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(19902) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19903) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19904) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19905) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19906) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19907) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19908) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19909) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19910) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19911) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19912) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19913) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19914) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19915) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19916) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19917) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19918) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19919) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19920) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19921) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19922) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19923) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19924) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19925) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19926) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19927) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19928) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19929) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19930) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19931) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19932) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19933) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19934) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19935) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19936) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19937) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19938) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19939) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19940) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19941) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19942) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19943) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19944) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19945) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19946) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19947) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19948) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19949) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19950) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19951) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(19952) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(19953) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19954) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19955) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19956) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19957) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19958) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19959) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19960) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19961) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(19962) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(19963) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19964) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19965) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19966) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19967) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19968) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19969) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19970) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19971) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(19972) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(19973) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19974) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19975) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19976) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19977) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19978) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19979) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19980) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19981) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(19982) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(19983) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(19984) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19985) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19986) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(19987) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19988) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(19989) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(19990) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(19991) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(19992) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(19993) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(19994) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(19995) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(19996) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(19997) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(19998) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(19999) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20000) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20001) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20002) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20003) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20004) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20005) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20006) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20007) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20008) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20009) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20010) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20011) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20012) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20013) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20014) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20015) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20016) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20017) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20018) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20019) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20020) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20021) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20022) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20023) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20024) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20025) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20026) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20027) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20028) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20029) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20030) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20031) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20032) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20033) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20034) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20035) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20036) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20037) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20038) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20039) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20040) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20041) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20042) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20043) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20044) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20045) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20046) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20047) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20048) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20049) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20050) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20051) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20052) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20053) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20054) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20055) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20056) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20057) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20058) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20059) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20060) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20061) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20062) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20063) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20064) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20065) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20066) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20067) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20068) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20069) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20070) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20071) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20072) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20073) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20074) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20075) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20076) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20077) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20078) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20079) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20080) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20081) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20082) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20083) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20084) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20085) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20086) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20087) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20088) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20089) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20090) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20091) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20092) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20093) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20094) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20095) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20096) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20097) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20098) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20099) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20100) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20101) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20102) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(20103) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(20104) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(20105) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(20106) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(20107) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(20108) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(20109) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(20110) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(20111) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(20112) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(20113) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(20114) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(20115) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(20116) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(20117) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(20118) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(20119) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(20120) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(20121) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(20122) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20123) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20124) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20125) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20126) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20127) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20128) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20129) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20130) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20131) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20132) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20133) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20134) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20135) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20136) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20137) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20138) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20139) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20140) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20141) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20142) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20143) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20144) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20145) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20146) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20147) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20148) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20149) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20150) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20151) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20152) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20153) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20154) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20155) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20156) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20157) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20158) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20159) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20160) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20161) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20162) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20163) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20164) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20165) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20166) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20167) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20168) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20169) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20170) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20171) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20172) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20173) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20174) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20175) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20176) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20177) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20178) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20179) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20180) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20181) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20182) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20183) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20184) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20185) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20186) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20187) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20188) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20189) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20190) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20191) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20192) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20193) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20194) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20195) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20196) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20197) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20198) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20199) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20200) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20201) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20202) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20203) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20204) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20205) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20206) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20207) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20208) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20209) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20210) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20211) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20212) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20213) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20214) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20215) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20216) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20217) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20218) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20219) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20220) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20221) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20222) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20223) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20224) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20225) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20226) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20227) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20228) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20229) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20230) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20231) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20232) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20233) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20234) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20235) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20236) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20237) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20238) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20239) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20240) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20241) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20242) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20243) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20244) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20245) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20246) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20247) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20248) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20249) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20250) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20251) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20252) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20253) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20254) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20255) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20256) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20257) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20258) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20259) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20260) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20261) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20262) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20263) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20264) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20265) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20266) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20267) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20268) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20269) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20270) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20271) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20272) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20273) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20274) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20275) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20276) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20277) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20278) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20279) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20280) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20281) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20282) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20283) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20284) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20285) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20286) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20287) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20288) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20289) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20290) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20291) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20292) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20293) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20294) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20295) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20296) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20297) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20298) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20299) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20300) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20301) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20302) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20303) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20304) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20305) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20306) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20307) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20308) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20309) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20310) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20311) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20312) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20313) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20314) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20315) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20316) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20317) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20318) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20319) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20320) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20321) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20322) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(20323) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(20324) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(20325) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(20326) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(20327) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(20328) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(20329) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(20330) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(20331) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(20332) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(20333) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(20334) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(20335) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(20336) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(20337) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(20338) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(20339) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(20340) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(20341) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(20342) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20343) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20344) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20345) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20346) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20347) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20348) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20349) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20350) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20351) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20352) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20353) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20354) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20355) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20356) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20357) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20358) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20359) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20360) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20361) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20362) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20363) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20364) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20365) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20366) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20367) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20368) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20369) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20370) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20371) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20372) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20373) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20374) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20375) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20376) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20377) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20378) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20379) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20380) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20381) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20382) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20383) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20384) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20385) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20386) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20387) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20388) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20389) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20390) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20391) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20392) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20393) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20394) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20395) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20396) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20397) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20398) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20399) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20400) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20401) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20402) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20403) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20404) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20405) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20406) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20407) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20408) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20409) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20410) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20411) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20412) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20413) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20414) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20415) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20416) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20417) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20418) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20419) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20420) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20421) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20422) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20423) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20424) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20425) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20426) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20427) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20428) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20429) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20430) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20431) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20432) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20433) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20434) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20435) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20436) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20437) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20438) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20439) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20440) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20441) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20442) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20443) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20444) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20445) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20446) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20447) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20448) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20449) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20450) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20451) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20452) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20453) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20454) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20455) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20456) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20457) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20458) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20459) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20460) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20461) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20462) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20463) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20464) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20465) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20466) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20467) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20468) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20469) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20470) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20471) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20472) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20473) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20474) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20475) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20476) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20477) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20478) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20479) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20480) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20481) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20482) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20483) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20484) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20485) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20486) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20487) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20488) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20489) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20490) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20491) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20492) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20493) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20494) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20495) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20496) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20497) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20498) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20499) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20500) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20501) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20502) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20503) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20504) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20505) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20506) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20507) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20508) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20509) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20510) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20511) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20512) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20513) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20514) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20515) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20516) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20517) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20518) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20519) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20520) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20521) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20522) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20523) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20524) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20525) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20526) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20527) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20528) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20529) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20530) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20531) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20532) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20533) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20534) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20535) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20536) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20537) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20538) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20539) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20540) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20541) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20542) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(20543) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(20544) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(20545) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(20546) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(20547) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(20548) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(20549) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(20550) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(20551) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(20552) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(20553) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(20554) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(20555) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(20556) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(20557) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(20558) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(20559) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(20560) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(20561) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(20562) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20563) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20564) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20565) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20566) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20567) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20568) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20569) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20570) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20571) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20572) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20573) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20574) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20575) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20576) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20577) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20578) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20579) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20580) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20581) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20582) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20583) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20584) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20585) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20586) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20587) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20588) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20589) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20590) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20591) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20592) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20593) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20594) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20595) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20596) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20597) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20598) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20599) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20600) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20601) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20602) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20603) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20604) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20605) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20606) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20607) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20608) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20609) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20610) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20611) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20612) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20613) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20614) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20615) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20616) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20617) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20618) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20619) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20620) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20621) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20622) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20623) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20624) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20625) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20626) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20627) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20628) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20629) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20630) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20631) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20632) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20633) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20634) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20635) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20636) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20637) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20638) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20639) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20640) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20641) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20642) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20643) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20644) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20645) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20646) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20647) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20648) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20649) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20650) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20651) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20652) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20653) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20654) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20655) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20656) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20657) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20658) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20659) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20660) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20661) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20662) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20663) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20664) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20665) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20666) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20667) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20668) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20669) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20670) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20671) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20672) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20673) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20674) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20675) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20676) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20677) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20678) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20679) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20680) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20681) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20682) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20683) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20684) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20685) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20686) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20687) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20688) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20689) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20690) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20691) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20692) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20693) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20694) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20695) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20696) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20697) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20698) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20699) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20700) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20701) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20702) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20703) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20704) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20705) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20706) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20707) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20708) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20709) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20710) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20711) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20712) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20713) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20714) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20715) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20716) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20717) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20718) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20719) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20720) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20721) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20722) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20723) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20724) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20725) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20726) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20727) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20728) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20729) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20730) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20731) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20732) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20733) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20734) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20735) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20736) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20737) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20738) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20739) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20740) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20741) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20742) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20743) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20744) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20745) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20746) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20747) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20748) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20749) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20750) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20751) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20752) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20753) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20754) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20755) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20756) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20757) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20758) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20759) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20760) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20761) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20762) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(20763) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(20764) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(20765) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(20766) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(20767) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(20768) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(20769) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(20770) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(20771) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(20772) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(20773) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(20774) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(20775) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(20776) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(20777) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(20778) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(20779) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(20780) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(20781) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(20782) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20783) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20784) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20785) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20786) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20787) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20788) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20789) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20790) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20791) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20792) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20793) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20794) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20795) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20796) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20797) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20798) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20799) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20800) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20801) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20802) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20803) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20804) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20805) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20806) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20807) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20808) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20809) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20810) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20811) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20812) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20813) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20814) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20815) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20816) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20817) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20818) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20819) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20820) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20821) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20822) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20823) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20824) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20825) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20826) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20827) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20828) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20829) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20830) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20831) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20832) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20833) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20834) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20835) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20836) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20837) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20838) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20839) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20840) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20841) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20842) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20843) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20844) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20845) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20846) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20847) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20848) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20849) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20850) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20851) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20852) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20853) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20854) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20855) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20856) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20857) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20858) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20859) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20860) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20861) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20862) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20863) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20864) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20865) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20866) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20867) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20868) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20869) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20870) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20871) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20872) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20873) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20874) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20875) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20876) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20877) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20878) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20879) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20880) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20881) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20882) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20883) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20884) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20885) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20886) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20887) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20888) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20889) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20890) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20891) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20892) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20893) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20894) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20895) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20896) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20897) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20898) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20899) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20900) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20901) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20902) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20903) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20904) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20905) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20906) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20907) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20908) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20909) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20910) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20911) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20912) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20913) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20914) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20915) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20916) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20917) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20918) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20919) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20920) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20921) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20922) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20923) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20924) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20925) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20926) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20927) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20928) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20929) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20930) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20931) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20932) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(20933) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20934) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20935) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20936) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20937) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20938) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20939) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20940) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20941) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(20942) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(20943) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20944) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20945) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20946) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20947) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20948) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20949) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20950) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20951) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(20952) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(20953) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20954) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20955) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20956) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20957) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20958) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20959) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20960) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20961) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(20962) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(20963) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(20964) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20965) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20966) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(20967) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20968) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(20969) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20970) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20971) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(20972) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(20973) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(20974) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(20975) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(20976) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(20977) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(20978) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(20979) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(20980) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(20981) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(20982) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(20983) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(20984) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(20985) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(20986) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(20987) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(20988) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(20989) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(20990) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(20991) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(20992) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(20993) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(20994) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(20995) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(20996) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(20997) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(20998) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(20999) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(21000) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(21001) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(21002) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21003) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21004) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21005) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21006) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21007) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21008) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21009) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21010) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21011) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21012) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21013) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21014) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21015) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21016) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21017) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21018) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21019) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21020) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21021) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21022) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21023) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21024) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21025) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21026) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21027) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21028) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21029) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21030) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21031) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21032) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21033) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21034) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21035) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21036) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21037) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21038) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21039) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21040) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21041) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21042) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21043) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21044) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21045) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21046) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21047) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21048) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21049) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21050) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21051) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21052) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21053) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21054) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21055) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21056) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21057) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21058) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21059) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21060) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21061) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21062) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21063) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21064) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21065) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21066) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21067) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21068) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21069) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21070) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21071) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21072) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21073) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21074) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21075) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21076) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21077) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21078) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21079) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21080) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21081) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21082) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21083) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21084) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21085) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21086) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21087) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21088) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21089) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21090) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21091) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21092) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21093) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21094) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21095) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21096) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21097) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21098) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21099) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21100) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21101) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21102) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21103) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21104) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21105) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21106) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21107) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21108) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21109) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21110) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21111) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21112) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21113) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21114) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21115) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21116) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21117) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21118) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21119) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21120) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21121) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21122) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21123) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21124) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21125) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21126) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21127) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21128) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21129) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21130) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21131) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21132) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21133) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21134) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21135) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21136) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21137) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21138) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21139) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21140) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21141) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21142) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21143) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21144) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21145) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21146) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21147) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21148) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21149) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21150) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21151) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21152) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21153) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21154) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21155) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21156) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21157) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21158) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21159) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21160) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21161) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21162) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21163) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21164) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21165) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21166) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21167) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21168) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21169) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21170) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21171) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21172) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21173) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21174) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21175) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21176) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21177) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21178) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21179) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21180) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21181) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21182) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21183) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21184) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21185) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21186) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21187) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21188) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21189) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21190) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21191) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21192) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21193) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21194) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21195) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21196) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21197) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21198) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21199) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21200) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21201) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21202) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(21203) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(21204) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(21205) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(21206) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(21207) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(21208) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(21209) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(21210) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(21211) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(21212) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(21213) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(21214) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(21215) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(21216) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(21217) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(21218) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(21219) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(21220) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(21221) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(21222) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21223) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21224) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21225) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21226) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21227) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21228) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21229) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21230) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21231) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21232) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21233) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21234) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21235) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21236) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21237) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21238) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21239) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21240) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21241) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21242) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21243) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21244) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21245) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21246) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21247) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21248) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21249) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21250) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21251) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21252) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21253) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21254) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21255) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21256) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21257) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21258) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21259) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21260) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21261) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21262) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21263) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21264) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21265) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21266) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21267) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21268) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21269) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21270) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21271) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21272) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21273) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21274) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21275) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21276) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21277) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21278) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21279) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21280) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21281) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21282) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21283) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21284) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21285) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21286) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21287) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21288) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21289) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21290) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21291) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21292) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21293) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21294) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21295) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21296) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21297) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21298) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21299) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21300) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21301) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21302) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21303) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21304) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21305) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21306) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21307) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21308) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21309) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21310) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21311) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21312) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21313) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21314) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21315) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21316) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21317) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21318) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21319) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21320) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21321) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21322) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21323) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21324) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21325) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21326) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21327) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21328) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21329) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21330) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21331) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21332) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21333) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21334) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21335) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21336) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21337) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21338) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21339) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21340) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21341) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21342) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21343) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21344) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21345) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21346) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21347) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21348) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21349) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21350) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21351) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21352) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21353) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21354) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21355) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21356) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21357) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21358) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21359) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21360) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21361) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21362) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21363) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21364) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21365) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21366) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21367) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21368) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21369) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21370) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21371) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21372) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21373) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21374) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21375) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21376) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21377) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21378) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21379) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21380) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21381) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21382) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21383) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21384) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21385) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21386) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21387) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21388) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21389) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21390) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21391) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21392) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21393) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21394) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21395) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21396) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21397) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21398) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21399) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21400) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21401) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21402) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21403) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21404) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21405) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21406) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21407) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21408) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21409) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21410) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21411) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21412) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21413) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21414) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21415) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21416) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21417) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21418) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21419) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21420) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21421) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21422) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(21423) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(21424) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(21425) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(21426) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(21427) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(21428) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(21429) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(21430) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(21431) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(21432) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(21433) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(21434) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(21435) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(21436) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(21437) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(21438) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(21439) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(21440) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(21441) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(21442) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21443) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21444) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21445) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21446) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21447) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21448) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21449) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21450) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21451) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21452) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21453) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21454) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21455) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21456) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21457) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21458) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21459) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21460) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21461) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21462) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21463) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21464) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21465) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21466) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21467) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21468) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21469) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21470) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21471) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21472) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21473) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21474) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21475) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21476) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21477) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21478) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21479) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21480) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21481) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21482) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21483) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21484) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21485) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21486) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21487) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21488) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21489) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21490) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21491) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21492) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21493) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21494) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21495) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21496) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21497) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21498) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21499) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21500) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21501) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21502) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21503) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21504) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21505) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21506) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21507) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21508) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21509) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21510) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21511) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21512) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21513) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21514) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21515) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21516) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21517) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21518) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21519) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21520) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21521) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21522) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21523) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21524) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21525) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21526) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21527) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21528) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21529) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21530) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21531) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21532) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21533) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21534) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21535) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21536) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21537) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21538) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21539) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21540) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21541) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21542) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21543) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21544) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21545) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21546) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21547) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21548) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21549) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21550) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21551) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21552) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21553) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21554) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21555) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21556) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21557) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21558) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21559) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21560) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21561) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21562) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21563) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21564) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21565) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21566) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21567) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21568) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21569) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21570) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21571) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21572) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21573) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21574) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21575) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21576) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21577) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21578) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21579) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21580) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21581) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21582) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21583) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21584) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21585) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21586) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21587) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21588) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21589) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21590) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21591) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21592) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RemoveEntryId(21593) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21594) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21595) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21596) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21597) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21598) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21599) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21600) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21601) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RemoveEntryId(21602) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RemoveEntryId(21603) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21604) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21605) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21606) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21607) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21608) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21609) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21610) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21611) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RemoveEntryId(21612) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RemoveEntryId(21613) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21614) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21615) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21616) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21617) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21618) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21619) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21620) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21621) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RemoveEntryId(21622) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RemoveEntryId(21623) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RemoveEntryId(21624) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21625) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21626) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RemoveEntryId(21627) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21628) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RemoveEntryId(21629) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21630) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21631) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RemoveEntryId(21632) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RemoveEntryId(21633) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RemoveEntryId(21634) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RemoveEntryId(21635) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RemoveEntryId(21636) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RemoveEntryId(21637) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RemoveEntryId(21638) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RemoveEntryId(21639) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RemoveEntryId(21640) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RemoveEntryId(21641) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RemoveEntryId(21642) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RemoveEntryId(21643) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RemoveEntryId(21644) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RemoveEntryId(21645) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RemoveEntryId(21646) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RemoveEntryId(21647) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RemoveEntryId(21648) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RemoveEntryId(21649) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RemoveEntryId(21650) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RemoveEntryId(21651) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RemoveEntryId(21652) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RemoveEntryId(21653) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RemoveEntryId(21654) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RemoveEntryId(21655) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RemoveEntryId(21656) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RemoveEntryId(21657) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RemoveEntryId(21658) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RemoveEntryId(21659) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RemoveEntryId(21660) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RemoveEntryId(21661) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RemoveEntryId(21662) with Deadline.Uncompressed with ValueFullyCompressed
        }
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