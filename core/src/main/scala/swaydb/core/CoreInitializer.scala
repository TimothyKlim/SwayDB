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

package swaydb.core

import com.typesafe.scalalogging.LazyLogging
import java.nio.file.Paths
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.FiniteDuration
import swaydb.core.function.FunctionStore
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.level.zero.LevelZero
import swaydb.core.level.{Level, LevelRef, TrashLevel}
import swaydb.core.queue.{FileLimiter, KeyValueLimiter}
import swaydb.core.io.file.IOEffect._
import swaydb.data.IO
import swaydb.data.config._
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice
import swaydb.data.storage.{AppendixStorage, LevelStorage}

private[core] object CoreInitializer extends LazyLogging {

  /**
    * Closes all the open files and releases the locks on database folders.
    */
  private def addShutdownHook(zero: LevelZero): Unit =
    sys.addShutdownHook {
      logger.info("Closing files.")
      zero.close.failed foreach {
        exception =>
          logger.error("Failed to close Levels.", exception)
      }

      logger.info("Releasing database locks.")
      zero.releaseLocks.failed foreach {
        exception =>
          logger.error("Failed to release locks.", exception)
      }
    }

  def apply(config: LevelZeroConfig)(implicit ec: ExecutionContext,
                                     keyOrder: KeyOrder[Slice[Byte]],
                                     timeOrder: TimeOrder[Slice[Byte]],
                                     functionStore: FunctionStore): IO[BlockingCore[IO]] = {
    implicit val fileLimiter = FileLimiter.empty
    LevelZero(
      mapSize = config.mapSize,
      storage = config.storage,
      nextLevel = None,
      throttleOn = false,
      acceleration = config.acceleration
    ) map {
      zero =>
        addShutdownHook(zero)
        BlockingCore[IO](zero)
    }
  }

  def apply(config: SwayDBConfig,
            maxSegmentsOpen: Int,
            cacheSize: Long,
            keyValueQueueDelay: FiniteDuration,
            segmentCloserDelay: FiniteDuration)(implicit ec: ExecutionContext,
                                                keyOrder: KeyOrder[Slice[Byte]],
                                                timeOrder: TimeOrder[Slice[Byte]],
                                                functionStore: FunctionStore): IO[BlockingCore[IO]] = {
    implicit val fileOpenLimiter: FileLimiter =
      FileLimiter(maxSegmentsOpen, segmentCloserDelay)

    implicit val keyValueLimiter: KeyValueLimiter =
      KeyValueLimiter(cacheSize, keyValueQueueDelay)

    def createLevel(id: Long,
                    nextLevel: Option[LevelRef],
                    config: LevelConfig): IO[LevelRef] =
      config match {
        case config: MemoryLevelConfig =>
          implicit val compression: Option[KeyValueGroupingStrategyInternal] = config.groupingStrategy map KeyValueGroupingStrategyInternal.apply
          Level(
            levelStorage = LevelStorage.Memory(dir = Paths.get("MEMORY_LEVEL").resolve(id.toString)),
            segmentSize = config.segmentSize,
            nextLevel = nextLevel,
            pushForward = config.pushForward,
            appendixStorage = AppendixStorage.Memory,
            bloomFilterFalsePositiveRate = config.bloomFilterFalsePositiveRate,
            throttle = config.throttle,
            compressDuplicateValues = config.compressDuplicateValues,
            deleteSegmentsEventually = config.deleteSegmentsEventually
          )

        case config: PersistentLevelConfig =>
          implicit val compression: Option[KeyValueGroupingStrategyInternal] = config.groupingStrategy map KeyValueGroupingStrategyInternal.apply
          Level(
            levelStorage =
              LevelStorage.Persistent(
                mmapSegmentsOnWrite = config.mmapSegment.mmapWrite,
                mmapSegmentsOnRead = config.mmapSegment.mmapRead,
                dir = config.dir.resolve(id.toString),
                otherDirs = config.otherDirs.map(dir => dir.copy(path = dir.path.resolve(id.toString)))
              ),
            segmentSize = config.segmentSize,
            nextLevel = nextLevel,
            pushForward = config.pushForward,
            appendixStorage = AppendixStorage.Persistent(config.mmapAppendix, config.appendixFlushCheckpointSize),
            bloomFilterFalsePositiveRate = config.bloomFilterFalsePositiveRate,
            throttle = config.throttle,
            compressDuplicateValues = config.compressDuplicateValues,
            deleteSegmentsEventually = config.deleteSegmentsEventually
          )

        case TrashLevelConfig =>
          IO.Success(TrashLevel)
      }

    def createLevels(levelConfigs: List[LevelConfig],
                     previousLowerLevel: Option[LevelRef]): IO[BlockingCore[IO]] =
      levelConfigs match {
        case Nil =>
          createLevel(1, previousLowerLevel, config.level1) flatMap {
            level1 =>
              LevelZero(
                mapSize = config.level0.mapSize,
                storage = config.level0.storage,
                nextLevel = Some(level1),
                throttleOn = true,
                acceleration = config.level0.acceleration
              ) map {
                zero =>
                  addShutdownHook(zero)
                  BlockingCore(zero)
              }
          }

        case lowestLevelConfig :: upperLevelConfigs =>

          val levelNumber: Long =
            previousLowerLevel
              .flatMap(_.paths.headOption.map(_.path.folderId - 1))
              .getOrElse(levelConfigs.size + 1)

          createLevel(levelNumber, previousLowerLevel, lowestLevelConfig) flatMap {
            newLowerLevel =>
              createLevels(upperLevelConfigs, Some(newLowerLevel))
          }
      }

    logger.info(s"Starting ${config.otherLevels.size} configured Levels.")
    createLevels(config.otherLevels.reverse, None)
  }

}
