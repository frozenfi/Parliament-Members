package com.example.parliamentapplication.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class MemberDetailsFragmentArgs(
  public val personNumber: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("personNumber", this.personNumber)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("personNumber", this.personNumber)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MemberDetailsFragmentArgs {
      bundle.setClassLoader(MemberDetailsFragmentArgs::class.java.classLoader)
      val __personNumber : Int
      if (bundle.containsKey("personNumber")) {
        __personNumber = bundle.getInt("personNumber")
      } else {
        throw IllegalArgumentException("Required argument \"personNumber\" is missing and does not have an android:defaultValue")
      }
      return MemberDetailsFragmentArgs(__personNumber)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): MemberDetailsFragmentArgs {
      val __personNumber : Int?
      if (savedStateHandle.contains("personNumber")) {
        __personNumber = savedStateHandle["personNumber"]
        if (__personNumber == null) {
          throw IllegalArgumentException("Argument \"personNumber\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"personNumber\" is missing and does not have an android:defaultValue")
      }
      return MemberDetailsFragmentArgs(__personNumber)
    }
  }
}
