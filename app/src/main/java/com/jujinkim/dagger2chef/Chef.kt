package com.jujinkim.dagger2chef

import com.jujinkim.dagger2chef.market.IMarket
import com.jujinkim.dagger2chef.model.*

// Class that consumes ingredients
class Chef(val market: IMarket) {
    lateinit var water: Water
    lateinit var sauce: Sauce
    lateinit var noodle: Noodle
    lateinit var pot: RamenPot

    init {
        // Chef doesn't know 'market' is a class "Market'
        // But only knows that is is an IMarket interface.
        market.passIngredients(this)
    }

    fun cookRamen(): Ramen {
        val ramen = pot.makeRamen(water, sauce, noodle)
        return ramen
    }
}