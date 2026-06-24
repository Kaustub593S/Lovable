package com.lovable.lovable.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="plan")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger planId;

    String name;

    String stripePriceId;

    Integer maxProjects;

    Integer maxTokensPerDay;

    Integer maxPreviews;

    Boolean unlimitedAi;

    //JsonBody features;

    Boolean active;
}
