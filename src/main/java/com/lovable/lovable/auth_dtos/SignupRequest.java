package com.lovable.lovable.auth_dtos;

public record SignupRequest(

        String email,
        String password,
        String username
) {
}
