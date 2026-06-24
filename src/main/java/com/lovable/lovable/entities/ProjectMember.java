package com.lovable.lovable.entities;

import com.lovable.lovable.enums.MemberRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="project_Member")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    ProjectMemberId projectMemberId;

    MemberRole role;

    @ManyToOne
    @JoinColumn(name = "invited_by")
    User invitedBy;

    Instant invitedAt;



}
