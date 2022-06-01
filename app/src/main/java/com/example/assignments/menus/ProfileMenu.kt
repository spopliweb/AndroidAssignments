package com.example.assignments.menus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignments.R
import com.example.assignments.databinding.FragmentProfileMenuBinding

class ProfileMenu : Fragment() {
    lateinit var binding: FragmentProfileMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileMenuBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}