package com.example.assignments.menus.popupmenu

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignments.R
import com.example.assignments.databinding.ActivityPopupMenuBinding
import com.example.assignments.databinding.StudentEditBinding

class PopupMenu : AppCompatActivity(), StudentMenuOnclick {
    lateinit var binding: ActivityPopupMenuBinding
    lateinit var list: ArrayList<Student>
    lateinit var stuBind: StudentEditBinding
    lateinit var adapter: StudentMenuAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopupMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.menuRecycleView.layoutManager = LinearLayoutManager(this)
        list = ArrayList()
        list.add(Student("Chintu Popali", "Dhule MH", "chintu@gmail.com"))
        list.add(Student("Sarika Popali", "Dhule MH", "Sarika@gmail.com"))
        list.add(Student("Hiranya Popali", "Dhule MH", "hiranya@gmail.com"))
        adapter = StudentMenuAdapter(list, this)
        binding.menuRecycleView.adapter = adapter
    }

    override fun studentOnClick(position: Int) {
        val student = list[position]
        stuBind = StudentEditBinding.inflate(layoutInflater)
        val popup = PopupMenu(this, binding.menuRecycleView)
        popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)
        popup.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.menuEdit -> {
                    stuBind.stuEdtName.setText(student.name)
                    stuBind.stuEdtAddress.setText(student.address)
                    stuBind.stuEdtEmail.setText(student.email)

                    stuBind.stuTvName.visibility = View.INVISIBLE
                    stuBind.stuTvAddress.visibility = View.INVISIBLE
                    stuBind.stuTvEmail.visibility = View.INVISIBLE

                    val builder = AlertDialog.Builder(this)
                    builder.setView(stuBind.root)
                    builder.setTitle("Update Data")
                    builder.setPositiveButton("Update", DialogInterface.OnClickListener { dialogInterface, i ->
                        val name = stuBind.stuEdtName.text.toString()
                        val address = stuBind.stuEdtAddress.text.toString()
                        val email = stuBind.stuEdtEmail.text.toString()
                        val newStu = Student(name, address, email)
                        list[position] = newStu
                        adapter.notifyDataSetChanged()
                    })
                    builder.show()
                }
                R.id.menuView -> {
                    stuBind.stuEdtName.visibility = View.INVISIBLE
                    stuBind.stuEdtAddress.visibility = View.INVISIBLE
                    stuBind.stuEdtEmail.visibility = View.INVISIBLE

                    stuBind.stuTvName.text = student.name
                    stuBind.stuTvAddress.text = student.address
                    stuBind.stuTvEmail.text = student.email

                    val builder = AlertDialog.Builder(this)
                    builder.setView(stuBind.root)
                    builder.setTitle("Check Data")
                    builder.setPositiveButton("Correct", DialogInterface.OnClickListener { dialogInterface, i ->
                        dialogInterface.dismiss()
                    })
                    builder.show()
                }
                R.id.menuDelete -> {
                    val builder = AlertDialog.Builder(this)
                    //builder.setView(stuBind.root)
                    builder.setTitle("Are you Sure You want to Delete Data")
                    builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                        list.remove(student)
                        adapter.notifyDataSetChanged()
                    })
                    builder.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                        dialogInterface.dismiss()
                    })
                    builder.show()
                }
            }
            true
        }

        popup.show()
    }
}