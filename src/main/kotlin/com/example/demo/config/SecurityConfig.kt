package com.example.demo.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
class SecurityConfig {

  @Autowired lateinit var userDetailsService: UserDetailsService

  @Bean
  fun PasswordEncoder(): PasswordEncoder {
    return BCryptPasswordEncoder()
  }

  @Bean
  fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {

    http
        .formLogin { login -> login.defaultSuccessUrl("/home").permitAll() }
        .authorizeHttpRequests { auth ->
          auth.requestMatchers("/").permitAll().anyRequest().authenticated()
        }

    return http.build()
  }
}
