package com.hank.kolin

import java.util.Scanner

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("Hank",60,99)
    val stu2 = Student("Jane",44,68)
    val stu3 = Student("Eric",30,49)
    val gstu = GraduateStudent("Jack",55,65,60)
    gstu.print()
    stu.print()
    stu2.print()
    stu3.print()
    println("Highest score: ${stu.highest()}")
//    println("Highest2 score: ${stu.highest2()}")
//    println("Highest3 score: ${stu.highest3()}")
//    println("Highest4 score: ${stu.highest4()}")
//    println("Highest5 score: ${stu.highest5()}")
}

class GraduateStudent(name: String?, english: Int, math: Int, var thesis:Int):Student(name,english,math) {
    companion object{
        @JvmStatic
        var pass = 70
    }

    override fun passOrFailed(): String = if(getAverage() >= pass) "PASS" else "FAILED"
    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

}

open class Student(var name:String?, var english:Int, var math:Int) {
    //java的 static概念

    companion object {
        @JvmStatic //使用 java的 static方式去產生
        var pass:Int = 60
        fun test(){
            println("kotlin static test.")
        }
    }

    open fun print(){
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
    open fun passOrFailed():String = if(getAverage() >= pass) "PASS" else "FAILED"
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