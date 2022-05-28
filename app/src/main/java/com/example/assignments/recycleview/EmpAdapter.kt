package com.example.assignments.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignments.databinding.EmpRowItemBinding

class EmpAdapter(val list:ArrayList<EmpInfo>) : RecyclerView.Adapter<EmpAdapter.EmpViewHolder>() {
    class EmpViewHolder (val binding: EmpRowItemBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmpViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = EmpRowItemBinding.inflate(inflater, parent, false)
        return EmpViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmpViewHolder, position: Int) {
        val emp = list[position]
        holder.binding.obj = emp
    }

    override fun getItemCount(): Int {
        return list.size
    }
}