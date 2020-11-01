package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.Sauce

class SauceMaker(): IMaker<Sauce> {
    override fun getItem(): Sauce = Sauce()
}