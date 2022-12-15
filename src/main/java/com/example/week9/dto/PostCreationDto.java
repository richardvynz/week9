package com.example.week9.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class PostCreationDto {
    private Long email;
    private String message;


}
