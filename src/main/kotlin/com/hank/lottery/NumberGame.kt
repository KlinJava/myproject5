package com.hank.kotlin

abstract class NumberGame {
    val numbers = HashSet<Int>()
    var numberCount = 0
    abstract fun generate()
    fun validate():Boolean = if (numbers.size == numberCount) true else false
}