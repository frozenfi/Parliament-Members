package com.example.parliamentapplication.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.parliamentapplication.api.ParliamentApi
import com.example.parliamentapplication.api.ParliamentApiStatus
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.FeedbackDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/*
Feedback repository that contains database that is needed for the application
 */
class FeedbackRepo(feedbackDatabase: FeedbackDatabase) {
    private val feedbackDao = feedbackDatabase.feedbackDao

    private val _status = MutableLiveData<ParliamentApiStatus>()
    val status: LiveData<ParliamentApiStatus>
        get() = _status

    suspend fun insertFeedback(feedback: Feedback) {
        feedbackDao.insert(feedback)
    }

    suspend fun getMemberFeedback(personNumber: Int): Feedback {
        return feedbackDao.getComment(personNumber)
    }

    init {
        _status.postValue(ParliamentApiStatus.LOADING)
    }
}

