package com.jujinkim.dagger2chef.market

import com.jujinkim.dagger2chef.Chef
import com.jujinkim.dagger2chef.maker.*
import dagger.Component

@Component(
        modules = [
            NoodleModule::class,
            PotModule::class,
            SauceModule::class,
            WaterModule::class
        ])
interface MarketComponent {
    fun inject(visitor: Chef)
}