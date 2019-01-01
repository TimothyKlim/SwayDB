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

package swaydb.core.level

import org.scalamock.scalatest.MockFactory
import swaydb.core.TestBase
import swaydb.core.data.{Memory, Value}
import swaydb.core.group.compression.data.KeyValueGroupingStrategyInternal
import swaydb.core.util.Benchmark
import swaydb.core.util.FileUtil._
import swaydb.data.compaction.Throttle
import swaydb.data.slice.Slice
import swaydb.data.order.KeyOrder
import swaydb.serializers.Default._
import swaydb.serializers._

import scala.concurrent.duration._

//@formatter:off
class LevelHigherSpec0 extends LevelHigherSpec

class LevelHigherSpec1 extends LevelHigherSpec {
  override def levelFoldersCount = 10
  override def mmapSegmentsOnWrite = true
  override def mmapSegmentsOnRead = true
  override def level0MMAP = true
  override def appendixStorageMMAP = true
}

class LevelHigherSpec2 extends LevelHigherSpec {
  override def levelFoldersCount = 10
  override def mmapSegmentsOnWrite = false
  override def mmapSegmentsOnRead = false
  override def level0MMAP = false
  override def appendixStorageMMAP = false
}

class LevelHigherSpec3 extends LevelHigherSpec {
  override def inMemoryStorage = true
}
//@formatter:on

sealed trait LevelHigherSpec extends TestBase with MockFactory with Benchmark {

  val keyValuesCount = 100
  override implicit val keyOrder: KeyOrder[Slice[Byte]] = KeyOrder.default
  implicit override val groupingStrategy: Option[KeyValueGroupingStrategyInternal] = randomCompressionOption(keyValuesCount)

