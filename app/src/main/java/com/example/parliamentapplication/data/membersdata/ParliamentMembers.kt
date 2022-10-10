package com.example.parliamentapplication
/*
* Name: Binod Panta
* Student No: 2012206
* Date: 02.10.2022
*/

import androidx.room.*

@Entity(tableName = "parliament_database")

data class ParliamentMembers(
    @PrimaryKey(autoGenerate = false)
    val personNumber: Int,

    @ColumnInfo(name = "seat_number")
    val seatNumber: Int,

    @ColumnInfo(name = "constituency")
    val constituency:String,

    @ColumnInfo(name = "last_name")
    var last: String,

    @ColumnInfo(name = "first_name")
    var first: String,

    @ColumnInfo(name= "full_name")
    var fullName:String = "$first $last",

    @ColumnInfo(name = "party")
    var party: String,

    @ColumnInfo(name = "born_year")
    val bornYear: Int,

    @ColumnInfo(name = "minister")
    val minister: Boolean,

    @ColumnInfo(name = "picture_url")
    val picture: String,

    @ColumnInfo(name = "twitter_account")
    val twitter:String
)

@Entity(tableName = "party")
data class Party( var party: String)



