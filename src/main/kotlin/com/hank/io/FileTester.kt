package com.hank.io

import jdk.dynalink.StandardOperation
import java.io.File
import java.io.FileWriter
import java.nio.file.Files

fun main() {
//    fileRead1()
    fileRead2()

//    fileWrite1()
//    fileWrite2()
//    fileWrite3()
//    fileWrite4()
//    fileWrite5()
}

private fun fileRead2() {
    //讀資料，方法2：bufferedReader()
    val br = File("data.txt").bufferedReader()
    var line: String? = br.readLine()
    while (line != null) {
        println(line)
        line = br.readLine()
    }
}

private fun fileRead1() {
    //讀資料，方法1：使用 lambda
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun fileWrite5() {
    //使用 java方式寫入
    val fw = FileWriter("output2.txt")
    fw.write("abc\n")
    fw.write("efg\n")
    fw.write("hij\n")
    fw.flush()
    fw.close()
    val fw2 = FileWriter("output2.txt", true) // true = 附加資料
    fw2.write("123\n")
    fw2.write("456\n")
    fw2.write("789\n")
    fw2.flush()
    fw2.close()
}

private fun fileWrite4() {
    //附加資料 append
    File("output2.txt").appendText("4th line\n")
}

private fun fileWrite3() {
    //方法3；bufferedWrite(),自已寫「跳行」
    File("output2.txt").bufferedWriter().use {
        it.write("11st line\n");
        it.write("22nd line\n");
        it.write("33rd line\n");
    }
}

private fun fileWrite2() {
    //方法2：use語法，自動 flush(),close()，自動「跳行」
    File("output2.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3rd line")
    }
}

private fun fileWrite1() {
    //方法1：
    File("output2.txt").writeText("abc123")
}