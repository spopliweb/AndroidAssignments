package com.example.assignments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.activity_switch.SecondActivity
import com.example.assignments.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Thread{
            Thread.sleep(3000)
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }.start()
    }
}