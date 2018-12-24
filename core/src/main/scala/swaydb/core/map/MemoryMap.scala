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

package swaydb.core.map

import java.util.concurrent.ConcurrentSkipListMap
import com.typesafe.scalalogging.LazyLogging
import swaydb.core.map.serializer.MapEntryWriter
import scala.reflect.ClassTag
import scala.util.{Success, Try}
import swaydb.data.order.KeyOrder

private[map] class MemoryMap[K, V: ClassTag](val skipList: ConcurrentSkipListMap[K, V],
                                             flushOnOverflow: Boolean,
                                             val fileSize: Long)(implicit keyOrder: KeyOrder[K],
                                                                 skipListMerger: SkipListMerge[K, V],
                                                                 writer: MapEntryWriter[MapEntry.Put[K, V]]) extends Map[K, V] with LazyLogging {

  private var currentBytesWritten: Long = 0

  @volatile private var _hasRange: Boolean = false

  override def hasRange: Boolean = _hasRange

  def delete: Try[Unit] =
    Try(skipList.clear())

  override def write(entry: MapEntry[K, V]): Try[Boolean] =
    synchronized {
      if (flushOnOverflow || currentBytesWritten == 0 || ((currentBytesWritten + entry.totalByteSize) <= fileSize)) {
        if (entry.hasRange) {
          _hasRange = true //set hasRange to true before inserting so that reads start looking for floor key-values as the inserts are occuring.
          skipListMerger.insert(entry, skipList)
        } else if (entry.hasUpdate || entry.hasRemoveDeadline || _hasRange) {
          skipListMerger.insert(entry, skipList)
        } else {
          entry applyTo skipList
        }
        currentBytesWritten += entry.totalByteSize
        Success(true)
      } else
        Success(false)
    }
}
