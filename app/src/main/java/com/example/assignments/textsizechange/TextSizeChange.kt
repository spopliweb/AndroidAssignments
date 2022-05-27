package com.example.assignments.textsizechange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assignments.databinding.ActivityTextSizeChangeBinding

class TextSizeChange : AppCompatActivity() {
    lateinit var binding : ActivityTextSizeChangeBinding
    var textSize: Float? = null
    var diff:kotlin.Float? = 1.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextSizeChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.upSize.setOnClickListener {
            textSize = binding.textView.textSize
            textSize = textSize!! + diff!!

            binding.textView.textSize = textSize!!
        }
        binding.downSize.setOnClickListener {
            textSize = binding.textView.textSize
            textSize = textSize!! - diff!!

            binding.textView.textSize = textSize!!
        }
    }
}