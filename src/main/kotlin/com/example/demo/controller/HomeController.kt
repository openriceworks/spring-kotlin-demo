package com.example.demo.controller

import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

  @GetMapping("/home")
  fun home(auth: Authentication): String {
    return "Hello, " + auth.name + " !"
  }
}
