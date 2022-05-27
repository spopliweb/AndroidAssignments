package com.example.assignments.number_range

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivityTakeNumbersBinding

class TakeNumbers : AppCompatActivity() {
    lateinit var binding: ActivityTakeNumbersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTakeNumbersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.numRangeBtn.setOnClickListener {
            val numOne = binding.numOne.text.toString()
            val numTwo = binding.numTwo.text.toString()

            val num = Numbers(numOne.toInt(), numTwo.toInt())

            val intent = Intent(this, ShowNumbers()::class.java)
            intent.putExtra("Object", num)
            startActivity(intent)
        }

    }
}