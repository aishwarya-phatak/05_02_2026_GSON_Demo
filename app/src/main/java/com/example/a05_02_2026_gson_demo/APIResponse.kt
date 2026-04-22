package com.example.a05_02_2026_gson_demo

data class APIResponse(
    var recipes : ArrayList<Recipe>,
    var total : Int,
    var skip : Int,
    var limit : Int
)
