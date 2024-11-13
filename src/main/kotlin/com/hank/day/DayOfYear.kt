package com.hank.day

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Calendar

fun main() {
//    val months = arrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
    val months = intArrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
    val now = Calendar.getInstance()
    println("今天是今年的第 ${now.get(Calendar.DAY_OF_YEAR)} 天")
    var year = now.get(Calendar.YEAR)
    var month = now.get(Calendar.MONTH)
    var day = now.get(Calendar.DAY_OF_MONTH)
    val reader = BufferedReader(InputStreamReader(System.`in`))
    println("Please enter year:($year)")
    val yearString:String = reader.readLine()
    year = if (yearString.length > 0)  yearString.toInt() else year
    println(year)

    println("Please enter month:($month)")
    val monthString = reader.readLine()
    month = if (monthString.length >0) monthString.toInt() else month
    println(month)

    println("Please enter day:($day)")
    val dayString = reader.readLine()
    day = if (dayString.length >0) dayString.toInt() else day
    println(day)

    var days:Int = 0
    for (n:Int in months.indices) { //indices = index的複數，此為「取出」index值
        if (month-1 > n) {
            days = days + months[n]
//            println(months[n])
        }
    }
    //判斷是否為「潤年」
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
        println("為潤年")
        days++
    }
    days = days +day
    println("目前為第 $days 天")
}