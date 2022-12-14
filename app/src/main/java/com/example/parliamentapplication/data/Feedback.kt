package com.example.parliamentapplication.data

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 07.10.2022
*/
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

//Feedback table having the column personNumber, rating and comment
@Entity(tableName = "feedback_database")
@Parcelize
data class Feedback(
    @PrimaryKey
    val personNumber: Int,
    @ColumnInfo(name = "rating")
    val rating :Int,
    @ColumnInfo(name ="comment")
    val comment: MutableList<String>
): Parcelable
