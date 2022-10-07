package com.example.parliamentapplication.data

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


interface FeedbackDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(commentFeedback: Feedback)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(commentFeedback: Feedback)

    @Query("SELECT * FROM feedback_database WHERE personNumber = :personNumber")
    suspend fun getComment(personNumber:Int):Feedback

    @Query("DELETE FROM feedback_database")
    fun clear()
}

