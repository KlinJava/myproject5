package com.hank.kolin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest(){
        val stu = Student("Hank",66,80)
        Assertions.assertEquals(80,stu.highest())
    }
    @Test
    fun averageTest(){
        val stu = Student("Hank",66,80)
        Assertions.assertEquals((66+80)/2,stu.getAverage())
    }
    @Test
    fun gradingTest(){
        val stu = Student("Hank",66,80)
        Assertions.assertEquals('C',stu.grading())
    }

}