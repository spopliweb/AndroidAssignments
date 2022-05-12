package com.example.assignments.sumoftwo

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivityNumeberOuputBinding

class NumeberOuput : AppCompatActivity() {
    lateinit var binding: ActivityNumeberOuputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumeberOuputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent

        val sumone = intent.getIntExtra("One",0)

        binding.sumOutput.text = "Sum of two numbers is $sumone"
    }
}