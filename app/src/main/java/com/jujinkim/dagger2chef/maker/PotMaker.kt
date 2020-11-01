package com.jujinkim.dagger2chef.maker

import com.jujinkim.dagger2chef.model.RamenPot

class PotMaker(): IMaker<RamenPot> {
    override fun getItem(): RamenPot = RamenPot()
}