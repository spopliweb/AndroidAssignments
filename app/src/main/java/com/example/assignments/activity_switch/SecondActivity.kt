package com.example.assignments.activity_switch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var bindingTwo : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTwo = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingTwo.root)

        bindingTwo.secondBtn.setOnClickListener {
            val i = Intent(this, FirstActivity::class.java)
            startActivity(i)
        }
    }
}