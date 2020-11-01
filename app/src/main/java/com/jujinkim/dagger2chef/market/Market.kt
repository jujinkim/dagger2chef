package com.jujinkim.dagger2chef.market

import com.jujinkim.dagger2chef.Chef
import com.jujinkim.dagger2chef.maker.NoodleMaker
import com.jujinkim.dagger2chef.maker.PotMaker
import com.jujinkim.dagger2chef.maker.SauceMaker
import com.jujinkim.dagger2chef.maker.WaterMaker

class Market: IMarket {
    val waterMaker = WaterMaker()
    val sauceMaker = SauceMaker()
    val noodleMaker = NoodleMaker()
    val potMaker = PotMaker()

    override fun passIngredients(visitor: Any) {
        if (visitor is Chef) {
            visitor.sauce = sauceMaker.getItem()
            visitor.noodle = noodleMaker.getItem()
            visitor.water = waterMaker.getItem()
            visitor.pot = potMaker.getItem()
        }
    }
}