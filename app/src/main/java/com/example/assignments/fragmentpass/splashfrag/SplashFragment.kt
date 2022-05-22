package com.example.assignments.fragmentpass.splashfrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivitySplashFragmentBinding
import com.example.assignments.fragmentpass.OneFrag
import com.example.assignments.fragmentpass.TwoFrag

class SplashFragment : AppCompatActivity() {
    lateinit var binding: ActivitySplashFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.splashOne, OneFrag()).commit()

        Thread{
            Thread.sleep(10000)

            supportFragmentManager.beginTransaction().replace(R.id.splashOne,TwoFrag()).commit()

        }.start()

    }
}