package com.example.shualeduri

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.shualeduri.databinding.ActivityProductDetailsBinding

class ProductActivity : ComponentActivity() {

    private lateinit var binding: ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddToCart.setOnClickListener {
            startActivity(Intent(this, MyCartActivity::class.java))
        }
    }
}

