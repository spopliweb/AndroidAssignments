package com.example.assignments.fragmentpass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivityMainFragBinding

class MainFrag : AppCompatActivity() {
    lateinit var binding: ActivityMainFragBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainFragBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstFrag.setOnClickListener {
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.add(R.id.fgvTest, OneFrag())
            transaction.commit()
        }
        binding.secondFrag.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fgvTest, TwoFrag()).commit()
        }
    }
}