package com.ignorelist.krosky.eags_calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ignorelist.krosky.eags_calculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}