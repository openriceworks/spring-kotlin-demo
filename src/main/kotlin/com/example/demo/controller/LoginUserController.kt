package com.example.demo.controller

import com.example.demo.LoginUserInfo
import com.example.demo.service.LoginUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/login_user")
class UserController {

  @Autowired lateinit var loginUserService: LoginUserService

  @GetMapping
  fun index(): List<LoginUserInfo> {
    return loginUserService.findUserInfoList()
  }
}
