package com.example.parliamentapplication.fragment

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 05.10.2022
*/

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.parliamentapplication.MainActivity
import com.example.parliamentapplication.R
import com.example.parliamentapplication.data.Feedback
import com.example.parliamentapplication.data.membersdata.MemberOfParliamentDatabase
import com.example.parliamentapplication.databinding.FragmentMemberDetailsBinding
import com.example.parliamentapplication.viewmodel.MemberDetailsViewModel
import com.example.parliamentapplication.viewmodel.MemberDetailsViewModelFactory

class MemberDetailsFragment : Fragment() {

    private lateinit var binding: FragmentMemberDetailsBinding
    private lateinit var memberDetailsViewModel: MemberDetailsViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_member_details, container, false)
        val application = requireNotNull(this.activity).application

        val argument = MemberDetailsFragmentArgs.fromBundle(requireArguments())
        val dataSrc = MemberOfParliamentDatabase.getInstance(application).memberOfParliamentDAO


        //Initialize the viewModelFactory
        val viewModelFactory = MemberDetailsViewModelFactory(dataSrc, argument.personNumber)

        //ViewModel initialized
        memberDetailsViewModel =
            ViewModelProvider(this, viewModelFactory)[MemberDetailsViewModel::class.java]

        //Fragment view is specified as the lifeCycleOwner of binding
        //Through this binding can observe the liveData
        binding.lifecycleOwner = viewLifecycleOwner

        //Observe the member selected to update the comment
        var observeFeedback = Feedback(argument.personNumber, 0, mutableListOf())

        memberDetailsViewModel.memberComment.observe(viewLifecycleOwner) {
            observeFeedback = it!!
        }

        //Set onclick listener to the addComment button
        binding.addComment.setOnClickListener {
            memberDetailsViewModel.onAddCommentBtnClicked(observeFeedback)
            Toast.makeText(requireContext(), "Please add comment", Toast.LENGTH_SHORT).show()
        }

        val memberObserved = Feedback(argument.personNumber, 0, mutableListOf())

        //navigate to comment fragment
        memberDetailsViewModel.navigateToComment.observe(viewLifecycleOwner) { comment ->
            comment?.let {
                this.findNavController().navigate(
                    MemberDetailsFragmentDirections.actionMemberDetailsToCommentFragment(
                        memberObserved
                    )
                )
                memberDetailsViewModel.navigateToCommentCompleted()
            }
        }

        /*
        //I will implement it later
      //onclick listener for the like button
      binding.likeBtn.setOnClickListener {
          Toast.makeText(requireContext(), "liked", Toast.LENGTH_SHORT).show()
          memberDetailsViewModel.updateFeedback(1)
          memberDetailsViewModel.memberComment.observe(viewLifecycleOwner) {
              binding.ratingScore.text = memberDetailsViewModel.rating()

          }
      }

           //binding set for twitter link but for some reason not working
      binding.button.setOnClickListener{
          memberDetailsViewModel.twitterLink.observe(viewLifecycleOwner) {
              val intent = Intent(Intent.ACTION_VIEW)
              intent.data = Uri.parse(it)
              startActivity(intent)
          }
      }
       */

        //binding the viewModel with the xml layout
        binding.memberDetailsViewModel = memberDetailsViewModel

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as MainActivity).supportActionBar?.title ="Member Details"
    }
}