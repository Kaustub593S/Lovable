package com.lovable.lovable.service;

import com.lovable.lovable.dtos.member.InviteMemberRequest;
import com.lovable.lovable.dtos.member.ProjectMemberResponse;
import com.lovable.lovable.dtos.member.UpdateMemberRoleRequest;
import com.lovable.lovable.enums.ProjectRole;

import java.math.BigInteger;
import java.util.List;

public interface ProjectMemberService {
    
    List<ProjectMemberResponse> getAllProjectMembers(BigInteger projectId);

    ProjectMemberResponse inviteMemberByEmail(InviteMemberRequest inviteMemberRequest);

    ProjectMemberResponse updateMemberRole(BigInteger userId, BigInteger memberId, UpdateMemberRoleRequest memberRole);

    Void deleteMember(BigInteger userId, BigInteger memberId);
}
