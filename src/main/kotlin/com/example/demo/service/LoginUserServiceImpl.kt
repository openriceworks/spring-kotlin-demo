package com.example.demo.service

import com.example.demo.dto.LoginUser
import com.example.demo.dto.LoginUserInfo
import com.example.demo.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LoginUserServiceImpl : LoginUserService {

  @Autowired lateinit var userMapper: UserMapper

  override fun findUserInfoList(): List<LoginUserInfo> {
    return userMapper.findUserInfoList()
  }

  override fun findUser(userAccount: String): LoginUser? {
    return userMapper.findUser(userAccount)
  }
}
