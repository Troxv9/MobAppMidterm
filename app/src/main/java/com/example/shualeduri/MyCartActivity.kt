package com.example.shualeduri

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.shualeduri.databinding.MyCartActivityBinding

class MyCartActivity : ComponentActivity() {

    private lateinit var binding: MyCartActivityBinding
    private var quantity = 1
    private var unitPrice = 120

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MyCartActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { finish() }

        binding.tvQuantity.text = quantity.toString()
        binding.tvTotal.text = "${unitPrice}$"

        binding.btnPlus.setOnClickListener {
            quantity++
            updateTotal()
        }

        binding.btnMinus.setOnClickListener {
            if (quantity > 1) quantity--
            updateTotal()
        }

        binding.btnDelete.setOnClickListener {
            quantity = 0
            updateTotal()
        }

        binding.btnPlaceOrder.setOnClickListener {
            startActivity(Intent(this, SuccessActivity::class.java))
        }
    }

    private fun updateTotal() {
        val total = quantity * unitPrice
        binding.tvQuantity.text = quantity.toString()
        binding.tvTotal.text = "${total}$"
    }
}
