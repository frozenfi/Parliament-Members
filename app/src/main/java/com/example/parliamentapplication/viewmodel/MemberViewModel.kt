package com.example.parliamentapplication.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.parliamentapplication.data.MemberOfParliamentDao
import com.example.parliamentapplication.repo.MembersRepo
/*
ViewModel class for MemberListFragment
 */

class MemberViewModel(membersRepo: MembersRepo, party: String) : ViewModel() {

    private val _navigateToMemberDetails = MutableLiveData<Int>()

    val navigateToParliamentMemberDetails
        get() = _navigateToMemberDetails

    val parliamentMembers = membersRepo.getMembersByParty(party)

    fun onMemberClicked(id:Int) {
        _navigateToMemberDetails.value = id
    }

    fun onMemberDetailNavigated() {
        _navigateToMemberDetails.value = null
    }

}

/*
ViewModel factory class for the instantiating the viewModel class
IDE throws error without the use of ViewModelFactory class
 */
class MemberListViewModelFactory(
    private val memberDao: MemberOfParliamentDao,
    private val party: String
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MemberViewModel::class.java)) {
            return MemberViewModel(MembersRepo(memberDao),party) as T
        }
        throw IllegalArgumentException("ViewModel class not identified")
    }
}