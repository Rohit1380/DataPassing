package com.example.datapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datapassing.databinding.ActivityDataSendBinding
import com.example.datapassing.databinding.ActivityMainBinding

class DataSend : AppCompatActivity() {
    lateinit var binding: ActivityDataSendBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataSendBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent?.let {
            var name = intent.getStringExtra("YourName")
            binding.tvPassName.text = name

            var Class = intent.getStringExtra("YourClass")
            binding.tvPassClass.text = Class

            var About = intent.getStringExtra("AboutYou")
            binding.tvPassAbout.text = About

        }
    }
}