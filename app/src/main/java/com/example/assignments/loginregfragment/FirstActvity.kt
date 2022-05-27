package com.example.assignments.loginregfragment

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivityFirstActvityBinding

class FirstActvity : AppCompatActivity() {
    lateinit var binding: ActivityFirstActvityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstActvityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginFrag.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.mainFCV, LoginOne()).commit()
        }
        binding.regFrag.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.mainFCV, RegistrationOne()).commit()
        }
    }
}