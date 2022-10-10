package com.example.parliamentapplication.data

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 07.10.2022
*/
import android.content.Context
import androidx.room.*


/*
A database that stores the comment and rating information
*/

@Database(entities = [Feedback::class], version =4, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class FeedbackDatabase:RoomDatabase() {
    abstract val feedbackDao: FeedbackDao

    companion object{
        @Volatile
        private var INSTANCE: FeedbackDatabase? = null

        fun getInstance(context: Context): FeedbackDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FeedbackDatabase::class.java,
                        "feedback_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}