package com.example.assignments.menus.popupmenu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignments.databinding.MenuRecycleBinding

class StudentMenuAdapter(val list:ArrayList<Student>, val studentMenuOnclick: StudentMenuOnclick):RecyclerView.Adapter<StudentMenuAdapter.StudentViewHolder>() {
    class StudentViewHolder(val bindingOne: MenuRecycleBinding): RecyclerView.ViewHolder(bindingOne.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val bindingOne = MenuRecycleBinding.inflate(inflater, parent, false)
        return StudentViewHolder(bindingOne)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = list[position]
        holder.bindingOne.obj = student

        holder.itemView.setOnClickListener {
            studentMenuOnclick.studentOnClick(position)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}