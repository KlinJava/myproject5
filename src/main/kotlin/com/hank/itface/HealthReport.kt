package com.hank.itface

class HealthReport:Report {
    override fun load() {
        println("Health load test.")
    }

    override fun print() {
        println("Health print tes.")
    }

}