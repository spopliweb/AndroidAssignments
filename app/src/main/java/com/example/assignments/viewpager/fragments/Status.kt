package com.example.assignments.viewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignments.R
import com.example.assignments.databinding.FragmentStatusBinding

class Status : Fragment() {
    lateinit var binding: FragmentStatusBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatusBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}