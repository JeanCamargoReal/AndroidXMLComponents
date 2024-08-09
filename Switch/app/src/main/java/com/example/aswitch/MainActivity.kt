package com.example.aswitch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setStatus()

        binding.switch2.setOnCheckedChangeListener { _, check ->
            setStatus()
        }
    }

    private fun setStatus() {
        binding.textStatus.text = if(binding.switch2.isChecked) {
            "Ativo"
        } else {
            "Inativo"
        }
    }
}