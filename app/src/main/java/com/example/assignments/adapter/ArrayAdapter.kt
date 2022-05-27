package com.example.assignments.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.assignments.databinding.ActivityArrayAdapterBinding

class ArrayAdapter : AppCompatActivity() {
    lateinit var binding : ActivityArrayAdapterBinding
    lateinit var list : ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArrayAdapterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add("Dhule")
        list.add("Nashik")
        list.add("Pune")
        list.add("Mumbai")
        list.add("Amravati")
        list.add("Akola")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        binding.mySpinner.adapter = adapter


        binding.mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                binding.tvSpinner.text = list[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

    }
}