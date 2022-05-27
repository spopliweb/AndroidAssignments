package com.example.assignments.addsubmuldiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.R
import com.example.assignments.databinding.ActivityRadioBinding

class RadioActivity : AppCompatActivity() {
    lateinit var binding: ActivityRadioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.raRadioGroup.setOnCheckedChangeListener { radioGroup, i ->
            val numOne = binding.raNumOne.text.toString().toInt()
            val numTwo = binding.raNumTwo.text.toString().toInt()
            var result: Int = 0

            if (radioGroup.checkedRadioButtonId == R.id.raPlus) {
                result = numOne + numTwo

                binding.raTvAnswer.text = result.toString()
            } else if (radioGroup.checkedRadioButtonId == R.id.raMinus) {
                result = numOne - numTwo

                binding.raTvAnswer.text = result.toString()
            }else if (radioGroup.checkedRadioButtonId == R.id.raMulti){
                result = numOne * numTwo

                binding.raTvAnswer.text = result.toString()
            }else if (radioGroup.checkedRadioButtonId == R.id.raDiv){
                result = numOne / numTwo

                binding.raTvAnswer.text = result.toString()
            }else{
                binding.raTvAnswer.text = result.toString()
            }
        }
    }
}