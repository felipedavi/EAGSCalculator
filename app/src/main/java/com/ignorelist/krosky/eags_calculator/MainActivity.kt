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
        binding.buttonSave.setOnClickListener {
            val pt = binding.editPortugues.text.toString().trim()
            val esp = binding.editEspecificas.text.toString().trim()
            when {
                pt.isEmpty() -> {
                    binding.editPortugues.error = "Campo necessário"
                    return@setOnClickListener
                }
                esp.isEmpty() -> {
                    binding.editEspecificas.error = "Campo necessário"
                    return@setOnClickListener
                }
                else -> {
                    openNextActivity()
                }
            }
        }
    }

    private fun openNextActivity() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
}