package swaydb.core.function

import java.util.concurrent.ConcurrentHashMap
import swaydb.core.data.SwayFunction
import swaydb.data.slice.Slice

trait FunctionStore {
  def get(functionId: Slice[Byte]): Option[SwayFunction]

  def put(functionId: Slice[Byte], function: SwayFunction): SwayFunction
}

object FunctionStore {

  def memory() =
    new MemoryStore()

}

class MemoryStore extends FunctionStore {

  private val functions = new ConcurrentHashMap[Slice[Byte], SwayFunction]()

  override def get(functionId: Slice[Byte]): Option[SwayFunction] =
    Option(functions.get(functionId))

  override def put(functionId: Slice[Byte], function: SwayFunction): SwayFunction =
    functions.put(functionId, function)
}
