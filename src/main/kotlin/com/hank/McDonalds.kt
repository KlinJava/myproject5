package com.hank.kolin

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val mcd = McDonalds()
    mcd.mcdonalds()
    mcd.printMenu()
    mcd.printMenu2()
    mcd.printMenu3("202")
}

class McDonalds {
    val menu = HashMap<String, Item>()
    fun mcdonalds() {
        val file: File = File("mcdonalds.txt")
        val br = BufferedReader(FileReader(file))
        var line: String? = br.readLine()
        while (line != null) {
            var tokens: List<String> = line.split(",")
            val item = Item(tokens.get(0), tokens.get(1), tokens.get(2).toInt(), tokens.get(3).toInt())
            menu.put(item.id, item)
            line = br.readLine()
        }
    }

    fun printMenu() {
        println("----------------------------")
        for (n: String in menu.keys) {
            println(n)
            println(menu.get(n))
         }
    }

    fun printMenu2() {
        println("----------------------------")
        for (n in menu.values) {
            println(n)
        }
    }

    fun printMenu3(s:String) {
        println("----------------------------")
        for (n: String in menu.keys) {
//            println(s)
            if (s == n) {
                println(menu.get(n))
            }
        }
    }
}

class Item(var id:String, var name:String, var calorie:Int, var price:Int) {
    override fun toString():String {
        return "$id\t$name\t$calorie\t$price"
    }
}