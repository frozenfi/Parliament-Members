package com.example.parliamentapplication.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.parliamentapplication.R

public class MainFragmentDirections private constructor() {
  public companion object {
    public fun actionMainFragmentToPartyListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_partyListFragment)
  }
}
