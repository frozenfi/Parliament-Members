package com.example.parliamentapplication.data

import android.annotation.SuppressLint
import androidx.room.TypeConverter

//It throws error when we try to store Lists directly in Room, So
//TypeConverter handles the multiple comments and has ability to
//convert to/from lists

class TypeConverter {

    @TypeConverter
    fun convertCommentsToString(commentList: MutableList<String>): String {
        return commentToString(commentList)
    }

    @TypeConverter
    fun convertStringToComment(storedString: String): List<String> {
        return stringToComment(storedString)
    }

    companion object {
        @SuppressLint("SuspiciousIndentation")
        @TypeConverter
        private fun stringToComment(storedString: String): List<String> {
            val listOfComment: List<String> = storedString.split(";").filter {
                it.isNotEmpty()
            }.toList()
            return listOfComment

        }

        @TypeConverter
        private fun commentToString(listOfComment: MutableList<String>): String {
            var storedString = ""
            for (comment in listOfComment) {
                storedString += "$comment;"
            }
            return storedString
        }

    }
}