package com.lovable.lovable.dtos.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}
