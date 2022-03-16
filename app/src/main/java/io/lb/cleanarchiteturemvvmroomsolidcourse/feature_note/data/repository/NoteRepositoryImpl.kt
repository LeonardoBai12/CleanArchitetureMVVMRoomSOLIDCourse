package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.data.repository

import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.data.data_source.NoteDao
import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.repository.NoteRepository
import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.model.Note

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override suspend fun add(note: Note) = dao.add(note)

    override suspend fun get(id: Long): Note? = dao.get(id)

    override suspend fun getAll(): List<Note> = dao.getAll()

    override suspend fun remove(note: Note) = dao.remove(note)
}