package com.lovable.lovable.auth_dtos;

public record UserProfileResponse(

        Long id,
        String email,
        String name,
        String avatarUrl
) {
}
