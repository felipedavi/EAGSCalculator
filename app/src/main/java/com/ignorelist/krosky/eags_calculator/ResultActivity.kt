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
        val pt = intent.getIntExtra("pt", 0)
        val esp = intent.getIntExtra("esp", 0)
        val mp = (pt.toDouble().div(40))*10
        val mesp = (esp.toDouble()/60)*10
        val r = String.format("Média de Português: %.2f\nMédia das Específicas: %.2f", mp, mesp)
        if ((mp>=5) or (mesp>=5)) {
            val m = mp+(mesp*2)/3
            binding.textResult.text = String.format("%s\nMédia: %.2f", r,m)
        } else {
            binding.textResult.text = String.format("%s\n\nDesclassificado")
        }
    }
}