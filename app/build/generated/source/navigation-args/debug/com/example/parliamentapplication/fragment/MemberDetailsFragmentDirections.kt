package com.example.parliamentapplication.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.parliamentapplication.R
import com.example.parliamentapplication.`data`.Feedback
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class MemberDetailsFragmentDirections private constructor() {
  private data class ActionMemberDetailsToCommentFragment(
    public val feedback: Feedback
  ) : NavDirections {
    public override val actionId: Int = R.id.action_memberDetails_to_commentFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Feedback::class.java)) {
          result.putParcelable("feedback", this.feedback as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Feedback::class.java)) {
          result.putSerializable("feedback", this.feedback as Serializable)
        } else {
          throw UnsupportedOperationException(Feedback::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionMemberDetailsToCommentFragment(feedback: Feedback): NavDirections =
        ActionMemberDetailsToCommentFragment(feedback)
  }
}
