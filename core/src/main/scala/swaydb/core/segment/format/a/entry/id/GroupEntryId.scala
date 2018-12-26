
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
object GroupEntryId extends GeneratedEntryId {

  override val format: EntryId.Format.A = GroupEntryId.FormatA

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
            case object NoDeadline extends GroupEntryId(661) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(662) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(663) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(664) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(665) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(666) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(667) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(668) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(669) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(670) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(671) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(672) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(673) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(674) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(675) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(676) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(677) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(678) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(679) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(680) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(681) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(682) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(683) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(684) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(685) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(686) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(687) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(688) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(689) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(690) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(691) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(692) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(693) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(694) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(695) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(696) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(697) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(698) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(699) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(700) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(701) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(702) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(703) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(704) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(705) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(706) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(707) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(708) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(709) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(710) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(711) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(712) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(713) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(714) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(715) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(716) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(717) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(718) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(719) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(720) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(721) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(722) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(723) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(724) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(725) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(726) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(727) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(728) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(729) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(730) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(731) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(732) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(733) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(734) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(735) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(736) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(737) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(738) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(739) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(740) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(741) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(742) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(743) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(744) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(745) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(746) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(747) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(748) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(749) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(750) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(751) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(752) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(753) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(754) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(755) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(756) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(757) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(758) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(759) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(760) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(761) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(762) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(763) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(764) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(765) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(766) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(767) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(768) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(769) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(770) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(771) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(772) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(773) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(774) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(775) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(776) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(777) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(778) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(779) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(780) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(781) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(782) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(783) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(784) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(785) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(786) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(787) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(788) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(789) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(790) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(791) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(792) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(793) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(794) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(795) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(796) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(797) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(798) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(799) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(800) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(801) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(802) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(803) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(804) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(805) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(806) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(807) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(808) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(809) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(810) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(811) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(812) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(813) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(814) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(815) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(816) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(817) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(818) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(819) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(820) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(821) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(822) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(823) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(824) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(825) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(826) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(827) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(828) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(829) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(830) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(831) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(832) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(833) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(834) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(835) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(836) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(837) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(838) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(839) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(840) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(841) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(842) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(843) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(844) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(845) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(846) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(847) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(848) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(849) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(850) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(851) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(852) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(853) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(854) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(855) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(856) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(857) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(858) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(859) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(860) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(861) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(862) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(863) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(864) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(865) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(866) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(867) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(868) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(869) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(870) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(871) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(872) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(873) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(874) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(875) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(876) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(877) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(878) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(879) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(880) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEntryId(881) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(882) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(883) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(884) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(885) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(886) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(887) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(888) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(889) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(890) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(891) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(892) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(893) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(894) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(895) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(896) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(897) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(898) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(899) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(900) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(901) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(902) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(903) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(904) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(905) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(906) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(907) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(908) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(909) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(910) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(911) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(912) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(913) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(914) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(915) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(916) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(917) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(918) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(919) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(920) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(921) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(922) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(923) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(924) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(925) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(926) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(927) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(928) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(929) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(930) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(931) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(932) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(933) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(934) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(935) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(936) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(937) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(938) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(939) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(940) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(941) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(942) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(943) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(944) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(945) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(946) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(947) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(948) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(949) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(950) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(951) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(952) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(953) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(954) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(955) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(956) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(957) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(958) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(959) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(960) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(961) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(962) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(963) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(964) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(965) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(966) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(967) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(968) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(969) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(970) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(971) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(972) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(973) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(974) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(975) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(976) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(977) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(978) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(979) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(980) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(981) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(982) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(983) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(984) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(985) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(986) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(987) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(988) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(989) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(990) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(991) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(992) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(993) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(994) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(995) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(996) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(997) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(998) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(999) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1000) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1001) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1002) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1003) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1004) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1005) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1006) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1007) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1008) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1009) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1010) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1011) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1012) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1013) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1014) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1015) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1016) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1017) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1018) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1019) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1020) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1021) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1022) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1023) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1024) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1025) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1026) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1027) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1028) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1029) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1030) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1031) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1032) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1033) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1034) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1035) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1036) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1037) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1038) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1039) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1040) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1041) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1042) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1043) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1044) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1045) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1046) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1047) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1048) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1049) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1050) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1051) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1052) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1053) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1054) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1055) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1056) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1057) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1058) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1059) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1060) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1061) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1062) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1063) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1064) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1065) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1066) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1067) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1068) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1069) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1070) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1071) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1072) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1073) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1074) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1075) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1076) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1077) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1078) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1079) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1080) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(1081) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(1082) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(1083) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(1084) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(1085) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(1086) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(1087) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(1088) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(1089) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(1090) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(1091) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(1092) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(1093) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(1094) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(1095) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(1096) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(1097) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(1098) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(1099) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(1100) with Deadline.Uncompressed with ValueFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1101) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1102) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1103) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1104) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1105) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1106) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1107) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1108) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1109) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1110) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1111) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1112) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1113) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1114) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1115) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1116) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1117) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1118) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1119) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1120) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1121) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1122) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1123) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1124) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1125) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1126) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1127) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1128) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1129) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1130) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1131) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1132) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1133) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1134) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1135) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1136) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1137) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1138) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1139) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1140) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1141) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1142) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1143) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1144) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1145) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1146) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1147) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1148) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1149) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1150) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1151) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1152) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1153) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1154) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1155) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1156) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1157) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1158) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1159) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1160) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1161) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1162) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1163) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1164) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1165) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1166) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1167) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1168) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1169) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1170) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1171) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1172) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1173) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1174) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1175) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1176) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1177) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1178) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1179) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1180) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1181) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1182) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1183) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1184) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1185) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1186) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1187) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1188) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1189) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1190) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1191) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1192) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1193) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1194) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1195) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1196) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1197) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1198) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1199) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1200) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1201) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1202) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1203) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1204) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1205) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1206) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1207) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1208) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1209) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1210) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1211) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1212) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1213) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1214) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1215) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1216) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1217) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1218) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1219) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1220) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1221) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1222) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1223) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1224) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1225) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1226) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1227) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1228) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1229) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1230) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1231) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1232) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1233) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1234) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1235) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1236) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1237) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1238) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1239) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1240) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1241) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1242) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1243) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1244) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1245) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1246) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1247) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1248) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1249) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1250) with Deadline.Uncompressed with ValueLengthUncompressed
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
            case object NoDeadline extends GroupEntryId(1251) with Deadline.NoDeadline with ValueLengthOneCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1252) with Deadline.OneCompressed with ValueLengthOneCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1253) with Deadline.TwoCompressed with ValueLengthOneCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1254) with Deadline.ThreeCompressed with ValueLengthOneCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1255) with Deadline.FourCompressed with ValueLengthOneCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1256) with Deadline.FiveCompressed with ValueLengthOneCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1257) with Deadline.SixCompressed with ValueLengthOneCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1258) with Deadline.SevenCompressed with ValueLengthOneCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1259) with Deadline.FullyCompressed with ValueLengthOneCompressed
            case object DeadlineUncompressed extends GroupEntryId(1260) with Deadline.Uncompressed with ValueLengthOneCompressed
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
            case object NoDeadline extends GroupEntryId(1261) with Deadline.NoDeadline with ValueLengthTwoCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1262) with Deadline.OneCompressed with ValueLengthTwoCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1263) with Deadline.TwoCompressed with ValueLengthTwoCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1264) with Deadline.ThreeCompressed with ValueLengthTwoCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1265) with Deadline.FourCompressed with ValueLengthTwoCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1266) with Deadline.FiveCompressed with ValueLengthTwoCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1267) with Deadline.SixCompressed with ValueLengthTwoCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1268) with Deadline.SevenCompressed with ValueLengthTwoCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1269) with Deadline.FullyCompressed with ValueLengthTwoCompressed
            case object DeadlineUncompressed extends GroupEntryId(1270) with Deadline.Uncompressed with ValueLengthTwoCompressed
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
            case object NoDeadline extends GroupEntryId(1271) with Deadline.NoDeadline with ValueLengthThreeCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1272) with Deadline.OneCompressed with ValueLengthThreeCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1273) with Deadline.TwoCompressed with ValueLengthThreeCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1274) with Deadline.ThreeCompressed with ValueLengthThreeCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1275) with Deadline.FourCompressed with ValueLengthThreeCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1276) with Deadline.FiveCompressed with ValueLengthThreeCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1277) with Deadline.SixCompressed with ValueLengthThreeCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1278) with Deadline.SevenCompressed with ValueLengthThreeCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1279) with Deadline.FullyCompressed with ValueLengthThreeCompressed
            case object DeadlineUncompressed extends GroupEntryId(1280) with Deadline.Uncompressed with ValueLengthThreeCompressed
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
            case object NoDeadline extends GroupEntryId(1281) with Deadline.NoDeadline with ValueLengthFullyCompressed
            case object DeadlineOneCompressed extends GroupEntryId(1282) with Deadline.OneCompressed with ValueLengthFullyCompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1283) with Deadline.TwoCompressed with ValueLengthFullyCompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1284) with Deadline.ThreeCompressed with ValueLengthFullyCompressed
            case object DeadlineFourCompressed extends GroupEntryId(1285) with Deadline.FourCompressed with ValueLengthFullyCompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1286) with Deadline.FiveCompressed with ValueLengthFullyCompressed
            case object DeadlineSixCompressed extends GroupEntryId(1287) with Deadline.SixCompressed with ValueLengthFullyCompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1288) with Deadline.SevenCompressed with ValueLengthFullyCompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1289) with Deadline.FullyCompressed with ValueLengthFullyCompressed
            case object DeadlineUncompressed extends GroupEntryId(1290) with Deadline.Uncompressed with ValueLengthFullyCompressed
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
            case object NoDeadline extends GroupEntryId(1291) with Deadline.NoDeadline with ValueLengthUncompressed
            case object DeadlineOneCompressed extends GroupEntryId(1292) with Deadline.OneCompressed with ValueLengthUncompressed
            case object DeadlineTwoCompressed extends GroupEntryId(1293) with Deadline.TwoCompressed with ValueLengthUncompressed
            case object DeadlineThreeCompressed extends GroupEntryId(1294) with Deadline.ThreeCompressed with ValueLengthUncompressed
            case object DeadlineFourCompressed extends GroupEntryId(1295) with Deadline.FourCompressed with ValueLengthUncompressed
            case object DeadlineFiveCompressed extends GroupEntryId(1296) with Deadline.FiveCompressed with ValueLengthUncompressed
            case object DeadlineSixCompressed extends GroupEntryId(1297) with Deadline.SixCompressed with ValueLengthUncompressed
            case object DeadlineSevenCompressed extends GroupEntryId(1298) with Deadline.SevenCompressed with ValueLengthUncompressed
            case object DeadlineFullyCompressed extends GroupEntryId(1299) with Deadline.FullyCompressed with ValueLengthUncompressed
            case object DeadlineUncompressed extends GroupEntryId(1300) with Deadline.Uncompressed with ValueLengthUncompressed
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
        case object NoDeadline extends GroupEntryId(1301) with Deadline.NoDeadline with NoValue
        case object DeadlineOneCompressed extends GroupEntryId(1302) with Deadline.OneCompressed with NoValue
        case object DeadlineTwoCompressed extends GroupEntryId(1303) with Deadline.TwoCompressed with NoValue
        case object DeadlineThreeCompressed extends GroupEntryId(1304) with Deadline.ThreeCompressed with NoValue
        case object DeadlineFourCompressed extends GroupEntryId(1305) with Deadline.FourCompressed with NoValue
        case object DeadlineFiveCompressed extends GroupEntryId(1306) with Deadline.FiveCompressed with NoValue
        case object DeadlineSixCompressed extends GroupEntryId(1307) with Deadline.SixCompressed with NoValue
        case object DeadlineSevenCompressed extends GroupEntryId(1308) with Deadline.SevenCompressed with NoValue
        case object DeadlineFullyCompressed extends GroupEntryId(1309) with Deadline.FullyCompressed with NoValue
        case object DeadlineUncompressed extends GroupEntryId(1310) with Deadline.Uncompressed with NoValue
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
        case object NoDeadline extends GroupEntryId(1311) with Deadline.NoDeadline with ValueFullyCompressed
        case object DeadlineOneCompressed extends GroupEntryId(1312) with Deadline.OneCompressed with ValueFullyCompressed
        case object DeadlineTwoCompressed extends GroupEntryId(1313) with Deadline.TwoCompressed with ValueFullyCompressed
        case object DeadlineThreeCompressed extends GroupEntryId(1314) with Deadline.ThreeCompressed with ValueFullyCompressed
        case object DeadlineFourCompressed extends GroupEntryId(1315) with Deadline.FourCompressed with ValueFullyCompressed
        case object DeadlineFiveCompressed extends GroupEntryId(1316) with Deadline.FiveCompressed with ValueFullyCompressed
        case object DeadlineSixCompressed extends GroupEntryId(1317) with Deadline.SixCompressed with ValueFullyCompressed
        case object DeadlineSevenCompressed extends GroupEntryId(1318) with Deadline.SevenCompressed with ValueFullyCompressed
        case object DeadlineFullyCompressed extends GroupEntryId(1319) with Deadline.FullyCompressed with ValueFullyCompressed
        case object DeadlineUncompressed extends GroupEntryId(1320) with Deadline.Uncompressed with ValueFullyCompressed
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