package com.example.parliamentapplication.viewmodel

import androidx.lifecycle.*
import com.example.parliamentapplication.data.MemberOfParliamentDao
import com.example.parliamentapplication.repo.MembersRepo
/*
VieModel class for Party Fragment
 */
class PartyViewModel(membersRepo: MembersRepo) : ViewModel() {
    val parties = membersRepo.getParties()
    val status = membersRepo.status


    private val _navigateToPartySelected = MutableLiveData<String?>()
    val navigateToPartySelected
        get() = _navigateToPartySelected

    fun onPartyClicked(party: String) {
        _navigateToPartySelected.value = party
    }

    fun onNavigateToPartySelected() {
        _navigateToPartySelected.value = null
    }
}

/*
ViewModel factory class for the instantiating the viewModel class
IDE throws error without the use of ViewModelFactory class
 */
class PartyViewModelFactory(private val memberOfParliamentDAO: MemberOfParliamentDao) :
    ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PartyViewModel::class.java)) {
            return PartyViewModel(MembersRepo(memberOfParliamentDAO)) as T
        }
        throw IllegalArgumentException("ViewModel class not identified")
    }
}


