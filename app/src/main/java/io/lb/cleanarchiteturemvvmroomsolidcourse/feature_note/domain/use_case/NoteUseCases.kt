package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.use_case

data class NoteUseCases(
    val addNoteUseCase: AddNoteUseCase,
    val getAllNotesUseCase: GetAllNotesUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val removeNoteUseCase: RemoveNoteUseCase,
)