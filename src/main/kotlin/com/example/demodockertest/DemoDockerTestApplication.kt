package com.example.demodockertest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoDockerTestApplication

fun main(args: Array<String>) {
    runApplication<DemoDockerTestApplication>(*args)
}
