package com.example.parliamentapplication.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class FeedbackDatabase:RoomDatabase() {
    abstract val feedbackDao:FeedbackDao

    companion object{
        @Volatile
        private var INSTANCE:FeedbackDatabase? = null

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
                    INSTANCE=instance
                }
                return instance
            }
        }
    }
}