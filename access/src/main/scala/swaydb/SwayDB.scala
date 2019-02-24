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
import swaydb.core.BlockingCoreAPI
import swaydb.core.data._
import swaydb.core.function.FunctionStore
import swaydb.core.queue.FileLimiter
import swaydb.core.tool.AppendixRepairer
import swaydb.data.MaxKey
import swaydb.data.accelerate.Level0Meter
import swaydb.data.compaction.LevelMeter
import swaydb.data.config._
import swaydb.data.io.IO
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.repairAppendix.RepairResult.OverlappingSegments
import swaydb.data.repairAppendix._
import swaydb.data.slice.Slice
import swaydb.data.transaction.Prepare
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
    * @param ordering               Sort order for keys
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
                                                          ec: ExecutionContext): IO[swaydb.Map[K, V]] =
    BlockingCoreAPI(
      config = config,
      maxOpenSegments = maxSegmentsOpen,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        swaydb.Map[K, V](new SwayDB(core))
    }

  def apply[T](config: SwayDBPersistentConfig,
               maxSegmentsOpen: Int,
               cacheSize: Int,
               cacheCheckDelay: FiniteDuration,
               segmentsOpenCheckDelay: FiniteDuration)(implicit serializer: Serializer[T],
                                                       keyOrder: KeyOrder[Slice[Byte]],
                                                       ec: ExecutionContext): IO[swaydb.Set[T]] =
    BlockingCoreAPI(
      config = config,
      maxOpenSegments = maxSegmentsOpen,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = segmentsOpenCheckDelay
    ) map {
      core =>
        swaydb.Set[T](new SwayDB(core))
    }

  def apply[K, V](config: SwayDBMemoryConfig,
                  cacheSize: Int,
                  cacheCheckDelay: FiniteDuration)(implicit keySerializer: Serializer[K],
                                                   valueSerializer: Serializer[V],
                                                   keyOrder: KeyOrder[Slice[Byte]],
                                                   ec: ExecutionContext): IO[swaydb.Map[K, V]] =
    BlockingCoreAPI(
      config = config,
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      core =>
        swaydb.Map[K, V](new SwayDB(core))
    }

  def apply[T](config: SwayDBMemoryConfig,
               cacheSize: Int,
               cacheCheckDelay: FiniteDuration)(implicit serializer: Serializer[T],
                                                keyOrder: KeyOrder[Slice[Byte]],
                                                ec: ExecutionContext): IO[swaydb.Set[T]] =
    BlockingCoreAPI(
      config = config,
      maxOpenSegments = 0,
      cacheSize = cacheSize,
      cacheCheckDelay = cacheCheckDelay,
      segmentsOpenCheckDelay = Duration.Zero
    ) map {
      core =>
        swaydb.Set[T](new SwayDB(core))
    }

  def apply[T](config: LevelZeroConfig)(implicit serializer: Serializer[T],
                                        keyOrder: KeyOrder[Slice[Byte]],
                                        ec: ExecutionContext): IO[swaydb.Set[T]] =
    BlockingCoreAPI(
      config = config
    ) map {
      core =>
        swaydb.Set[T](new SwayDB(core))
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

private[swaydb] class SwayDB(api: BlockingCoreAPI) {

  def put(key: Slice[Byte]) =
    api.put(key)

  def put(key: Slice[Byte], value: Option[Slice[Byte]]): IO[Level0Meter] =
    api.put(key, value)

  def put(key: Slice[Byte], value: Option[Slice[Byte]], expireAt: Deadline): IO[Level0Meter] =
    api.put(key, value, expireAt)

  def update(key: Slice[Byte], value: Option[Slice[Byte]]): IO[Level0Meter] =
    api.update(key, value)

  def update(from: Slice[Byte], to: Slice[Byte], value: Option[Slice[Byte]]): IO[Level0Meter] =
    api.update(from, to, value)

  def expire(key: Slice[Byte], at: Deadline): IO[Level0Meter] =
    api.remove(key, at)

  def expire(from: Slice[Byte], to: Slice[Byte], at: Deadline): IO[Level0Meter] =
    api.remove(from, to, at)

  def remove(key: Slice[Byte]) =
    api.remove(key)

  def remove(from: Slice[Byte], to: Slice[Byte]): IO[Level0Meter] =
    api.remove(from, to)

  def function(key: Slice[Byte], function: Slice[Byte]) =
    api.function(key, function)

  def function(from: Slice[Byte], to: Slice[Byte], function: Slice[Byte]): IO[Level0Meter] =
    api.function(from, to, function)

  def registerFunction(functionID: Slice[Byte], function: swaydb.core.data.SwayFunction): swaydb.core.data.SwayFunction =
    api.registerFunction(functionID, function)

  def commit(prepare: Iterable[Prepare[Slice[Byte], Option[Slice[Byte]]]]) =
    api.put(prepare)

  def head: IO[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.head

  def last: IO[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.last

  def keyValueCount: IO[Int] =
    api.bloomFilterKeyValueCount

  def contains(key: Slice[Byte]): IO[Boolean] =
    api contains key

  def mightContain(key: Slice[Byte]): IO[Boolean] =
    api mightContain key

  def get(key: Slice[Byte]): IO[Option[Option[Slice[Byte]]]] =
    api.get(key)

  def getKey(key: Slice[Byte]): IO[Option[Slice[Byte]]] =
    api.getKey(key)

  def getKeyValue(key: Slice[Byte]): IO[Option[(Slice[Byte], Option[Slice[Byte]])]] =
    api.getKeyValue(key)

  def beforeKey(key: Slice[Byte]) =
    api.beforeKey(key)

  def before(key: Slice[Byte]) =
    api.before(key)

  def afterKey(key: Slice[Byte]) =
    api.afterKey(key)

  def after(key: Slice[Byte]) =
    api.after(key)

  def headKey: IO[Option[Slice[Byte]]] =
    api.headKey

  def lastKey: IO[Option[Slice[Byte]]] =
    api.lastKey

  def sizeOfSegments: Long =
    api.sizeOfSegments

  def level0Meter: Level0Meter =
    api.level0Meter

  def levelMeter(levelNumber: Int): Option[LevelMeter] =
    api.levelMeter(levelNumber)

  def valueSize(key: Slice[Byte]): IO[Option[Int]] =
    api.valueSize(key)

  def deadline(key: Slice[Byte]): IO[Option[Deadline]] =
    api.deadline(key)
}