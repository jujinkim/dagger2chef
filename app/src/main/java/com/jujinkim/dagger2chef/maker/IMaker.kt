package com.jujinkim.dagger2chef.maker

interface IMaker<T> {
    fun getItem(): T
}