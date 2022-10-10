package com.example.parliamentapplication.fragment
/*
* Name: Binod Panta
* Student No: 2012206
* Date: 07.10.2022
*/
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.parliamentapplication.R
import com.example.parliamentapplication.adapter.MemberAdapter
import com.example.parliamentapplication.adapter.MemberClickListener
import com.example.parliamentapplication.data.membersdata.MemberOfParliamentDatabase
import com.example.parliamentapplication.databinding.FragmentMemberListBinding
import com.example.parliamentapplication.viewmodel.MemberListViewModelFactory
import com.example.parliamentapplication.viewmodel.MemberViewModel
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parliamentapplication.MainActivity


class MemberListFragment : Fragment() {

    private lateinit var binding: FragmentMemberListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_member_list, container, false)

        val application = requireNotNull(this.activity).application
        val args = MemberListFragmentArgs.fromBundle(requireArguments())

        //Initialize the viewModelFactory
        val viewModelFactory = MemberListViewModelFactory(
            MemberOfParliamentDatabase.getInstance(application).memberOfParliamentDAO,
            args.party
        )

        //ViewModel initialized
        val memberViewModel = ViewModelProvider(this, viewModelFactory)[MemberViewModel::class.java]

        //binding the viewModel with the xml layout
        binding.memberViewModel = memberViewModel

        //Fragment view is specified as the lifeCycleOwner of binding
        //Through this binding can observe the liveData
        binding.lifecycleOwner = viewLifecycleOwner

        //Set the adapter for recycler view
        val adapter = MemberAdapter(MemberClickListener { personNumber ->
            memberViewModel.onMemberClicked(personNumber)
        })

        binding.memberList.adapter = adapter

        //Observe the change in the List of members of parliament
        memberViewModel.parliamentMembers.observe(viewLifecycleOwner) {
            it?.let { adapter.submitList(it) }
        }

        //Navigate to next fragment member details fragment
        memberViewModel.navigateToParliamentMemberDetails.observe(viewLifecycleOwner) { member ->
            member?.let {
                this.findNavController().navigate(
                    MemberListFragmentDirections.actionMemberListFragmentToMemberDetails(member)
                )
                memberViewModel.onMemberDetailNavigated()
            }
        }

        binding.memberList.layoutManager = LinearLayoutManager(requireContext())

        return binding.root

    }
    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).supportActionBar?.title ="Party Member List"
    }
}