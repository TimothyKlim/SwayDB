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

package swaydb.core.util

import scala.collection.mutable.ListBuffer
import scala.reflect.ClassTag

object CollectionUtil {

  val emptyStringSeq = Seq.empty[String]

  implicit class IterableImplicit[T: ClassTag](it: Iterator[T]) {

    def foreachBreak(f: T => Boolean): Unit = {
      var break: Boolean = false
      while (it.hasNext && !break)
        break = f(it.next())
    }

    /**
      * Used for cases when multiple iterators over a list eg: collect & then fold is costly.
      */
    def foldLeftWhile[B](initial: B, condition: T => Boolean)(op: (B, T) => B): B = {
      var result = initial
      it foreachBreak {
        item =>
          val continue = condition(item)
          if (continue) result = op(result, item)
          !continue
      }
      result
    }

  }

  sealed trait MergeResult[T]
  object MergeResult {
    case class Merged[T](result: T) extends MergeResult[T]
    case class Overwrite[T](result: T) extends MergeResult[T]
    case class UnMerged[T](left: T, right: T) extends MergeResult[T]
  }

  implicit class ArrayImplicit[T: ClassTag](input: Array[T]) {
    def foldCollapse(startIndex: Int)(f: (T, T) => MergeResult[T]): Array[T] = {
      val output = ListBuffer.empty[T]
      var index = startIndex

      while (index < input.length) {
        if (index + 1 >= input.length) {
          //End! No items to collapse
          //          output += input(index)
          index += 1
        } else {
          //(1, 2), (3, 4), (5, 6) ...
          val leftInput = input(index)
          val rightInput = input(index + 1)
          f(leftInput, rightInput) match {
            case MergeResult.Merged(result) =>
              output :+ result
              index += 1
            case MergeResult.Overwrite(result) =>
              output.clear()
              output :+ result
            case MergeResult.UnMerged(left, right) =>

          }

        }
      }
      ???
    }
  }
}
