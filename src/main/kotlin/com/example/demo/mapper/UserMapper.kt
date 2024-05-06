package com.example.demo.mapper

import com.example.demo.dto.LoginUser
import com.example.demo.dto.LoginUserInfo
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {
  @Select("SELECT user_account, user_name FROM users") fun findUserInfoList(): List<LoginUserInfo>

  @Select(
      """
    SELECT
      user_account, password, user_name
    FROM users
    WHERE user_account = #{userAccount}
  """
  )
  fun findUser(@Param("userAccount") userAccount: String): LoginUser?
}
