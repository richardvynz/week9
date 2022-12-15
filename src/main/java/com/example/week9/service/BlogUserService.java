package com.example.week9.service;


import com.example.week9.dto.LoginResponseDto;
import com.example.week9.dto.RegistrationDto;
import com.example.week9.dto.UserLoginDto;
import com.example.week9.dto.UserResponseDto;
import jakarta.servlet.http.HttpSession;

public interface BlogUserService {

   LoginResponseDto loginBlogUser(UserLoginDto userLoginDto,
                                  LoginResponseDto loginResponseDto,
                                  HttpSession httpSession);

   UserResponseDto createBlogUser(RegistrationDto registrationDto);
}
