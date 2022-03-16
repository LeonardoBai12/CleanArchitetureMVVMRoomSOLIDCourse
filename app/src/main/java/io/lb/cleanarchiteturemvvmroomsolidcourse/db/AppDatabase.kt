package io.lb.cleanarchiteturemvvmroomsolidcourse.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.data.data_source.NoteDao
import io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
)
abstract class AppDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {

        private const val DATABASE_NAME = "note.db"

        private var instance: AppDatabase? = null

        private fun create(context: Context) =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()

        fun getInstance(context: Context) =
            (instance ?: create(context)).also {
                instance = it
            }
    }
}