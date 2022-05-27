package com.example.assignments.loginregfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignments.R
import com.example.assignments.databinding.FragmentRegistrationOneBinding

class RegistrationOne : Fragment() {
    lateinit var binding: FragmentRegistrationOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationOneBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}