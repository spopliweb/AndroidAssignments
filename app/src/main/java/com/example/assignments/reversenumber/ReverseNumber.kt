package com.example.assignments.reversenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import com.example.assignments.databinding.ActivityReverseNumberBinding

class ReverseNumber : AppCompatActivity() {
    lateinit var binding: ActivityReverseNumberBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReverseNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.revNumber.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if (binding.revNumber.text.toString().isNotEmpty()){
                        var number: Int =binding.revNumber.text.toString().toInt()
                        var revers =0
                        while (number > 0){
                            val lastDigit =number%10

                            revers = revers * 10 + lastDigit

                            number = number/10
                        }
                        binding.revNumTV.text = revers.toString()
                    }else{
                        binding.revNumTV.text = "0"
                    }
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
    }
}