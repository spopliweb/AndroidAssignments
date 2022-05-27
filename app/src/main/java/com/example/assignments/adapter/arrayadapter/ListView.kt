package com.example.assignments.adapter.arrayadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.assignments.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() {
    lateinit var binding: ActivityListViewBinding
    lateinit var list : ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()
        list = ArrayList()
        list.add("Dhule")
        list.add("Nashik")
        list.add("Pune")
        list.add("Mumbai")
        list.add("Amravati")
        list.add("Akola")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        binding.myListView.adapter = adapter

        binding.myListView.setOnItemClickListener { adapterView, view, pos, l ->

            binding.tvMyList.text = list[pos]
        }


    }
}