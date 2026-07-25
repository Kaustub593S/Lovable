package com.lovable.lovable.dtos.member;

import com.lovable.lovable.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
