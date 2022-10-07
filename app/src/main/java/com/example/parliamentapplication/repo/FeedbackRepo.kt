package com.example.parliamentapplication.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.parliamentapplication.api.ParliamentApi
import com.example.parliamentapplication.api.ParliamentApiStatus
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.FeedbackDao
import com.example.parliamentapplication.data.MemberOfParliamentDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FeedbackRepo(private val feedbackDao: FeedbackDao) {

    //private val feedbackDao = feedbackDatabase.feedbackDao
    private val _status = MutableLiveData<ParliamentApiStatus>()
    val status: LiveData<ParliamentApiStatus>
        get() = _status


    init {
        _status.postValue(ParliamentApiStatus.LOADING)
    }
    suspend fun refreshFeedbackDatabase() {
        withContext(Dispatchers.IO) {
            val members = ParliamentApi.parliamentMembers.getParliamentMembers()
            _status.postValue(ParliamentApiStatus.DONE)
            members.forEach{
                feedbackDao.update(Feedback(it.personNumber,0, mutableListOf()))
            }
        }
    }

    suspend fun insertFeedback(member:Feedback) {
        feedbackDao.insert(member)
    }

    suspend fun getFeedback(personNumber:Int):Feedback {
        return feedbackDao.getComment(personNumber)
    }
}