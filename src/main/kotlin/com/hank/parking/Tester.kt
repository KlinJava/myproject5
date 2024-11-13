package com.hank.parking


import java.text.SimpleDateFormat
import java.time.Duration
import java.time.Instant
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Date


fun main() {
//    localDateTime()
//    date()

    // Calendar物件，可做「運算」，稱「Mutable」物件
    val calendar = Calendar.getInstance()
    println("Calendar現在時間: ${calendar.time}")
    calendar.set(Calendar.MONTH,2) //改 2月
    println("Calendar改成3月: ${calendar.time}")
    calendar.add(Calendar.DAY_OF_MONTH,3) //加 3天
    println("Calendar改完月份後: ${calendar.time}")
}

private fun date() {
    //Date 舊式時間類別
    val date = Date()
    println("date時間: $date")
    println("date long: ${date.time}") //長整數
    //「時間長整數」轉「自訂格式時間」
    val sdf = SimpleDateFormat("yyyy/MM/dd_HH:mm:ss")
    println("時間長整數轉自訂時間格式: ${sdf.format(date.time)}")
    //字串轉「時間」
    val s: String = "2018/12/25_08:00:00"
    println("字串轉時間: ${sdf.parse(s)}")

}

private fun localDateTime() {
    //Instant, LocalDateTime ，均為 immutable
    val now1 = Instant.now()
    println("格林威治時間： $now1")
    val now2 = LocalDateTime.now()
    println("台灣時間(+8)： $now2")
    val df = DateTimeFormatter.ofPattern("yyyy/MM/dd_HH:mm:ss")
    println("台灣自訂格式: ${df.format(now2)}")
    println("加2小時: ${df.format(now2.plus(Duration.ofHours(2)))}")
    println("現場時間是否改變: ${df.format(now2)}")
    //字串轉時間
    val other = LocalDateTime.of(2018, 11, 23, 0, 0, 0)
    println("字串轉時間:$other")
}

