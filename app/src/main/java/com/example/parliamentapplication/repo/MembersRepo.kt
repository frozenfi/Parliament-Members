package com.example.parliamentapplication.repo
/*
* Name: Binod Panta
* Student No: 2012206
* Date: 02.10.2022
*/
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.api.ParliamentApi
import com.example.parliamentapplication.api.ParliamentApiStatus
import com.example.parliamentapplication.data.membersdata.MemberOfParliamentDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/*
Parliament member repository that contains database that is needed for the application
 */
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

    fun getParties(): LiveData<List<String>> {
        return memberDatabaseDao.getParties()
    }

    fun getMembersWithPersonNumber(id: Int): LiveData<ParliamentMembers> {
        return memberDatabaseDao.getMemberById(id)
    }
}

