package com.example.textview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.textview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val curso = "Curso Kotlin"

        binding.textView.text = curso
    }
}