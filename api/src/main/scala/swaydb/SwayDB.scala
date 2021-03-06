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

package swaydb

import com.typesafe.scalalogging.LazyLogging
import java.nio.file.Path
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.{FiniteDuration, _}
import scala.concurrent.forkjoin.ForkJoinPool
import swaydb.core.BlockingCore
import swaydb.core.data._
import swaydb.core.function.FunctionStore
import swaydb.core.queue.FileLimiter
import swaydb.core.tool.AppendixRepairer
import swaydb.data.config._
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.repairAppendix.RepairResult.OverlappingSegments
import swaydb.data.repairAppendix._
import swaydb.data.slice.Slice
import swaydb.data.{IO, MaxKey}
import swaydb.serializers.Serializer

/**
  * Instance used for creating/initialising databases.
  */
object SwayDB extends LazyLogging {

  private implicit val memoryFunctionStore: FunctionStore = FunctionStore.memory()
  private implicit val timeOrder: TimeOrder[Slice[Byte]] = TimeOrder.long

  /**
    * Default execution context for all databases.
    *
    * This can be overridden by provided an implicit parameter in the scope of where the database is initialized.
    */
  def defaultExecutionContext = new ExecutionContext {
    val threadPool = new ForkJoinPool(100)

    def execute(runnable: Runnable) =
      threadPool execute runnable

    def reportFailure(exception: Throwable): Unit =
      logger.error("Execution context failure", exception)
  }

  /**
    * Creates a database based on the input config.
    *
    * @param config                 Configuration to use to create the database
    * @param maxSegmentsOpen        Number of concurrent opened Segments
    * @param cacheSize              Size of in-memory key-values. For Memory database this set the size of uncompressed key-values.
    *                               If compression is used for memory database the this field can be ignored.
    * @param cacheCheckDelay        Sets the max interval at which key-values get dropped from the cache. The delays
    *                               are dynamically adjusted based on the current size of the cache to stay close the set
    *                               cacheSize.
    *                               If compression is not used for memory database the this field can be ignored.
    * @param segmentsOpenCheckDelay For persistent Levels only. This can property is not used for databases.
    *                               Sets the max interval at which Segments get closed. The delays
    *                               are dynamically adjusted based on the current number of open Segments.
    * @param keySerializer          Converts keys to Bytes
    * @param valueSerializer        Converts values to Bytes
    * @param keyOrder               Sort order for keys
    * @param ec                     ExecutionContext
    * @tparam K Type of key
    * @tparam V Type of value
    * @return Database instance
    */
  def apply[K, V](config: SwayDBPersistentConfig,
                  maxSegmentsOpen: Int,
                  cacheSize: Int,
                  cacheCheckDelay: FiniteDuration,
                  segmentsOpenCheckDelay: FiniteDuration)(implicit keySerializer: Serializer[K],
                                                          valueSerializer: Serializer[V],
                                                          keyOrder: KeyOrder[Slice[Byte]],
                                                          ec: ExecutionContext): IO[swaydb.Map[K, V, IO]] =
    BlockingCore(
      config = config,
      maxOpenSegments = maxSegmentsOpen,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      db =>
        swaydb.Map[K, V, IO](db)
    }

  def apply[T](config: SwayDBPersistentConfig,
               maxSegmentsOpen: Int,
               cacheSize: Int,
               cacheCheckDelay: FiniteDuration,
               segmentsOpenCheckDelay: FiniteDuration)(implicit serializer: Serializer[T],
                                                       keyOrder: KeyOrder[Slice[Byte]],
                                                       ec: ExecutionContext): IO[swaydb.Set[T, IO]] =
    BlockingCore(
      config = config,
      maxOpenSegments = maxSegmentsOpen,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      db =>
        swaydb.Set[T](db)
    }

  def apply[K, V](config: SwayDBMemoryConfig,
                  cacheSize: Int,
                  cacheCheckDelay: FiniteDuration)(implicit keySerializer: Serializer[K],
                                                   valueSerializer: Serializer[V],
                                                   keyOrder: KeyOrder[Slice[Byte]],
                                                   ec: ExecutionContext): IO[swaydb.Map[K, V, IO]] =
    BlockingCore(
      config = config,
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      db =>
        swaydb.Map[K, V, IO](db)
    }

  def apply[T](config: SwayDBMemoryConfig,
               cacheSize: Int,
               cacheCheckDelay: FiniteDuration)(implicit serializer: Serializer[T],
                                                keyOrder: KeyOrder[Slice[Byte]],
                                                ec: ExecutionContext): IO[swaydb.Set[T, IO]] =
    BlockingCore(
      config = config,
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      db =>
        swaydb.Set[T](db)
    }

