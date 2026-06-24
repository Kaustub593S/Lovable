package com.lovable.lovable.auth_dtos;

public record AuthResponse(
        String token,
        UserProfileResponse userProfile
) {
}
