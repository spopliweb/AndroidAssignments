package com.example.assignments.activity_switch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    lateinit var bindingFirst : ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFirst = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(bindingFirst.root)
        bindingFirst.firstBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}