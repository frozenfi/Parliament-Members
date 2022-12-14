package com.example.parliamentapplication.data.membersdata

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 02.10.2022
*/
import android.content.Context
import androidx.room.*

import com.example.parliamentapplication.ParliamentMembers

/*
A database that stores the parliament member information
*/

@Database(entities = [ParliamentMembers::class], version = 4, exportSchema = false)
abstract class MemberOfParliamentDatabase : RoomDatabase() {

    abstract val memberOfParliamentDAO: MemberOfParliamentDao

    companion object {

        @Volatile
        private var INSTANCE: MemberOfParliamentDatabase? = null


        fun getInstance(context: Context): MemberOfParliamentDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MemberOfParliamentDatabase::class.java, "parliament_database"
                    )
                        .fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}