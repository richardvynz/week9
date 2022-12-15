package com.example.week9.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class RegistrationDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
