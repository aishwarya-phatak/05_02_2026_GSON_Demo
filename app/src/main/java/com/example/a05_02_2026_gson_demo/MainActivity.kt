package com.example.a05_02_2026_gson_demo

import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.gson.Gson
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder().build()
        );
        val url = URL("https://dummyjson.com/recipes")
        val httpsURLConnection = url.openConnection() as HttpsURLConnection
        httpsURLConnection.connect()

        val inputStreamReader = InputStreamReader(httpsURLConnection.getInputStream())
        val apiResponse = Gson().fromJson<APIResponse>(inputStreamReader, APIResponse::class.java)

        Log.e("api response : ", apiResponse.toString())
        Log.e("recipes : ", apiResponse.recipes.toString())

        val length = apiResponse.recipes.size
        for (i in 0..<length){
            val eachRecipe = apiResponse.recipes[i]
            val cookingTime = eachRecipe.cookingTime
        }

    }
}