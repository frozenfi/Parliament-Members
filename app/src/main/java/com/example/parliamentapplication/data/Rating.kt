package com.example.parliamentapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rating_db")
data class Rating(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    @ColumnInfo(name = "personNumber")
    val personNumber: Int,

    @ColumnInfo(name="rating")
    val rating: Float

)

@Entity(tableName = "comment_db")
data class Comment(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo(name = "personNumber")
    val personNumber: Int,

    @ColumnInfo(name = "comment")
    val comment: String
        )

