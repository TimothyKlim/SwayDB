
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
sealed abstract class ApplyEntryId(override val id: Int) extends EntryId(id)
object ApplyEntryId extends GeneratedEntryId {

  override val format: EntryId.Format.A = ApplyEntryId.FormatA

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
            case object NoDeadline extends ApplyEntryId(2675) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2676) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2677) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2678) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2679) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2680) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2681) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2682) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2683) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2684) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(2685) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2686) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2687) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2688) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2689) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2690) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2691) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2692) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2693) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2694) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(2695) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2696) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2697) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2698) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2699) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2700) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2701) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2702) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2703) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2704) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(2705) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2706) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2707) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2708) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2709) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2710) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2711) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2712) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2713) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2714) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(2715) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2716) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2717) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2718) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2719) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2720) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2721) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2722) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2723) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(2724) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(2725) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2726) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2727) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2728) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2729) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2730) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2731) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2732) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2733) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2734) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(2735) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2736) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2737) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2738) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2739) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2740) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2741) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2742) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2743) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2744) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(2745) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2746) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2747) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2748) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2749) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2750) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2751) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2752) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2753) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2754) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(2755) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2756) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2757) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2758) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2759) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2760) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2761) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2762) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2763) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2764) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(2765) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2766) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2767) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2768) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2769) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2770) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2771) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2772) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2773) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(2774) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(2775) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2776) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2777) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2778) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2779) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2780) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2781) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2782) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2783) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2784) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(2785) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2786) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2787) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2788) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2789) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2790) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2791) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2792) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2793) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2794) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(2795) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2796) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2797) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2798) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2799) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2800) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2801) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2802) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2803) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2804) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(2805) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2806) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2807) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2808) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2809) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2810) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2811) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2812) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2813) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2814) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(2815) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2816) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2817) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2818) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2819) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2820) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2821) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2822) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2823) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(2824) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(2825) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2826) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2827) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2828) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2829) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2830) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2831) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2832) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2833) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2834) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(2835) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2836) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2837) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2838) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2839) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2840) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2841) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2842) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2843) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2844) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(2845) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2846) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2847) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2848) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2849) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2850) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2851) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2852) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2853) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2854) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(2855) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2856) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2857) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2858) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2859) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2860) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2861) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2862) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2863) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2864) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(2865) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2866) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2867) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2868) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2869) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2870) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2871) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2872) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2873) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(2874) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends ApplyEntryId(2875) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends ApplyEntryId(2876) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends ApplyEntryId(2877) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends ApplyEntryId(2878) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends ApplyEntryId(2879) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends ApplyEntryId(2880) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends ApplyEntryId(2881) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends ApplyEntryId(2882) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends ApplyEntryId(2883) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends ApplyEntryId(2884) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends ApplyEntryId(2885) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends ApplyEntryId(2886) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends ApplyEntryId(2887) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends ApplyEntryId(2888) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends ApplyEntryId(2889) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends ApplyEntryId(2890) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends ApplyEntryId(2891) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends ApplyEntryId(2892) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends ApplyEntryId(2893) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends ApplyEntryId(2894) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(2895) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2896) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2897) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2898) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2899) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2900) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2901) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2902) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2903) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2904) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(2905) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2906) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2907) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2908) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2909) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2910) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2911) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2912) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2913) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2914) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(2915) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2916) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2917) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2918) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2919) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2920) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2921) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2922) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2923) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2924) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(2925) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2926) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2927) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2928) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2929) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2930) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2931) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2932) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2933) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2934) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(2935) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2936) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2937) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2938) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2939) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2940) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2941) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2942) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2943) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(2944) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(2945) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2946) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2947) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2948) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2949) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2950) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2951) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2952) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2953) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2954) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(2955) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2956) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2957) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2958) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2959) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2960) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2961) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2962) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2963) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2964) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(2965) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2966) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2967) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2968) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2969) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2970) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2971) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2972) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2973) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2974) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(2975) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2976) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2977) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2978) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2979) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2980) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2981) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2982) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2983) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(2984) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(2985) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2986) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2987) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2988) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2989) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(2990) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(2991) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(2992) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(2993) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(2994) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(2995) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(2996) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(2997) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(2998) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(2999) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3000) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3001) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3002) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3003) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3004) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(3005) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3006) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3007) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3008) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3009) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3010) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3011) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3012) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3013) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3014) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(3015) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3016) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3017) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3018) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3019) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3020) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3021) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3022) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3023) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3024) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(3025) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3026) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3027) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3028) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3029) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3030) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3031) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3032) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3033) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3034) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(3035) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3036) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3037) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3038) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3039) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3040) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3041) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3042) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3043) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(3044) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(3045) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3046) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3047) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3048) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3049) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3050) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3051) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3052) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3053) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3054) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(3055) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3056) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3057) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3058) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3059) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3060) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3061) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3062) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3063) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3064) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(3065) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3066) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3067) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3068) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3069) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3070) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3071) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3072) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3073) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3074) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(3075) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3076) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3077) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3078) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3079) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3080) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3081) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3082) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3083) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3084) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(3085) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3086) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3087) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3088) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3089) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3090) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3091) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3092) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3093) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(3094) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends ApplyEntryId(3095) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends ApplyEntryId(3096) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends ApplyEntryId(3097) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends ApplyEntryId(3098) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends ApplyEntryId(3099) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends ApplyEntryId(3100) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends ApplyEntryId(3101) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends ApplyEntryId(3102) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends ApplyEntryId(3103) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends ApplyEntryId(3104) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends ApplyEntryId(3105) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends ApplyEntryId(3106) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends ApplyEntryId(3107) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends ApplyEntryId(3108) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends ApplyEntryId(3109) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends ApplyEntryId(3110) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends ApplyEntryId(3111) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends ApplyEntryId(3112) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends ApplyEntryId(3113) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends ApplyEntryId(3114) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(3115) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3116) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3117) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3118) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3119) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3120) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3121) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3122) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3123) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3124) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(3125) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3126) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3127) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3128) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3129) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3130) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3131) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3132) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3133) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3134) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(3135) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3136) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3137) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3138) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3139) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3140) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3141) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3142) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3143) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3144) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(3145) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3146) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3147) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3148) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3149) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3150) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3151) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3152) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3153) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3154) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(3155) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3156) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3157) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3158) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3159) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3160) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3161) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3162) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3163) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(3164) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(3165) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3166) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3167) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3168) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3169) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3170) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3171) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3172) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3173) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3174) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(3175) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3176) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3177) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3178) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3179) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3180) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3181) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3182) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3183) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3184) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(3185) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3186) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3187) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3188) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3189) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3190) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3191) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3192) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3193) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3194) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(3195) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3196) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3197) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3198) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3199) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3200) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3201) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3202) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3203) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3204) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(3205) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3206) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3207) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3208) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3209) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3210) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3211) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3212) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3213) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(3214) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(3215) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3216) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3217) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3218) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3219) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3220) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3221) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3222) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3223) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3224) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(3225) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3226) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3227) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3228) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3229) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3230) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3231) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3232) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3233) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3234) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(3235) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3236) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3237) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3238) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3239) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3240) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3241) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3242) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3243) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3244) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(3245) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3246) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3247) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3248) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3249) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3250) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3251) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3252) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3253) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3254) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(3255) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3256) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3257) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3258) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3259) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3260) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3261) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3262) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3263) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(3264) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends ApplyEntryId(3265) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3266) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3267) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3268) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3269) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3270) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3271) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3272) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3273) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3274) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends ApplyEntryId(3275) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3276) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3277) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3278) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3279) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3280) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3281) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3282) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3283) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3284) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends ApplyEntryId(3285) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3286) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3287) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3288) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3289) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3290) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3291) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3292) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3293) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3294) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends ApplyEntryId(3295) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3296) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3297) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3298) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3299) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3300) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3301) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3302) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3303) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends ApplyEntryId(3304) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends ApplyEntryId(3305) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends ApplyEntryId(3306) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends ApplyEntryId(3307) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends ApplyEntryId(3308) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends ApplyEntryId(3309) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends ApplyEntryId(3310) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends ApplyEntryId(3311) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends ApplyEntryId(3312) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends ApplyEntryId(3313) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends ApplyEntryId(3314) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends ApplyEntryId(3315) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends ApplyEntryId(3316) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends ApplyEntryId(3317) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends ApplyEntryId(3318) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends ApplyEntryId(3319) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends ApplyEntryId(3320) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends ApplyEntryId(3321) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends ApplyEntryId(3322) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends ApplyEntryId(3323) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends ApplyEntryId(3324) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends ApplyEntryId(3325) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends ApplyEntryId(3326) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends ApplyEntryId(3327) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends ApplyEntryId(3328) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends ApplyEntryId(3329) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends ApplyEntryId(3330) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends ApplyEntryId(3331) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends ApplyEntryId(3332) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends ApplyEntryId(3333) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends ApplyEntryId(3334) with Deadline.Uncompressed with ValueFullyCompressed
      }
    }
  }

  override def keyIdsList: List[ApplyEntryId] = SealedList.list[ApplyEntryId].sortBy(_.id)

  override val (headId, lastId) = keyIdsList ==> {
    keyIdsList =>
      (keyIdsList.head.id, keyIdsList.last.id)
  }

  def contains(id: Int): Boolean =
    id >= headId && id <= lastId
}