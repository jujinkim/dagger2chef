package com.jujinkim.dagger2chef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chef = Chef()
        val ramen = chef.cookRamen()
        ramen.eat()
    }
}