package com.example.shualeduri

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.shualeduri.databinding.ActivitySuccessBinding

class SuccessActivity : ComponentActivity() {

    private lateinit var binding: ActivitySuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.successImage.setOnClickListener { finish() }
    }
}

