package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var title: String,
    var content: String,
    var creationTime: Long,
    var updateTime: Long,
)