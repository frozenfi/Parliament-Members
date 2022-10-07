package com.example.parliamentapplication.fragment

import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.parliamentapplication.R
import com.example.parliamentapplication.adapter.CommentAdapter
import com.example.parliamentapplication.data.FeedbackDatabase
import com.example.parliamentapplication.databinding.FragmentCommentBinding
import com.example.parliamentapplication.viewmodel.CommentViewModel
import com.example.parliamentapplication.viewmodel.CommentViewModelFactory

//import com.example.parliamentapplication.viewmodel.CommentViewModelFactory

class CommentFragment : Fragment() {

    private lateinit var binding: FragmentCommentBinding
    private lateinit var commentViewModel: CommentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_comment, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_comment, container, false)
        val application = requireNotNull(this.activity).application
        val args = CommentFragmentArgs.fromBundle(requireArguments())
        val dataSrc = FeedbackDatabase.getInstance(application).feedbackDao


        val commentViewModelFactory = CommentViewModelFactory(dataSrc, args.personNumber)
        commentViewModel =
            ViewModelProvider(this, commentViewModelFactory)[CommentViewModel::class.java]

        binding.commentViewModel = commentViewModel

        val adapter = CommentAdapter()
        binding.commentList.adapter = adapter

        updateCommentUI(adapter)

        binding.addCommentBtn.setOnClickListener() {
            requireView().hideKeyboard()
            val addComment = binding.editComment.text.toString()
            commentViewModel.updateFeedback(addComment)
            updateCommentUI(adapter)
            binding.editComment.setText("")
        }
        return binding.root
    }

    private fun updateCommentUI(adapter: CommentAdapter) {
        commentViewModel.memberFeedback.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.submitList(it.comment.toList().reversed())
            }
        })
    }

    private fun View.hideKeyboard() {
        val inputMethodManager = context.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }
}



