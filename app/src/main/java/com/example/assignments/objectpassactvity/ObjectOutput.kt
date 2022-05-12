package com.example.assignments.objectpassactvity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivityObjectOutputBinding

class ObjectOutput : AppCompatActivity() {
    lateinit var binding : ActivityObjectOutputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityObjectOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val student = i.getSerializableExtra("Object") as Student

        binding.obj = student
    }
}