package com.lovable.lovable.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usage_log")
public class UsageLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger usageId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "project_project_id")
    Project project;

    String action;

    Integer tokensUsed;

    Integer durationMs;

    String Metadata;

    Instant createdAt;

}
