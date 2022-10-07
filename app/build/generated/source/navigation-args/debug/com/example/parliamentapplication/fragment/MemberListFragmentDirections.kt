package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.parliamentapplication.R
import kotlin.Int

public class MemberListFragmentDirections private constructor() {
  private data class ActionMemberListFragmentToMemberDetails(
    public val personNumber: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_memberListFragment_to_memberDetails

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("personNumber", this.personNumber)
        return result
      }
  }

  public companion object {
    public fun actionMemberListFragmentToMemberDetails(personNumber: Int): NavDirections =
        ActionMemberListFragmentToMemberDetails(personNumber)
  }
}
