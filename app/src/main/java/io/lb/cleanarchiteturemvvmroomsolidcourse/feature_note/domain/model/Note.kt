package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    var title: String,
    var content: String,
    @ColumnInfo(name = "creation_date")
    var creationTime: Long,
    @ColumnInfo(name = "update_date")
    var updateTime: Long,
)