package com.hank.kotlin

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter = LocalDateTime.of(2018,12,25,8,0,0)
    val leave = LocalDateTime.of(2018,12,25,10,0,0)
    var car = Car("AA-0001",enter)
    car.leave = leave
    println("停車時間(min): ${car.duration()}")
    val hours = Math.ceil(car.duration() / 60.0).toLong()
    println("停車時間(hours)： $hours")
    println("停車費(30): ${hours*30}")
}

class Car(val id:String, val enter:LocalDateTime) {
    var leave:LocalDateTime? = null
        set(value) { //等於 java的 setter
            if (enter.isBefore(value)){
                field = value //field 代表 set leave中 leave這個東西，不可用 this.leave，會變無窮迴圈
            }
        }
    fun duration() = Duration.between(enter,leave).toMinutes()
}