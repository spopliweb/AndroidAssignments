package com.example.assignments.buttonclickbgchange

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivityBackgroundChangeBinding

class BackgroundChange : AppCompatActivity() {
    lateinit var binding: ActivityBackgroundChangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBackgroundChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOne.setOnClickListener {
            binding.root.setBackgroundColor(Color.RED)
        }
        binding.btnTwo.setOnClickListener {
            binding.root.setBackgroundColor(Color.BLUE)
        }
        binding.btnThree.setOnClickListener {
            binding.root.setBackgroundColor(Color.GREEN)
        }

    }
}