  "Level.higher when the lower Level is empty" should {
    "return None if the Level is empty" in {
      assertOnLevel(
        keyValues = Slice.empty,
        assertion = _.higher(1).assertGetOpt shouldBe empty
      )
    }

    "return None if the Level contains no higher" in {
      assertOnLevel(
        keyValues = Slice(Memory.put(1, "one")),
        assertion =
          level => {
            (1 to 10) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return None if the Level contains higher Remove" in {
      assertOnLevel(
        keyValues = Slice(Memory.remove(5)),
        assertion =
          level =>
            (1 to 10) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
      )
    }

    "return None if the Level contains higher Remove Range" in {
      assertOnLevel(
        keyValues = Slice(Memory.Range(1, 10, None, Value.remove(None))),
        assertion =
          level =>
            (0 to 15) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
      )
    }

    "return None if the Level contains higher Remove Range with fromValue set to Value.remove(None)" in {
      assertOnLevel(
        keyValues = Slice(Memory.Range(1, 10, Some(Value.remove(None)), Value.remove(None))),
        assertion =
          level =>
            (0 to 15) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
      )
    }

    "return None for all Removed Range key-values other than fromKey where the fromValue set to Value.put" in {
      assertOnLevel(
        keyValues = Slice(Memory.Range(5, 10, Some(Value.put("five")), Value.remove(None))),
        assertion =
          level => {
            (0 to 4) foreach {
              key =>
                level.higher(key).assertGet shouldBe Memory.put(5, "five")
            }

            (5 to 15) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return higher if the Level contains higher Put" in {

      assertOnLevel(
        keyValues = Slice(Memory.put(5, "five")),
        assertion =
          level => {
            (0 to 4) foreach {
              key =>
                level.higher(key).assertGet shouldBe Memory.put(5, "five")
            }
          }
      )
    }

    "return None if the Level contains higher Put range without any fixed Put keys in lower level" in {
      assertOnLevel(
        keyValues = Slice(Memory.Range(1, 10, None, Value.update(10))),
        assertion =
          level => {
            (0 to 12) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return None if the Level contains higher Remove and Remove Ranges" in {

      assertOnLevel(
        keyValues =
          Slice(
            Memory.remove(1),
            Memory.Range(2, 10, None, Value.remove(None)),
            Memory.Range(10, 15, Some(Value.remove(None)), Value.remove(None))
          ),
        assertion =
          level => {
            (0 to 20) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return None if the Level contains higher Put ranges" in {
      assertOnLevel(
        keyValues =
          Slice(
            Memory.Range(2, 10, None, Value.update(10)),
            Memory.Range(10, 15, None, Value.update(15)),
            Memory.Range(16, 20, None, Value.update(20))
          ),
        assertion =
          level => {
            (0 to 20) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )

    }

    "return None if the Level contains higher Remove, Remove Ranges & Put Ranges" in {
      assertOnLevel(
        keyValues =
          Slice(
            Memory.remove(1),
            Memory.Range(2, 10, None, Value.remove(None)),
            Memory.Range(10, 20, Some(Value.remove(None)), Value.update(10)),
            Memory.Range(25, 30, None, Value.remove(None)),
            Memory.remove(30),
            Memory.Range(31, 35, None, Value.update(30)),
            Memory.Range(40, 45, Some(Value.remove(None)), Value.remove(None))
          ),
        assertion =
          level => {
            (0 to 50) foreach {
              key =>
                level.isEmpty shouldBe false
                level.nextLevel.assertGet.isEmpty shouldBe true
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return higher if the Level contains higher Put in upper level" in {
      assertOnLevel(
        keyValues =
          Slice(
            Memory.remove(1),
            Memory.Range(2, 10, None, Value.remove(None)),
            Memory.Range(10, 20, Some(Value.remove(None)), Value.update(10)),
            Memory.Range(25, 30, None, Value.remove(None)),
            Memory.remove(30),
            Memory.Range(31, 35, None, Value.update(30)),
            Memory.Range(40, 45, Some(Value.remove(None)), Value.remove(None)),
            Memory.put(100)
          ),
        assertion =
          level => {
            (0 to 50) foreach {
              key =>
                level.isEmpty shouldBe false
                level.nextLevel.assertGet.isEmpty shouldBe true
                level.higher(key).assertGet shouldBe Memory.put(100, None)
            }
          }
      )
    }
  }

  "Level.higher when both level contains key-values" should {
    "return None if higher and lower Levels contains Remove" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.remove(5)),
        lowerLevelKeyValues = Slice(Memory.remove(3)),
        assertion =
          level =>
            level.higher(2).assertGetOpt shouldBe empty
      )
    }

    "return None if upper Level and lower Level contains higher Remove and Remove range" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.remove(5)),
        lowerLevelKeyValues = Slice(Memory.remove(10), Memory.Range(11, 20, Some(Value.remove(None)), Value.remove(None))),
        assertion =
          level =>
            (1 to 21) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
      )
    }

    "return None if upper Level contains no higher & lower Level contains higher Remove" in {
      //5
      //    10
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.put(5)),
        lowerLevelKeyValues = Slice(Memory.remove(10)),
        assertion =
          level =>
            (5 to 15) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
      )
    }

    "return None if upper Level contains no higher & lower Level contains higher Remove Range" in {
      //5
      //    10
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.put(5)),
        lowerLevelKeyValues = Slice(Memory.Range(10, 15, None, Value.remove(None))),
        assertion =
          level =>
            (5 to 15) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
      )
    }

    "return None if upper Level contains no higher & lower Level contains higher Remove Range with Remove fromValue" in {
      //5
      //    10
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.put(5)),
        lowerLevelKeyValues = Slice(Memory.Range(10, 15, Some(Value.remove(None)), Value.remove(None))),
        assertion =
          level =>
            (5 to 15) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
      )
    }

    "return None if upper Level contains no higher & lower Level contains higher Remove Range with Put fromValue" in {
      //5
      //    10
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.put(5)),
        lowerLevelKeyValues = Slice(Memory.Range(10, 15, Some(Value.put("ten")), Value.remove(None))),
        assertion =
          level => {
            (5 to 9) foreach {
              key =>
                level.higher(key).assertGet shouldBe Memory.put(10, "ten")
            }

            (10 to 15) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return higher from lower Level if the first higher in lower Level is remove" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.put(5, "five")),
        lowerLevelKeyValues = Slice(Memory.remove(3), Memory.put(4, "four")),
        assertion =
          level => {
            level.higher(2).assertGet shouldBe Memory.put(4, "four")
            level.higher(3).assertGet shouldBe Memory.put(4, "four")
            level.higher(4).assertGet shouldBe Memory.put(5, "five")
          }
      )
    }

