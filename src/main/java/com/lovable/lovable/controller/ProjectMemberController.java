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

import java.math.BigInteger;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<ProjectMemberResponse>> getAllProjectMembers(@PathVariable BigInteger projectId)
    {
        return ResponseEntity.ok(projectMemberService.getAllProjectMembers(projectId));
    }

    @PostMapping
    public ResponseEntity<ProjectMemberResponse> inviteMembersByEmail(@PathVariable BigInteger projectId, @RequestBody InviteMemberRequest inviteMemberRequest)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMemberByEmail(inviteMemberRequest));
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<ProjectMemberResponse> updateMemberRole(@PathVariable BigInteger userId,@PathVariable BigInteger memberId, @PathVariable UpdateMemberRoleRequest memberRole)
    {
        return ResponseEntity.ok(projectMemberService.updateMemberRole(userId,memberId,memberRole));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteMemeber(@PathVariable BigInteger userId,@PathVariable BigInteger memberId)
    {
        return ResponseEntity.ok(projectMemberService.deleteMember(userId,memberId));
    }

}
