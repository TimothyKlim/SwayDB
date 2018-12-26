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

package swaydb.core.segment.format.a.entry.generators

import java.io.PrintWriter
import java.nio.file.Paths
import swaydb.core.io.file.IO
import scala.io.Source
import swaydb.core.segment.format.a.entry.id.EntryId.GeneratedEntryId
import swaydb.core.segment.format.a.entry.id._

/**
  * Generates if Ids for all key-value types.
  *
  * Put entries with No meta block have the smallest id number and require only 1 byte for the id.
  * All other entries requires 2 bytes maximum for the id.
  */
object IdsGenerator extends App {

  def write(entry: String,
            startId: Int): Int = {
    val fullKeyId = s"${entry}EntryId"
    val targetIdClass = IO.createFileIfAbsent(Paths.get(s"${System.getProperty("user.dir")}/core/src/main/scala/swaydb/core/segment/format/a/entry/id/$fullKeyId.scala")).get
    val writer = new PrintWriter(targetIdClass.toFile)
    writer.write("")

    val templateClass = classOf[TemplateEntryId].getSimpleName

    val maxId =
      Source
        .fromFile(s"${System.getProperty("user.dir")}/core/src/main/scala/swaydb/core/segment/format/a/entry/id/$templateClass.scala")
        .getLines
        .foldLeft(startId) {
          case (id, line) =>
            val newLine =
              if (!line.contains("remove this")) {
                val newLine =
                  line
                    .replace(templateClass, fullKeyId)
                    .replace(s"-1", s"$id")
                writer.append("\n" + newLine)
                newLine
              } else {
                ""
              }

            if (line.contains("package")) {
              writer.append("\n")
              writer.append(
                """
                  |/** ******************************************
                  |  * ************ GENERATED CLASS *************
                  |  * ******************************************/""".stripMargin)
            }

            if (newLine.contains(s"$fullKeyId($id)"))
              id + 1
            else
              id
        }
    writer.close()
    maxId
  }

  /**
    * All generated ID classes.
    */
  def ids: Seq[GeneratedEntryId] =
    Seq(
      PutEntryId,
      GroupEntryId,
      RemoveEntryId,
      UpdateEntryId,
      RangeEntryId,
      ApplyEntryId
    )

  def entries = Seq("Put", "Group", "Remove", "Range", "Update", "Apply")

  val minId = 0

  def maxKey =
    entries.foldLeft(minId) {
      case (id, entry) =>
        write(entry, id) + 1
    }

  println("minId: " + minId)
  println("maxId: " + maxKey)
}
