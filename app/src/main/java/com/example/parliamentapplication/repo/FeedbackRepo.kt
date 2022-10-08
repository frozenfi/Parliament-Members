package com.example.parliamentapplication.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.parliamentapplication.api.ParliamentApi
import com.example.parliamentapplication.api.ParliamentApiService
import com.example.parliamentapplication.api.ParliamentApiStatus
import com.example.parliamentapplication.data.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
/*
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
*/

/*
class FeedbackRepo(private val feedbackDao: FeedbackDao) {


    suspend fun insertRating(rating: Rating) = feedbackDao.insertRating(rating)

    suspend fun insertComment(comment: Comment) = feedbackDao.insertComment(comment)

    fun getRating(personNumber:Int):LiveData<List<Double>> = feedbackDao.getRating(personNumber)

    fun getComment(personNumber:Int):LiveData<List<Comment>> = feedbackDao.getComment(personNumber)

}
*/

class FeedbackRepo(private val feedbackDatabase: FeedbackDatabase) {
    private val feedbackDao = feedbackDatabase.feedbackDao

    //Prepopulate the Feedback database

    suspend fun refreshData() {
        withContext(Dispatchers.IO) {
            val listOfMember = ParliamentApi.parliamentMembers.getParliamentMembers()
            listOfMember.forEach{
                feedbackDao.update(Feedback(it.personNumber, 0, mutableListOf()))
            }
        }
    }

    suspend fun insertFeedback(feedback: Feedback) {
        feedbackDao.insert(feedback)
    }

    suspend fun getMemberFeedback(personNumber:Int) :Feedback {
        return feedbackDao.getComment(personNumber)
    }
}
