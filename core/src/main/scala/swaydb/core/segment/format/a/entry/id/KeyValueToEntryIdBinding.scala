package swaydb.core.segment.format.a.entry.id

import scala.annotation.implicitNotFound
import swaydb.core.data.Transient
import swaydb.core.segment.format.a.entry.id.EntryId.GeneratedEntryId

@implicitNotFound("Type class implementation not found for KeyValueToEntryIdBinding of type ${T}")
sealed trait KeyValueToEntryIdBinding[T] {
  val entryId: GeneratedEntryId
}

object KeyValueToEntryIdBinding {

  implicit object Remove extends KeyValueToEntryIdBinding[Transient.Remove] {
    override val entryId: GeneratedEntryId = RemoveEntryId
  }

  implicit object Update extends KeyValueToEntryIdBinding[Transient.Update] {
    override val entryId: GeneratedEntryId = UpdateEntryId
  }

  implicit object Group extends KeyValueToEntryIdBinding[Transient.Group] {
    override val entryId: GeneratedEntryId = GroupEntryId
  }

  implicit object Range extends KeyValueToEntryIdBinding[Transient.Range] {
    override val entryId: GeneratedEntryId = RangeEntryId
  }

  implicit object Put extends KeyValueToEntryIdBinding[Transient.Put] {
    override val entryId: GeneratedEntryId = PutEntryId
  }

  implicit object Apply extends KeyValueToEntryIdBinding[Transient.Apply] {
    override val entryId: GeneratedEntryId = ApplyEntryId
  }
}
