/*
 * Copyright (c) 2019 Simer Plaha (@simerplaha)
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

package swaydb.core.map.timer

import com.typesafe.scalalogging.LazyLogging
import java.nio.file.Path
import java.util.concurrent.ConcurrentSkipListMap
import java.util.concurrent.atomic.AtomicLong
import scala.concurrent.ExecutionContext
import swaydb.core.data.Time
import swaydb.core.function.FunctionStore
import swaydb.core.map.serializer.{MapEntryReader, MapEntryWriter}
import swaydb.core.map.{Map, MapEntry, PersistentMap, SkipListMerger}
import swaydb.core.queue.FileLimiter
import swaydb.data.IO
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice

private[core] object PersistentTimer extends LazyLogging {

  private implicit object TimerSkipListMerger extends SkipListMerger[Slice[Byte], Slice[Byte]] {
    override def insert(insertKey: Slice[Byte],
                        insertValue: Slice[Byte],
                        skipList: ConcurrentSkipListMap[Slice[Byte], Slice[Byte]])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                                                   timeOrder: TimeOrder[Slice[Byte]],
                                                                                   functionStore: FunctionStore): Unit =
      throw new IllegalAccessException("Timer does not require skipList merger.")

    override def insert(entry: MapEntry[Slice[Byte], Slice[Byte]],
                        skipList: ConcurrentSkipListMap[Slice[Byte], Slice[Byte]])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                                                   timeOrder: TimeOrder[Slice[Byte]],
                                                                                   functionStore: FunctionStore): Unit =
      throw new IllegalAccessException("Timer does not require skipList merger.")
  }

  def apply(path: Path,
            mmap: Boolean,
            mod: Long,
            flushCheckpointSize: Long)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                       timeOrder: TimeOrder[Slice[Byte]],
                                       functionStore: FunctionStore,
                                       ec: ExecutionContext,
                                       writer: MapEntryWriter[MapEntry.Put[Slice[Byte], Slice[Byte]]],
                                       reader: MapEntryReader[MapEntry[Slice[Byte], Slice[Byte]]]): IO[PersistentTimer] = {
    implicit val limiter = FileLimiter.empty

    Map.persistent[Slice[Byte], Slice[Byte]](
      folder = path,
      mmap = mmap,
      flushOnOverflow = true,
      fileSize = flushCheckpointSize,
      dropCorruptedTailEntries = false
    ).map(_.item) flatMap {
      map =>
        map.headValue() match {
          case Some(usedID) =>
            val startId = usedID.readLong()
            map.write(MapEntry.Put(Timer.defaultKey, Slice.writeLong(startId + mod))) flatMap {
              wrote =>
                if (wrote)
                  IO {
                    new PersistentTimer(
                      mod = mod,
                      startID = startId,
                      map = map
                    )
                  }
                else
                  IO.Failure(IO.Error.Fatal(new Exception("Failed to initialise PersistentTimer.")))
            }

          case None =>
            map.write(MapEntry.Put(Timer.defaultKey, Slice.writeLong(mod))) flatMap {
              wrote =>
                if (wrote)
                  IO {
                    new PersistentTimer(
                      mod = mod,
                      startID = 0,
                      map = map
                    )
                  }
                else
                  IO.Failure(IO.Error.Fatal(new Exception("Failed to initialise PersistentTimer.")))
            }
        }

    }
  }

  /**
    * Stores next checkpoint time to Map.
    *
    * Why throw exceptions?
    * Writes are ALWAYS expected to succeed but unexpected failures can still occur.
    * Since nextTime is called for each written key-value having an IO wrapper
    * for each [[PersistentTimer.next]] call can increase in-memory objects which can cause
    * performance issues.
    *
    * Throwing exception on failure here is ok since failures are not expected and if failure does occur
    * it would be due to file system permission issue.
    *
    * Possibly needs a better solution.
    */
  private[timer] def checkpoint(nextTime: Long,
                                mod: Long,
                                map: PersistentMap[Slice[Byte], Slice[Byte]])(implicit writer: MapEntryWriter[MapEntry.Put[Slice[Byte], Slice[Byte]]]) =
    map.write(MapEntry.Put(Timer.defaultKey, Slice.writeLong(nextTime + mod))) onFailureSideEffect {
      failed =>
        val message = s"Failed to write timer entry: $nextTime"
        logger.error(message, failed.exception)
        throw new Exception(message)
    } foreach {
      wrote =>
        if (!wrote) {
          val message = s"Failed to write timer entry: $nextTime"
          logger.error(message)
          throw new Exception(message)
        }
    }
}

private[core] class PersistentTimer(mod: Long,
                                    startID: Long,
                                    map: PersistentMap[Slice[Byte], Slice[Byte]])(implicit writer: MapEntryWriter[MapEntry.Put[Slice[Byte], Slice[Byte]]]) extends Timer with LazyLogging {

  private val time = new AtomicLong(startID)

  override def next: Time =
    synchronized {
      val nextTime = time.incrementAndGet()
      if (nextTime % mod == 0) PersistentTimer.checkpoint(nextTime, mod, map)
      Time(nextTime)
    }

  override def close: IO[Unit] =
    map.close()
}
