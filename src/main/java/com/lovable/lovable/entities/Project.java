package com.lovable.lovable.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="project")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger projectId;

    String name;

    String passwordHash;

    String description;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    ProjectOwnership owner;

    Boolean isPublic;

    String thumbnailUrl;

    Instant createdAt;

    Instant updatedAt;

    Instant deletedAt;

}
