package com.example.assignments.adapter.simpleadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import com.example.assignments.R
import com.example.assignments.databinding.ActivityEmpDataBinding

class EmpData : AppCompatActivity() {
    lateinit var binding: ActivityEmpDataBinding
    lateinit var listt: ArrayList<HashMap<String, String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmpDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listt = ArrayList()
        val map1 = HashMap<String, String>()
        map1.put("Name", "Chintu Popali")
        map1.put("Position", "Nothing")
        listt.add(map1)

        val map2 = HashMap<String, String>()
        map2.put("Name", "Sunny Popali")
        map2.put("Position", "All")
        listt.add(map2)

        val arrOne = arrayOf("Name", "Position")
        val arrayTwo = intArrayOf(R.id.simpleName, R.id.simplePos)
        val simpleAdapter = SimpleAdapter(this, listt, R.layout.simple__adapter,arrOne,arrayTwo)

        binding.empList.adapter = simpleAdapter


    }
}