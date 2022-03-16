package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.repository

import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.model.Note

interface NoteRepository {
    suspend fun add(note: Note)
    suspend fun get(id: Long): Note?
    suspend fun getAll(): List<Note>
    suspend fun remove(note: Note)
}