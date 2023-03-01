package com.example.datapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datapassing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOk.setOnClickListener {
            if (binding.etName.text.isEmpty()){
                binding.etName.error="Enter your name"
                binding.etName.requestFocus()
            }
            else if (binding.etClass.text.isEmpty()){
                binding.etClass.error="Enter your class"
                binding.etClass.requestFocus()
            }
            else if (binding.etAbout.text.isEmpty()){
                binding.etAbout.error="About you"
                binding.etAbout.requestFocus()
            }
            else{
                val intent= Intent(this,DataSend::class.java)
                intent.putExtra("YourName", binding.etName.text.toString())
                intent.putExtra("YourClass", binding.etClass.text.toString())
                intent.putExtra("AboutYou", binding.etAbout.text.toString())
                startActivity(intent)
            }
        }
    }
}