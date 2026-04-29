package com.example.a05_02_2026_room_demo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val productDB = Room.databaseBuilder<ProductDatabase>(
            this, ProductDatabase::class.java, "db_products"
        ).allowMainThreadQueries().build()

        val productDao = productDB.getProductDao()

        productDao.insertProduct(
            Product(
                8923,
                "Mixer",
                2000.34f,
                "Bajaj"
            )
        )

        productDao.insertProduct(
            Product(
                3423,
                "Food Processor",
                8000.34f,
                "Preethi Appliances"
            )
        )

        productDao.insertProduct(
            Product(
                5454,
                "Cooker",
                3032.34f,
                "Hawkins"
            )
        )

        Log.e("tag", "---------------------")
        var retrivedProducts = productDao.getProducts()
        var count = retrivedProducts.size
        for (i in 0..<count) {
            Log.e("Each Product ", "$retrivedProducts[$i]")
        }

        Log.e("tag", "---------------------")
        productDao.deleteProduct(
            Product(
                5454, "Cooker", 3032.34f, "Hawkins"
            )
        )

        Log.e("tag", "---------------------")

        retrivedProducts = productDao.getProducts()
        count = retrivedProducts.size
        for (i in 0..<count) {
            Log.e("Each Product ", "$retrivedProducts[$i]")
        }

        Log.e("tag", "---------------------")

        productDao.updateProduct(
            Product(
                3423,
                "Dosa Tawa",
                1200.34f,
                "Hawkins Futura"
            )
        )
    }
}