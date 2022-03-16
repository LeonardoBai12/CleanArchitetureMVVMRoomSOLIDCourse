package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.data.data_source

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.model.Note

interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAll(): List<Note>

    @Query("SELECT * FROM note WHERE id = :id")
    fun get(id: Long): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(note: Note)

    @Query("DELETE FROM note")
    fun removeAll()

    @Query("DELETE FROM note WHERE id = :id")
    fun remove(id: Long)
}