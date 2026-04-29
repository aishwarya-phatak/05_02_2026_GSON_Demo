package com.example.a05_02_2026_room_demo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Product::class], version = 1)
abstract class ProductDatabase : RoomDatabase(){
    abstract fun getProductDao(): ProductDao
}