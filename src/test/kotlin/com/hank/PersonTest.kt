package com.hank.kotlin

import com.hank.Human
import com.hank.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun humanBmiTest(){
        val human = Human(66.5f,1.7f,"Hank")
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())
    }

    @Test
    fun personBmiTest(){
        val person = Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi())
    }
}