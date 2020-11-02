package com.jujinkim.dagger2chef

import com.jujinkim.dagger2chef.market.DaggerMarketComponent
import com.jujinkim.dagger2chef.model.*
import javax.inject.Inject

// Class that consumes ingredients
class Chef{
    @Inject lateinit var water: Water
    @Inject lateinit var sauce: Sauce
    @Inject lateinit var noodle: Noodle
    @Inject lateinit var pot: RamenPot

    init {
        DaggerMarketComponent.create().inject(this)
    }

    fun cookRamen(): Ramen {
        val ramen = pot.makeRamen(water, sauce, noodle)
        return ramen
    }
}