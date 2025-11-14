package com.example.shualeduri


import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class CartViewModel(private val state: SavedStateHandle) : ViewModel() {

    companion object {
        private const val KEY_UNIT_PRICE = "unit_price"
        private const val KEY_QUANTITY = "quantity"
    }

    // defaults
    fun getUnitPrice(): Int = state.get<Int>(KEY_UNIT_PRICE) ?: 120
    fun setUnitPrice(price: Int) { state.set(KEY_UNIT_PRICE, price) }

    fun getQuantity(): Int = state.get<Int>(KEY_QUANTITY) ?: 1
    fun setQuantity(q: Int) { state.set(KEY_QUANTITY, q) }

    fun increaseQuantity() {
        val q = getQuantity() + 1
        setQuantity(q)
    }

    fun decreaseQuantity() {
        val q = getQuantity()
        if (q > 1) setQuantity(q - 1)
    }

    fun getTotal(): Int = getUnitPrice() * getQuantity()
}
