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

/*
@Dao
interface FeedbackDao{
    @Insert
    suspend fun insertRating(rating: Rating)

    @Insert
    suspend fun insertComment(comment: Comment)

    @Query("SELECT rating from rating_db WHERE personNumber = :personNumber")
    fun getRating(personNumber: Int) :LiveData<List<Double>>

    @Query("SELECT * FROM comment_db WHERE personNumber =:personNumber")
    fun getComment(personNumber: Int) :LiveData<List<Comment>>
}
*/