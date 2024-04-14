package com.example.demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl : UserDetailsService {

  @Autowired lateinit var userService: LoginUserService

  override fun loadUserByUsername(username: String): UserDetails {
    println(username)
    println(BCryptPasswordEncoder().encode("admin"))
    var loginUser = userService.findUser(username)
    if (loginUser != null) {
      return User.builder().username(username).password(loginUser.password).build()
    }

    throw RuntimeException()
  }
}
