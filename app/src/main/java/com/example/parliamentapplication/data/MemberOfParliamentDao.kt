package com.example.parliamentapplication.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.Party

/*
A DAO interface with some methods that can access the database
 */

@Dao
interface MemberOfParliamentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(list: List<ParliamentMembers>)

    @Update
    suspend fun update(member: ParliamentMembers)

    @Query("SELECT * FROM parliament_database")
    fun getParliamentMembers(): LiveData<List<ParliamentMembers>>

    @Query("SELECT DISTINCT party FROM parliament_database ORDER BY party")
    fun getParties(): LiveData<List<String>>

    @Query("SELECT * FROM parliament_database WHERE personNumber = :personNumber")
    fun getMemberById(personNumber: Int): LiveData<ParliamentMembers>

    @Query("SELECT * FROM parliament_database WHERE party = :party ORDER BY full_name ASC")
    fun getMembersByParty(party: String): LiveData<List<ParliamentMembers>>

    @Query("SELECT * FROM parliament_database GROUP BY party ORDER BY party ASC")
    fun getPartiesList(): LiveData<List<Party>>


}