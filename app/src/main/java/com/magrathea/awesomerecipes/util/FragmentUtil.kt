package com.magrathea.awesomerecipes.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

interface FragmentUtil {
    fun replaceFragmentWithHistory(fragmentActivity: FragmentActivity, fragment: Fragment)
    fun replaceFragmentWithoutHistory(fragmentActivity: FragmentActivity, fragment: Fragment)
}