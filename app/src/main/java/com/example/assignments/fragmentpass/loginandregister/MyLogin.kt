package com.example.assignments.fragmentpass.loginandregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivityMyLoginBinding

class MyLogin : AppCompatActivity() {
    lateinit var binding: ActivityMyLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.myLoginFrag, LoginFragment()).commit()

    }
}