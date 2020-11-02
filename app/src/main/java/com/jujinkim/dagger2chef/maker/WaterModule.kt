package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.Water
import dagger.Module
import dagger.Provides

@Module
class WaterModule {
    @Provides
    fun getItem(): Water = Water()
}