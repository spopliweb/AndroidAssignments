package com.example.assignments.radiobuttoncolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivityRadioButtonBinding

class RadioButton : AppCompatActivity() {
    lateinit var binding : ActivityRadioButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioBtnGrp.setOnCheckedChangeListener { radioGroup, i ->
            if (radioGroup.checkedRadioButtonId == R.id.radioBtnRed){
                binding.root.setBackgroundColor(Color.RED)
            }else if(radioGroup.checkedRadioButtonId == R.id.radioBtnBlue){
                binding.root.setBackgroundColor(Color.BLUE)
            }else if(radioGroup.checkedRadioButtonId == R.id.radioBtnYellow){
                binding.root.setBackgroundColor(Color.YELLOW)
            }else if (radioGroup.checkedRadioButtonId == R.id.radioBtnCust){
                binding.root.setBackgroundColor(Color.rgb(155, 144, 200))
            }
        }
    }
}