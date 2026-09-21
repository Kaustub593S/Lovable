package com.lovable.lovable.entity;

import com.lovable.lovable.enums.ProjectRole;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name="project-member")
public class ProjectMember {

    @EmbeddedId
    private ProjectMemberId projectMemberId;
    @ManyToOne
    @MapsId("projectId")
    private Project project;
    @ManyToOne
    @MapsId("userId")
    private User user;
    @Enumerated(EnumType.STRING)
    private ProjectRole role;
    private Long invitedBy;
    private Instant invitedAt;
}
