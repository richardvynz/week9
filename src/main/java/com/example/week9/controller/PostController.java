package com.example.week9.controller;
import com.example.week9.dto.PostCreationDto;
import com.example.week9.dto.PostResponseDto;
import com.example.week9.dto.RegistrationDto;
import com.example.week9.dto.UserResponseDto;
import com.example.week9.models.Post;
import com.example.week9.service.PostService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v2")
public class PostController {

    private final PostService postService;


    @PostMapping("/createPost")

  public ResponseEntity <PostResponseDto> createPost(@RequestBody PostCreationDto postCreationDto,
                                                PostResponseDto  postResponseDto,
                                                HttpSession httpSession){
        PostResponseDto postResponseDto1 = postService.createPost(postCreationDto,postResponseDto,httpSession);
        return new ResponseEntity<>(postResponseDto1,HttpStatus.CREATED);
    }



}
