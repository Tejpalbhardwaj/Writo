package com.example.writo.Room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date


@Entity(tableName = "TodoDatabase")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,

    var tittle: String,
    var createdAt: Date
)
