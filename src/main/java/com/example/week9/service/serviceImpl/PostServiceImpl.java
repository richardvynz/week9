package com.example.week9.service.serviceImpl;

import com.example.week9.dto.PostCreationDto;
import com.example.week9.dto.PostResponseDto;
import com.example.week9.models.BlogUser;
import com.example.week9.models.Post;
import com.example.week9.repository.BlogUserRepository;
import com.example.week9.repository.PostRepository;
import com.example.week9.service.PostService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {
    private final BlogUserRepository blogUserRepository;
    private final PostRepository postRepository;

    @Override
    public PostResponseDto createPost(PostCreationDto postCreation,
                                      PostResponseDto postResponseDto,
                                      HttpSession httpSession) {

        BlogUser loggedInUser = (BlogUser) httpSession.getAttribute("loggedInUser");

        if (loggedInUser.getEmail().equalsIgnoreCase("decadev@dev.com")) {
            Post post = new Post();

            PostResponseDto postResponseDto1 = new PostResponseDto();
            BeanUtils.copyProperties(postCreation, post);

            post = postRepository.save(post);
            BeanUtils.copyProperties(post, postResponseDto1);
            return postResponseDto1;
        }
        throw new RuntimeException("you cannot post today!");



    }


}


























//    BlogUser blogUser = blogUserRepository.findById(postCreation.getBlogUserId()).orElse(null) ;


//    if(blogUser==null || !blogUser.getRole().equalsIgnoreCase("ADMIN")){
//      throw new RuntimeException("permission denied");
//    }

//    blogUser.setId(postCreation.getBlogUserId());






