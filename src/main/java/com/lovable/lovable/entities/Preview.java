package com.lovable.lovable.entities;


import com.lovable.lovable.enums.PreviewStatus;
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
@Table(name="preview")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger previewId;

    @ManyToOne
    @JoinColumn(name = "project_project_id")
    Project project;

    String namespace;

    String podName;

    String previewUrl;

    PreviewStatus status;

    Instant startedAt;

    Instant terminatedAt;

    Instant createdAt;

}
