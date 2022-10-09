package com.example.parliamentapplication.repo

import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.FeedbackDatabase

/*
Feedback repository that contains database that is needed for the application
 */
class FeedbackRepo(private val feedbackDatabase: FeedbackDatabase) {
    private val feedbackDao = feedbackDatabase.feedbackDao

    suspend fun insertFeedback(feedback: Feedback) {
        feedbackDao.insert(feedback)
    }

    suspend fun getMemberFeedback(personNumber: Int): Feedback {
        return feedbackDao.getComment(personNumber)
    }
}
