package com.example.week9.controller;


import com.example.week9.dto.LoginResponseDto;
import com.example.week9.dto.RegistrationDto;
import com.example.week9.dto.UserLoginDto;
import com.example.week9.dto.UserResponseDto;
import com.example.week9.models.BlogUser;
import com.example.week9.service.BlogUserService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("api/v2")
@RestController
public class BlogUserController {

    private final BlogUserService blogUserService;

    @PostMapping("/create")
    public ResponseEntity<UserResponseDto> createBlogAdmin(@RequestBody RegistrationDto registrationDto){
        UserResponseDto userResponseDto = blogUserService.createBlogUser(registrationDto);
       return new  ResponseEntity<>(userResponseDto,HttpStatus.CREATED);
    }



    @GetMapping("/login")
    public ResponseEntity<LoginResponseDto> loginBlogUser(@RequestBody UserLoginDto userLoginDto,
                                                          LoginResponseDto loginResponseDto,
                                                          HttpSession httpSession){
        LoginResponseDto loginResponseDto1 =
                blogUserService.loginBlogUser(userLoginDto,loginResponseDto, httpSession);
        return new ResponseEntity<>(loginResponseDto1,HttpStatus.OK);
    }
}
