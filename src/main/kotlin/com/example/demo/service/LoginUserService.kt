package com.example.demo.service

import com.example.demo.dto.LoginUser
import com.example.demo.dto.LoginUserInfo

interface LoginUserService {

  fun findUserInfoList(): List<LoginUserInfo>

  fun findUser(userAccount: String): LoginUser?
}
