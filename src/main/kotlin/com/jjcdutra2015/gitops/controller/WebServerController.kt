package com.jjcdutra2015.gitops.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebServerController {

    @GetMapping("/")
    fun getWebServer(): String {
        return "Hello Full Cycle"
    }
}