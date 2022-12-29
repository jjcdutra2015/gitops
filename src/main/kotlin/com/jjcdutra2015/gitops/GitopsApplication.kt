package com.jjcdutra2015.gitops

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitopsApplication

fun main(args: Array<String>) {
    runApplication<GitopsApplication>(*args)
}
