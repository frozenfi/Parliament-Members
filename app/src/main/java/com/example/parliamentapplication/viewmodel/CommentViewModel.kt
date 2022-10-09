package com.example.parliamentapplication.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.parliamentapplication.MyApp

import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.data.*
import com.example.parliamentapplication.repo.FeedbackRepo
import com.example.parliamentapplication.repo.MembersRepo
import kotlinx.coroutines.launch

/*
ViewModel for comments
 */
class CommentViewModel(feedback: Feedback, application: Application) :
    AndroidViewModel(application) {

    private val feedbackDatabase = FeedbackDatabase.getInstance(application)
    private val feedbackRepo = FeedbackRepo(feedbackDatabase)

    private var _member = MutableLiveData<LiveData<ParliamentMembers>>()
    val member: LiveData<LiveData<ParliamentMembers>>
        get() = _member

    private var _memberFeedback = MutableLiveData<Feedback>()
    val memberFeedback: LiveData<Feedback>
        get() = _memberFeedback

    init {
        viewModelScope.launch {
            _memberFeedback.value = feedback
        }
    }

    //updates the feedback through coroutine
    fun updateFeedback(addComment: String) {
        viewModelScope.launch {
            val newFeedback = _memberFeedback.value?.let {
                Feedback(
                    it.personNumber,
                    it.rating,
                    it.comment.plus(addComment) as MutableList<String>
                )
            }
            if (newFeedback != null) {
                feedbackRepo.insertFeedback(newFeedback)
                _memberFeedback.value = newFeedback!!
            }
        }
    }

}
/*
ViewModel factory class for the instantiating the viewModel class
IDE throws error without the use of ViewModelFactory class
 */

class CommentViewModelFactory(
    private val feedback: Feedback,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CommentViewModel::class.java)) {
            return CommentViewModel(feedback, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
