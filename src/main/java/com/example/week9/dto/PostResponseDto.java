package com.example.week9.dto;

import com.example.week9.models.BlogUser;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

public class PostResponseDto {

    private String message;

    private BlogUser blogUser;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
