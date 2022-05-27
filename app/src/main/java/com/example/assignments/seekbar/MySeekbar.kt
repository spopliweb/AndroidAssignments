package com.example.assignments.seekbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.assignments.databinding.ActivityMySeekbarBinding

class MySeekbar : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    lateinit var binding: ActivityMySeekbarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMySeekbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seekRed.setOnSeekBarChangeListener(this)
        binding.seekBlue.setOnSeekBarChangeListener(this)
        binding.seekGreen.setOnSeekBarChangeListener(this)

    }

    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        val red =binding.seekRed.progress
        val green = binding.seekGreen.progress
        val blue = binding.seekBlue.progress

        binding.root.setBackgroundColor(Color.rgb(red, green, blue))
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {

    }

    override fun onStopTrackingTouch(p0: SeekBar?) {

    }
}