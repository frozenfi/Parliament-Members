package com.example.parliamentapplication.fragment

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parliamentapplication.MainActivity
import com.example.parliamentapplication.R
import com.example.parliamentapplication.adapter.PartyAdapter
import com.example.parliamentapplication.adapter.PartyClickListener
import com.example.parliamentapplication.data.membersdata.MemberOfParliamentDatabase
import com.example.parliamentapplication.databinding.FragmentPartyListBinding
import com.example.parliamentapplication.viewmodel.PartyViewModel
import com.example.parliamentapplication.viewmodel.PartyViewModelFactory

@Suppress("COMPATIBILITY_WARNING", "DEPRECATION")
class PartyListFragment : Fragment() {
    private lateinit var binding: FragmentPartyListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_party_list, container, false)
        val application = requireNotNull(this.activity).application

        //Initialize the viewModelFactory
        val viewModelFactory =
            PartyViewModelFactory(MemberOfParliamentDatabase.getInstance(application).memberOfParliamentDAO)

        //ViewModel initialized
        val partyViewModel = ViewModelProvider(this, viewModelFactory)[PartyViewModel::class.java]

        //Fragment view is specified as the lifeCycleOwner of binding
        //Through this binding can observe the liveData
        binding.lifecycleOwner = viewLifecycleOwner

        //Set the adapter for recycler view
        val adapter = PartyAdapter(PartyClickListener { party ->
            partyViewModel.onPartyClicked(party)
        })

        binding.partyList.adapter = adapter

        //Observe the change in the List of Party
        partyViewModel.parties.observe(viewLifecycleOwner) {
            it.let {
                adapter.submitList(it)
            }
        }

        //Navigate to the fragment for list of Members
        partyViewModel.navigateToPartySelected.observe(viewLifecycleOwner) { party ->
            party?.let {
                view?.findNavController()?.navigate(PartyListFragmentDirections.actionPartyListFragmentToMemberListFragment(party))
                partyViewModel.onNavigateToPartySelected()
            }
        }
        binding.partyList.layoutManager =LinearLayoutManager(requireContext())


        return binding.root

    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).supportActionBar?.title ="Party List"
    }

}