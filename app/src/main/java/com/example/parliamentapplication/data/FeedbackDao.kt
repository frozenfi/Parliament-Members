package com.example.parliamentapplication.data

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 07.10.2022
*/
import androidx.room.*
import com.example.parliamentapplication.data.Feedback

// A DAO interface with some methods that can access the database

@Dao
interface FeedbackDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(commentFeedback: Feedback)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(commentFeedback: Feedback)

    @Query("SELECT * FROM feedback_database WHERE personNumber = :personNumber")
    suspend fun getComment(personNumber:Int): Feedback

    /*
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(like:Rating)

    @Query("UPDATE rating_db SET rating = rating + 1 WHERE personNumber = :personNumber")
    suspend fun likeMember(personNumber: Int)

    @Query("UPDATE rating_db SET rating = rating - 1 WHERE personNumber = :personNumber")
    suspend fun dislikeMember(personNumber: Int)

    @Query("SELECT* FROM rating_db WHERE personNumber =:personNumber")
    fun getlikes(personNumber: Int):LiveData<Rating>

     */

}
