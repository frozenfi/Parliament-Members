package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.parliamentapplication.R
import com.example.parliamentapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main, container, false
        )

        binding.partyList.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToPartyListFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }


}