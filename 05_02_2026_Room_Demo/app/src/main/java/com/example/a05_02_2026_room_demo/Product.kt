package com.example.a05_02_2026_room_demo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Products")
data class Product(
    @PrimaryKey
    var pid : Int,
    @ColumnInfo(name = "product_title")
    var title : String,
    var price : Float,
    var brand : String
)
