package com.example.assignments.objectpassactvity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments.databinding.ActivityObjectTakeBinding

class ObjectTake : AppCompatActivity() {
    lateinit var binding: ActivityObjectTakeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityObjectTakeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.objButton.setOnClickListener {
            val name = binding.objName.text.toString()
            val email = binding.objEmail.text.toString()
            val phone = binding.objNum.text.toString()

            val student = Student(name, email, phone.toLong())
            val intent = Intent(this, ObjectOutput::class.java)
            intent.putExtra("Object", student)
            startActivity(intent)

        }
    }
}