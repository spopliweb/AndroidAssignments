package com.example.assignments.mydialogs

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import com.example.assignments.databinding.ActivityDateDifferenceBinding
import java.text.SimpleDateFormat
import java.util.*

class DateDifference : AppCompatActivity() {
    lateinit var binidng: ActivityDateDifferenceBinding
    var boolOne = false
    var boolTwo = false
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binidng = ActivityDateDifferenceBinding.inflate(layoutInflater)
        setContentView(binidng.root)

        var dateOne: String = ""
        var dateTwo: String = ""

        binidng.dateOne.setOnClickListener {
            val calender = Calendar.getInstance()
            val year = calender.get(Calendar.YEAR)
            val month = calender.get(Calendar.MONTH)
            val day = calender.get(Calendar.DAY_OF_WEEK)


            val datePicker = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener{
                override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                    dateOne = "$p3/${p2+1}/$p1"
                }

            }, year, month, day)
            datePicker.show()

        }
        binidng.dateTwo.setOnClickListener {
            val calender = Calendar.getInstance()
            val year = calender.get(Calendar.YEAR)
            val month = calender.get(Calendar.MONTH)
            val day = calender.get(Calendar.DAY_OF_WEEK)

            val datePicker = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener{
                override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                    dateTwo = "$p3/${p2+1}/$p1"

                }

            }, year, month, day)
            datePicker.show()

        }
        binidng.dateCal.setOnClickListener {
            val pattern =SimpleDateFormat("dd/M/yyyy")
            val dateFirst = pattern.parse(dateOne)
            val dateLast = pattern.parse(dateTwo)

            var difference  = dateLast.time - dateFirst.time
            difference /= (1000 * 60 * 60 * 24)

            binidng.dateDiff.text = "$difference days"
        }
    }
}