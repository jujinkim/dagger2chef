package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.Water

class WaterMaker(): IMaker<Water> {
    override fun getItem(): Water = Water()
}