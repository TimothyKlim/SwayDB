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

package swaydb.core.segment.format.a.entry.reader.matchers

import scala.util.Try
import swaydb.core.data.Persistent
import swaydb.core.segment.format.a.entry.id.GroupEntryId
import swaydb.core.segment.format.a.entry.reader.DeadlineReaders._
import swaydb.core.segment.format.a.entry.reader.KeyReaders._
import swaydb.core.segment.format.a.entry.reader.ValueReader._
import swaydb.core.segment.format.a.entry.reader.matchers.GroupReader._
import swaydb.data.order.KeyOrder
import swaydb.data.slice.{Reader, Slice}

object ApplyFormatAEntryReader {

  def read(id: Int,
           indexReader: Reader,
           valueReader: Reader,
           indexOffset: Int,
           nextIndexOffset: Int,
           nextIndexSize: Int,
           previous: Option[Persistent])(implicit order: KeyOrder[Slice[Byte]]): Option[Try[Persistent]] =
	//GENERATED CONDITIONS
	???
}
