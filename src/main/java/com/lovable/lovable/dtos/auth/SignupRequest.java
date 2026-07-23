package com.lovable.lovable.dtos.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