  def apply[T](config: LevelZeroConfig)(implicit serializer: Serializer[T],
                                        keyOrder: KeyOrder[Slice[Byte]],
                                        ec: ExecutionContext): IO[swaydb.Set[T, IO]] =
    BlockingCore(
      config = config
    ) map {
      db =>
        swaydb.Set[T](db)
    }

  private def toCoreFunctionOutput[V](output: swaydb.Apply[V])(implicit valueSerializer: Serializer[V]): SwayFunctionOutput =
    output match {
      case Apply.Nothing =>
        SwayFunctionOutput.Nothing

      case Apply.Remove =>
        SwayFunctionOutput.Remove

      case Apply.Expire(deadline) =>
        SwayFunctionOutput.Expire(deadline)

      case update: Apply.Update[V] =>
        val untypedValue: Slice[Byte] = valueSerializer.write(update.value)
        SwayFunctionOutput.Update(Some(untypedValue), update.deadline)
    }

  private[swaydb] def toCoreFunction[K, V](f: (K, Option[Deadline]) => Apply[V])(implicit keySerializer: Serializer[K],
                                                                                 valueSerializer: Serializer[V]): swaydb.core.data.SwayFunction = {
    import swaydb.serializers._

    def function(key: Slice[Byte], deadline: Option[Deadline]) =
      toCoreFunctionOutput(f(key.read[K], deadline))

    swaydb.core.data.SwayFunction.KeyDeadline(function)
  }

  private[swaydb] def toCoreFunction[K, V](f: (K, V, Option[Deadline]) => Apply[V])(implicit keySerializer: Serializer[K],
                                                                                    valueSerializer: Serializer[V]): swaydb.core.data.SwayFunction = {
    import swaydb.serializers._

    def function(key: Slice[Byte], value: Option[Slice[Byte]], deadline: Option[Deadline]) =
      toCoreFunctionOutput(f(key.read[K], value.read[V], deadline))

    swaydb.core.data.SwayFunction.KeyValueDeadline(function)
  }

  private[swaydb] def toCoreFunction[K, V](f: V => Apply[V])(implicit valueSerializer: Serializer[V]): swaydb.core.data.SwayFunction = {
    import swaydb.serializers._

    def function(value: Option[Slice[Byte]]) =
      toCoreFunctionOutput(f(value.read[V]))

    swaydb.core.data.SwayFunction.Value(function)
  }

  /**
    * Documentation: http://www.swaydb.io/api/repairAppendix
    */
  def repairAppendix[K](levelPath: Path,
                        repairStrategy: AppendixRepairStrategy)(implicit serializer: Serializer[K],
                                                                fileLimiter: FileLimiter,
                                                                keyOrder: KeyOrder[Slice[Byte]] = KeyOrder.default,
                                                                ec: ExecutionContext = defaultExecutionContext): IO[RepairResult[K]] =
  //convert to typed result.
    AppendixRepairer(levelPath, repairStrategy) match {
      case IO.Failure(IO.Error.Fatal(OverlappingSegmentsException(segmentInfo, overlappingSegmentInfo))) =>
        IO.Success(
          OverlappingSegments[K](
            segmentInfo =
              SegmentInfo(
                path = segmentInfo.path,
                minKey = serializer.read(segmentInfo.minKey),
                maxKey =
                  segmentInfo.maxKey match {
                    case MaxKey.Fixed(maxKey) =>
                      MaxKey.Fixed(serializer.read(maxKey))

                    case MaxKey.Range(fromKey, maxKey) =>
                      MaxKey.Range(fromKey = serializer.read(fromKey), maxKey = serializer.read(maxKey))
                  },
                segmentSize = segmentInfo.segmentSize,
                keyValueCount = segmentInfo.keyValueCount
              ),
            overlappingSegmentInfo =
              SegmentInfo(
                path = overlappingSegmentInfo.path,
                minKey = serializer.read(overlappingSegmentInfo.minKey),
                maxKey =
                  overlappingSegmentInfo.maxKey match {
                    case MaxKey.Fixed(maxKey) =>
                      MaxKey.Fixed(serializer.read(maxKey))

                    case MaxKey.Range(fromKey, maxKey) =>
                      MaxKey.Range(fromKey = serializer.read(fromKey), maxKey = serializer.read(maxKey))
                  },
                segmentSize = overlappingSegmentInfo.segmentSize,
                keyValueCount = overlappingSegmentInfo.keyValueCount
              )
          )
        )
      case IO.Failure(error) =>
        IO.Failure(error)

      case IO.Success(_) =>
        IO.Success(RepairResult.Repaired)
    }
}