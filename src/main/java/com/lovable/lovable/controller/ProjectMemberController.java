package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.member.InviteMemberRequest;
import com.lovable.lovable.dtos.member.ProjectMemberResponse;
import com.lovable.lovable.dtos.member.UpdateMemberRoleRequest;
import com.lovable.lovable.enums.ProjectRole;
import com.lovable.lovable.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<ProjectMemberResponse>> getAllProjectMembers(@PathVariable Long projectId)
    {
        return ResponseEntity.ok(projectMemberService.getAllProjectMembers(projectId));
    }

    @PostMapping
    public ResponseEntity<ProjectMemberResponse> inviteMembersByEmail(@PathVariable Long projectId, @RequestBody InviteMemberRequest inviteMemberRequest)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMemberByEmail(inviteMemberRequest,projectId,100L));
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<ProjectMemberResponse> updateMemberRole(@PathVariable Long userId,@PathVariable Long memberId, @PathVariable UpdateMemberRoleRequest memberRole)
    {
        return ResponseEntity.ok(projectMemberService.updateMemberRole(userId,memberId,memberRole));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteMemeber(@PathVariable Long userId,@PathVariable Long memberId)
    {
        return ResponseEntity.ok(projectMemberService.deleteMember(userId,memberId));
    }

}
