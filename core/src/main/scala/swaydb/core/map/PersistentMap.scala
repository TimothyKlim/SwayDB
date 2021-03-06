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

package swaydb.core.map

import com.typesafe.scalalogging.LazyLogging
import java.nio.file.Path
import java.util.concurrent.ConcurrentSkipListMap
import scala.annotation.tailrec
import scala.collection.JavaConverters._
import scala.collection.concurrent
import scala.concurrent.ExecutionContext
import scala.reflect.ClassTag
import swaydb.core.data.Memory
import swaydb.core.function.FunctionStore
import swaydb.core.io.file.{DBFile, IOEffect}
import swaydb.core.map.serializer.{MapCodec, MapEntryReader, MapEntryWriter}
import swaydb.core.queue.FileLimiter
import swaydb.core.util.Extension
import swaydb.core.io.file.IOEffect._
import swaydb.data.IO
import swaydb.data.IO._
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice

private[map] object PersistentMap extends LazyLogging {

  private[map] def apply[K, V: ClassTag](folder: Path,
                                         mmap: Boolean,
                                         flushOnOverflow: Boolean,
                                         fileSize: Long,
                                         dropCorruptedTailEntries: Boolean)(implicit keyOrder: KeyOrder[K],
                                                                            timeOrder: TimeOrder[Slice[Byte]],
                                                                            functionStore: FunctionStore,
                                                                            limiter: FileLimiter,
                                                                            reader: MapEntryReader[MapEntry[K, V]],
                                                                            writer: MapEntryWriter[MapEntry.Put[K, V]],
                                                                            skipListMerger: SkipListMerger[K, V],
                                                                            ec: ExecutionContext): IO[RecoveryResult[PersistentMap[K, V]]] = {
    IOEffect.createDirectoryIfAbsent(folder)
    val skipList: ConcurrentSkipListMap[K, V] = new ConcurrentSkipListMap[K, V](keyOrder)

    recover(folder, mmap, fileSize, skipList, dropCorruptedTailEntries) map {
      case (fileRecoveryResult, hasRange) =>
        RecoveryResult(
          item = new PersistentMap[K, V](folder, mmap, fileSize, flushOnOverflow, fileRecoveryResult.item, hasRangeInitial = hasRange)(skipList),
          result = fileRecoveryResult.result
        )
    }
  }

  private[map] def apply[K, V: ClassTag](folder: Path,
                                         mmap: Boolean,
                                         flushOnOverflow: Boolean,
                                         fileSize: Long)(implicit keyOrder: KeyOrder[K],
                                                         timeOrder: TimeOrder[Slice[Byte]],
                                                         limiter: FileLimiter,
                                                         functionStore: FunctionStore,
                                                         reader: MapEntryReader[MapEntry[K, V]],
                                                         writer: MapEntryWriter[MapEntry.Put[K, V]],
                                                         skipListMerger: SkipListMerger[K, V],
                                                         ec: ExecutionContext): IO[PersistentMap[K, V]] = {
    IOEffect.createDirectoryIfAbsent(folder)
    val skipList: ConcurrentSkipListMap[K, V] = new ConcurrentSkipListMap[K, V](keyOrder)

    firstFile(folder, mmap, fileSize) map {
      file =>
        new PersistentMap[K, V](folder, mmap, fileSize, flushOnOverflow, hasRangeInitial = false, currentFile = file)(skipList)
    }
  }

  private[map] def firstFile(folder: Path, memoryMapped: Boolean, fileSize: Long)(implicit ec: ExecutionContext,
                                                                                  limiter: FileLimiter): IO[DBFile] =
    if (memoryMapped)
      DBFile.mmapInit(folder.resolve(0.toLogFileId), fileSize, autoClose = false)
    else
      DBFile.channelWrite(folder.resolve(0.toLogFileId), autoClose = false)

  private[map] def recover[K, V](folder: Path,
                                 mmap: Boolean,
                                 fileSize: Long,
                                 skipList: ConcurrentSkipListMap[K, V],
                                 dropCorruptedTailEntries: Boolean)(implicit writer: MapEntryWriter[MapEntry.Put[K, V]],
                                                                    mapReader: MapEntryReader[MapEntry[K, V]],
                                                                    skipListMerger: SkipListMerger[K, V],
                                                                    keyOrder: KeyOrder[K],
                                                                    limiter: FileLimiter,
                                                                    timeOrder: TimeOrder[Slice[Byte]],
                                                                    functionStore: FunctionStore,
                                                                    ec: ExecutionContext): IO[(RecoveryResult[DBFile], Boolean)] = {
    //read all existing logs and populate skipList
    var hasRange: Boolean = false
    folder.files(Extension.Log) mapIO {
      path =>
        logger.info("{}: Recovering with dropCorruptedTailEntries = {}.", path, dropCorruptedTailEntries)
        DBFile.channelRead(path, autoClose = false) flatMap {
          file =>
            file.readAll flatMap {
              bytes =>
                logger.info("{}: Reading file.", path)
                MapCodec.read[K, V](bytes, dropCorruptedTailEntries) map {
                  recovery =>
                    logger.info("{}: Recovered! Populating in-memory map with recovered key-values.", path)
                    val entriesRecovered =
                      recovery.item.foldLeft(0) {
                        case (size, entry) =>
                          //when populating skipList do the same checks a PersistentMap does when writing key-values to the skipList.
                          //Use the merger to write key-values to skipList if the there a range, update or remove(with deadline).
                          //else simply write the key-values to the skipList. This logic should be abstracted out to a common function.
                          //See MapSpec for tests.
                          if (entry.hasRange) {
                            skipListMerger.insert(entry, skipList)
                            hasRange = true
                          } else if (hasRange || entry.hasUpdate || entry.hasRemoveDeadline) {
                            skipListMerger.insert(entry, skipList)
                          } else {
                            entry applyTo skipList
                          }
                          size + entry.entriesCount
                      }
                    logger.info(s"{}: Recovered {} ${if (entriesRecovered > 1) "entries" else "entry"}.", path, entriesRecovered)
                    RecoveryResult(file, recovery.result)
                }
            }
        }
    } flatMap {
      recoveredFiles =>
        nextFile(recoveredFiles.map(_.item), mmap, fileSize, skipList) getOrElse firstFile(folder, mmap, fileSize) map {
          file =>
            //if there was a failure recovering any one of the files, return the recovery with the failure result.
            (
              RecoveryResult(
                item = file,
                result = recoveredFiles.find(_.result.isFailure).map(_.result) getOrElse IO.unit
              ),
              hasRange
            )
        }
    }
  }

  /**
    * Creates nextFile by persisting the entries in skipList to the new file. This function does not
    * re-read oldFiles to apply the existing entries to skipList, skipList should already be populated with new entries.
    * This is to ensure that before deleting any of the old entries, a new file is successful created.
    *
    * oldFiles get deleted after the recovery is successful. In case of a failure an error message is logged.
    */
  private[map] def nextFile[K, V](oldFiles: Iterable[DBFile],
                                  mmap: Boolean,
                                  fileSize: Long,
                                  skipList: ConcurrentSkipListMap[K, V])(implicit reader: MapEntryReader[MapEntry[K, V]],
                                                                         writer: MapEntryWriter[MapEntry.Put[K, V]],
                                                                         limiter: FileLimiter,
                                                                         ec: ExecutionContext): Option[IO[DBFile]] =
    oldFiles.lastOption map {
      lastFile =>
        nextFile(lastFile, mmap, fileSize, skipList) flatMap {
          nextFile =>
            //Next file successfully created. delete all old files without the last which gets deleted by nextFile.
            oldFiles.dropRight(1).foreachIO(_.delete()) match {
              case Some(failure) =>
                logger.error(
                  "Recovery successful but failed to delete old log file. Delete this file manually and every other file except '{}' and reboot.",
                  nextFile.path,
                  failure.exception
                )
                IO.Failure(failure.exception)

              case None =>
                logger.info(s"Recovery successful")
                IO.Success(nextFile)
            }
        }
    }

  private[map] def nextFile[K, V](currentFile: DBFile,
                                  mmap: Boolean,
                                  size: Long,
                                  skipList: ConcurrentSkipListMap[K, V])(implicit writer: MapEntryWriter[MapEntry.Put[K, V]],
                                                                         mapReader: MapEntryReader[MapEntry[K, V]],
                                                                         limiter: FileLimiter,
                                                                         ec: ExecutionContext): IO[DBFile] =
    currentFile.path.incrementFileId flatMap {
      nextPath =>
        val bytes = MapCodec.write(skipList)
        val newFile =
          if (mmap)
            DBFile.mmapInit(path = nextPath, bufferSize = bytes.size + size, autoClose = false)
          else
            DBFile.channelWrite(nextPath, autoClose = false)

        newFile flatMap {
          newFile =>
            newFile.append(bytes) flatMap {
              _ =>
                currentFile.delete() flatMap {
                  _ =>
                    IO.Success(newFile)
                }
            }
        }
    }
}

