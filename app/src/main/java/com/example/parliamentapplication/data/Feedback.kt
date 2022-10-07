package com.example.parliamentapplication.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


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
