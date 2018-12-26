package swaydb.core.function

import swaydb.core.data.FunctionType
import swaydb.data.slice.Slice

trait CacheFunction {
  def get(functionId: Slice[Byte]): Option[FunctionType]
}
