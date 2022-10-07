package com.example.parliamentapplication.viewmodel

import androidx.lifecycle.*
import com.example.parliamentapplication.data.MemberOfParliamentDao

import com.example.parliamentapplication.repo.MembersRepo

class PartyViewModel(membersRepo: MembersRepo) : ViewModel() {
    val parties = membersRepo.getParties()
    val status = membersRepo.status


    private val _navigateToPartySelected = MutableLiveData<String>()
    val navigateToPartySelected
        get() = _navigateToPartySelected

    fun onPartyClicked(party: String) {
        _navigateToPartySelected.value = party
    }

    fun onNavigateToPartySelected() {
        //_navigateToPartySelected.value = null
    }
}

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


/*
class MemberOfParliamentViewModel:ViewModel() {
    private val repo = MembersRepo
    private val listOfParty = Transformations.map(repo.allMP) {it->it.map{it.party}.toSet()}
    private val partyMembersList = MutableLiveData<List<ParliamentMembers>>()
    private val memberOfParliamentDetails = MutableLiveData<ParliamentMembers>()

    val party:LiveData<Set<String>>
    get() = listOfParty

    val memberOfParty:LiveData<List<ParliamentMembers>>
    get() = partyMembersList

    val detailsOfMember:LiveData<ParliamentMembers>
    get() = memberOfParliamentDetails


    init {
        getParliamentInfo()
    }


    fun getPartyMembers(party:String) {
        partyMembersList.value =repo.allMP.value?.filter { it.party==party }
    }

    fun getPartyMembersDetail(name:String) {
        memberOfParliamentDetails.value =repo.allMP.value?.find { "${it.firstname} ${it.lastname}" == name }
    }

}

 */

