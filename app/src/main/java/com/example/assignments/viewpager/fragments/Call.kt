package com.example.assignments.viewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignments.R
import com.example.assignments.databinding.FragmentCallBinding

class Call : Fragment() {
    lateinit var binding: FragmentCallBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCallBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}