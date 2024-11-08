package com.hank.itface

class FinanceReport:Report{
    override fun load() {
        println("Finance load test.")
    }

    override fun print() {
        println("Finance print test.")
    }

}