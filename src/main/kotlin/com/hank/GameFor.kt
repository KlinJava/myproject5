package com.hank

import java.util.Random
import java.util.Scanner

fun main() {
    val secret = Random().nextInt(10)+1
    println("secret:$secret")
    val scanner = Scanner(System.`in`)
    var number = -1
    for (i in 1..5){
        print("Please enter a number(${i}/4): ")
        number = scanner.nextInt()
        println("第${i}次:$number")
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Greate,the number is $secret")
            break
        }
    }
    if (number != secret ) println("可惜都沒猜中，secret是： $secret")
}
