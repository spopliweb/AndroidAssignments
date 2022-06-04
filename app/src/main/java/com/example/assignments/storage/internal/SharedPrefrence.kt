package com.example.assignments.storage.internal

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assignments.databinding.ActivitySharedPrefrenceBinding

class SharedPrefrence : AppCompatActivity() {
    lateinit var binding: ActivitySharedPrefrenceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPrefrenceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shrAdd.setOnClickListener {
            val sharedPrefrence : SharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE)
            val editor: SharedPreferences.Editor =sharedPrefrence.edit()

            editor.putInt("number", 30)
            editor.putString("name", "Chintu")
            editor.apply()

            Toast.makeText(this, "Data Added", Toast.LENGTH_SHORT).show()
        }
        binding.shrShow.setOnClickListener {
            val sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE)
            val a = sharedPreferences.getInt("number", 0)
            val str = sharedPreferences.getString("name", "")

            binding.tvShrShow.text = "$a $str"
        }
        binding.shrClear.setOnClickListener {
            val sharedPrefrences = getSharedPreferences("MyData", MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPrefrences.edit()

            editor.clear()
            editor.apply()
            val a = sharedPrefrences.getInt("number", 0)
            val str = sharedPrefrences.getString("name", "")

            binding.tvShrShow.text = "$a $str"
            Toast.makeText(this, "Data Removed", Toast.LENGTH_SHORT).show()
        }
    }
}