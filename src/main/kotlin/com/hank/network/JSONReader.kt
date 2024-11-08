package com.hank.network

import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
//    json1()
//    json2()
//    josn3()
    //使用 with 方式3
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0381e141-f7ee-450e-99da-2240208d1773")
    println(url.readText())
}

private fun josn3() {
    //使用 with 方式2
    val url =
        URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0381e141-f7ee-450e-99da-2240208d1773")
    with(url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
    }
}

private fun json2() {
    //使用 with 方式1
    val url =
        URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0381e141-f7ee-450e-99da-2240208d1773")
    with(url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader()
        var line = br.readLine()
        val json = StringBuffer()
        while (line != null) {
            json.append(line)
            line = br.readLine()
        }
        println(json.toString())
    }
}

private fun json1() {
    val url =
        URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0381e141-f7ee-450e-99da-2240208d1773")
    val connection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    var line = br.readLine()
    val json = StringBuffer()
    while (line != null) {
        json.append(line)
        line = br.readLine()
    }
    println(json.toString())
}