private[map] case class PersistentMap[K, V: ClassTag](path: Path,
                                                      mmap: Boolean,
                                                      fileSize: Long,
                                                      flushOnOverflow: Boolean,
                                                      private var currentFile: DBFile,
                                                      private val hasRangeInitial: Boolean)(val skipList: ConcurrentSkipListMap[K, V])(implicit keyOrder: KeyOrder[K],
                                                                                                                                       timeOrder: TimeOrder[Slice[Byte]],
                                                                                                                                       limiter: FileLimiter,
                                                                                                                                       functionStore: FunctionStore,
                                                                                                                                       reader: MapEntryReader[MapEntry[K, V]],
                                                                                                                                       writer: MapEntryWriter[MapEntry.Put[K, V]],
                                                                                                                                       skipListMerger: SkipListMerger[K, V],
                                                                                                                                       ec: ExecutionContext) extends Map[K, V] with LazyLogging {

  // actualSize of the file can be different to fileSize when the entry's size is > fileSize.
  // In this case a file is created just to fit those bytes (for that one entry).
  // For eg: if fileSize is 4.mb and the entry size is 5.mb, a new file is created with 5.mb for that one entry.
  // all the subsequent entries get added to 4.mb files, if it fits, or else the size is extended again.
  private var actualFileSize: Long = fileSize
  // does not account of flushed entries.
  private var bytesWritten: Long = 0

  //_hasRange is not a case class input parameters because 2.11 throws compilation error 'values cannot be volatile'
  @volatile private var _hasRange: Boolean = hasRangeInitial

  @volatile private var writeCount: Long = 0L

  override def hasRange: Boolean = _hasRange

  def currentFilePath =
    currentFile.path

  def stateID: Long =
    writeCount

  override def write(mapEntry: MapEntry[K, V]): IO[Boolean] =
    synchronized {
      persist(mapEntry) onSuccessSideEffect {
        _ =>
          writeCount += 1
      }
    }

  /**
    * Before writing the Entry, check to ensure if the current [[MapEntry]] requires a merge write or direct write.
    *
    * Merge write should be used when
    * - The entry contains a [[Memory.Range]] key-value.
    * - The entry contains a [[Memory.Update]] Update key-value.
    * - The entry contains a [[Memory.Remove]] with deadline key-value. Removes without deadlines do not require merging.
    *
    * Note: These check are not required for Appendix writes because Appendix entries current do not use
    * Range, Update or key-values with deadline.
    */
  @tailrec
  private def persist(entry: MapEntry[K, V]): IO[Boolean] =
    if ((bytesWritten + entry.totalByteSize) <= actualFileSize)
      currentFile.append(MapCodec.write(entry)) map {
        _ =>
          //if this main contains range then use skipListMerge.
          if (entry.hasRange) {
            _hasRange = true //set hasRange to true before inserting so that reads start looking for floor key-values as the inserts are occurring.
            skipListMerger.insert(entry, skipList)
          } else if (entry.hasUpdate || entry.hasRemoveDeadline || _hasRange) {
            skipListMerger.insert(entry, skipList)
          } else {
            entry applyTo skipList
          }
          bytesWritten += entry.totalByteSize
          //          println("bytesWritten: " + bytesWritten)
          true
      }
    //flushOnOverflow is executed if the current file is empty, even if flushOnOverflow = false.
    else if (!flushOnOverflow && bytesWritten != 0)
      IO.`false`
    else {
      val nextFilesSize = entry.totalByteSize.toLong max fileSize
      PersistentMap.nextFile(currentFile, mmap, nextFilesSize, skipList) match {
        case IO.Success(newFile) =>
          currentFile = newFile
          actualFileSize = nextFilesSize
          bytesWritten = 0
          persist(entry)

        case IO.Failure(error) =>
          logger.error("{}: Failed to replace with new file", currentFile.path, error.exception)
          IO.Failure(error)
      }
    }

  override def close(): IO[Unit] =
    currentFile.close

  override def exists =
    currentFile.existsOnDisk

  override def delete: IO[Unit] =
    currentFile.delete() flatMap {
      _ =>
        IOEffect.delete(path) map {
          _ =>
            skipList.clear()
        }
    }

  override def asScala: concurrent.Map[K, V] =
    skipList.asScala

  override def pathOption: Option[Path] =
    Some(path)

  override def fileId: IO[Long] =
    path.fileId.map(_._1)
}
