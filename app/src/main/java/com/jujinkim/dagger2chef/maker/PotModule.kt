package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.RamenPot
import dagger.Module
import dagger.Provides

@Module
class PotModule {
    @Provides
    fun getItem(): RamenPot = RamenPot()
}