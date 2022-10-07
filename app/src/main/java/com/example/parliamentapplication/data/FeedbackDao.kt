package com.example.parliamentapplication.data

import androidx.lifecycle.LiveData
import androidx.room.*
import java.util.concurrent.Flow

@Dao
interface FeedbackDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(commentFeedback: Feedback)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(commentFeedback: Feedback)

    @Query("SELECT * FROM feedback_database WHERE personNumber = :personNumber")
    suspend fun getComment(personNumber:Int):Feedback

   // @Query("SELECT * FROM feedback_database WHERE personNumber = :personNumber")
    //fun getAllComment(personNumber: Int): LiveData<List<Feedback>>

    @Query("DELETE FROM feedback_database")
    fun clear()
}

