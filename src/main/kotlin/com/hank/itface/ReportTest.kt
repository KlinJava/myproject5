package com.hank.itface

fun main() {
    val finance:Report = FinanceReport()
    val health:Report = HealthReport()
    val list = mutableListOf<Report>(finance,health)
    for (r:Report in list){
        r.load()
        r.print()
    }
}