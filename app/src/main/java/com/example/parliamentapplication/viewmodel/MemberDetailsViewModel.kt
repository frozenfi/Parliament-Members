package com.example.parliamentapplication.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.FeedbackDao
import com.example.parliamentapplication.data.FeedbackDatabase
import com.example.parliamentapplication.data.MemberOfParliamentDao
import com.example.parliamentapplication.repo.FeedbackRepo
import com.example.parliamentapplication.repo.MembersRepo
import kotlinx.coroutines.launch
import java.util.zip.ZipEntry

class MemberDetailsViewModel(membersRepo: MembersRepo, personNumber: Int) : ViewModel() {


    //LiveData object that observe and update Member
    private var _selectedMember = MutableLiveData<LiveData<ParliamentMembers>>()
    val member: LiveData<LiveData<ParliamentMembers>>
        get() = _selectedMember

    private var _selectMember = MutableLiveData<ParliamentMembers>()
    val selectMember: LiveData<ParliamentMembers>
        get() = _selectMember

    //LiveData objects that observe and update member comment information
    private var _memberComment = MutableLiveData<Feedback?>()
    val memberComment: LiveData<Feedback?>
        get() = _memberComment

    init {
        _selectedMember.value = membersRepo.getMembersWithPersonNumber(personNumber)

    }

    fun updateFeedback(newRating: Int) {
        viewModelScope.launch {
            val memberFeedback = _memberComment.value?.let { it ->
                Feedback(
                    it.personNumber as Int,
                    it.rating.plus(newRating) ?: 0,
                    it.comment.toMutableList()
                )
            }
            if (memberFeedback != null) {
                _memberComment.value = memberFeedback
            }
        }
    }

    private val _navigateToComment = MutableLiveData<Feedback>()
    val navigateToComment: LiveData<Feedback>
        get() = _navigateToComment

    fun onAddCommentBtnClicked(feedback: Feedback) {
        _navigateToComment.value = feedback
    }

    fun navigateToCommentCompleted() {
        _navigateToComment.value = null
    }

    fun updatePartyText():String {
        val partyName = when(selectMember.value?.party) {
                "kd" -> "Christian Democrats"
                "kesk" -> "Centre Party"
                "kok" -> "National Coalition Party"
                "liik" -> "Movement Now"
                "ps" -> "Finns party"
                "r" -> "Swedish People's Party"
                "sd" -> "Social Democratic Party"
                "vas" -> "Left Alliance"
                "vihr" -> "Green League"
                else -> ""
        }
        return "Party: $partyName"
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