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

package swaydb.core.map.serializer

import scala.annotation.implicitNotFound
import scala.collection.mutable.ListBuffer
import scala.concurrent.duration.Deadline
import scala.util.{Failure, Success, Try}
import swaydb.core.data.Value
import swaydb.core.data.Value.ApplyValue
import swaydb.core.io.reader.Reader
import swaydb.core.util.Bytes
import swaydb.core.util.TimeUtil._
import swaydb.data.slice.{Reader, Slice}

@implicitNotFound("Type class implementation not found for ValueSerializer of type ${T}")
trait ValueSerializer[T] {

  def write(value: T, bytes: Slice[Byte]): Unit

  def read(reader: Reader): Try[T]

  def read(bytes: Slice[Byte]): Try[T] =
    read(Reader(bytes))

  def bytesRequired(value: T): Int
}

object ValueSerializer {

  def readDeadline(reader: Reader): Try[Option[Deadline]] =
    reader.readLongUnsigned() map {
      deadline =>
        if (deadline == 0)
          None
        else
          deadline.toDeadlineOption
    }

  implicit object ValuePutSerializer extends ValueSerializer[Value.Put] {

    override def write(value: Value.Put, bytes: Slice[Byte]): Unit =
      bytes
        .addIntUnsigned(value.value.map(_.size).getOrElse(0))
        .addAll(value.value.getOrElse(Slice.emptyBytes))
        .addLongUnsigned(value.deadline.toNanos)

    override def bytesRequired(value: Value.Put): Int =
      Bytes.sizeOf(value.value.map(_.size).getOrElse(0)) +
        value.value.map(_.size).getOrElse(0) +
        Bytes.sizeOf(value.deadline.toNanos)

    override def read(reader: Reader): Try[Value.Put] =
      reader.readIntUnsigned() flatMap {
        valueLength =>
          if (valueLength == 0)
            readDeadline(reader) map {
              deadline =>
                Value.Put(None, deadline)
            }
          else
            reader.read(valueLength) flatMap {
              value =>
                readDeadline(reader) map {
                  deadline =>
                    Value.Put(Some(value), deadline)
                }
            }
      }
  }

  implicit object ValueRemoveSerializer extends ValueSerializer[Value.Remove] {

    override def write(value: Value.Remove, bytes: Slice[Byte]): Unit =
      bytes.addLongUnsigned(value.deadline.toNanos)

    override def bytesRequired(value: Value.Remove): Int =
      Bytes.sizeOf(value.deadline.toNanos)

    override def read(reader: Reader): Try[Value.Remove] =
      readDeadline(reader) map {
        deadline =>
          Value.Remove(deadline)
      }
  }

  implicit object ValueUpdateSerializer extends ValueSerializer[Value.Update] {

    override def write(value: Value.Update, bytes: Slice[Byte]): Unit =
      bytes
        .addIntUnsigned(value.value.map(_.size).getOrElse(0))
        .addAll(value.value.getOrElse(Slice.emptyBytes))
        .addLongUnsigned(value.deadline.toNanos)

    override def bytesRequired(value: Value.Update): Int =
      Bytes.sizeOf(value.value.map(_.size).getOrElse(0)) +
        value.value.map(_.size).getOrElse(0) +
        Bytes.sizeOf(value.deadline.toNanos)

    override def read(reader: Reader): Try[Value.Update] =
      reader.readIntUnsigned() flatMap {
        valueLength =>
          if (valueLength == 0)
            readDeadline(reader) map {
              deadline =>
                Value.Update(None, deadline)
            }
          else
            reader.read(valueLength) flatMap {
              value =>
                readDeadline(reader) map {
                  deadline =>
                    Value.Update(Some(value), deadline)
                }
            }
      }
  }

  implicit object ValueFunctionSerializer extends ValueSerializer[Value.Function] {
    override def write(value: Value.Function, bytes: Slice[Byte]): Unit =
      ValueSerializer.write((value.id, value.function))(bytes)

    override def bytesRequired(value: Value.Function): Int =
      ValueSerializer.bytesRequired((value.id, value.function))

    override def read(reader: Reader): Try[Value.Function] =
      ValueSerializer.read[(Slice[Byte], Slice[Byte])](reader) map {
        case (id, name) =>
          Value.Function(id, name)
      }
  }

