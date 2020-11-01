package com.jujinkim.dagger2chef.model

class RamenPot {
    fun makeRamen(water: Water, sauce: Sauce, noodle: Noodle): Ramen {
        return Ramen(water, sauce, noodle)
    }
}