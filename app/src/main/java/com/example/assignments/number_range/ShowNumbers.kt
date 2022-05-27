package com.example.assignments.number_range

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.assignments.databinding.ActivityShowNumbersBinding

class ShowNumbers : AppCompatActivity() {
    lateinit var binding: ActivityShowNumbersBinding
    lateinit var list : ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowNumbersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()

        val intent = intent

        val numOne = intent.getSerializableExtra("Object") as Numbers

        var one :Int = numOne.one
        var two : Int = numOne.two

        while (one <= two){
            list.add(one)
            one++
        }

        val adapter = ArrayAdapter<Int>(this, android.R.layout.simple_list_item_1, list)

        binding.myList.adapter = adapter

    }
}
