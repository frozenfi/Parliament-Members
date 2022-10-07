package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class MemberListFragmentArgs(
  public val party: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("party", this.party)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("party", this.party)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MemberListFragmentArgs {
      bundle.setClassLoader(MemberListFragmentArgs::class.java.classLoader)
      val __party : String?
      if (bundle.containsKey("party")) {
        __party = bundle.getString("party")
        if (__party == null) {
          throw IllegalArgumentException("Argument \"party\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"party\" is missing and does not have an android:defaultValue")
      }
      return MemberListFragmentArgs(__party)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): MemberListFragmentArgs {
      val __party : String?
      if (savedStateHandle.contains("party")) {
        __party = savedStateHandle["party"]
        if (__party == null) {
          throw IllegalArgumentException("Argument \"party\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"party\" is missing and does not have an android:defaultValue")
      }
      return MemberListFragmentArgs(__party)
    }
  }
}
