package swaydb.core.segment.merge

import org.scalatest.{Matchers, WordSpec}
import swaydb.core.CommonAssertions
import swaydb.core.data.Memory
import scala.concurrent.duration._
import swaydb.core.data.KeyValue.ReadOnly
import swaydb.serializers._
import swaydb.serializers.Default._
class KeyValueMergerSpec extends WordSpec with Matchers with CommonAssertions {


  "PutOnPut" should {
    "always overwrite puts" in {

      KeyValueMerger[ReadOnly.Put, ReadOnly.Put](
        newKeyValue = Memory.Put(key = 1, value = None),
        oldKeyValue = Memory.Put(key = 1, value = 2, removeAt = 10.seconds.fromNow),
        hasTimeLeftAtLeast = 1.seconds
      ).assertGet shouldBe Memory.Put(key = 1, value = None)


    }
  }

}
