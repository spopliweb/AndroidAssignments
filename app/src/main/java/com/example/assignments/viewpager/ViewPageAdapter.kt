package com.example.assignments.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignments.viewpager.fragments.Call
import com.example.assignments.viewpager.fragments.Chat
import com.example.assignments.viewpager.fragments.Status

class ViewPageAdapter(myFragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(myFragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return Chat()
            1 -> return Status()
            2 -> return Call()
        }
        return Chat()
    }
}