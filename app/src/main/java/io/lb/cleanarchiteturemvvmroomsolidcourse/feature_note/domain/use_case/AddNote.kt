package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.use_case

import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.model.Note
import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) = repository.add(note)
}