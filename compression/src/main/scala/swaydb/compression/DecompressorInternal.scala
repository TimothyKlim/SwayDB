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

package swaydb.compression

import net.jpountz.lz4.{LZ4Factory, LZ4FastDecompressor, LZ4SafeDecompressor}
import org.xerial.snappy
import swaydb.data.IO
import swaydb.data.compression.LZ4Decompressor.{FastDecompressor, SafeDecompressor}
import swaydb.data.compression.LZ4Instance._
import swaydb.data.compression.{DecompressorId, LZ4Decompressor, LZ4Instance}
import swaydb.data.slice.Slice
import swaydb.data.util.PipeOps._

private[swaydb] sealed trait DecompressorInternal {

  val id: Int

  def decompress(slice: Slice[Byte],
                 decompressLength: Int): IO[Slice[Byte]]
}

private[swaydb] object DecompressorInternal {

  private[swaydb] sealed trait LZ4 extends DecompressorInternal

  def apply(id: Int): IO[DecompressorInternal] =
    DecompressorId(id) map {
      id =>
        IO(apply(id))
    } getOrElse {
      IO.Failure(DecompressException.InvalidDecompressorId(id))
    }

  def apply(instance: LZ4Instance,
            decompressor: LZ4Decompressor): DecompressorInternal.LZ4 =
    decompressorId(instance, decompressor) ==> {
      id =>
        DecompressorInternal(id)
    }

  private def decompressorId(lz4Instance: LZ4Instance,
                             lZ4Decompressor: LZ4Decompressor): DecompressorId.LZ4DecompressorId =
    (lz4Instance, lZ4Decompressor) match {
      //@formatter:off
      case (FastestInstance, FastDecompressor) =>     DecompressorId.LZ4FastestInstance.FastDecompressor
      case (FastestInstance, SafeDecompressor) =>     DecompressorId.LZ4FastestInstance.SafeDecompressor
      case (FastestJavaInstance, FastDecompressor) => DecompressorId.LZ4FastestJavaInstance.FastDecompressor
      case (FastestJavaInstance, SafeDecompressor) => DecompressorId.LZ4FastestJavaInstance.SafeDecompressor
      case (NativeInstance, FastDecompressor) =>      DecompressorId.LZ4NativeInstance.FastDecompressor
      case (NativeInstance, SafeDecompressor) =>      DecompressorId.LZ4NativeInstance.SafeDecompressor
      case (SafeInstance, FastDecompressor) =>        DecompressorId.LZ4SafeInstance.FastDecompressor
      case (SafeInstance, SafeDecompressor) =>        DecompressorId.LZ4SafeInstance.SafeDecompressor
      case (UnsafeInstance, FastDecompressor) =>      DecompressorId.LZ4UnsafeInstance.FastDecompressor
      case (UnsafeInstance, SafeDecompressor) =>      DecompressorId.LZ4UnsafeInstance.SafeDecompressor
      //@formatter:on
    }

  def apply(id: DecompressorId): DecompressorInternal =
    id match {
      //@formatter:off
      case DecompressorId.Snappy.Default =>                           Snappy
      case DecompressorId.UnCompressedGroup =>                        UnCompressedGroup
      case id: DecompressorId.LZ4DecompressorId =>                    DecompressorInternal(id)
      //@formatter:on
    }

  def apply(id: DecompressorId.LZ4DecompressorId): DecompressorInternal.LZ4 =
    id match {
      //@formatter:off
      case DecompressorId.LZ4FastestInstance.FastDecompressor =>      LZ4Fast(id.id, LZ4Factory.fastestInstance().fastDecompressor())
      case DecompressorId.LZ4FastestInstance.SafeDecompressor =>      LZ4Safe(id.id, LZ4Factory.fastestInstance().safeDecompressor())
      case DecompressorId.LZ4FastestJavaInstance.FastDecompressor =>  LZ4Fast(id.id, LZ4Factory.fastestJavaInstance().fastDecompressor())
      case DecompressorId.LZ4FastestJavaInstance.SafeDecompressor =>  LZ4Safe(id.id, LZ4Factory.fastestJavaInstance().safeDecompressor())
      case DecompressorId.LZ4NativeInstance.FastDecompressor =>       LZ4Fast(id.id, LZ4Factory.nativeInstance().fastDecompressor())
      case DecompressorId.LZ4NativeInstance.SafeDecompressor =>       LZ4Safe(id.id, LZ4Factory.nativeInstance().safeDecompressor())
      case DecompressorId.LZ4SafeInstance.FastDecompressor =>         LZ4Fast(id.id, LZ4Factory.safeInstance().fastDecompressor())
      case DecompressorId.LZ4SafeInstance.SafeDecompressor =>         LZ4Safe(id.id, LZ4Factory.safeInstance().safeDecompressor())
      case DecompressorId.LZ4UnsafeInstance.FastDecompressor =>       LZ4Fast(id.id, LZ4Factory.unsafeInstance().fastDecompressor())
      case DecompressorId.LZ4UnsafeInstance.SafeDecompressor =>       LZ4Safe(id.id, LZ4Factory.unsafeInstance().safeDecompressor())
      //@formatter:on
    }

  private[swaydb] case class LZ4Fast(id: Int,
                                     decompressor: LZ4FastDecompressor) extends DecompressorInternal.LZ4 {

    override def decompress(slice: Slice[Byte],
                            decompressLength: Int): IO[Slice[Byte]] =
      IO(Slice(decompressor.decompress(slice.toArray, decompressLength)))
  }

  private[swaydb] case class LZ4Safe(id: Int,
                                     decompressor: LZ4SafeDecompressor) extends DecompressorInternal.LZ4 {

    override def decompress(slice: Slice[Byte],
                            decompressLength: Int): IO[Slice[Byte]] =
      IO(Slice(decompressor.decompress(slice.toArray, decompressLength)))
  }

  private[swaydb] case object UnCompressedGroup extends DecompressorInternal {

    override val id: Int = DecompressorId.UnCompressedGroup.id

    override def decompress(slice: Slice[Byte],
                            decompressLength: Int): IO[Slice[Byte]] =
      IO.Success(slice)
  }

  private[swaydb] case object Snappy extends DecompressorInternal {

    override val id: Int = DecompressorId.Snappy.Default.id

    override def decompress(slice: Slice[Byte],
                            decompressLength: Int): IO[Slice[Byte]] =
      IO(snappy.Snappy.uncompress(slice.toArray)) map (Slice(_))
  }

  def random(): IO[DecompressorInternal] =
    DecompressorInternal(DecompressorId.randomIntId())

  def randomLZ4(): DecompressorInternal.LZ4 =
    DecompressorInternal(DecompressorId.randomLZ4Id())
}