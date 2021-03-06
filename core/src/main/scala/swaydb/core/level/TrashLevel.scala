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

package swaydb.core.level

import java.nio.file.{Path, Paths}
import swaydb.core.data.{KeyValue, Memory}
import swaydb.core.level.actor.LevelAPI
import swaydb.core.level.actor.LevelCommand._
import swaydb.core.map.Map
import swaydb.core.segment.Segment
import swaydb.data.compaction.{LevelMeter, Throttle}
import swaydb.data.slice.Slice
import scala.concurrent.duration.{FiniteDuration, _}
import swaydb.data.IO

private[core] object TrashLevel extends LevelRef {

  override val paths: PathsDistributor = PathsDistributor(Seq(), () => Seq())

  override val appendixPath: Path = Paths.get("Trash level has no path")

  override val rootPath: Path = Paths.get("Trash level has no path")

  override val throttle: LevelMeter => Throttle =
    (_) => Throttle(Duration.Zero, 0)

  override def !(request: LevelAPI): Unit =
    request match {
      case request: PushSegments =>
        request.replyTo ! PushSegmentsResponse(request, IO.unit)
      case request: PushMap =>
        request.replyTo ! PushMapResponse(request, IO.unit)
      case PullRequest(pullFrom) =>
        pullFrom ! Pull
    }

  override val nextLevel: Option[LevelRef] =
    None

  override val segmentsInLevel: Iterable[Segment] =
    Iterable.empty

  override val hasNextLevel: Boolean =
    false

  override val bloomFilterKeyValueCount: IO[Int] =
    IO.zero

  override val segmentsCount: Int =
    0

  override val segmentFilesOnDisk: List[Path] =
    List.empty

  override def take(count: Int): Slice[Segment] =
    Slice.create[Segment](0)

  override def foreach[T](f: (Slice[Byte], Segment) => T): Unit =
    ()

  override def containsSegmentWithMinKey(minKey: Slice[Byte]): Boolean =
    false

  override def getSegment(minKey: Slice[Byte]): Option[Segment] =
    None

  override val getBusySegments: List[Segment] =
    List.empty

  override val existsOnDisk =
    false

  override val levelSize: Long =
    0

  override val segmentCountAndLevelSize: (Int, Long) =
    (0, 0)

  override val head =
    IO.none

  override val last =
    IO.none

  override def get(key: Slice[Byte]) =
    IO.none

  override def lower(key: Slice[Byte]) =
    IO.none

  override def higher(key: Slice[Byte]) =
    IO.none

  override val isEmpty: Boolean =
    true

  override def takeSegments(size: Int, condition: Segment => Boolean): Iterable[Segment] =
    Iterable.empty

  override def takeSmallSegments(size: Int): Iterable[Segment] =
    Iterable.empty

  override def takeLargeSegments(size: Int): Iterable[Segment] =
    Iterable.empty

  override val sizeOfSegments: Long =
    0

  override def releaseLocks: IO[Unit] =
    IO.unit

  override val close: IO[Unit] =
    IO.unit

  override val meter: LevelMeter =
    LevelMeter(0, 0)

  override def meterFor(levelNumber: Int): Option[LevelMeter] =
    None

  override def mightContain(key: Slice[Byte]): IO[Boolean] =
    IO.`false`

  override val isTrash: Boolean = true

  override def ceiling(key: Slice[Byte]): IO.Async[Option[KeyValue.ReadOnly.Put]] =
    IO.none

  override def floor(key: Slice[Byte]): IO.Async[Option[KeyValue.ReadOnly.Put]] =
    IO.none

  override val headKey: IO.Async[Option[Slice[Byte]]] =
    IO.none

  override val lastKey: IO.Async[Option[Slice[Byte]]] =
    IO.none

  override def closeSegments(): IO[Unit] =
    IO.unit

  override def levelNumber: Long = -1

  override def inMemory: Boolean = true
}
