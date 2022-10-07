package com.example.parliamentapplication.repo

import android.media.Rating
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.Party
import com.example.parliamentapplication.api.ParliamentApi
import com.example.parliamentapplication.api.ParliamentApiStatus
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.MemberOfParliamentDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MembersRepo(private val memberDatabaseDao: MemberOfParliamentDao) {

    private val _status = MutableLiveData<ParliamentApiStatus>()
    val status: LiveData<ParliamentApiStatus>
        get() = _status

    init {
        _status.postValue(ParliamentApiStatus.LOADING)
    }

    suspend fun refreshData() {
        withContext(Dispatchers.IO) {
            val members = ParliamentApi.parliamentMembers.getParliamentMembers()
            _status.postValue(ParliamentApiStatus.DONE)
            memberDatabaseDao.insertAll(members)
        }
    }

    fun getMembersByParty(party: String): LiveData<List<ParliamentMembers>> {
        return memberDatabaseDao.getMembersByParty(party)
    }

    //String
    fun getPartiesList(): LiveData<List<Party>> {
        return memberDatabaseDao.getPartiesList()
    }

    fun getParties(): LiveData<List<String>> {
        return memberDatabaseDao.getParties()
    }

    fun getMembersWithPersonNumber(id: Int): LiveData<ParliamentMembers> {
        return memberDatabaseDao.getMemberById(id)
    }
}
    /*suspend fun insertRating(rating: Rating) {
        memberDatabaseDao.insertRating(rating)
    }
    suspend fun insertComment(commentFeedback:Feedback) = memberDatabaseDao.insertComment(commentFeedback)

    fun getComment(personNumber: Int):Feedback{
       return memberDatabaseDao.getComment(personNumber)
    }

    fun getRating(personNumber: Int):LiveData<List<Double>> {
        return memberDatabaseDao.getRating(personNumber)
    }
*/
