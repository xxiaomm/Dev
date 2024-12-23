package com.example.devserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevServerApplication

fun main(args: Array<String>) {
    runApplication<DevServerApplication>(*args)
}
