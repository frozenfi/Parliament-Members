package com.example.parliamentapplication.data

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 09.10.2022
*/
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rating_db")
data class Rating(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "personNumber")
    val personNumber: Int,
    @ColumnInfo(name="rating")
    val likes:Int = 0
)

