package com.example.demo.service

import com.example.demo.LoginUser
import com.example.demo.LoginUserInfo

interface LoginUserService {

  fun findUserInfoList(): List<LoginUserInfo>

  fun findUser(userAccount: String): LoginUser?
}
