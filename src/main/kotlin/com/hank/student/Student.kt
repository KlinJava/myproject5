package com.hank.kolin

import java.util.Scanner

fun main() {
//    userInput()
    val stu = Student("Hank",60,99)
    stu.print()
    println("Highest score: ${stu.highest()}")
    println("Highest2 score: ${stu.highest2()}")
    println("Highest3 score: ${stu.highest3()}")
    println("Highest4 score: ${stu.highest4()}")
    println("Highest5 score: ${stu.highest5()}")
}

class Student(var name:String?, var english:Int, var math:Int) {
    fun print(){
        /*print(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" + passOrFailed()
                )
        println("\t" + grading())*/
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }
    fun grading():Char = when(getAverage()) {
            in 90..100 -> 'A'
            86,87,88,89 -> 'B'
            in 80..85 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }
    fun passOrFailed():String = if(getAverage() >=60) "PASS" else "FAILED"
    fun getAverage():Int = (english+math)/2
    fun nameCheck() = println(name?.length)

    fun highest():Int{
        var max = 0
        if (english > math) {
            max = english
        } else {
            max =math
        }
        return max
    }
    fun highest2():Int{
        var max = if(english > math) english else math
        return max
    }
    fun highest3():Int{
        var max = if(english > math) {
            println("English")
            english
        } else {
            println("Math")
            math
        }
        return max
    }
    fun highest4():Int{
        return if(english > math) english else math
    }
    fun highest5() = if(english > math) english else math
}


private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english: ")
    var english: Int = scanner.nextInt()
    print("Please enter student's math: ")
    var math: Int = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}