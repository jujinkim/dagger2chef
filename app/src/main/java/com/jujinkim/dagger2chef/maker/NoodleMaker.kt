package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.Noodle

class NoodleMaker(): IMaker<Noodle> {
    override fun getItem(): Noodle = Noodle()
}