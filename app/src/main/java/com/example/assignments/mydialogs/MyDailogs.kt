package com.example.assignments.mydialogs

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.example.assignments.R
import com.example.assignments.databinding.ActivityMyDailogsBinding
import java.util.*
import kotlin.collections.ArrayList

class MyDailogs : AppCompatActivity() {
    lateinit var binding: ActivityMyDailogsBinding
    lateinit var items : ArrayList<String>
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyDailogsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        items = ArrayList()
        val hobbies = arrayOf("Cricket", "Badminton", "Football", "Gym", "Swimming", "Tennis")

        //Simple Alert
        binding.button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Title")
            builder.setIcon(R.drawable.ic_email)
            builder.setMessage("Your Message comes Here")
            builder.show()
        }
        //Positive Negative and other button
        binding.button2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Title")
            builder.setPositiveButton("Positive", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Positive button Clicked", Toast.LENGTH_SHORT).show()
            })
            builder.setNegativeButton("Negative", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Negative button Clicked", Toast.LENGTH_SHORT).show()
            })
            builder.setNeutralButton("ButtonOne", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Neutral Button Clicked", Toast.LENGTH_SHORT).show()
            })
            builder.show()
        }

        //Single Click
        binding.button3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setSingleChoiceItems(hobbies, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                binding.textView2.text = hobbies[i]
            })
            builder.show()
        }

        //Date Show
        binding.butDate.setOnClickListener {
            val calender = Calendar.getInstance()
            val year  = calender.get(Calendar.YEAR)
            val day = calender.get(Calendar.DAY_OF_WEEK)
            val month = calender.get(Calendar.MONTH)

            val datePicker = DatePickerDialog(this, object: DatePickerDialog.OnDateSetListener{
                override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                    binding.textView2.text = "You choose Date $p3/${p2+1}/$p1"
                }

            },year,month,day)
            datePicker.show()
        }

        //MultiChoice
        binding.btnMulti.setOnClickListener {
            items.clear()
            items.add(hobbies[0])
            items.add(hobbies[2])
            val builder = AlertDialog.Builder(this)
            builder.setMultiChoiceItems(hobbies, booleanArrayOf(true, false, true, false, false, false), DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                if (b){
                    items.add(hobbies[i])
                }else{
                    items.remove(hobbies[i])
                }
            })
            builder.setPositiveButton("Show", DialogInterface.OnClickListener { dialogInterface, i ->
                binding.textView2.text = items.toString()
            })
            builder.show()
        }




    }
}