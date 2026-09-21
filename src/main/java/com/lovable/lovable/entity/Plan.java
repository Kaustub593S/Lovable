package com.lovable.lovable.entity;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    private Long id;
    private String name;
    private String stripePriceId;
    private Integer maxProjects;
    private Integer maxTokensPerDay;
    private Integer maxPreviews;
    private Boolean unlimitedAi;
    private String features;
    private Boolean active;



}
