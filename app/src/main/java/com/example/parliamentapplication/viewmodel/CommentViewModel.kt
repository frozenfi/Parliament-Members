package com.example.parliamentapplication.viewmodel

import androidx.lifecycle.*
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.FeedbackDao
import com.example.parliamentapplication.repo.FeedbackRepo
import kotlinx.coroutines.launch


class CommentViewModel(private val feedbackRepo: FeedbackRepo, personNumber: Int):ViewModel() {
    private var _member = MutableLiveData<LiveData<ParliamentMembers>>()
    val member: LiveData<LiveData<ParliamentMembers>>
    get() = _member

    private var _memberFeedback = MutableLiveData<Feedback>()
    val memberFeedback:LiveData<Feedback>
    get() = _memberFeedback

    init {
        viewModelScope.launch {
            _memberFeedback.value=feedbackRepo.getFeedback(personNumber)
        }
    }
    fun updateFeedback(addComment:String) {
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


class CommentViewModelFactory(
    private val feedbackDao: FeedbackDao,
    private val personNumber: Int
):ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CommentViewModel::class.java)) {
            return CommentViewModel(FeedbackRepo(feedbackDao), personNumber) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

