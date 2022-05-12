package com.example.assignments.sumoftwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivityNumberTakenBinding

class NumberTaken : AppCompatActivity() {
    lateinit var bindingSum : ActivityNumberTakenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingSum = ActivityNumberTakenBinding.inflate(layoutInflater)
        setContentView(bindingSum.root)
        bindingSum.sumAdd.setOnClickListener {
            val one = bindingSum.sumOne.text.toString().toInt()
            val two = bindingSum.sumTwo.text.toString().toInt()

            val sum = one + two

            val intent = Intent(this, NumeberOuput::class.java)
            intent.putExtra("One", sum)
            startActivity(intent)

        }
    }
}