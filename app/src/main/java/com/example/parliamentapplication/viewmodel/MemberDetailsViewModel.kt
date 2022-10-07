package com.example.parliamentapplication.viewmodel

import androidx.lifecycle.*
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.FeedbackDao
import com.example.parliamentapplication.data.MemberOfParliamentDao
import com.example.parliamentapplication.repo.FeedbackRepo
import com.example.parliamentapplication.repo.MembersRepo

class MemberDetailsViewModel(membersRepo: MembersRepo, personNumber: Int) : ViewModel() {

    //LiveData object that observe and update Member
    private var _selectedMember = MutableLiveData<LiveData<ParliamentMembers>>()
    val member:LiveData<LiveData<ParliamentMembers>>
    get() = _selectedMember



    //LiveData objects that observe and update member comment information
    private var _memberComment = MutableLiveData<Feedback>()
    val memberComment: LiveData<Feedback>
        get() = _memberComment

    init {
        _selectedMember.value = membersRepo.getMembersWithPersonNumber(personNumber)

    }

   private val _navigateToComment = MutableLiveData<Feedback>()
    val navigateToComment:LiveData<Feedback>
    get() = _navigateToComment

    fun onAddCommentBtnClicked(feedback: Feedback) {
        _navigateToComment.value = feedback
    }
    fun navigateToCommentCompleted() {
        _navigateToComment.value = null
    }

}

class MemberDetailsViewModelFactory(
    private val parliamentDAO: MemberOfParliamentDao,
    //private val feedbackDao: FeedbackDao,
    private val personNumber: Int
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MemberDetailsViewModel::class.java)) {
            return MemberDetailsViewModel(MembersRepo(parliamentDAO), personNumber) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}