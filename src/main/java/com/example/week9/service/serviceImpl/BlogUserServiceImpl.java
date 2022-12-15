package com.example.week9.service.serviceImpl;

import com.example.week9.dto.LoginResponseDto;
import com.example.week9.dto.RegistrationDto;
import com.example.week9.dto.UserLoginDto;
import com.example.week9.dto.UserResponseDto;
import com.example.week9.models.BlogUser;
import com.example.week9.repository.BlogUserRepository;
import com.example.week9.service.BlogUserService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;


@AllArgsConstructor
@Service
public class BlogUserServiceImpl implements BlogUserService {
    private final BlogUserRepository blogUserRepository;


    @Override
    public LoginResponseDto loginBlogUser(UserLoginDto userLoginDto,
                                          LoginResponseDto loginResponseDto,
                                          HttpSession httpSession) {

        Optional<BlogUser> blogUser = blogUserRepository.findBlogUserByEmailAndPassword(userLoginDto.getEmail(),
                userLoginDto.getPassword());

//     if(blogUser.getEmail().equals(userLoginDto.getEmail()) &&
//             blogUser.getPassword().equals(userLoginDto.getPassword())){
//     }
        httpSession.setAttribute("loggedInUser", blogUser.get());

        BeanUtils.copyProperties(blogUser.get(), loginResponseDto);
        return loginResponseDto;
    }

    @Override
    public UserResponseDto createBlogUser(RegistrationDto registrationDto) {
        BlogUser blogUser = new BlogUser();
        UserResponseDto userResponseDto = new UserResponseDto();
        BeanUtils.copyProperties(registrationDto, blogUser);
        blogUser = blogUserRepository.save(blogUser);
        BeanUtils.copyProperties(blogUser, userResponseDto);
        return userResponseDto;

    }
}






























//    public UserResponseDto createBlogAdmin(RegistrationDto registrationDto) {
//        BlogUser blogUser = new BlogUser();
//
//        UserResponseDto userResponseDto = new UserResponseDto();
//        BeanUtils.copyProperties(registrationDto,blogUser);
//
//        blogUser.setRole(Roles.ADMIN.name());
//
//        blogUser = blogUserRepository.save(blogUser);
//        BeanUtils.copyProperties(blogUser,userResponseDto);
//        return userResponseDto;
//    }