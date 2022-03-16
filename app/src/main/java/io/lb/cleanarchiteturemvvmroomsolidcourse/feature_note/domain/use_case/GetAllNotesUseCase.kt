package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.use_case

import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.repository.NoteRepository

class GetAllNotesUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke() = repository.getAll()
}