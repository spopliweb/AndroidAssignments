package com.example.assignments.recycleview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignments.databinding.ActivityMyEmpDataBinding

class MyEmpData : AppCompatActivity() {
    lateinit var binding: ActivityMyEmpDataBinding
    lateinit var list: ArrayList<EmpInfo>
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyEmpDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rcRecyleView.layoutManager = LinearLayoutManager(this)
        list = ArrayList()

        val adapter = EmpAdapter(list)
        binding.rcRecyleView.adapter = adapter

        binding.rcEmpBtn.setOnClickListener {
            val fname = binding.rcEmpName.text.toString()
            val lname = binding.rcEmpLname.text.toString()
            val phone = binding.rcEmpPhone.text.toString()
            val email = binding.rcEmailId.text.toString()

            val emp = EmpInfo(fname, lname, phone.toLong(), email)
            list.add(emp)

            adapter.notifyDataSetChanged()
            reset()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun reset() {
        binding.rcEmpLname.setText("")
        binding.rcEmpName.setText("")
        binding.rcEmpPhone.setText("")
        binding.rcEmailId.setText("")
        binding.rcEmpName.focusable

    }
}