    "return higher from lower Level if the higher from lower Level is smaller then higher from upper Level" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.put(5, "five")),
        lowerLevelKeyValues = Slice(Memory.put(3, "three"), Memory.put(4, "four")),
        assertion =
          level => {
            level.higher(2).assertGet shouldBe Memory.put(3, "three")
            level.higher(3).assertGet shouldBe Memory.put(4, "four")
            level.higher(4).assertGet shouldBe Memory.put(5, "five")
          }
      )
    }

    "return higher from upper Level if the first higher is Remove Range and the input key falls within the Remove range" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.Range(5, 10, None, Value.remove(None)), Memory.put(11, "eleven")),
        lowerLevelKeyValues = Slice(Memory.put(3, "three")),
        assertion =
          level =>
            level.higher(5).assertGet shouldBe Memory.put(11, "eleven")
      )
    }

    "return higher from upper Level if the first higher is Remove Range" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.Range(5, 10, None, Value.remove(None)), Memory.put(11, "eleven")),
        lowerLevelKeyValues = Slice(Memory.put(3, "three")),
        assertion =
          level => {
            level.higher(0).assertGet shouldBe Memory.put(3, "three")
            level.higher(1).assertGet shouldBe Memory.put(3, "three")
            level.higher(2).assertGet shouldBe Memory.put(3, "three")

            (3 to 10) foreach {
              key =>
                level.higher(key).assertGet shouldBe Memory.put(11, "eleven")
            }
          }
      )
    }

    "return higher from upper Level if the first higher is Remove Range and fromValue is set to Value.put, and second higher is Remove range's toKey" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.Range(5, 10, Some(Value.put("five")), Value.remove(None)), Memory.put(10, "ten")),
        lowerLevelKeyValues = Slice(Memory.put(3, "three")),
        assertion =
          level => {
            level.higher(0).assertGet shouldBe Memory.put(3, "three")
            level.higher(1).assertGet shouldBe Memory.put(3, "three")
            level.higher(2).assertGet shouldBe Memory.put(3, "three")

            level.higher(3).assertGet shouldBe Memory.put(5, "five")
            level.higher(4).assertGet shouldBe Memory.put(5, "five")

            (5 to 9) foreach {
              key =>
                level.higher(key).assertGet shouldBe Memory.put(10, "ten")
            }
          }
      )
    }

    "return higher from upper Level if the first higher is Remove Range and there is no second higher" in {
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.Range(5, 10, None, Value.remove(None))),
        lowerLevelKeyValues = Slice(Memory.put(3, "three")),
        assertion =
          level => {
            level.higher(0).assertGet shouldBe Memory.put(3, "three")
            level.higher(1).assertGet shouldBe Memory.put(3, "three")
            level.higher(2).assertGet shouldBe Memory.put(3, "three")

            (3 to 10) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return higher from lower Level if the first higher in upper Level is a valid Put Range with Put value in lower Level but lower Level contains a smaller key which is the higher" in {
      //5 - 10
      //3, 6
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.Range(5, 10, None, Value.update("upper level"))),
        lowerLevelKeyValues = Slice(Memory.put(3, "three"), Memory.put(6, "six")),
        assertion =
          level => {
            level.higher(0).assertGet shouldBe Memory.put(3, "three")
            level.higher(1).assertGet shouldBe Memory.put(3, "three")
            level.higher(2).assertGet shouldBe Memory.put(3, "three")

            level.higher(3).assertGet shouldBe Memory.put(6, "upper level")
            level.higher(4).assertGet shouldBe Memory.put(6, "upper level")
            level.higher(5).assertGet shouldBe Memory.put(6, "upper level")

            (6 to 11) foreach {
              key =>
                level.higher(key).assertGetOpt shouldBe empty
            }
          }
      )
    }

    "return higher from lower Level when higher from lower Level is the equal to toKey of higher from upper Level" in {
      //5 - 10
      //3, 6
      assertOnLevel(
        upperLevelKeyValues = Slice(Memory.Range(5, 10, None, Value.update("upper level"))),
        lowerLevelKeyValues = Slice(Memory.put(10, "ten")),
        assertion =
          level => {
            (0 to 9) foreach {
              key =>
                level.higher(key).assertGet shouldBe Memory.put(10, "ten")
            }
            level.higher(10).assertGetOpt shouldBe empty
            level.higher(11).assertGetOpt shouldBe empty
          }
      )
    }

    "return higher if the Lower Level contains higher Put" in {
      val lowerLevel = TestLevel()
      val level = TestLevel(nextLevel = Some(lowerLevel), throttle = (_) => Throttle(Duration.Zero, 0))

      val keyValues =
        Slice(
          Memory.remove(1),
          Memory.Range(2, 10, None, Value.remove(None)),
          Memory.Range(10, 20, Some(Value.remove(None)), Value.update(10)),
          Memory.Range(25, 30, None, Value.remove(None)),
          Memory.remove(30),
          Memory.Range(31, 35, None, Value.update(30)),
          Memory.Range(40, 45, Some(Value.remove(None)), Value.remove(None))
        )

      level.putKeyValues(keyValues).assertGet

      lowerLevel.putKeyValues(Slice(Memory.put(100))).assertGet

      def doAssert(level: Level) =
        (0 to 50) foreach {
          key =>
            level.isEmpty shouldBe false
            level.nextLevel.assertGet.isEmpty shouldBe false
            level.higher(key).assertGet shouldBe Memory.put(100, None)
        }

      doAssert(level)
      doAssert(level)

      if (persistent) {
        val reopenedLevel = level.reopen
        //reopen and read again
        doAssert(reopenedLevel)
        doAssert(reopenedLevel)
      }
    }

    "return higher if the Level contains Ranges and Removes and lower level contains key-values" in {

      val lowerLevel = TestLevel(nextLevel = Some(TestLevel()), throttle = (_) => Throttle(Duration.Zero, 0))
      val level = TestLevel(nextLevel = Some(lowerLevel), throttle = (_) => Throttle(Duration.Zero, 0))

      val keyValues =
        Slice(
          Memory.remove(5),
          Memory.Range(7, 10, None, Value.remove(None)),
          Memory.Range(10, 20, Some(Value.remove(None)), Value.update(10)),
          Memory.Range(25, 30, None, Value.remove(None)),
          Memory.remove(30),
          Memory.Range(31, 35, None, Value.update(30)),
          Memory.Range(40, 45, Some(Value.remove(None)), Value.remove(None))
        )

      level.putKeyValues(keyValues).assertGet

      //add remove for each 100 key-values in lower level and all key-value should still return empty
      (1 to 100) foreach {
        key =>
          lowerLevel.putKeyValues(Slice(Memory.remove(key - 1), Memory.remove(key), Memory.remove(key + 1))).assertGet
          lowerLevel.isEmpty shouldBe false
          level.higher(key).assertGetOpt shouldBe empty
      }

      lowerLevel.segmentsInLevel() should have size 1
      lowerLevel.segmentsInLevel().head.path.fileId.assertGet._1 shouldBe 100 //100 updates occurred

      //1 to 10 is each non existing or is removed from the upper level via a Remove Range or Remove.
      //inserting a Put in the lower Level should still return empty.
      (1 to 10) foreach {
        key =>
          lowerLevel.putKeyValues(Slice(Memory.put(key))).assertGet
          level.higher(key).assertGetOpt shouldBe empty
      }


      //11 to 19 is a Put range with rangeValue set to Put(10). Inserting Put in lower level for these key-values should return range's range value.
      //inserting a Put in the lower Level should still return empty.
      (11 to 19) foreach {
        key =>
          lowerLevel.putKeyValues(Slice(Memory.put(key, key))).assertGet
          level.higher(key - 1).assertGet shouldBe Memory.put(key, Some(10))
      }

      //20 has no key in upper Level. Inserting it in lower Level and reading from upper should return lower level's value
      //PUT
      lowerLevel.putKeyValues(Slice(Memory.put(20, "twenty"))).assertGet
      level.higher(19).assertGet shouldBe Memory.put(20, Some("twenty"))
      //REMOVE
      lowerLevel.putKeyValues(Slice(Memory.remove(20))).assertGet
      level.higher(19).assertGetOpt shouldBe empty

      //25 to 30 is remove in upper Level. Put in lower level should still return empty
      (25 to 30) foreach {
        key =>
          lowerLevel.putKeyValues(Slice(Memory.put(key))).assertGet
          level.higher(key).assertGetOpt shouldBe empty
      }

      //31 to 34 is a Put range with rangeValue set to Put(30). Inserting Put in lower level for these key-values should return range's range value.
      //inserting a Put in the lower Level should still return empty.
      (31 to 34) foreach {
        key =>
          lowerLevel.putKeyValues(Slice(Memory.put(key, key))).assertGet
          level.higher(key - 1).assertGet shouldBe Memory.put(key, Some(30))
      }


      //40 to 44 is remove in upper Level. Put in lower level should still return empty
      (40 to 44) foreach {
        key =>
          lowerLevel.putKeyValues(Slice(Memory.put(key))).assertGet
          level.higher(key).assertGetOpt shouldBe empty
      }

      //44 to 50 has no key-values
      (44 to 50) foreach {
        key =>
          level.higher(key).assertGetOpt shouldBe empty
      }
    }

    "return higher from if upper Level when lower level contains a higher key-value but it's removed from Range's fromValue" in {
      val lowerLevel = TestLevel(nextLevel = Some(TestLevel()), throttle = (_) => Throttle(Duration.Zero, 0))
      val level = TestLevel(nextLevel = Some(lowerLevel), throttle = (_) => Throttle(Duration.Zero, 0))

      level.putKeyValues(
        Slice(
          Memory.remove(1),
          Memory.Range(50, 100, Some(Value.remove(None)), Value.update(100)),
          Memory.put(101, 101)
        )
      ).assertGet

      lowerLevel.putKeyValues(
        Slice(Memory.put(50, 50))
      ).assertGet

      def doAssert(level: Level) =
        (0 to 100) foreach {
          key =>
            level.higher(key).assertGet shouldBe Memory.put(101, 101)
        }

      doAssert(level)
      doAssert(level)

      if (persistent) {
        val reopenedLevel = level.reopen
        //reopen and read again
        doAssert(reopenedLevel)
        doAssert(reopenedLevel)
      }
    }
  }
}
