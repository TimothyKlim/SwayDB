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
import swaydb.core.data.{Time, Value}
import swaydb.core.io.reader.Reader
import swaydb.core.util.Bytes
import swaydb.core.util.TimeUtil._
import swaydb.data.slice.{Reader, Slice}

@implicitNotFound("Type class implementation not found for ValueSerializer of type ${T}")
sealed trait ValueSerializer[T] {

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
      ValueSerializer.write((value.function, value.time.map(_.time)))(bytes)(TupleBytesAndOptionBytesSerializer)

    override def bytesRequired(value: Value.Function): Int =
      ValueSerializer.bytesRequired((value.function, value.time.map(_.time)))(TupleBytesAndOptionBytesSerializer)

    override def read(reader: Reader): Try[Value.Function] =
      ValueSerializer.read[(Slice[Byte], Option[Slice[Byte]])](reader) map {
        case (function, time) =>
          Value.Function(function, time.map(Time(_)))
      }
  }

  implicit object ValueAppliesSerializer extends ValueSerializer[Slice[Value.Apply]] {

    override def write(value: Slice[Value.Apply], bytes: Slice[Byte]): Unit = {
      bytes.addIntUnsigned(value.size)

      value foreach {
        case value: Value.Update =>
          ValueSerializer.write(value)(bytes.add(0.toByte))
        case value: Value.Function =>
          ValueSerializer.write(value)(bytes.add(1.toByte))
        case value: Value.Remove =>
          ValueSerializer.write(value)(bytes.add(2.toByte))
      }
    }

    override def bytesRequired(value: Slice[Value.Apply]): Int =
      value.foldLeft(Bytes.sizeOf(value.size)) {
        case (total, function) =>
          function match {
            case value: Value.Update =>
              total + ValueSerializer.bytesRequired(value)
            case value: Value.Function =>
              total + ValueSerializer.bytesRequired(value)
            case value: Value.Remove =>
              total + ValueSerializer.bytesRequired(value)
          }
      }

    override def read(reader: Reader): Try[Slice[Value.Apply]] =
      reader.readIntUnsigned() flatMap {
        count =>
          reader.foldLeftTry(Slice.create[Value.Apply](count)) {
            case (applies, reader) =>
              reader.get() flatMap {
                id =>
                  if (id == 0.toByte)
                    ValueSerializer.read[Value.Update](reader) map {
                      update =>
                        applies add update
                        applies
                    }
                  else if (id == 1.toByte)
                    ValueSerializer.read[Value.Function](reader) map {
                      update =>
                        applies add update
                        applies
                    }
                  else if (id == 2.toByte)
                    ValueSerializer.read[Value.Remove](reader) map {
                      update =>
                        applies add update
                        applies
                    }
                  else
                    Failure(new Exception(s"Invalid id:$id"))
              }
          }
      }
  }

  implicit object ValueApplySerializer extends ValueSerializer[Value.PendingApply] {

    override def write(value: Value.PendingApply, bytes: Slice[Byte]): Unit =
      ValueSerializer.write(value.applies)(bytes)

    override def bytesRequired(value: Value.PendingApply): Int =
      ValueSerializer.bytesRequired(value.applies)

    override def read(reader: Reader): Try[Value.PendingApply] =
      ValueSerializer.read[Slice[Value.Apply]](reader) map Value.PendingApply
  }

  /**
    * Serializer for a tuple of Option bytes and sequence bytes.
    */
  implicit object SeqOfBytesSerializer extends ValueSerializer[Seq[Slice[Byte]]] {

    override def write(values: Seq[Slice[Byte]], bytes: Slice[Byte]): Unit =
      values foreach {
        value =>
          bytes
            .addIntUnsigned(value.size)
            .addAll(value)
      }

    override def bytesRequired(values: Seq[Slice[Byte]]): Int =
      values.foldLeft(0) {
        case (size, valueBytes) =>
          size + Bytes.sizeOf(valueBytes.size) + valueBytes.size
      }

    override def read(reader: Reader): Try[Seq[Slice[Byte]]] =
      reader.foldLeftTry(ListBuffer.empty[Slice[Byte]]) {
        case (result, reader) =>
          reader.readIntUnsigned() flatMap {
            size =>
              reader.read(size) map {
                bytes =>
                  result += bytes
              }
          }
      }
  }

  /**
    * Serializer for a tuple of Option bytes and sequence bytes.
    */
  implicit object TupleOfBytesSerializer extends ValueSerializer[(Slice[Byte], Slice[Byte])] {

    override def write(value: (Slice[Byte], Slice[Byte]), bytes: Slice[Byte]): Unit =
      SeqOfBytesSerializer.write(Seq(value._1, value._2), bytes)

    override def bytesRequired(value: (Slice[Byte], Slice[Byte])): Int =
      SeqOfBytesSerializer.bytesRequired(Seq(value._1, value._2))

    override def read(reader: Reader): Try[(Slice[Byte], Slice[Byte])] =
      SeqOfBytesSerializer.read(reader) flatMap {
        bytes =>
          if (bytes.size != 2)
            Failure(new Exception(TupleOfBytesSerializer.getClass.getSimpleName + s".read did not return a tuple. Size = ${bytes.size}"))
          else
            Success(bytes.head, bytes.last)
      }
  }

  /**
    * Serializer for a tuple of Option bytes and sequence bytes.
    */
  implicit object TupleBytesAndOptionBytesSerializer extends ValueSerializer[(Slice[Byte], Option[Slice[Byte]])] {

    override def write(value: (Slice[Byte], Option[Slice[Byte]]), bytes: Slice[Byte]): Unit =
      value._2 match {
        case Some(second) =>
          bytes.addIntSigned(1)
          ValueSerializer.write[(Slice[Byte], Slice[Byte])]((value._1, second))(bytes)
        case None =>
          bytes.addIntSigned(0)
          bytes.addAll(value._1)
      }

    override def bytesRequired(value: (Slice[Byte], Option[Slice[Byte]])): Int =
      value._2 match {
        case Some(second) =>
          1 +
            ValueSerializer.bytesRequired[(Slice[Byte], Slice[Byte])](value._1, second)
        case None =>
          1 +
            value._1.size
      }

    override def read(reader: Reader): Try[(Slice[Byte], Option[Slice[Byte]])] =
      reader.readIntUnsigned() flatMap {
        id =>
          if (id == 0)
            reader.readRemaining() map {
              all =>
                (all, None)
            }
          else
            ValueSerializer.read[(Slice[Byte], Slice[Byte])](reader) map {
              case (left, right) =>
                (left, Some(right))
            }
      }
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
