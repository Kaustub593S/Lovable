package com.lovable.lovable.dtos.member;

import com.lovable.lovable.enums.ProjectRole;

public record UpdateMemberRoleRequest(
            ProjectRole role
) {
}
