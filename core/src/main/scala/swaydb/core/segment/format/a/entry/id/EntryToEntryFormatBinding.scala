package swaydb.core.segment.format.a.entry.id

import scala.annotation.implicitNotFound
import swaydb.core.data.Transient
import swaydb.core.segment.format.a.entry.id.EntryId.EntryFormat

@implicitNotFound("Type class implementation not found for EntryToEntryFormatBinding of type ${T}")
sealed trait EntryToEntryFormatBinding[T] {
  val entryFormat: EntryFormat
}

object EntryToEntryFormatBinding {

  implicit object Remove extends EntryToEntryFormatBinding[Transient.Remove] {
    override val entryFormat: EntryFormat = RemoveEntryId
  }

  implicit object Update extends EntryToEntryFormatBinding[Transient.Update] {
    override val entryFormat: EntryFormat = UpdateEntryId
  }

  implicit object Group extends EntryToEntryFormatBinding[Transient.Group] {
    override val entryFormat: EntryFormat = GroupEntryId
  }

  implicit object Range extends EntryToEntryFormatBinding[Transient.Range] {
    override val entryFormat: EntryFormat = RangeEntryId
  }

  implicit object Put extends EntryToEntryFormatBinding[Transient.Put] {
    override val entryFormat: EntryFormat = PutEntryId
  }

  implicit object PendingApply extends EntryToEntryFormatBinding[Transient.PendingApply] {
    override val entryFormat: EntryFormat = PendingApplyEntryId
  }
}
