package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.parliamentapplication.R
import com.example.parliamentapplication.adapter.MemberAdapter
import com.example.parliamentapplication.adapter.MemberClickListener
import com.example.parliamentapplication.data.MemberOfParliamentDatabase
import com.example.parliamentapplication.databinding.FragmentMemberListBinding
import com.example.parliamentapplication.viewmodel.MemberListViewModelFactory
import com.example.parliamentapplication.viewmodel.MemberViewModel
import kotlinx.android.synthetic.main.fragment_member_list.view.*
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager


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


        val viewModelFactory = MemberListViewModelFactory(
            MemberOfParliamentDatabase.getInstance(application).memberOfParliamentDAO,
            args.party
        )

        val memberViewModel = ViewModelProvider(this, viewModelFactory)[MemberViewModel::class.java]

        binding.memberViewModel=memberViewModel
        binding.lifecycleOwner = viewLifecycleOwner

        val adapter = MemberAdapter(MemberClickListener { personNumber ->
            memberViewModel.onMemberClicked(personNumber)
        })

        binding.memberList.adapter = adapter

        memberViewModel.parliamentMembers.observe(viewLifecycleOwner) {
            it?.let { adapter.submitList(it) }
        }

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


}