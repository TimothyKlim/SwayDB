
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
sealed abstract class GroupEntryId(override val id: Int) extends EntryId(id)
object GroupEntryId extends EntryFormat {

  override val format: EntryId.Format = GroupEntryId.FormatA

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
              object NoDeadline extends GroupEntryId(2639) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(2640) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2641) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2642) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(2643) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2644) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(2645) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2646) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2647) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(2648) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(2649) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(2650) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2651) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2652) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(2653) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2654) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(2655) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2656) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2657) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(2658) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(2659) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(2660) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2661) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2662) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(2663) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2664) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(2665) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2666) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2667) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(2668) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(2669) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(2670) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2671) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2672) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(2673) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2674) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(2675) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2676) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2677) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(2678) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(2679) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(2680) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(2681) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(2682) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(2683) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(2684) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(2685) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(2686) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(2687) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(2688) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(2689) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(2690) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2691) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2692) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(2693) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2694) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(2695) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2696) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2697) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(2698) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(2699) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(2700) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2701) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2702) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(2703) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2704) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(2705) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2706) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2707) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(2708) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(2709) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(2710) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2711) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2712) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(2713) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2714) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(2715) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2716) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2717) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(2718) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(2719) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(2720) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2721) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2722) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(2723) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2724) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(2725) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2726) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2727) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(2728) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(2729) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(2730) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(2731) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(2732) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(2733) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(2734) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(2735) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(2736) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(2737) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(2738) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(2739) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(2740) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2741) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2742) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(2743) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2744) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(2745) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2746) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2747) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(2748) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(2749) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(2750) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2751) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2752) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(2753) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2754) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(2755) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2756) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2757) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(2758) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(2759) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(2760) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2761) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2762) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(2763) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2764) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(2765) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2766) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2767) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(2768) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(2769) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(2770) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2771) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2772) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(2773) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2774) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(2775) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2776) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2777) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(2778) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(2779) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(2780) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(2781) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(2782) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(2783) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(2784) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(2785) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(2786) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(2787) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(2788) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(2789) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(2790) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2791) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2792) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(2793) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2794) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(2795) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2796) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2797) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(2798) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(2799) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(2800) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2801) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2802) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(2803) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2804) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(2805) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2806) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2807) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(2808) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(2809) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(2810) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2811) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2812) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(2813) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2814) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(2815) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2816) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2817) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(2818) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(2819) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(2820) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2821) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2822) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(2823) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2824) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(2825) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2826) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2827) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(2828) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(2829) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(2830) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(2831) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(2832) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(2833) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(2834) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(2835) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(2836) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(2837) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(2838) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(2839) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(2840) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(2841) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(2842) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(2843) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(2844) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(2845) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(2846) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(2847) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(2848) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(2849) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(2850) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(2851) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(2852) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(2853) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(2854) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(2855) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(2856) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(2857) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(2858) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(2859) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(2860) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2861) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2862) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(2863) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2864) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(2865) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2866) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2867) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(2868) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(2869) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(2870) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2871) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2872) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(2873) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2874) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(2875) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2876) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2877) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(2878) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(2879) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(2880) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2881) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2882) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(2883) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2884) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(2885) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2886) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2887) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(2888) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(2889) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(2890) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2891) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2892) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(2893) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2894) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(2895) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2896) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2897) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(2898) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(2899) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(2900) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(2901) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(2902) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(2903) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(2904) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(2905) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(2906) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(2907) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(2908) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(2909) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(2910) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2911) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2912) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(2913) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2914) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(2915) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2916) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2917) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(2918) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(2919) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(2920) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2921) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2922) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(2923) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2924) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(2925) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2926) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2927) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(2928) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(2929) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(2930) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2931) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2932) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(2933) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2934) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(2935) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2936) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2937) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(2938) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(2939) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(2940) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2941) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2942) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(2943) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2944) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(2945) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2946) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2947) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(2948) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(2949) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(2950) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(2951) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(2952) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(2953) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(2954) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(2955) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(2956) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(2957) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(2958) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(2959) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(2960) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2961) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2962) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(2963) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2964) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(2965) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2966) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2967) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(2968) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(2969) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(2970) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2971) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2972) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(2973) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2974) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(2975) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2976) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2977) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(2978) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(2979) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(2980) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2981) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2982) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(2983) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2984) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(2985) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2986) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2987) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(2988) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(2989) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(2990) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(2991) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(2992) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(2993) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(2994) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(2995) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(2996) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(2997) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(2998) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(2999) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3000) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3001) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3002) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3003) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3004) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3005) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3006) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3007) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3008) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3009) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3010) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3011) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3012) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3013) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3014) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3015) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3016) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3017) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3018) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3019) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3020) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3021) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3022) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3023) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3024) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3025) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3026) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3027) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3028) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3029) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3030) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3031) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3032) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3033) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3034) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3035) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3036) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3037) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3038) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3039) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3040) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3041) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3042) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3043) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3044) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3045) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3046) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3047) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3048) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3049) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3050) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3051) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3052) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3053) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3054) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3055) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3056) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3057) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3058) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(3059) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(3060) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(3061) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(3062) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(3063) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(3064) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(3065) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(3066) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(3067) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(3068) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(3069) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(3070) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(3071) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(3072) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(3073) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(3074) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(3075) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(3076) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(3077) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(3078) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(3079) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3080) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3081) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3082) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3083) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3084) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3085) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3086) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3087) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3088) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3089) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3090) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3091) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3092) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3093) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3094) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3095) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3096) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3097) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3098) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3099) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3100) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3101) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3102) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3103) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3104) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3105) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3106) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3107) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3108) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3109) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3110) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3111) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3112) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3113) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3114) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3115) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3116) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3117) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3118) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3119) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3120) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3121) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3122) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3123) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3124) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3125) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3126) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3127) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3128) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3129) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3130) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3131) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3132) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3133) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3134) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3135) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3136) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3137) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3138) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3139) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3140) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3141) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3142) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3143) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3144) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3145) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3146) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3147) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3148) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3149) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3150) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3151) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3152) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3153) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3154) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3155) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3156) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3157) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3158) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3159) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3160) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3161) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3162) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3163) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3164) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3165) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3166) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3167) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3168) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3169) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3170) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3171) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3172) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3173) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3174) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3175) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3176) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3177) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3178) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3179) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3180) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3181) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3182) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3183) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3184) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3185) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3186) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3187) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3188) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3189) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3190) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3191) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3192) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3193) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3194) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3195) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3196) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3197) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3198) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3199) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3200) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3201) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3202) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3203) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3204) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3205) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3206) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3207) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3208) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3209) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3210) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3211) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3212) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3213) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3214) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3215) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3216) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3217) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3218) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3219) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3220) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3221) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3222) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3223) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3224) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3225) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3226) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3227) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3228) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3229) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3230) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3231) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3232) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3233) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3234) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3235) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3236) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3237) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3238) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3239) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3240) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3241) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3242) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3243) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3244) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3245) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3246) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3247) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3248) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3249) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3250) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3251) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3252) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3253) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3254) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3255) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3256) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3257) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3258) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3259) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3260) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3261) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3262) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3263) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3264) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3265) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3266) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3267) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3268) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3269) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3270) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3271) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3272) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3273) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3274) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3275) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3276) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3277) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3278) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(3279) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(3280) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(3281) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(3282) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(3283) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(3284) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(3285) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(3286) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(3287) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(3288) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(3289) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(3290) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(3291) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(3292) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(3293) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(3294) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(3295) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(3296) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(3297) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(3298) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(3299) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3300) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3301) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3302) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3303) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3304) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3305) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3306) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3307) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3308) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3309) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3310) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3311) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3312) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3313) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3314) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3315) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3316) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3317) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3318) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3319) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3320) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3321) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3322) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3323) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3324) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3325) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3326) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3327) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3328) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3329) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3330) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3331) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3332) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3333) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3334) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3335) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3336) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3337) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3338) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3339) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3340) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3341) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3342) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3343) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3344) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3345) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3346) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3347) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3348) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3349) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3350) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3351) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3352) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3353) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3354) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3355) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3356) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3357) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3358) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3359) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3360) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3361) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3362) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3363) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3364) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3365) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3366) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3367) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3368) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3369) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3370) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3371) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3372) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3373) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3374) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3375) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3376) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3377) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3378) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3379) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3380) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3381) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3382) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3383) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3384) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3385) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3386) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3387) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3388) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3389) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3390) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3391) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3392) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3393) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3394) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3395) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3396) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3397) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3398) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3399) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3400) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3401) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3402) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3403) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3404) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3405) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3406) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3407) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3408) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3409) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3410) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3411) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3412) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3413) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3414) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3415) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3416) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3417) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3418) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3419) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3420) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3421) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3422) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3423) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3424) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3425) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3426) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3427) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3428) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3429) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3430) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3431) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3432) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3433) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3434) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3435) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3436) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3437) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3438) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3439) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3440) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3441) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3442) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3443) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3444) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3445) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3446) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3447) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3448) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3449) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3450) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3451) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3452) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3453) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3454) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3455) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3456) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3457) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3458) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3459) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3460) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3461) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3462) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3463) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3464) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3465) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3466) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3467) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3468) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3469) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3470) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3471) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3472) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3473) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3474) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3475) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3476) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3477) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3478) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3479) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3480) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3481) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3482) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3483) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3484) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3485) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3486) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3487) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3488) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3489) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3490) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3491) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3492) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3493) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3494) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3495) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3496) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3497) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3498) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(3499) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(3500) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(3501) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(3502) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(3503) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(3504) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(3505) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(3506) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(3507) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(3508) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(3509) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(3510) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(3511) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(3512) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(3513) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(3514) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(3515) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(3516) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(3517) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(3518) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(3519) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3520) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3521) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3522) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3523) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3524) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3525) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3526) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3527) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3528) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3529) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3530) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3531) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3532) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3533) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3534) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3535) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3536) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3537) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3538) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3539) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3540) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3541) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3542) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3543) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3544) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3545) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3546) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3547) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3548) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3549) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3550) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3551) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3552) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3553) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3554) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3555) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3556) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3557) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3558) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3559) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3560) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3561) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3562) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3563) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3564) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3565) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3566) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3567) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3568) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3569) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3570) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3571) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3572) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3573) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3574) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3575) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3576) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3577) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3578) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3579) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3580) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3581) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3582) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3583) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3584) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3585) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3586) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3587) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3588) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3589) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3590) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3591) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3592) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3593) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3594) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3595) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3596) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3597) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3598) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3599) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3600) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3601) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3602) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3603) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3604) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3605) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3606) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3607) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3608) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3609) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3610) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3611) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3612) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3613) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3614) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3615) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3616) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3617) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3618) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3619) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3620) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3621) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3622) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3623) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3624) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3625) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3626) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3627) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3628) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3629) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3630) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3631) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3632) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3633) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3634) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3635) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3636) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3637) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3638) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3639) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3640) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3641) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3642) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3643) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3644) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3645) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3646) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3647) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3648) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3649) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3650) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3651) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3652) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3653) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3654) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3655) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3656) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3657) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3658) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3659) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3660) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3661) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3662) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3663) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3664) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3665) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3666) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3667) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3668) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3669) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3670) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3671) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3672) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3673) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3674) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3675) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3676) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3677) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3678) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3679) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3680) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3681) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3682) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3683) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3684) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3685) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3686) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3687) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3688) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3689) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3690) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3691) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3692) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3693) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3694) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3695) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3696) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3697) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3698) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3699) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3700) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3701) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3702) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3703) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3704) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3705) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3706) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3707) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3708) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3709) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3710) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3711) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3712) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3713) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3714) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3715) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3716) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3717) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3718) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(3719) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(3720) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(3721) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(3722) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(3723) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(3724) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(3725) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(3726) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(3727) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(3728) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(3729) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(3730) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(3731) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(3732) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(3733) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(3734) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(3735) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(3736) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(3737) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(3738) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(3739) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3740) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3741) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3742) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3743) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3744) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3745) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3746) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3747) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3748) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3749) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3750) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3751) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3752) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3753) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3754) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3755) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3756) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3757) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3758) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3759) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3760) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3761) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3762) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3763) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3764) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3765) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3766) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3767) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3768) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3769) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3770) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3771) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3772) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3773) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3774) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3775) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3776) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3777) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3778) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3779) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3780) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3781) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3782) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3783) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3784) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3785) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3786) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3787) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3788) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3789) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3790) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3791) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3792) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3793) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3794) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3795) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3796) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3797) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3798) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3799) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3800) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3801) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3802) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3803) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3804) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3805) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3806) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3807) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3808) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3809) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3810) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3811) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3812) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3813) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3814) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3815) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3816) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3817) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3818) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3819) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3820) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3821) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3822) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3823) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3824) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3825) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3826) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3827) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3828) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3829) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3830) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3831) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3832) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3833) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3834) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3835) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3836) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3837) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3838) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3839) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3840) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3841) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3842) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3843) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3844) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3845) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3846) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3847) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3848) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3849) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3850) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3851) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3852) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3853) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3854) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3855) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3856) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3857) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3858) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3859) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3860) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3861) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3862) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3863) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3864) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3865) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3866) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3867) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3868) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3869) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3870) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3871) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3872) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3873) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3874) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3875) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3876) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3877) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3878) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3879) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3880) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3881) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3882) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3883) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3884) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3885) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3886) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3887) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3888) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(3889) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3890) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3891) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3892) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3893) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3894) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3895) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3896) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3897) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3898) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3899) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3900) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3901) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3902) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3903) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3904) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3905) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3906) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3907) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3908) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3909) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3910) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3911) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3912) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3913) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3914) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3915) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3916) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3917) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3918) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3919) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3920) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3921) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3922) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3923) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3924) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3925) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3926) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3927) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3928) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3929) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(3930) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(3931) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(3932) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(3933) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(3934) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(3935) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(3936) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(3937) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(3938) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(3939) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(3940) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(3941) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(3942) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(3943) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(3944) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(3945) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(3946) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(3947) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(3948) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(3949) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(3950) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(3951) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(3952) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(3953) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(3954) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(3955) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(3956) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(3957) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(3958) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(3959) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(3960) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3961) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3962) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(3963) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3964) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(3965) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3966) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3967) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(3968) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(3969) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(3970) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3971) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3972) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(3973) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3974) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(3975) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3976) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3977) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(3978) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(3979) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(3980) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3981) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3982) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(3983) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3984) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(3985) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3986) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3987) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(3988) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(3989) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(3990) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(3991) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(3992) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(3993) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(3994) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(3995) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(3996) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(3997) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(3998) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(3999) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4000) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4001) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4002) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4003) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4004) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4005) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4006) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4007) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4008) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4009) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4010) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4011) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4012) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4013) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4014) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4015) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4016) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4017) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4018) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4019) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4020) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4021) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4022) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4023) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4024) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4025) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4026) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4027) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4028) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4029) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4030) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4031) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4032) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4033) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4034) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4035) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4036) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4037) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4038) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4039) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4040) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4041) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4042) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4043) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4044) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4045) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4046) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4047) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4048) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4049) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4050) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4051) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4052) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4053) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4054) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4055) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4056) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4057) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4058) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4059) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4060) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4061) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4062) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4063) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4064) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4065) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4066) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4067) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4068) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4069) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4070) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4071) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4072) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4073) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4074) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4075) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4076) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4077) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4078) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4079) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4080) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4081) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4082) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4083) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4084) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4085) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4086) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4087) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4088) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4089) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4090) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4091) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4092) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4093) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4094) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4095) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4096) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4097) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4098) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4099) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4100) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4101) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4102) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4103) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4104) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4105) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4106) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4107) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4108) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4109) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4110) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4111) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4112) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4113) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4114) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4115) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4116) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4117) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4118) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4119) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4120) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4121) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4122) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4123) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4124) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4125) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4126) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4127) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4128) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4129) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4130) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4131) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4132) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4133) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4134) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4135) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4136) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4137) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4138) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4139) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4140) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4141) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4142) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4143) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4144) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4145) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4146) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4147) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4148) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4149) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4150) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4151) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4152) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4153) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4154) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4155) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4156) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4157) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4158) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(4159) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(4160) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(4161) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(4162) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(4163) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(4164) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(4165) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(4166) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(4167) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(4168) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(4169) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(4170) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(4171) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(4172) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(4173) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(4174) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(4175) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(4176) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(4177) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(4178) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(4179) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4180) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4181) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4182) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4183) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4184) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4185) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4186) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4187) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4188) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4189) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4190) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4191) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4192) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4193) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4194) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4195) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4196) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4197) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4198) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4199) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4200) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4201) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4202) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4203) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4204) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4205) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4206) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4207) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4208) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4209) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4210) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4211) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4212) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4213) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4214) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4215) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4216) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4217) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4218) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4219) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4220) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4221) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4222) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4223) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4224) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4225) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4226) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4227) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4228) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4229) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4230) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4231) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4232) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4233) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4234) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4235) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4236) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4237) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4238) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4239) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4240) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4241) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4242) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4243) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4244) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4245) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4246) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4247) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4248) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4249) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4250) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4251) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4252) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4253) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4254) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4255) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4256) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4257) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4258) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4259) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4260) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4261) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4262) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4263) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4264) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4265) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4266) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4267) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4268) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4269) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4270) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4271) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4272) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4273) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4274) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4275) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4276) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4277) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4278) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4279) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4280) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4281) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4282) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4283) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4284) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4285) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4286) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4287) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4288) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4289) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4290) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4291) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4292) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4293) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4294) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4295) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4296) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4297) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4298) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4299) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4300) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4301) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4302) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4303) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4304) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4305) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4306) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4307) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4308) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4309) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4310) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4311) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4312) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4313) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4314) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4315) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4316) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4317) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4318) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4319) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4320) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4321) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4322) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4323) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4324) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4325) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4326) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4327) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4328) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4329) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4330) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4331) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4332) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4333) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4334) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4335) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4336) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4337) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4338) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4339) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4340) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4341) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4342) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4343) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4344) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4345) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4346) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4347) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4348) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4349) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4350) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4351) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4352) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4353) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4354) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4355) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4356) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4357) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4358) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4359) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4360) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4361) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4362) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4363) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4364) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4365) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4366) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4367) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4368) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4369) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4370) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4371) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4372) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4373) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4374) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4375) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4376) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4377) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4378) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(4379) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(4380) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(4381) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(4382) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(4383) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(4384) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(4385) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(4386) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(4387) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(4388) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(4389) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(4390) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(4391) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(4392) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(4393) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(4394) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(4395) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(4396) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(4397) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(4398) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(4399) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4400) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4401) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4402) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4403) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4404) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4405) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4406) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4407) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4408) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4409) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4410) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4411) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4412) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4413) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4414) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4415) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4416) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4417) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4418) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4419) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4420) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4421) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4422) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4423) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4424) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4425) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4426) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4427) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4428) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4429) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4430) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4431) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4432) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4433) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4434) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4435) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4436) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4437) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4438) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4439) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4440) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4441) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4442) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4443) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4444) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4445) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4446) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4447) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4448) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4449) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4450) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4451) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4452) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4453) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4454) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4455) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4456) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4457) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4458) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4459) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4460) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4461) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4462) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4463) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4464) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4465) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4466) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4467) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4468) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4469) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4470) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4471) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4472) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4473) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4474) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4475) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4476) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4477) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4478) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4479) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4480) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4481) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4482) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4483) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4484) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4485) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4486) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4487) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4488) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4489) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4490) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4491) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4492) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4493) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4494) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4495) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4496) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4497) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4498) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4499) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4500) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4501) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4502) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4503) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4504) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4505) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4506) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4507) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4508) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4509) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4510) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4511) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4512) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4513) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4514) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4515) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4516) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4517) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4518) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4519) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4520) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4521) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4522) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4523) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4524) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4525) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4526) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4527) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4528) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4529) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4530) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4531) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4532) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4533) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4534) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4535) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4536) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4537) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4538) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4539) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4540) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4541) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4542) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4543) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4544) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4545) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4546) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4547) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4548) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4549) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4550) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4551) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4552) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4553) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4554) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4555) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4556) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4557) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4558) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4559) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4560) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4561) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4562) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4563) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4564) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4565) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4566) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4567) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4568) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4569) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4570) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4571) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4572) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4573) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4574) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4575) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4576) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4577) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4578) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4579) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4580) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4581) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4582) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4583) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4584) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4585) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4586) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4587) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4588) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4589) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4590) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4591) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4592) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4593) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4594) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4595) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4596) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4597) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4598) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(4599) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(4600) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(4601) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(4602) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(4603) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(4604) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(4605) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(4606) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(4607) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(4608) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(4609) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(4610) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(4611) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(4612) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(4613) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(4614) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(4615) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(4616) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(4617) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(4618) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(4619) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4620) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4621) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4622) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4623) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4624) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4625) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4626) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4627) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4628) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4629) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4630) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4631) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4632) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4633) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4634) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4635) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4636) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4637) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4638) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4639) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4640) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4641) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4642) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4643) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4644) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4645) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4646) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4647) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4648) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4649) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4650) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4651) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4652) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4653) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4654) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4655) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4656) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4657) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4658) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4659) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4660) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4661) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4662) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4663) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4664) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4665) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4666) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4667) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4668) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4669) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4670) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4671) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4672) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4673) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4674) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4675) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4676) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4677) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4678) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4679) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4680) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4681) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4682) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4683) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4684) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4685) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4686) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4687) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4688) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4689) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4690) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4691) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4692) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4693) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4694) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4695) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4696) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4697) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4698) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4699) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4700) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4701) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4702) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4703) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4704) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4705) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4706) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4707) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4708) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4709) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4710) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4711) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4712) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4713) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4714) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4715) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4716) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4717) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4718) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4719) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4720) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4721) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4722) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4723) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4724) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4725) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4726) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4727) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4728) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4729) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4730) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4731) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4732) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4733) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4734) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4735) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4736) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4737) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4738) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4739) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4740) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4741) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4742) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4743) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4744) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4745) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4746) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4747) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4748) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4749) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4750) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4751) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4752) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4753) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4754) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4755) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4756) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4757) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4758) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4759) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4760) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4761) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4762) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4763) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4764) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4765) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4766) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4767) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4768) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4769) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4770) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4771) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4772) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4773) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4774) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4775) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4776) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4777) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4778) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4779) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4780) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4781) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4782) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4783) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4784) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4785) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4786) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4787) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4788) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4789) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4790) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4791) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4792) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4793) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4794) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4795) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4796) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4797) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4798) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4799) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4800) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4801) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4802) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4803) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4804) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4805) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4806) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4807) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4808) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4809) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4810) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4811) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4812) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4813) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4814) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4815) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4816) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4817) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4818) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(4819) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(4820) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(4821) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(4822) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(4823) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(4824) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(4825) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(4826) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(4827) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(4828) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(4829) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(4830) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(4831) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(4832) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(4833) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(4834) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(4835) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(4836) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(4837) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(4838) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(4839) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4840) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4841) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4842) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4843) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4844) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4845) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4846) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4847) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4848) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4849) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4850) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4851) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4852) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4853) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4854) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4855) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4856) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4857) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4858) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4859) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4860) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4861) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4862) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4863) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4864) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4865) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4866) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4867) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4868) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4869) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4870) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4871) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4872) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4873) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4874) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4875) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4876) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4877) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4878) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4879) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4880) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4881) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4882) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4883) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4884) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4885) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4886) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4887) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4888) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4889) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4890) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4891) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4892) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4893) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4894) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4895) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4896) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4897) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4898) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4899) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4900) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4901) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4902) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4903) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4904) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4905) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4906) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4907) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4908) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4909) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4910) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4911) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4912) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4913) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4914) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4915) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4916) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4917) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4918) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4919) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4920) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4921) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4922) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4923) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4924) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4925) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4926) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4927) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4928) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4929) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4930) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4931) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4932) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4933) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4934) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4935) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4936) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4937) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4938) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4939) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4940) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4941) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4942) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4943) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4944) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4945) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4946) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4947) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4948) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4949) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(4950) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4951) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4952) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(4953) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4954) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(4955) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4956) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4957) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(4958) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(4959) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(4960) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4961) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4962) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(4963) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4964) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(4965) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4966) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4967) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(4968) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(4969) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(4970) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4971) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4972) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(4973) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4974) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(4975) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4976) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4977) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(4978) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(4979) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(4980) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(4981) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(4982) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(4983) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(4984) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(4985) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(4986) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(4987) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(4988) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(4989) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(4990) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(4991) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(4992) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(4993) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(4994) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(4995) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(4996) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(4997) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(4998) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(4999) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(5000) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5001) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5002) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(5003) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5004) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(5005) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5006) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5007) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(5008) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(5009) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(5010) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5011) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5012) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(5013) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5014) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(5015) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5016) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5017) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(5018) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(5019) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(5020) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5021) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5022) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(5023) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5024) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(5025) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5026) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5027) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(5028) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(5029) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(5030) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(5031) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(5032) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(5033) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(5034) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(5035) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(5036) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(5037) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(5038) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(5039) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(5040) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(5041) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(5042) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(5043) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(5044) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(5045) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(5046) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(5047) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(5048) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(5049) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(5050) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(5051) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(5052) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(5053) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(5054) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(5055) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(5056) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(5057) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(5058) with Deadline.Uncompressed with ValueFullyCompressed
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
              object NoDeadline extends GroupEntryId(5059) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(5060) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5061) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5062) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(5063) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5064) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(5065) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5066) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5067) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(5068) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(5069) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(5070) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5071) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5072) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(5073) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5074) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(5075) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5076) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5077) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(5078) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(5079) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(5080) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5081) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5082) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(5083) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5084) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(5085) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5086) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5087) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(5088) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(5089) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(5090) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5091) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5092) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(5093) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5094) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(5095) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5096) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5097) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(5098) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(5099) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(5100) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(5101) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(5102) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(5103) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(5104) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(5105) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(5106) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(5107) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(5108) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(5109) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(5110) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5111) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5112) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(5113) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5114) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(5115) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5116) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5117) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(5118) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(5119) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(5120) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5121) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5122) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(5123) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5124) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(5125) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5126) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5127) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(5128) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(5129) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(5130) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5131) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5132) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(5133) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5134) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(5135) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5136) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5137) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(5138) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(5139) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(5140) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5141) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5142) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(5143) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5144) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(5145) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5146) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5147) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(5148) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(5149) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(5150) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(5151) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(5152) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(5153) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(5154) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(5155) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(5156) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(5157) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(5158) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(5159) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(5160) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5161) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5162) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(5163) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5164) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(5165) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5166) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5167) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(5168) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(5169) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(5170) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5171) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5172) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(5173) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5174) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(5175) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5176) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5177) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(5178) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(5179) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(5180) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5181) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5182) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(5183) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5184) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(5185) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5186) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5187) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(5188) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(5189) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(5190) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5191) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5192) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(5193) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5194) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(5195) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5196) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5197) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(5198) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(5199) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(5200) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(5201) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(5202) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(5203) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(5204) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(5205) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(5206) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(5207) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(5208) with Deadline.Uncompressed with ValueLengthUncompressed
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
              object NoDeadline extends GroupEntryId(5209) with Deadline.NoDeadline with ValueLengthOneCompressed
              object DeadlineOneCompressed extends GroupEntryId(5210) with Deadline.OneCompressed with ValueLengthOneCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5211) with Deadline.TwoCompressed with ValueLengthOneCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5212) with Deadline.ThreeCompressed with ValueLengthOneCompressed
              object DeadlineFourCompressed extends GroupEntryId(5213) with Deadline.FourCompressed with ValueLengthOneCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5214) with Deadline.FiveCompressed with ValueLengthOneCompressed
              object DeadlineSixCompressed extends GroupEntryId(5215) with Deadline.SixCompressed with ValueLengthOneCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5216) with Deadline.SevenCompressed with ValueLengthOneCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5217) with Deadline.FullyCompressed with ValueLengthOneCompressed
              object DeadlineUncompressed extends GroupEntryId(5218) with Deadline.Uncompressed with ValueLengthOneCompressed
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
              object NoDeadline extends GroupEntryId(5219) with Deadline.NoDeadline with ValueLengthTwoCompressed
              object DeadlineOneCompressed extends GroupEntryId(5220) with Deadline.OneCompressed with ValueLengthTwoCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5221) with Deadline.TwoCompressed with ValueLengthTwoCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5222) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
              object DeadlineFourCompressed extends GroupEntryId(5223) with Deadline.FourCompressed with ValueLengthTwoCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5224) with Deadline.FiveCompressed with ValueLengthTwoCompressed
              object DeadlineSixCompressed extends GroupEntryId(5225) with Deadline.SixCompressed with ValueLengthTwoCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5226) with Deadline.SevenCompressed with ValueLengthTwoCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5227) with Deadline.FullyCompressed with ValueLengthTwoCompressed
              object DeadlineUncompressed extends GroupEntryId(5228) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
              object NoDeadline extends GroupEntryId(5229) with Deadline.NoDeadline with ValueLengthThreeCompressed
              object DeadlineOneCompressed extends GroupEntryId(5230) with Deadline.OneCompressed with ValueLengthThreeCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5231) with Deadline.TwoCompressed with ValueLengthThreeCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5232) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
              object DeadlineFourCompressed extends GroupEntryId(5233) with Deadline.FourCompressed with ValueLengthThreeCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5234) with Deadline.FiveCompressed with ValueLengthThreeCompressed
              object DeadlineSixCompressed extends GroupEntryId(5235) with Deadline.SixCompressed with ValueLengthThreeCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5236) with Deadline.SevenCompressed with ValueLengthThreeCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5237) with Deadline.FullyCompressed with ValueLengthThreeCompressed
              object DeadlineUncompressed extends GroupEntryId(5238) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
              object NoDeadline extends GroupEntryId(5239) with Deadline.NoDeadline with ValueLengthFullyCompressed
              object DeadlineOneCompressed extends GroupEntryId(5240) with Deadline.OneCompressed with ValueLengthFullyCompressed
              object DeadlineTwoCompressed extends GroupEntryId(5241) with Deadline.TwoCompressed with ValueLengthFullyCompressed
              object DeadlineThreeCompressed extends GroupEntryId(5242) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
              object DeadlineFourCompressed extends GroupEntryId(5243) with Deadline.FourCompressed with ValueLengthFullyCompressed
              object DeadlineFiveCompressed extends GroupEntryId(5244) with Deadline.FiveCompressed with ValueLengthFullyCompressed
              object DeadlineSixCompressed extends GroupEntryId(5245) with Deadline.SixCompressed with ValueLengthFullyCompressed
              object DeadlineSevenCompressed extends GroupEntryId(5246) with Deadline.SevenCompressed with ValueLengthFullyCompressed
              object DeadlineFullyCompressed extends GroupEntryId(5247) with Deadline.FullyCompressed with ValueLengthFullyCompressed
              object DeadlineUncompressed extends GroupEntryId(5248) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
              object NoDeadline extends GroupEntryId(5249) with Deadline.NoDeadline with ValueLengthUncompressed
              object DeadlineOneCompressed extends GroupEntryId(5250) with Deadline.OneCompressed with ValueLengthUncompressed
              object DeadlineTwoCompressed extends GroupEntryId(5251) with Deadline.TwoCompressed with ValueLengthUncompressed
              object DeadlineThreeCompressed extends GroupEntryId(5252) with Deadline.ThreeCompressed with ValueLengthUncompressed
              object DeadlineFourCompressed extends GroupEntryId(5253) with Deadline.FourCompressed with ValueLengthUncompressed
              object DeadlineFiveCompressed extends GroupEntryId(5254) with Deadline.FiveCompressed with ValueLengthUncompressed
              object DeadlineSixCompressed extends GroupEntryId(5255) with Deadline.SixCompressed with ValueLengthUncompressed
              object DeadlineSevenCompressed extends GroupEntryId(5256) with Deadline.SevenCompressed with ValueLengthUncompressed
              object DeadlineFullyCompressed extends GroupEntryId(5257) with Deadline.FullyCompressed with ValueLengthUncompressed
              object DeadlineUncompressed extends GroupEntryId(5258) with Deadline.Uncompressed with ValueLengthUncompressed
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
          object NoDeadline extends GroupEntryId(5259) with Deadline.NoDeadline with NoValue
          object DeadlineOneCompressed extends GroupEntryId(5260) with Deadline.OneCompressed with NoValue
          object DeadlineTwoCompressed extends GroupEntryId(5261) with Deadline.TwoCompressed with NoValue
          object DeadlineThreeCompressed extends GroupEntryId(5262) with Deadline.ThreeCompressed with NoValue
          object DeadlineFourCompressed extends GroupEntryId(5263) with Deadline.FourCompressed with NoValue
          object DeadlineFiveCompressed extends GroupEntryId(5264) with Deadline.FiveCompressed with NoValue
          object DeadlineSixCompressed extends GroupEntryId(5265) with Deadline.SixCompressed with NoValue
          object DeadlineSevenCompressed extends GroupEntryId(5266) with Deadline.SevenCompressed with NoValue
          object DeadlineFullyCompressed extends GroupEntryId(5267) with Deadline.FullyCompressed with NoValue
          object DeadlineUncompressed extends GroupEntryId(5268) with Deadline.Uncompressed with NoValue
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
          object NoDeadline extends GroupEntryId(5269) with Deadline.NoDeadline with ValueFullyCompressed
          object DeadlineOneCompressed extends GroupEntryId(5270) with Deadline.OneCompressed with ValueFullyCompressed
          object DeadlineTwoCompressed extends GroupEntryId(5271) with Deadline.TwoCompressed with ValueFullyCompressed
          object DeadlineThreeCompressed extends GroupEntryId(5272) with Deadline.ThreeCompressed with ValueFullyCompressed
          object DeadlineFourCompressed extends GroupEntryId(5273) with Deadline.FourCompressed with ValueFullyCompressed
          object DeadlineFiveCompressed extends GroupEntryId(5274) with Deadline.FiveCompressed with ValueFullyCompressed
          object DeadlineSixCompressed extends GroupEntryId(5275) with Deadline.SixCompressed with ValueFullyCompressed
          object DeadlineSevenCompressed extends GroupEntryId(5276) with Deadline.SevenCompressed with ValueFullyCompressed
          object DeadlineFullyCompressed extends GroupEntryId(5277) with Deadline.FullyCompressed with ValueFullyCompressed
          object DeadlineUncompressed extends GroupEntryId(5278) with Deadline.Uncompressed with ValueFullyCompressed
        }
      }
    }
  }

  override def keyIdsList: List[GroupEntryId] = SealedList.list[GroupEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}