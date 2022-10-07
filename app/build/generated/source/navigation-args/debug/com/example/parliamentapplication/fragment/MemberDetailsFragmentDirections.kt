package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.parliamentapplication.R
import kotlin.Int

public class MemberDetailsFragmentDirections private constructor() {
  private data class ActionMemberDetailsToCommentFragment(
    public val personNumber: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_memberDetails_to_commentFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("personNumber", this.personNumber)
        return result
      }
  }

  public companion object {
    public fun actionMemberDetailsToCommentFragment(personNumber: Int): NavDirections =
        ActionMemberDetailsToCommentFragment(personNumber)
  }
}
