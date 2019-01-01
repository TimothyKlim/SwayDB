
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
sealed abstract class RangeEntryId(override val id: Int) extends EntryId(id)
object RangeEntryId extends EntryFormat {

  override val format: EntryId.Format = RangeEntryId.FormatA

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
              object NoDeadline extends RangeEntryId(16384) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16385) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16386) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16387) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16388) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16389) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16390) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16391) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16392) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16393) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16394) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16395) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16396) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16397) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16398) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16399) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16400) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16401) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16402) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16403) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16404) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16405) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16406) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16407) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16408) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16409) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16410) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16411) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16412) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16413) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16414) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16415) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16416) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16417) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16418) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16419) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16420) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16421) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16422) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16423) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16424) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16425) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16426) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16427) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16428) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16429) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16430) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16431) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16432) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16433) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16434) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16435) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16436) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16437) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16438) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16439) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16440) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16441) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16442) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16443) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16444) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16445) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16446) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16447) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16448) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16449) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16450) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16451) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16452) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16453) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16454) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16455) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16456) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16457) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16458) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16459) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16460) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16461) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16462) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16463) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16464) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16465) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16466) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16467) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16468) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16469) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16470) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16471) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16472) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16473) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16474) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16475) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16476) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16477) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16478) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16479) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16480) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16481) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16482) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16483) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16484) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16485) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16486) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16487) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16488) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16489) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16490) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16491) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16492) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16493) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16494) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16495) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16496) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16497) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16498) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16499) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16500) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16501) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16502) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16503) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16504) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16505) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16506) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16507) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16508) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16509) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16510) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16511) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16512) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16513) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16514) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16515) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16516) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16517) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16518) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16519) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16520) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16521) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16522) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16523) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16524) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16525) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16526) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16527) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16528) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16529) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16530) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16531) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16532) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16533) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16534) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16535) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16536) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16537) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16538) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16539) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16540) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16541) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16542) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16543) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16544) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16545) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16546) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16547) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16548) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16549) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16550) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16551) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16552) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16553) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16554) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16555) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16556) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16557) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16558) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16559) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16560) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16561) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16562) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16563) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16564) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16565) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16566) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16567) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16568) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16569) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16570) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16571) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16572) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16573) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16574) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16575) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16576) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16577) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16578) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16579) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16580) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16581) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16582) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16583) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(16584) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(16585) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(16586) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(16587) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(16588) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(16589) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(16590) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(16591) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(16592) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(16593) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(16594) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(16595) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(16596) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(16597) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(16598) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(16599) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(16600) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(16601) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(16602) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(16603) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(16604) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16605) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16606) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16607) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16608) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16609) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16610) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16611) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16612) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16613) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16614) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16615) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16616) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16617) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16618) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16619) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16620) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16621) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16622) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16623) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16624) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16625) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16626) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16627) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16628) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16629) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16630) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16631) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16632) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16633) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16634) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16635) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16636) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16637) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16638) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16639) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16640) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16641) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16642) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16643) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16644) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16645) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16646) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16647) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16648) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16649) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16650) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16651) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16652) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16653) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16654) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16655) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16656) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16657) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16658) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16659) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16660) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16661) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16662) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16663) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16664) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16665) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16666) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16667) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16668) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16669) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16670) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16671) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16672) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16673) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16674) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16675) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16676) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16677) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16678) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16679) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16680) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16681) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16682) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16683) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16684) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16685) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16686) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16687) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16688) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16689) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16690) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16691) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16692) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16693) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16694) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16695) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16696) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16697) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16698) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16699) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16700) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16701) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16702) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16703) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16704) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16705) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16706) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16707) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16708) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16709) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16710) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16711) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16712) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16713) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16714) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16715) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16716) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16717) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16718) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16719) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16720) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16721) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16722) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16723) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16724) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16725) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16726) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16727) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16728) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16729) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16730) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16731) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16732) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16733) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16734) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16735) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16736) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16737) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16738) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16739) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16740) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16741) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16742) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16743) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16744) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16745) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16746) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16747) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16748) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16749) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16750) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16751) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16752) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16753) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16754) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16755) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16756) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16757) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16758) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16759) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16760) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16761) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16762) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16763) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16764) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16765) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16766) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16767) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16768) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16769) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16770) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16771) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16772) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16773) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16774) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16775) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16776) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16777) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16778) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16779) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16780) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16781) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16782) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16783) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16784) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16785) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16786) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16787) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16788) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16789) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16790) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16791) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16792) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16793) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16794) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16795) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16796) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16797) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16798) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16799) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16800) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16801) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16802) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16803) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(16804) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(16805) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(16806) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(16807) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(16808) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(16809) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(16810) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(16811) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(16812) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(16813) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(16814) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(16815) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(16816) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(16817) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(16818) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(16819) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(16820) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(16821) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(16822) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(16823) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(16824) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16825) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16826) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16827) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16828) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16829) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16830) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16831) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16832) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16833) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16834) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16835) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16836) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16837) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16838) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16839) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16840) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16841) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16842) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16843) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16844) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16845) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16846) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16847) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16848) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16849) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16850) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16851) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16852) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16853) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16854) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16855) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16856) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16857) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16858) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16859) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16860) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16861) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16862) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16863) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16864) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16865) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16866) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16867) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16868) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16869) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16870) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16871) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16872) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16873) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16874) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16875) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16876) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16877) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16878) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16879) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16880) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16881) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16882) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16883) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16884) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16885) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16886) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16887) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16888) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16889) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16890) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16891) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16892) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16893) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16894) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16895) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16896) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16897) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16898) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16899) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16900) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16901) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16902) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16903) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16904) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16905) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16906) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16907) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16908) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16909) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16910) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16911) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16912) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16913) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16914) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16915) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16916) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16917) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16918) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16919) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16920) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16921) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16922) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16923) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16924) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16925) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16926) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16927) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16928) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16929) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16930) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16931) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16932) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16933) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16934) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16935) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16936) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16937) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16938) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16939) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16940) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16941) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16942) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16943) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16944) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16945) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16946) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16947) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16948) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16949) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(16950) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16951) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16952) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(16953) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(16954) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(16955) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16956) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16957) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(16958) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16959) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(16960) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16961) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16962) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(16963) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(16964) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(16965) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(16966) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(16967) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(16968) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(16969) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(16970) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(16971) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(16972) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(16973) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(16974) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(16975) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16976) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16977) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(16978) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16979) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(16980) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16981) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16982) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(16983) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(16984) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(16985) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16986) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16987) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(16988) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16989) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(16990) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(16991) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(16992) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(16993) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(16994) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(16995) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(16996) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(16997) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(16998) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(16999) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17000) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17001) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17002) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17003) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17004) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17005) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17006) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17007) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17008) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17009) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17010) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17011) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17012) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17013) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17014) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17015) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17016) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17017) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17018) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17019) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17020) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17021) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17022) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17023) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(17024) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(17025) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(17026) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(17027) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(17028) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(17029) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(17030) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(17031) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(17032) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(17033) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(17034) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(17035) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(17036) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(17037) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(17038) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(17039) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(17040) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(17041) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(17042) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(17043) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(17044) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17045) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17046) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17047) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17048) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17049) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17050) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17051) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17052) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17053) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17054) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17055) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17056) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17057) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17058) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17059) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17060) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17061) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17062) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17063) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17064) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17065) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17066) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17067) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17068) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17069) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17070) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17071) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17072) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17073) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17074) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17075) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17076) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17077) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17078) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17079) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17080) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17081) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17082) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17083) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17084) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17085) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17086) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17087) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17088) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17089) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17090) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17091) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17092) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17093) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17094) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17095) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17096) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17097) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17098) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17099) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17100) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17101) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17102) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17103) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17104) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17105) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17106) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17107) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17108) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17109) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17110) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17111) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17112) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17113) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17114) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17115) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17116) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17117) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17118) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17119) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17120) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17121) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17122) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17123) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17124) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17125) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17126) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17127) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17128) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17129) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17130) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17131) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17132) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17133) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17134) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17135) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17136) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17137) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17138) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17139) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17140) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17141) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17142) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17143) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17144) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17145) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17146) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17147) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17148) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17149) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17150) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17151) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17152) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17153) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17154) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17155) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17156) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17157) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17158) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17159) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17160) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17161) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17162) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17163) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17164) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17165) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17166) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17167) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17168) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17169) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17170) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17171) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17172) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17173) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17174) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17175) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17176) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17177) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17178) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17179) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17180) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17181) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17182) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17183) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17184) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17185) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17186) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17187) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17188) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17189) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17190) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17191) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17192) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17193) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17194) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17195) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17196) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17197) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17198) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17199) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17200) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17201) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17202) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17203) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17204) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17205) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17206) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17207) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17208) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17209) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17210) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17211) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17212) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17213) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17214) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17215) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17216) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17217) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17218) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17219) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17220) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17221) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17222) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17223) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17224) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17225) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17226) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17227) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17228) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17229) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17230) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17231) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17232) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17233) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17234) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17235) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17236) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17237) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17238) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17239) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17240) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17241) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17242) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17243) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(17244) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(17245) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(17246) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(17247) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(17248) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(17249) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(17250) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(17251) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(17252) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(17253) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(17254) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(17255) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(17256) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(17257) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(17258) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(17259) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(17260) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(17261) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(17262) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(17263) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(17264) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17265) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17266) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17267) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17268) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17269) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17270) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17271) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17272) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17273) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17274) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17275) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17276) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17277) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17278) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17279) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17280) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17281) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17282) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17283) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17284) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17285) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17286) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17287) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17288) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17289) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17290) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17291) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17292) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17293) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17294) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17295) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17296) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17297) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17298) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17299) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17300) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17301) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17302) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17303) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17304) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17305) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17306) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17307) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17308) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17309) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17310) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17311) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17312) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17313) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17314) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17315) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17316) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17317) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17318) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17319) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17320) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17321) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17322) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17323) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17324) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17325) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17326) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17327) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17328) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17329) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17330) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17331) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17332) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17333) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17334) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17335) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17336) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17337) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17338) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17339) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17340) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17341) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17342) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17343) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17344) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17345) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17346) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17347) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17348) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17349) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17350) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17351) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17352) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17353) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17354) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17355) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17356) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17357) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17358) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17359) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17360) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17361) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17362) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17363) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17364) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17365) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17366) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17367) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17368) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17369) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17370) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17371) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17372) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17373) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17374) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17375) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17376) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17377) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17378) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17379) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17380) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17381) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17382) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17383) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17384) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17385) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17386) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17387) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17388) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17389) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17390) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17391) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17392) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17393) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17394) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17395) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17396) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17397) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17398) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17399) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17400) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17401) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17402) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17403) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17404) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17405) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17406) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17407) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17408) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17409) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17410) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17411) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17412) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17413) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17414) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17415) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17416) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17417) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17418) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17419) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17420) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17421) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17422) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17423) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17424) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17425) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17426) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17427) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17428) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17429) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17430) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17431) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17432) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17433) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17434) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17435) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17436) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17437) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17438) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17439) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17440) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17441) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17442) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17443) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17444) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17445) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17446) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17447) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17448) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17449) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17450) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17451) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17452) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17453) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17454) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17455) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17456) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17457) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17458) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17459) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17460) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17461) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17462) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17463) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(17464) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(17465) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(17466) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(17467) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(17468) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(17469) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(17470) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(17471) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(17472) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(17473) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(17474) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(17475) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(17476) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(17477) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(17478) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(17479) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(17480) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(17481) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(17482) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(17483) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(17484) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17485) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17486) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17487) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17488) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17489) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17490) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17491) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17492) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17493) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17494) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17495) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17496) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17497) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17498) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17499) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17500) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17501) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17502) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17503) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17504) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17505) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17506) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17507) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17508) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17509) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17510) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17511) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17512) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17513) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17514) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17515) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17516) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17517) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17518) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17519) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17520) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17521) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17522) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17523) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17524) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17525) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17526) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17527) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17528) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17529) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17530) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17531) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17532) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17533) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17534) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17535) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17536) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17537) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17538) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17539) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17540) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17541) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17542) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17543) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17544) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17545) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17546) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17547) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17548) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17549) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17550) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17551) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17552) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17553) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17554) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17555) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17556) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17557) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17558) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17559) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17560) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17561) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17562) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17563) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17564) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17565) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17566) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17567) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17568) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17569) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17570) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17571) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17572) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17573) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17574) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17575) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17576) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17577) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17578) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17579) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17580) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17581) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17582) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17583) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17584) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17585) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17586) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17587) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17588) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17589) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17590) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17591) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17592) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17593) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17594) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17595) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17596) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17597) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17598) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17599) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17600) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17601) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17602) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17603) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17604) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17605) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17606) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17607) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17608) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17609) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17610) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17611) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17612) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17613) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17614) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17615) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17616) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17617) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17618) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17619) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17620) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17621) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17622) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17623) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17624) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17625) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17626) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17627) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17628) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17629) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17630) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17631) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17632) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17633) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17634) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17635) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17636) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17637) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17638) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17639) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17640) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17641) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17642) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17643) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17644) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17645) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17646) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17647) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17648) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17649) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17650) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17651) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17652) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17653) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17654) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17655) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17656) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17657) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17658) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17659) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17660) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17661) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17662) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17663) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17664) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17665) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17666) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17667) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17668) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17669) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17670) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17671) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17672) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17673) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17674) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17675) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17676) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17677) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17678) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17679) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17680) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17681) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17682) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17683) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(17684) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(17685) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(17686) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(17687) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(17688) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(17689) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(17690) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(17691) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(17692) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(17693) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(17694) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(17695) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(17696) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(17697) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(17698) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(17699) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(17700) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(17701) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(17702) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(17703) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(17704) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17705) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17706) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17707) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17708) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17709) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17710) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17711) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17712) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17713) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17714) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17715) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17716) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17717) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17718) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17719) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17720) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17721) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17722) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17723) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17724) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17725) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17726) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17727) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17728) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17729) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17730) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17731) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17732) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17733) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17734) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17735) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17736) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17737) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17738) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17739) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17740) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17741) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17742) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17743) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17744) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17745) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17746) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17747) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17748) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17749) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17750) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17751) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17752) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17753) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17754) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17755) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17756) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17757) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17758) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17759) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17760) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17761) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17762) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17763) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17764) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17765) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17766) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17767) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17768) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17769) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17770) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17771) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17772) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17773) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17774) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17775) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17776) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17777) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17778) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17779) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17780) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17781) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17782) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17783) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17784) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17785) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17786) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17787) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17788) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17789) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17790) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17791) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17792) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17793) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17794) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17795) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17796) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17797) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17798) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17799) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17800) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17801) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17802) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17803) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17804) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17805) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17806) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17807) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17808) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17809) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17810) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17811) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17812) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17813) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17814) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17815) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17816) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17817) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17818) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17819) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17820) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17821) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17822) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17823) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17824) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17825) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17826) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17827) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17828) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17829) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17830) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17831) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17832) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17833) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17834) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17835) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17836) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17837) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17838) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17839) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17840) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17841) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17842) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17843) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17844) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17845) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17846) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17847) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17848) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17849) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17850) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17851) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17852) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17853) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17854) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17855) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17856) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17857) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17858) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17859) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17860) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17861) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17862) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17863) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17864) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17865) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17866) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17867) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17868) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17869) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17870) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17871) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17872) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17873) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17874) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17875) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17876) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17877) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17878) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17879) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17880) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17881) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17882) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17883) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17884) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17885) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17886) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17887) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17888) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17889) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17890) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17891) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17892) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17893) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17894) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17895) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17896) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17897) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17898) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17899) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17900) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17901) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17902) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17903) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(17904) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(17905) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(17906) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(17907) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(17908) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(17909) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(17910) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(17911) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(17912) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(17913) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(17914) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(17915) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(17916) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(17917) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(17918) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(17919) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(17920) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(17921) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(17922) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(17923) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(17924) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17925) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17926) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17927) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17928) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17929) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17930) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17931) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17932) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17933) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17934) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17935) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17936) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17937) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17938) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17939) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17940) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17941) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17942) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17943) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17944) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17945) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17946) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17947) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17948) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17949) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(17950) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17951) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17952) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(17953) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(17954) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(17955) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17956) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17957) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(17958) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17959) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(17960) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17961) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17962) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(17963) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(17964) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(17965) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(17966) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(17967) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(17968) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(17969) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(17970) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(17971) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(17972) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(17973) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(17974) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(17975) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17976) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17977) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(17978) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17979) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(17980) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17981) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17982) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(17983) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(17984) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(17985) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17986) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17987) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(17988) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17989) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(17990) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(17991) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(17992) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(17993) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(17994) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(17995) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(17996) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(17997) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(17998) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(17999) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18000) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18001) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18002) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18003) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18004) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18005) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18006) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18007) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18008) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18009) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18010) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18011) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18012) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18013) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18014) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18015) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18016) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18017) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18018) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18019) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18020) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18021) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18022) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18023) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18024) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18025) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18026) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18027) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18028) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18029) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18030) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18031) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18032) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18033) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18034) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18035) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18036) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18037) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18038) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18039) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18040) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18041) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18042) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18043) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18044) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18045) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18046) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18047) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18048) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18049) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18050) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18051) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18052) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18053) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18054) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18055) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18056) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18057) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18058) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18059) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18060) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18061) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18062) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18063) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18064) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18065) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18066) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18067) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18068) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18069) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18070) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18071) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18072) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18073) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18074) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18075) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18076) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18077) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18078) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18079) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18080) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18081) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18082) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18083) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18084) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18085) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18086) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18087) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18088) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18089) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18090) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18091) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18092) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18093) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18094) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18095) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18096) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18097) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18098) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18099) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18100) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18101) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18102) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18103) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18104) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18105) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18106) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18107) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18108) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18109) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18110) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18111) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18112) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18113) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18114) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18115) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18116) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18117) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18118) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18119) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18120) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18121) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18122) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18123) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(18124) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(18125) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(18126) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(18127) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(18128) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(18129) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(18130) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(18131) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(18132) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(18133) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(18134) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(18135) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(18136) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(18137) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(18138) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(18139) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(18140) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(18141) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(18142) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(18143) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(18144) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18145) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18146) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18147) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18148) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18149) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18150) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18151) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18152) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18153) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18154) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18155) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18156) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18157) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18158) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18159) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18160) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18161) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18162) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18163) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18164) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18165) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18166) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18167) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18168) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18169) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18170) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18171) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18172) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18173) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18174) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18175) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18176) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18177) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18178) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18179) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18180) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18181) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18182) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18183) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18184) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18185) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18186) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18187) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18188) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18189) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18190) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18191) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18192) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18193) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18194) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18195) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18196) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18197) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18198) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18199) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18200) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18201) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18202) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18203) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18204) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18205) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18206) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18207) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18208) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18209) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18210) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18211) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18212) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18213) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18214) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18215) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18216) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18217) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18218) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18219) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18220) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18221) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18222) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18223) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18224) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18225) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18226) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18227) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18228) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18229) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18230) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18231) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18232) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18233) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18234) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18235) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18236) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18237) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18238) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18239) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18240) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18241) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18242) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18243) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18244) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18245) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18246) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18247) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18248) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18249) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18250) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18251) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18252) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18253) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18254) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18255) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18256) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18257) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18258) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18259) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18260) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18261) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18262) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18263) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18264) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18265) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18266) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18267) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18268) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18269) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18270) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18271) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18272) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18273) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18274) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18275) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18276) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18277) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18278) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18279) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18280) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18281) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18282) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18283) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18284) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18285) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18286) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18287) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18288) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18289) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18290) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18291) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18292) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18293) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18294) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18295) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18296) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18297) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18298) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18299) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18300) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18301) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18302) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18303) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18304) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18305) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18306) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18307) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18308) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18309) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18310) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18311) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18312) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18313) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18314) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18315) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18316) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18317) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18318) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18319) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18320) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18321) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18322) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18323) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18324) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18325) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18326) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18327) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18328) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18329) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18330) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18331) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18332) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18333) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18334) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18335) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18336) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18337) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18338) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18339) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18340) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18341) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18342) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18343) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(18344) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(18345) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(18346) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(18347) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(18348) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(18349) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(18350) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(18351) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(18352) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(18353) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(18354) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(18355) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(18356) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(18357) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(18358) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(18359) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(18360) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(18361) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(18362) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(18363) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(18364) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18365) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18366) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18367) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18368) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18369) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18370) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18371) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18372) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18373) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18374) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18375) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18376) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18377) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18378) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18379) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18380) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18381) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18382) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18383) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18384) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18385) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18386) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18387) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18388) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18389) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18390) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18391) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18392) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18393) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18394) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18395) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18396) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18397) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18398) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18399) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18400) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18401) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18402) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18403) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18404) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18405) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18406) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18407) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18408) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18409) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18410) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18411) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18412) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18413) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18414) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18415) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18416) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18417) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18418) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18419) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18420) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18421) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18422) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18423) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18424) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18425) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18426) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18427) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18428) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18429) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18430) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18431) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18432) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18433) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18434) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18435) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18436) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18437) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18438) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18439) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18440) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18441) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18442) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18443) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18444) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18445) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18446) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18447) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18448) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18449) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18450) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18451) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18452) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18453) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18454) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18455) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18456) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18457) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18458) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18459) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18460) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18461) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18462) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18463) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18464) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18465) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18466) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18467) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18468) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18469) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18470) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18471) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18472) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18473) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18474) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18475) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18476) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18477) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18478) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18479) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18480) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18481) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18482) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18483) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18484) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18485) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18486) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18487) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18488) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18489) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18490) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18491) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18492) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18493) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18494) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18495) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18496) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18497) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18498) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18499) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18500) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18501) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18502) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18503) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18504) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18505) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18506) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18507) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18508) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18509) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18510) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18511) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18512) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18513) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18514) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18515) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18516) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18517) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18518) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18519) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18520) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18521) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18522) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18523) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18524) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18525) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18526) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18527) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18528) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18529) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18530) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18531) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18532) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18533) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18534) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18535) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18536) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18537) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18538) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18539) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18540) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18541) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18542) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18543) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18544) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18545) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18546) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18547) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18548) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18549) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18550) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18551) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18552) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18553) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18554) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18555) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18556) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18557) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18558) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18559) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18560) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18561) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18562) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18563) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(18564) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(18565) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(18566) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(18567) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(18568) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(18569) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(18570) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(18571) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(18572) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(18573) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(18574) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(18575) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(18576) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(18577) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(18578) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(18579) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(18580) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(18581) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(18582) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(18583) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(18584) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18585) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18586) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18587) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18588) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18589) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18590) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18591) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18592) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18593) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18594) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18595) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18596) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18597) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18598) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18599) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18600) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18601) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18602) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18603) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18604) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18605) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18606) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18607) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18608) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18609) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18610) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18611) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18612) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18613) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18614) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18615) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18616) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18617) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18618) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18619) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18620) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18621) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18622) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18623) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18624) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18625) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18626) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18627) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18628) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18629) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18630) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18631) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18632) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18633) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18634) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18635) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18636) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18637) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18638) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18639) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18640) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18641) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18642) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18643) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18644) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18645) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18646) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18647) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18648) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18649) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18650) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18651) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18652) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18653) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18654) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18655) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18656) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18657) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18658) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18659) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18660) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18661) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18662) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18663) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18664) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18665) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18666) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18667) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18668) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18669) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18670) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18671) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18672) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18673) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18674) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18675) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18676) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18677) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18678) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18679) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18680) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18681) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18682) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18683) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18684) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18685) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18686) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18687) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18688) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18689) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18690) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18691) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18692) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18693) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18694) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18695) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18696) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18697) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18698) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18699) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18700) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18701) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18702) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18703) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18704) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18705) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18706) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18707) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18708) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18709) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18710) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18711) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18712) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18713) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18714) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18715) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18716) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18717) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18718) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18719) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18720) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18721) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18722) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18723) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18724) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18725) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18726) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18727) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18728) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18729) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18730) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18731) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18732) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18733) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18734) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18735) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18736) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18737) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18738) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18739) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18740) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18741) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18742) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18743) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18744) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18745) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18746) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18747) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18748) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18749) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18750) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18751) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18752) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18753) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18754) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18755) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18756) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18757) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18758) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18759) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18760) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18761) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18762) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18763) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18764) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18765) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18766) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18767) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18768) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18769) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18770) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18771) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18772) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18773) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18774) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18775) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18776) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18777) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18778) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18779) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18780) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18781) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18782) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18783) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(18784) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(18785) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(18786) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(18787) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(18788) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(18789) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(18790) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(18791) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(18792) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(18793) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(18794) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(18795) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(18796) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(18797) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(18798) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(18799) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(18800) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(18801) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(18802) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(18803) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends RangeEntryId(18804) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18805) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18806) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18807) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18808) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18809) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18810) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18811) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18812) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18813) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18814) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18815) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18816) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18817) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18818) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18819) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18820) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18821) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18822) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18823) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18824) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18825) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18826) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18827) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18828) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18829) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18830) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18831) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18832) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18833) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18834) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18835) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18836) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18837) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18838) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18839) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18840) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18841) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18842) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18843) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18844) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18845) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18846) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18847) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18848) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18849) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18850) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18851) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18852) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18853) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18854) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18855) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18856) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18857) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18858) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18859) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18860) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18861) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18862) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18863) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18864) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18865) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18866) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18867) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18868) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18869) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18870) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18871) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18872) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18873) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18874) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18875) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18876) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18877) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18878) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18879) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18880) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18881) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18882) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18883) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18884) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18885) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18886) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18887) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18888) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18889) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18890) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18891) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18892) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18893) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18894) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18895) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18896) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18897) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18898) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18899) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18900) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18901) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18902) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18903) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18904) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18905) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18906) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18907) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18908) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18909) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18910) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18911) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18912) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18913) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18914) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18915) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18916) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18917) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18918) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18919) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18920) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18921) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18922) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18923) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18924) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18925) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18926) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18927) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18928) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18929) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18930) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18931) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18932) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18933) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18934) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18935) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18936) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18937) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18938) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18939) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18940) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18941) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18942) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18943) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18944) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18945) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18946) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18947) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18948) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18949) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(18950) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(18951) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(18952) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(18953) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends RangeEntryId(18954) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends RangeEntryId(18955) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18956) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18957) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends RangeEntryId(18958) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18959) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends RangeEntryId(18960) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18961) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18962) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends RangeEntryId(18963) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends RangeEntryId(18964) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends RangeEntryId(18965) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18966) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18967) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends RangeEntryId(18968) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18969) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends RangeEntryId(18970) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18971) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18972) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends RangeEntryId(18973) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends RangeEntryId(18974) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends RangeEntryId(18975) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18976) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18977) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends RangeEntryId(18978) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18979) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends RangeEntryId(18980) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18981) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18982) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends RangeEntryId(18983) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends RangeEntryId(18984) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends RangeEntryId(18985) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends RangeEntryId(18986) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends RangeEntryId(18987) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends RangeEntryId(18988) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends RangeEntryId(18989) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends RangeEntryId(18990) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends RangeEntryId(18991) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends RangeEntryId(18992) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends RangeEntryId(18993) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends RangeEntryId(18994) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends RangeEntryId(18995) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends RangeEntryId(18996) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends RangeEntryId(18997) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends RangeEntryId(18998) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends RangeEntryId(18999) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends RangeEntryId(19000) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends RangeEntryId(19001) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends RangeEntryId(19002) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends RangeEntryId(19003) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends RangeEntryId(19004) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends RangeEntryId(19005) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends RangeEntryId(19006) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends RangeEntryId(19007) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends RangeEntryId(19008) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends RangeEntryId(19009) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends RangeEntryId(19010) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends RangeEntryId(19011) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends RangeEntryId(19012) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends RangeEntryId(19013) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends RangeEntryId(19014) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends RangeEntryId(19015) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends RangeEntryId(19016) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends RangeEntryId(19017) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends RangeEntryId(19018) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends RangeEntryId(19019) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends RangeEntryId(19020) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends RangeEntryId(19021) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends RangeEntryId(19022) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends RangeEntryId(19023) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }
    }
  }

  override def keyIdsList: List[RangeEntryId] = SealedList.list[RangeEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}