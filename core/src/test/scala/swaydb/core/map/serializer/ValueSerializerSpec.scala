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

import org.scalatest.{Matchers, WordSpec}
import swaydb.core.data.Value
import swaydb.core.{CommonAssertions, TryAssert}
import swaydb.data.slice.Slice
import swaydb.serializers._
import swaydb.serializers.Default._

class ValueSerializerSpec extends WordSpec with Matchers with TryAssert with CommonAssertions {

  "Remove" in {
    runThis(30.times) {
      val value = Value.Remove(randomDeadlineOption, randomNextTimeOption)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[Value.Remove](bytes).assertGet shouldBe value
    }
  }

  "Put" in {
    runThis(30.times) {
      val value = Value.Put(randomStringOption, randomDeadlineOption, randomNextTimeOption)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[Value.Put](bytes).assertGet shouldBe value
    }
  }

  "Update" in {
    runThis(30.times) {
      val value = Value.Update(randomStringOption, randomDeadlineOption, randomNextTimeOption)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[Value.Update](bytes).assertGet shouldBe value
    }

  }

  "Function" in {
    runThis(30.times) {
      val value = Value.Function(randomCharacters(randomIntMax(100)), randomNextTimeOption)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(value))

      ValueSerializer.write(value)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[Value.Function](bytes).assertGet shouldBe value
    }
  }

  "Apply" in {
    runThis(30.times) {
      val applies = randomApplies(randomIntMax(100) + 1)
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(applies))

      ValueSerializer.write(applies)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[Slice[Value.Apply]](bytes).assertGet shouldBe applies
    }
  }

  "PendingApply" in {
    runThis(30.times) {
      val pendingApply = Value.PendingApply(randomApplies(randomIntMax(100) + 1))
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(pendingApply))

      ValueSerializer.write(pendingApply)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[Value.PendingApply](bytes).assertGet shouldBe pendingApply
    }
  }

  "SeqOfBytesSerializer" in {
    runThis(30.times) {
      val seqBytes = randomByteChunks(randomIntMax(100))
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(seqBytes))

      ValueSerializer.write(seqBytes)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[Seq[Slice[Byte]]](bytes).assertGet shouldBe seqBytes
    }
  }

  "TupleOfBytesSerializer" in {
    runThis(30.times) {
      val tuple = (randomBytesSlice(randomIntMax(100)), randomBytesSlice(randomIntMax(100)))
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(tuple))

      ValueSerializer.write(tuple)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[(Slice[Byte], Slice[Byte])](bytes).assertGet shouldBe tuple
    }
  }

  "TupleBytesAndOptionBytesSerializer" in {
    runThis(30.times) {
      val tuple = (randomBytesSlice(randomIntMax(100)), eitherOne(None, Some(randomBytesSlice(randomIntMax(100)))))
      val bytes = Slice.create[Byte](ValueSerializer.bytesRequired(tuple))

      ValueSerializer.write(tuple)(bytes)

      bytes.isFull shouldBe true

      ValueSerializer.read[(Slice[Byte], Option[Slice[Byte]])](bytes).assertGet shouldBe tuple
    }
  }

}
