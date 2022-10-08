package com.example.parliamentapplication.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.parliamentapplication.MyApp

import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.data.*
import com.example.parliamentapplication.repo.FeedbackRepo
import com.example.parliamentapplication.repo.MembersRepo
import kotlinx.coroutines.launch


class CommentViewModel(feedback: Feedback, application: Application) : AndroidViewModel(application) {

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


/*
class CommentViewModel(application: Application):ViewModel() {
   private val feedbackRepo:FeedbackRepo
   private lateinit var memRepo:MembersRepo
    private val memDao = MemberOfParliamentDatabase.getInstance(application).memberOfParliamentDAO


    private lateinit var _memberDetail:LiveData<ParliamentMembers>
   val memberDetail:LiveData<ParliamentMembers>
   get() = _memberDetail

    private lateinit var _memberFeedback:LiveData<List<Comment>>
    val memberFeedback: LiveData<List<Comment>>
    get() = _memberFeedback

    init {
        val feedbackDao = FeedbackDatabase.getInstance(application).feedbackDao
        feedbackRepo = FeedbackRepo(feedbackDao)


    }


    fun getComment(personNumber: Int) {
        _memberFeedback = feedbackRepo.getComment(personNumber)

    }

    fun getMember(personNumber:Int) {
        memRepo = MembersRepo(memDao)
        _memberDetail = memRepo.getMembersWithPersonNumber(personNumber)
    }

}
class CommentViewModelFactory(
    val application: Application
):ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CommentViewModel::class.java)) {
            return CommentViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
*/