  implicit object ValueAppliesSerializer extends ValueSerializer[Seq[Value.ApplyValue]] {

    override def write(value: Seq[Value.ApplyValue], bytes: Slice[Byte]): Unit =
      value foreach {
        case value: Value.Update =>
          ValueSerializer.write(value)(bytes.add(0.toByte))
        case value: Value.Function =>
          ValueSerializer.write(value)(bytes.add(1.toByte))
      }

    override def bytesRequired(value: Seq[Value.ApplyValue]): Int =
      value.foldLeft(value.size) {
        case (total, function) =>
          function match {
            case value: Value.Update =>
              total + ValueSerializer.bytesRequired(value)
            case value: Value.Function =>
              total + ValueSerializer.bytesRequired(value)
          }
      }

    override def read(reader: Reader): Try[Seq[Value.ApplyValue]] =
      reader.hasMore flatMap {
        case true =>
          reader.foldLeftTry(ListBuffer.empty[Value.ApplyValue]) {
            case (applies, reader) =>
              reader.get() flatMap {
                id =>
                  if (id == 0.toByte)
                    ValueSerializer.read[Value.Update](reader) map {
                      update =>
                        applies += update
                        applies
                    }
                  else if (id == 1.toByte)
                    ValueSerializer.read[Value.Function](reader) map {
                      update =>
                        applies += update
                        applies
                    }
                  else
                    Failure(new Exception(s"Invalid id:$id"))
              }
          }

        case false =>
          Success(Seq.empty)
      }
  }

  implicit object ValueApplySerializer extends ValueSerializer[Value.Apply] {

    override def write(value: Value.Apply, bytes: Slice[Byte]): Unit =
      ValueSerializer.write(value.applies)(bytes)

    override def bytesRequired(value: Value.Apply): Int =
      ValueSerializer.bytesRequired(value.applies)

    override def read(reader: Reader): Try[Value.Apply] =
      ValueSerializer.read[Seq[Value.ApplyValue]](reader) map Value.Apply
  }

  /**
    * Serializer for a tuple of Option bytes and sequence bytes.
    */
  implicit object OptionBytesAndSeqBytesSerializer extends ValueSerializer[(Option[Slice[Byte]], Seq[Slice[Byte]])] {
    def readSequenceBytes(reader: Reader): Try[Seq[Slice[Byte]]] =
      reader.readRemaining() flatMap {
        sequenceBytes =>
          Bytes.readSeq(sequenceBytes)
      }

    override def write(value: (Option[Slice[Byte]], Seq[Slice[Byte]]), bytes: Slice[Byte]): Unit =
      Bytes.writeTo(value._2) {
        bytes
          .addIntUnsigned(Bytes.sizeOf(value._1.map(_.size).getOrElse(0)))
          .addAll(value._1.getOrElse(Slice.emptyBytes))
      }

    override def bytesRequired(value: (Option[Slice[Byte]], Seq[Slice[Byte]])): Int = {
      val optionSize = value._1.map(_.size).getOrElse(0)
      val seqSize = Bytes.sizeOf(value._2)

      Bytes.sizeOf(optionSize) +
        optionSize +
        seqSize
    }

    override def read(reader: Reader): Try[(Option[Slice[Byte]], Seq[Slice[Byte]])] =
      reader.readIntUnsigned() flatMap {
        optionSize =>
          if (optionSize == 0)
            readSequenceBytes(reader) map {
              sequences =>
                (None, sequences)
            }
          else
            reader.read(optionSize) flatMap {
              optionBytes =>
                readSequenceBytes(reader) map {
                  sequences =>
                    (Some(optionBytes), sequences)
                }
            }
      }
  }

  /**
    * Serializer for a tuple of Option bytes and sequence bytes.
    */
  implicit object SeqOfBytesSerializer extends ValueSerializer[Seq[Slice[Byte]]] {

    override def write(value: Seq[Slice[Byte]], bytes: Slice[Byte]): Unit =
      Bytes.writeTo(value)(bytes)

    override def bytesRequired(value: Seq[Slice[Byte]]): Int =
      Bytes.sizeOf(value)

    override def read(reader: Reader): Try[Seq[Slice[Byte]]] =
      Bytes.readSeq(reader)
  }

  /**
    * Serializer for a tuple of Option bytes and sequence bytes.
    */
  implicit object TupleOfBytesSerializer extends ValueSerializer[(Slice[Byte], Slice[Byte])] {

    override def write(value: (Slice[Byte], Slice[Byte]), bytes: Slice[Byte]): Unit =
      Bytes.writeTo(Seq(value._1, value._2))(bytes)

    override def bytesRequired(value: (Slice[Byte], Slice[Byte])): Int =
      Bytes.sizeOf(Seq(value._1, value._2))

    override def read(reader: Reader): Try[(Slice[Byte], Slice[Byte])] =
      Bytes.readTuple(reader)
  }

  def write[T](value: T)(bytes: Slice[Byte])(implicit serializer: ValueSerializer[T]): Unit =
    serializer.write(value, bytes)

  def read[T](value: Slice[Byte])(implicit serializer: ValueSerializer[T]): Try[T] =
    serializer.read(value)

  def read[T](reader: Reader)(implicit serializer: ValueSerializer[T]): Try[T] =
    serializer.read(reader)

  def bytesRequired[T](value: T)(implicit serializer: ValueSerializer[T]): Int =
    serializer.bytesRequired(value)
}
