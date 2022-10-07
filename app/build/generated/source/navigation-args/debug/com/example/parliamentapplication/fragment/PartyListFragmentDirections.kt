package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.parliamentapplication.R
import kotlin.Int
import kotlin.String

public class PartyListFragmentDirections private constructor() {
  private data class ActionPartyListFragmentToMemberListFragment(
    public val party: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_partyListFragment_to_memberListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("party", this.party)
        return result
      }
  }

  public companion object {
    public fun actionPartyListFragmentToMemberListFragment(party: String): NavDirections =
        ActionPartyListFragmentToMemberListFragment(party)
  }
}
