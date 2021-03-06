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

package swaydb.core.seek

import org.scalamock.scalatest.MockFactory
import org.scalatest.{Matchers, WordSpec}
import swaydb.core.CommonAssertions._
import swaydb.core.RunThis._
import swaydb.core.TestData._
import swaydb.core.IOAssert._
import swaydb.core.data.{Time, Value}
import swaydb.core.merge.FixedMerger
import swaydb.core.{TestData, TestTimer}
import swaydb.data.IO
import swaydb.data.order.{KeyOrder, TimeOrder}
import swaydb.data.slice.Slice
import swaydb.serializers.Default._
import swaydb.serializers._

class LowerRangeSomeSpec extends WordSpec with Matchers with MockFactory {

  implicit val keyOrder = KeyOrder.default
  implicit val timeOrder = TimeOrder.long
  implicit val functionStore = TestData.functionStore

  "return Some" when {
    implicit val testTimer = TestTimer.Empty

    //  2<- 10
    //0  -  10
    // 1 - 9
    "1" in {
      runThis(100.times) {

        implicit val testTimer = TestTimer.Empty

        (5 to 10).reverse foreach {
          key =>
            implicit val current = mock[CurrentWalker]
            implicit val next = mock[NextWalker]

            val rangeValue = randomUpdateRangeValue(value = randomStringOption, functionOutput = randomFunctionOutput(addRemoves = false, expiredDeadline = false))
            val upperLevel = randomRangeKeyValue(0, 10, None, rangeValue = rangeValue)
            val lowerLower = randomPutKeyValue(key - 1, deadline = None)

            val expected = FixedMerger(upperLevel.rangeValue.toMemory(key - 1), lowerLower).assertGet

            inSequence {
              //@formatter:off
              current.lower         _ expects (key: Slice[Byte])  returning IO(Some(upperLevel))
              next.stateID          _ expects ()                  returning 1
              next.lower            _ expects (key: Slice[Byte])  returning IO(Some(lowerLower)).asAsync
              next.hasStateChanged  _ expects 1                   returning false
              //@formatter:on
            }
            Lower(key: Slice[Byte]).assertGet shouldBe expected
        }
      }
    }

    // 1
    //0  -  10
    //0
    "1a" in {
      runThis(100.times) {

        implicit val testTimer = TestTimer.Empty

        implicit val current = mock[CurrentWalker]
        implicit val next = mock[NextWalker]

        val fromValue = eitherOne(None, Some(Value.put(randomStringOption, removeAfter = randomDeadlineOption(false))))
        val upperLevel = randomRangeKeyValue(0, 10, fromValue, randomRangeValue(addRemoves = false, deadline = randomDeadlineOption(false), functionOutput = randomFunctionOutput(false, false)))
        val lowerLevel = randomPutKeyValue(0, deadline = randomDeadlineOption(false))

        //if fromValue is defined it will be merged with lower else lower is returned
        val expected =
          upperLevel.fetchFromOrElseRangeValue
            .map(currentFromValue => FixedMerger(currentFromValue.toMemory(0), lowerLevel).assertGet)
            .getOrElse(lowerLevel)

        inSequence {
          //@formatter:off
          current.lower         _ expects (1: Slice[Byte])    returning IO(Some(upperLevel))
          next.stateID          _ expects ()                  returning 1
          next.lower            _ expects (1: Slice[Byte])    returning IO(Some(lowerLevel)).asAsync
          next.hasStateChanged  _ expects 1                   returning false
          //@formatter:on
        }
        Lower(1: Slice[Byte]).assertGet shouldBe expected
      }
    }

    //           15
    //0  -  10
    //      10
    "2" in {
      runThis(100.times) {

        implicit val testTimer = TestTimer.Empty

        implicit val current = mock[CurrentWalker]
        implicit val next = mock[NextWalker]

        (11 to 15).reverse foreach {
          key =>
            val lowerLower = randomPutKeyValue(10, deadline = None)

            inSequence {
              //@formatter:off
              current.lower         _ expects (key: Slice[Byte])  returning IO(Some(randomRangeKeyValue(0, 10)))
              next.stateID          _ expects ()                  returning 1
              next.lower            _ expects (key: Slice[Byte])  returning IO(Some(lowerLower)).asAsync
              next.hasStateChanged  _ expects 1                   returning false
              //@formatter:on
            }
            Lower(key: Slice[Byte]).assertGet shouldBe lowerLower
        }
      }
    }

    //           15
    //0  -  10
    //     9
    "3" in {
      runThis(100.times) {

        implicit val testTimer = TestTimer.Empty

        (10 to 15).reverse foreach {
          key =>
            implicit val current = mock[CurrentWalker]
            implicit val next = mock[NextWalker]

            val currentRangeValue = randomUpdateRangeValue()
            val lowerLower = randomPutKeyValue(9, deadline = None)

            val expected = FixedMerger(currentRangeValue.toMemory(9), lowerLower).assertGet

            inSequence {
              //@formatter:off
              current.lower         _ expects (key: Slice[Byte])  returning IO(Some(randomRangeKeyValue(0, 10, rangeValue = currentRangeValue)))
              next.stateID          _ expects ()                  returning 1
              next.lower            _ expects (key: Slice[Byte])  returning IO(Some(lowerLower)).asAsync
              next.hasStateChanged  _ expects 1                   returning false
              //@formatter:on
            }
            Lower(key: Slice[Byte]).assertGet shouldBe expected
        }
      }
    }

    //              10 <- 15
    //  1(None)  -  10
    //  1
    "4" in {
      runThis(100.times) {

        implicit val testTimer = TestTimer.Empty

        (10 to 15).reverse foreach {
          key =>
            implicit val current = mock[CurrentWalker]
            implicit val next = mock[NextWalker]

            val lowerLower = randomPutKeyValue(1, deadline = None)
            val rangeValue = randomRangeValue(addRemoves = false, deadline = randomDeadlineOption(false), functionOutput = randomFunctionOutput(false, false))

            val expected = FixedMerger(rangeValue.toMemory(1), lowerLower).assertGet

            inSequence {
              //@formatter:off
              current.lower         _ expects (key: Slice[Byte])  returning IO(Some(randomRangeKeyValue(1, 10, fromValue = None, rangeValue)))
              next.stateID          _ expects ()                  returning 1
              next.lower            _ expects (key: Slice[Byte])  returning IO(Some(lowerLower)).asAsync
              next.hasStateChanged  _ expects 1                   returning false
              //@formatter:on
            }
            Lower(key: Slice[Byte]).assertGet shouldBe expected
        }
      }
    }

    //                  10 <- 15
    //  1(Some-put)  -  10
    //0-1
    "5" in {
      runThis(100.times) {

        implicit val testTimer = TestTimer.Empty

        (10 to 15).reverse foreach {
          key =>
            implicit val current = mock[CurrentWalker]
            implicit val next = mock[NextWalker]

            val put = Value.Put(randomStringOption, None, Time.empty)

            inSequence {
              //@formatter:off
              current.lower         _ expects (key: Slice[Byte])  returning IO(Some(randomRangeKeyValue(1, 10, fromValue = Some(put))))
              next.stateID          _ expects ()                  returning 1
              next.lower            _ expects (key: Slice[Byte])  returning IO(Some(randomPutKeyValue(eitherOne[Int](0, 1), deadline = None))).asAsync
              next.hasStateChanged  _ expects 1                   returning false
              //@formatter:on
            }
            Lower(key: Slice[Byte]).assertGet shouldBe put.toMemory(1)
        }
      }
    }
  }
}
