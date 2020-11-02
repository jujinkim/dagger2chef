package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.Sauce
import dagger.Module
import dagger.Provides

@Module
class SauceModule {
    @Provides
    fun getItem(): Sauce = Sauce()
}