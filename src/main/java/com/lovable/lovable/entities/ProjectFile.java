package com.lovable.lovable.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="project_file")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger projectFileId;

    @ManyToOne
    @JoinColumn(name = "project_id")
    Project project;

    @Column(unique = true)
    private String path;

    String minio_object_key;

    @ManyToOne
    @JoinColumn(name = "created_by_user_id")
    User createdBy;

    @ManyToOne
    @JoinColumn(name = "updated_by_user_id")
    User updatedBy;

    @ManyToOne
    @JoinColumn(name = "created_at")
    User createdAt;

    @ManyToOne
    @JoinColumn(name = "updated_at")
    User updatedAt;




}
