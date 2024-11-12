package com.hank.kotlin

class Game539:NumberGame() {

    override fun generate() {
        val numberCount539:Int = 5
        super.numberCount = numberCount539
        numbers.add(100)
        numbers.add(200)
        numbers.add(300)
        numbers.add(400)
        println("kotlin Game539 set長度=${numbers.size}")
        println("kotlin Game539 需求長度=$numberCount539")
        println("kotlin Game539 選號數量是否正常=${validate()}")
    }
}