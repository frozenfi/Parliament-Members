package com.example.parliamentapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "feedback_database")
data class Feedback(
    @PrimaryKey
    val personNumber: Int,
    @ColumnInfo(name = "rating")
    val rating :Int,
    @ColumnInfo(name ="comment")
    val comment: MutableList<String>
)
