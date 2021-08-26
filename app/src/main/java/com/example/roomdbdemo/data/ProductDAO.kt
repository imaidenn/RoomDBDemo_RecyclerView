package com.example.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDAO {
    @Insert
    fun insertProduct(product :Product)

    @Query("Select * From product_table")
    fun getAll(): List<Product>

    @Query("Select * From product_table Where price < :priceRange")
    fun getPriceBelow(priceRange:Double) : List<Product>
}