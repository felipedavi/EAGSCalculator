package com.ignorelist.krosky.eags_calculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ignorelist.krosky.eags_calculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val bundle :Bundle ?=intent.extras
        val pt = bundle!!.getFloat("pt")
        val esp = bundle.getFloat("esp")
        if ((pt>=20) and (esp>=30)) {
            val m = (((pt/40) + (2*(esp/60)))/3)*10
            binding.textResult.text = "Média: $m"
        } else {
            binding.textResult.setText(R.string.fail)
        }
    }
}