package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parliamentapplication.R
import com.example.parliamentapplication.adapter.PartyAdapter
import com.example.parliamentapplication.adapter.PartyClickListener
import com.example.parliamentapplication.data.MemberOfParliamentDatabase
import com.example.parliamentapplication.databinding.FragmentPartyListBinding
import com.example.parliamentapplication.viewmodel.PartyViewModel
import com.example.parliamentapplication.viewmodel.PartyViewModelFactory


@Suppress("DEPRECATION", "COMPATIBILITY_WARNING")
class PartyListFragment : Fragment() {
    private lateinit var binding: FragmentPartyListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_party_list, container, false)
        val application = requireNotNull(this.activity).application
        val viewModelFactory =
            PartyViewModelFactory(MemberOfParliamentDatabase.getInstance(application).memberOfParliamentDAO)

        val partyViewModel = ViewModelProvider(this, viewModelFactory)[PartyViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner

        val adapter = PartyAdapter(PartyClickListener { party ->
            partyViewModel.onPartyClicked(party)
        })

        binding.partyList.adapter = adapter

        partyViewModel.parties.observe(viewLifecycleOwner) {
            it.let {
                adapter.submitList(it)
            }
        }
        partyViewModel.navigateToPartySelected.observe(viewLifecycleOwner) { party ->
            party?.let {
                view?.findNavController()?.navigate(PartyListFragmentDirections.actionPartyListFragmentToMemberListFragment(party))
                partyViewModel.onNavigateToPartySelected()
            }
        }

        binding.partyList.layoutManager =LinearLayoutManager(requireContext())


        return binding.root

    }

}