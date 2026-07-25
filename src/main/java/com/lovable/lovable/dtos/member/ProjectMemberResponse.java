package com.lovable.lovable.dtos.member;

import com.lovable.lovable.enums.ProjectRole;

import java.time.Instant;

public record ProjectMemberResponse(
        String name,
        ProjectRole role,
        String email,
        Instant invitedAt
) {
}
