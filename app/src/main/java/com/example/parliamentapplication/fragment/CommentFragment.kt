package com.example.parliamentapplication.fragment

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 08.10.2022
*/
import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.parliamentapplication.MainActivity
import com.example.parliamentapplication.R
import com.example.parliamentapplication.adapter.CommentAdapter
import com.example.parliamentapplication.databinding.FragmentCommentBinding
import com.example.parliamentapplication.viewmodel.CommentViewModel
import com.example.parliamentapplication.viewmodel.CommentViewModelFactory


class CommentFragment : Fragment() {

    private lateinit var binding: FragmentCommentBinding
    private lateinit var commentViewModel: CommentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_comment, container, false)
        val application = requireNotNull(activity).application
        val feedback = CommentFragmentArgs.fromBundle(this.requireArguments()).feedback

        //Initialize the viewModelFactory
        val commentViewModelFactory = CommentViewModelFactory(feedback, application)

        //ViewModel initialized
        commentViewModel =
            ViewModelProvider(this, commentViewModelFactory)[CommentViewModel::class.java]

        //bind the viewmodel with the related xml file
        binding.commentViewModel = commentViewModel

        val adapter = CommentAdapter()
        binding.commentList.adapter = adapter

        //function update UI called
        updateCommentUI(adapter)

        //onClick listener for the add comment button
        binding.addCommentBtn.setOnClickListener() {
            requireView().hideKeyboard()
            val addComment = binding.editComment.text.toString()
            commentViewModel.updateFeedback(addComment)
            updateCommentUI(adapter)
            binding.editComment.setText("")
        }
        return binding.root
    }


    //internal function to update the UI with the comments
    private fun updateCommentUI(adapter: CommentAdapter) {
        commentViewModel.memberFeedback.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.submitList(it.comment.toList().reversed())
            }
        })
    }

    //funtion to hide keyboard
    private fun View.hideKeyboard() {
        val inputMethodManager =
            context.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }

}


