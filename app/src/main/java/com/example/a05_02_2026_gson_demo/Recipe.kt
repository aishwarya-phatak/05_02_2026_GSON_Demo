package com.example.a05_02_2026_gson_demo

import com.google.gson.annotations.SerializedName

data class Recipe(
    var id: Int,
    var name: String,
    var ingredients: ArrayList<String>,
    var instructions: ArrayList<String>,

    @SerializedName("prepTimeMinutes")
    var preparationMinutes: Int,

    @SerializedName("cookTimeMinutes")
    var cookingTime: Int,

    var servings: Int,
    var difficulty: String,
    var cuisine: String,
    var caloriesPerServing: Int,
    var tags: ArrayList<String>,
    var userId: Int,
    var image: String,
    var rating: Double,
    var reviewCount: Int,
    var mealType: ArrayList<String>
)
