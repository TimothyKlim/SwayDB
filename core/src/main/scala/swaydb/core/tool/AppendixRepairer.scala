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

package swaydb.core.tool

import com.typesafe.scalalogging.LazyLogging
import java.nio.file.Path
import scala.concurrent.ExecutionContext
import swaydb.core.function.FunctionStore
import swaydb.core.io.file.IOEffect
import swaydb.core.level.AppendixSkipListMerger
import swaydb.core.map.serializer.{AppendixMapEntryReader, MapEntryReader, MapEntryWriter}
import swaydb.core.map.{Map, MapEntry, SkipListMerger}
import swaydb.core.queue.{FileLimiter, KeyValueLimiter}
import swaydb.core.segment.Segment
import swaydb.core.util.Extension
import swaydb.data.IO
import swaydb.data.IO._
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.repairAppendix.AppendixRepairStrategy._
import swaydb.data.repairAppendix.{AppendixRepairStrategy, OverlappingSegmentsException, SegmentInfoUnTyped}
import swaydb.data.slice.Slice
import swaydb.data.util.StorageUnits._

private[swaydb] object AppendixRepairer extends LazyLogging {

  def apply(levelPath: Path,
            strategy: AppendixRepairStrategy)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                              timeOrder: TimeOrder[Slice[Byte]],
                                              fileOpenLimiter: FileLimiter,
                                              functionStore: FunctionStore,
                                              ec: ExecutionContext): IO[Unit] = {
    val reader = AppendixMapEntryReader(false, false, false)(keyOrder, timeOrder, functionStore, KeyValueLimiter.none, FileLimiter.empty, None, ec)
    import reader._
    import swaydb.core.map.serializer.AppendixMapEntryWriter._
    implicit val merger = AppendixSkipListMerger

    IO(IOEffect.files(levelPath, Extension.Seg)) flatMap {
      files =>
        files.mapIO(Segment(_, false, false, false, true)(keyOrder, timeOrder, functionStore, KeyValueLimiter.none, FileLimiter.empty, None, ec))
          .flatMap {
            segments =>
              checkOverlappingSegments(segments, strategy) flatMap {
                _ =>
                  buildAppendixMap(levelPath.resolve("appendix"), segments.filter(_.existsOnDisk))
              }
          }
    }
  }

  def applyRecovery(segment: Segment,
                    overlappingSegment: Segment,
                    strategy: AppendixRepairStrategy) =
    strategy match {
      case KeepNew =>
        logger.info(
          s"${KeepNew.getClass.getSimpleName.dropRight(1)} recovery strategy selected. Deleting old {}",
          segment.path
        )
        segment.delete

      case KeepOld =>
        logger.info(
          s"${KeepOld.getClass.getSimpleName.dropRight(1)} recovery strategy selected. Deleting new {}.",
          overlappingSegment.path
        )
        overlappingSegment.delete

      case ReportFailure =>
        segment.getBloomFilterKeyValueCount() flatMap {
          segmentKeyValueCount =>
            overlappingSegment.getBloomFilterKeyValueCount() flatMap {
              overlappingSegmentKeyValueCount =>
                IO.Failure(
                  OverlappingSegmentsException(
                    segmentInfo =
                      SegmentInfoUnTyped(
                        path = segment.path,
                        minKey = segment.minKey,
                        maxKey = segment.maxKey,
                        segmentSize = segment.segmentSize,
                        keyValueCount = segmentKeyValueCount
                      ),
                    overlappingSegmentInfo =
                      SegmentInfoUnTyped(
                        path = overlappingSegment.path,
                        minKey = overlappingSegment.minKey,
                        maxKey = overlappingSegment.maxKey,
                        segmentSize = overlappingSegment.segmentSize,
                        keyValueCount = overlappingSegmentKeyValueCount
                      )
                  )
                )
            }
        }
    }

  def checkOverlappingSegments(segments: Slice[Segment],
                               strategy: AppendixRepairStrategy)(implicit keyOrder: KeyOrder[Slice[Byte]]): IO[Int] =
    segments.foldLeftIO(1) {
      case (position, segment) =>
        logger.info("Checking for overlapping Segments for Segment {}", segment.path)
        segments.drop(position) find {
          targetSegment =>
            val overlaps = Segment.overlaps(segment, targetSegment)
            if (overlaps)
              logger.error(s"Is overlapping with {} = {}", targetSegment.path, overlaps)
            else
              logger.trace(s"Is overlapping with {} = {}", targetSegment.path, overlaps)
            overlaps
        } match {
          case Some(overlappingSegment) =>
            applyRecovery(segment, overlappingSegment, strategy) match {
              case IO.Success(_) =>
                return checkOverlappingSegments(segments.drop(position - 1).filter(_.existsOnDisk), strategy)

              case IO.Failure(error) =>
                IO.Failure(error)
            }

          case None =>
            IO.Success(position + 1)
        }
    }

  def buildAppendixMap(appendixDir: Path,
                       segments: Slice[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                 timeOrder: TimeOrder[Slice[Byte]],
                                                 fileOpenLimiter: FileLimiter,
                                                 functionStore: FunctionStore,
                                                 writer: MapEntryWriter[MapEntry.Put[Slice[Byte], Segment]],
                                                 mapReader: MapEntryReader[MapEntry[Slice[Byte], Segment]],
                                                 skipListMerger: SkipListMerger[Slice[Byte], Segment],
                                                 ec: ExecutionContext): IO[Unit] =
    IOEffect.walkDelete(appendixDir) flatMap {
      _ =>
        Map.persistent[Slice[Byte], Segment](appendixDir, false, flushOnOverflow = true, 1.gb) flatMap {
          appendix =>
            segments foreachIO {
              segment =>
                appendix.write(MapEntry.Put(segment.minKey, segment))
            } match {
              case Some(IO.Failure(exception)) =>
                IO.Failure(exception)
              case None =>
                IO.unit
            }
        }
    }
}
