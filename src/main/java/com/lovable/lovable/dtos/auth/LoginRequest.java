package com.lovable.lovable.dtos.auth;

public record LoginRequest(
        String email,
        String password
) {
}
