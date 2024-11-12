package com.hank.kotlin

class BigGame:NumberGame() {

    override fun generate() {
        val numberCountBig = 6
        super.numberCount = numberCountBig
        numbers.add(101)
        numbers.add(201)
        numbers.add(301)
        numbers.add(401)
        numbers.add(501)
        println("kotlin BigGame set長度=${numbers.size}")
        println("kotlin BigGame 需求長度=$numberCountBig")
        println("kotlin BigGame 選號數量是否正常=${validate()}")
    }
}