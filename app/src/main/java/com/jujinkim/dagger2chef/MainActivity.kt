package com.jujinkim.dagger2chef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jujinkim.dagger2chef.market.Market

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val market = Market()
        val chef = Chef(market = market)

        val ramen = chef.cookRamen()
        ramen.eat()
    }
}