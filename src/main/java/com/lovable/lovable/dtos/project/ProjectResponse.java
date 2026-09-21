package com.lovable.lovable.dtos.project;

import com.lovable.lovable.dtos.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(

        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
