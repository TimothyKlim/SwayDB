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

package swaydb.core.tool

import java.nio.file.Path
import com.typesafe.scalalogging.LazyLogging
import swaydb.core.io.file.IO
import swaydb.core.level.AppendixSkipListMerger
import swaydb.core.map.serializer.{AppendixMapEntryReader, MapEntryReader, MapEntryWriter}
import swaydb.core.map.{Map, MapEntry, SkipListMerge}
import swaydb.core.queue.KeyValueLimiter
import swaydb.core.segment.Segment
import swaydb.core.util.TryUtil._
import swaydb.core.util.{Extension, FileUtil, TryUtil}
import swaydb.data.repairAppendix.AppendixRepairStrategy._
import swaydb.data.repairAppendix.{AppendixRepairStrategy, OverlappingSegmentsException, SegmentInfoUnTyped}
import swaydb.data.slice.Slice
import swaydb.data.util.StorageUnits._
import scala.concurrent.ExecutionContext
import scala.util.{Failure, Success, Try}
import swaydb.data.order.KeyOrder

private[swaydb] object AppendixRepairer extends LazyLogging {

  def apply(levelPath: Path,
            strategy: AppendixRepairStrategy)(implicit keyOrder: KeyOrder[Slice[Byte]],
                                              ec: ExecutionContext): Try[Unit] = {
    val reader = AppendixMapEntryReader(false, false, false)(keyOrder, KeyValueLimiter.none, _ => (), None, ec)
    import reader._
    import swaydb.core.map.serializer.AppendixMapEntryWriter._
    implicit val merger = AppendixSkipListMerger

    Try(FileUtil.files(levelPath, Extension.Seg)) flatMap {
      files =>
        files.tryMap(Segment(_, false, false, false, true)(keyOrder, KeyValueLimiter.none, _ => (), None, ec))
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
                Failure(
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
                               strategy: AppendixRepairStrategy)(implicit keyOrder: KeyOrder[Slice[Byte]]): Try[Int] =
    segments.tryFoldLeft(1) {
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
        } map {
          overlappingSegment =>
            applyRecovery(segment, overlappingSegment, strategy) map {
              _ =>
                //do not jump to next Segment, continue checking for overlapping Segments for the current Segment.
                return checkOverlappingSegments(segments.drop(position - 1).filter(_.existsOnDisk), strategy)
            }
        } getOrElse Success(position + 1)
    }

  def buildAppendixMap(appendixDir: Path,
                       segments: Slice[Segment])(implicit keyOrder: KeyOrder[Slice[Byte]],
                                                 writer: MapEntryWriter[MapEntry.Put[Slice[Byte], Segment]],
                                                 mapReader: MapEntryReader[MapEntry[Slice[Byte], Segment]],
                                                 skipListMerger: SkipListMerge[Slice[Byte], Segment],
                                                 ec: ExecutionContext): Try[Unit] =
    IO.walkDelete(appendixDir) flatMap {
      _ =>
        Map.persistent[Slice[Byte], Segment](appendixDir, false, flushOnOverflow = true, 1.gb) flatMap {
          appendix =>
            segments tryForeach {
              segment =>
                appendix.write(MapEntry.Put(segment.minKey, segment))
            } match {
              case Some(Failure(exception)) =>
                Failure(exception)
              case None =>
                TryUtil.successUnit
            }
        }
    }
}
