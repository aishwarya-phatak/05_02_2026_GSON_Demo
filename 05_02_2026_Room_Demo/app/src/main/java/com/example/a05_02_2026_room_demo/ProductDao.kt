package com.example.a05_02_2026_room_demo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {

    @Query("select * from Products")
    fun getProducts() : ArrayList<Product>

    @Insert
    fun insertProduct(product : Product)

    @Delete
    fun deleteProduct(product : Product)

    @Update
    fun updateProduct(product: Product)
}