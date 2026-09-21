package com.lovable.lovable.service;

import com.lovable.lovable.dtos.member.InviteMemberRequest;
import com.lovable.lovable.dtos.member.ProjectMemberResponse;
import com.lovable.lovable.dtos.member.UpdateMemberRoleRequest;
import com.lovable.lovable.enums.ProjectRole;


import java.util.List;

public interface ProjectMemberService {
    
    List<ProjectMemberResponse> getAllProjectMembers(Long projectId);

    ProjectMemberResponse inviteMemberByEmail(InviteMemberRequest inviteMemberRequest,Long projectId,Long userId);

    ProjectMemberResponse updateMemberRole(Long userId, Long memberId, UpdateMemberRoleRequest memberRole);

    Void deleteMember(Long userId, Long memberId);
}
