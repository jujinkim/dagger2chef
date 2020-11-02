package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.Noodle
import dagger.Module
import dagger.Provides

@Module
class NoodleModule {
    @Provides
    fun getItem(): Noodle = Noodle()
}