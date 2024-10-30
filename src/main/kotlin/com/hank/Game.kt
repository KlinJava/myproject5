package com.hank

import java.util.Random
import java.util.Scanner

fun main() {
    val secret = Random().nextInt(10)+1
    println("secret: $secret")
//    val scanner = Scanner(System.`in`)
    var number:Int = 0
        while(number != secret){
            print("Please enter a number:")
//            number = scanner.nextInt()
            number = readLine()!!.toInt()
            if (number > secret){
                println("Lower")
            } else if (number < secret) {
                println("Higher")
            } else {
                println("Greate,the number is $number")
            }
        }
}

