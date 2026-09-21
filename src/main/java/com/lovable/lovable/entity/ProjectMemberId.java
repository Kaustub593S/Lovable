package com.lovable.lovable.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectMemberId {
    private Long projectId;
    private Long userId;
}
