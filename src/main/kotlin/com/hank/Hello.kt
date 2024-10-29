package com.hank

fun main() {
//    println("Hello Kotlin!")
//    var s = "abcde"
    var s:String? = "abcde"
    s = null
//    println(s!!.length)
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    println(s?.substring(1,4))
    val h = Human(66.5f,1.7f)
    h.hello()
    println(h.bmi())
    val score:Int = 88
    println(score > 60)
    var c : Char = 'A'
    println(c.toInt() > 60)
    /*var age : Int = 19
    age = 20
    var weight = 66.5f // 等於 weight : Float = 66.5f
    var name : String
    name = "hank"*/
}

class Human(var weight:Float, var height:Float, var name:String = "") {
    init {
        println("Init OK. w = $weight , h = $height")
    }
//    constructor(name:String, weight:Float, height:Float):this(weight,height)

    fun bmi():Float {
        val bmi:Float = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("您好！Hello kotlin")
    }
}
