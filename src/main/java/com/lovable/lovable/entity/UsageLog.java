package com.lovable.lovable.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsageLog {

    private Long id;
    private User user;
    private Project project;
    private String action;
    private Integer tokensUsed;
    private Integer durationMs;
    private String metaData;
    private Instant createdAt;
}
