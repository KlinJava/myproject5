package com.hank

fun main() {
    //array
    var num1 = arrayOf<Int>(1,3,5)
    println(num1)
    for (n:Int in num1){
        println(n)
    }
    var num2 = arrayOfNulls<Int>(3)
    num2.set(0,11)
    num2.set(1,22)
    num2.set(2,33)
    for (n:Int? in num2) {
        println(n)
    }
    var num3 = Array<Int>(5){
        it
    }
    num3[0] = 111
    num3[1] = 222
    num3[2] = 333
    num3[3] = 444
    num3[4] = 555
    for (n:Int in num3){
        println(n)
    }
    num3.forEach {
        println(it)
    }

//    map()
//    set()
//    list()
}

private fun map() {
    //map
    var map = HashMap<String, String>()
    map.put("2330", "台積電")
    map.put("2317", "鴻海")
    println(map)
    for (n: String in map.keys) {
        print("$n\t")
        println(map.get(n))
    }
}

private fun set() {
    //set
    var set = HashSet<Int>()
    set.add(1)
    set.add(3)
    set.add(4)
    println(set)
    for (n: Int in set) {
        println(n)
    }
}

private fun list() {
    //immutable
    val list: List<Int> = listOf(5, 1, 2, 7)
    val list2 = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf<Int>(68, 88, 77, 99, 50)
    for (n in scores) {
        println(n)
    }
    println(list.get(3))
    //mutalbe
    var mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)
}