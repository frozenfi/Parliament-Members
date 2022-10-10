package com.example.parliamentapplication.viewmodel
/*
* Name: Binod Panta
* Student No: 2012206
* Date: 05.10.2022
*/

import android.app.Application
import androidx.lifecycle.*
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.FeedbackDatabase
import com.example.parliamentapplication.data.membersdata.MemberOfParliamentDao
import com.example.parliamentapplication.repo.FeedbackRepo
import com.example.parliamentapplication.repo.MembersRepo
import kotlinx.coroutines.launch
import java.util.*

/*
ViewModel class for MemberDetails fragment
 */
class MemberDetailsViewModel( membersRepo: MembersRepo, personNumber: Int, application: Application) : ViewModel(){

    private val feedbackDatabase=FeedbackDatabase.getInstance(application)
    private val feedbackRepo = FeedbackRepo(feedbackDatabase)

    private var _selectedMember = MutableLiveData<LiveData<ParliamentMembers>>()
    val selectedMember: LiveData<LiveData<ParliamentMembers>>
        get() = _selectedMember

    private var _selectMember = MutableLiveData<ParliamentMembers>()
     val selectMember: LiveData<ParliamentMembers>
       get() = _selectMember


    //LiveData objects that observe and update member comment information
    private var _memberComment = MutableLiveData<Feedback>()
     val memberComment: LiveData<Feedback>
        get() = _memberComment


    init {
        _selectedMember.value = membersRepo.getMembersWithPersonNumber(personNumber)

        }


    //val twitterLink: LiveData<String> = Transformations.map(selectMember) { member ->
      //  member.twitter
    //}

    //TO BE IMPLEMENTED LATER
    /*
        fun likeMember(){
            viewModelScope.launch {
                _selectedMember.value?.value?.let {
                    likeRepo.likeMember(it.personNumber)
                }
            }
        }


    //TO BE IMPLEMENTED LATER
        fun disLikeMember(){
            viewModelScope.launch {
                _selectedMember.value?.value?.let {
                    likeRepo.dislikeMember(it.personNumber)
                }
            }
        }


     */

    private val _navigateToComment = MutableLiveData<Feedback?>()
    val navigateToComment: MutableLiveData<Feedback?>
        get() = _navigateToComment

    fun onAddCommentBtnClicked(feedback: Feedback) {
        _navigateToComment.value = feedback
    }

    fun navigateToCommentCompleted() {
        _navigateToComment.value = null
    }
}

/*
ViewModel factory class for the instantiating the viewModel class
IDE throws error without the use of ViewModelFactory class
 */
class MemberDetailsViewModelFactory(
    private val parliamentDAO: MemberOfParliamentDao,
    private val personNumber: Int,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MemberDetailsViewModel::class.java)) {
            return MemberDetailsViewModel(MembersRepo(parliamentDAO), personNumber,application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}