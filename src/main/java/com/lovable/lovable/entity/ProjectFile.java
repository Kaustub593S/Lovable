package com.lovable.lovable.entity;

import lombok.*;

import java.math.BigInteger;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectFile {

    private BigInteger id;
    private Project projectId;
    private String path;

    private String minioObjectKey;
    private User createdBy;
    private User updatedBy;
    private Instant createdAt;
    private Instant updatedAt;

}
