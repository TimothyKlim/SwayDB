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

package swaydb.data.segment

import swaydb.data.order.KeyOrder
import swaydb.data.slice.Slice

private[swaydb] sealed trait MaxKey {
  val maxKey: Slice[Byte]
  val inclusive: Boolean
}

private[swaydb] object MaxKey {

  implicit class MaxKeyImplicits(maxKey: MaxKey) {
    def unslice() =
      maxKey match {
        case Fixed(maxKey) =>
          Fixed(maxKey.unslice())

        case Range(fromKey, maxKey) =>
          Range(fromKey.unslice(), maxKey.unslice())
      }

    def lessThan(key: Slice[Byte])(implicit keyOrder: KeyOrder[Slice[Byte]]): Boolean = {
      import keyOrder._
      (maxKey.inclusive && maxKey.maxKey < key) || (!maxKey.inclusive && maxKey.maxKey <= key)
    }
  }

  private[swaydb] case class Fixed(maxKey: Slice[Byte]) extends MaxKey {
    override val inclusive: Boolean = true
  }
  private[swaydb] case class Range(fromKey: Slice[Byte], maxKey: Slice[Byte]) extends MaxKey {
    override val inclusive: Boolean = false
  }
}
