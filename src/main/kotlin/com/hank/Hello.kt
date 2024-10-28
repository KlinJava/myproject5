package com.hank

fun main() {
//    println("Hello Kotlin!")
    val h = Human()
    h.hello()
    var age : Int = 19
    age = 20
    var weight = 66.5f // 等於 weight : Float = 66.5f
    var name : String
    name = "hank"
}

class Human {
    fun hello() {
        println("您好！Hello kotlin")
    }
}
