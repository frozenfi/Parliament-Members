package com.example.parliamentapplication.utils

import androidx.room.TypeConverter

class TypeConverter {
    @TypeConverter
    fun commentToStringConversion(listOfComment: MutableList<String>): String {
        return commentToString(listOfComment)
    }

    fun stringToCommentConversion(storedString: String): List<String> {
        return stringToComment(storedString)
    }

    companion object {
        private fun stringToComment(storedString: String): List<String> {
        val listOfComment:List<String> = storedString.split(";").filter {
            it.isNotEmpty()
        }.toList()
            return listOfComment

        }

        private fun commentToString(listOfComment: MutableList<String>): String {
            var storedString = ""
            for(comment in listOfComment){
                storedString += comment + ";"
            }
            return storedString
        }

    }
}