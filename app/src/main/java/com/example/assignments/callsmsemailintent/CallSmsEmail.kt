package com.example.assignments.callsmsemailintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.assignments.databinding.ActivityCallSmsEmailBinding

class CallSmsEmail : AppCompatActivity() {
    lateinit var binding: ActivityCallSmsEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallSmsEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("mailto: chintu2411@gmail.com")
            startActivity(intent)

        }

        binding.callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: 9860482283")
            startActivity(intent)
        }

        binding.smsBtn.setOnClickListener {
            val i = Intent(Intent.ACTION_SENDTO)
            i.data = Uri.parse("smsto: 9860482283")
            i.putExtra("sms_body", "This is test SMS")
            startActivity(i)
        }

        binding.sharBtn.setOnClickListener {
            val one = Intent(Intent.ACTION_SEND)
            one.putExtra(Intent.EXTRA_TEXT, "One")
            one.type = "text/plain"
            startActivity(one)
        }
        binding.camBtn.setOnClickListener {
            val oneIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(oneIntent)
        }
    }
}