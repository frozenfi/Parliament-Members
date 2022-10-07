package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.parliamentapplication.R
import com.example.parliamentapplication.data.MemberOfParliamentDatabase
import com.example.parliamentapplication.databinding.FragmentMemberDetailsBinding
import com.example.parliamentapplication.viewmodel.MemberDetailsViewModel
import com.example.parliamentapplication.viewmodel.MemberDetailsViewModelFactory

class MemberDetailsFragment : Fragment() {

    private lateinit var binding: FragmentMemberDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_member_details, container, false)
        val application = requireNotNull(this.activity).application
        //val args = MemberDetailsFragmentArgs.fromBundle(requireArguments())
        val argument = MemberDetailsFragmentArgs.fromBundle(requireArguments())
        val dataSrc = MemberOfParliamentDatabase.getInstance(application).memberOfParliamentDAO
       // val feedbackSrc = FeedbackDatabase.getInstance(application).feedbackDao

       // val viewModelFactory = MemberDetailsViewModelFactory(dataSrc, args.personNumber)
        val viewModelFactory = MemberDetailsViewModelFactory(dataSrc,argument.personNumber)
        val memberDetailsViewModel = ViewModelProvider(this,viewModelFactory)[MemberDetailsViewModel::class.java]

        binding.addComment.setOnClickListener{
            Toast.makeText(requireContext(), "Please add comment", Toast.LENGTH_SHORT).show()
        }


        binding.memberDetailsViewModel =memberDetailsViewModel

        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

}