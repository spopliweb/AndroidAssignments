package com.example.assignments.toolbarwithsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivityMyToolbarBinding

class MyToolbar : AppCompatActivity() {
    lateinit var binding: ActivityMyToolbarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}