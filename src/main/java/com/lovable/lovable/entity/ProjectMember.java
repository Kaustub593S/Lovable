package com.lovable.lovable.entity;

import com.lovable.lovable.enums.ProjectRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjectMember {

    private ProjectMemberId projectMemberId;
    private Project projectId;
    private User userId;
    private ProjectRole role;
    private BigInteger invitedBy;
    private Instant invitedAt;
}
