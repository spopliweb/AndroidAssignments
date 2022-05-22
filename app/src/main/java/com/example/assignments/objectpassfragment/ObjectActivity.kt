package com.example.assignments.objectpassfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivityObjectBinding

class ObjectActivity : AppCompatActivity() {
    lateinit var binding : ActivityObjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.fgvObject, ObjectOneFragment()).commit()
    }
}