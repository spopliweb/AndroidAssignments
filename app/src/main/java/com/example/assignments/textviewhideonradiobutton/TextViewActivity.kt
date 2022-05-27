package com.example.assignments.textviewhideonradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.assignments.R
import com.example.assignments.databinding.ActivityTextViewBinding

class TextViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityTextViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHideRadioGroup.setOnCheckedChangeListener { radioGroup, i ->
            if (radioGroup.checkedRadioButtonId == R.id.tvShow){
                binding.tvHideOne.visibility = View.VISIBLE
            }else if (radioGroup.checkedRadioButtonId == R.id.tvHide){
                binding.tvHideOne.visibility = View.INVISIBLE
            }else{
                binding.tvHideOne.visibility = View.INVISIBLE
            }
        }
    }
}