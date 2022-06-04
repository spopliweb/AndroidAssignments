package com.example.assignments.storage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assignments.databinding.ActivityReadWriteFileBinding
import java.io.FileOutputStream

class ReadWriteFile : AppCompatActivity() {
    lateinit var binding: ActivityReadWriteFileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadWriteFileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fileTextAdd.setOnClickListener {
            val str = binding.fileText.text.toString()

            val fos : FileOutputStream = openFileOutput("One.txt", MODE_PRIVATE)
            fos.write(str.toByteArray())
            fos.close()
            Toast.makeText(this, "Data added", Toast.LENGTH_SHORT).show()
        }
        binding.fileTextShow.setOnClickListener {
            val fis = openFileInput("One.txt")
            val arr = ByteArray(fis.available())
            fis.read(arr)
            val stri = String(arr)
            binding.tvDataShow.text = stri
        }
    }
}