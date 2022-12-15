package com.example.week9.service;

import com.example.week9.dto.PostCreationDto;
import com.example.week9.dto.PostResponseDto;
import jakarta.servlet.http.HttpSession;

public interface PostService {


    PostResponseDto createPost(PostCreationDto postCreation,
                               PostResponseDto postResponseDto,
                               HttpSession httpSession);
}
