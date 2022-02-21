package com.ignorelist.krosky.eags_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ignorelist.krosky.eags_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonSave.setOnClickListener { openNextActivity() }
    }
    private fun openNextActivity() {
        val pt = binding.editPortugues.text.toString().toFloat()
        val esp = binding.editEspecificas.text.toString().toFloat()
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("pt", pt)
        intent.putExtra("esp", esp)
        startActivity(intent)
    }
}