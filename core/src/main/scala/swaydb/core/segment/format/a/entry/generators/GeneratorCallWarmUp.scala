package swaydb.core.segment.format.a.entry.generators

import com.typesafe.scalalogging.LazyLogging

object GeneratorCallWarmUp extends LazyLogging {

  def warmUp(): Unit =
    IdsGenerator.ids foreach {
      id =>
        val headId = id.headId
        val lastId = id.lastId
        logger.info(s"Warming up ${id.getClass.getSimpleName} - headId = $headId, lastId = $lastId")
    }
}
