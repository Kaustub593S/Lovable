package com.lovable.lovable.entity;

import com.lovable.lovable.enums.PreviewStatus;
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
public class Preview {

    private BigInteger id;
    private Project projectId;
    private String namespace;
    private String podName;
    private String previewUrl;
    private PreviewStatus status;
    private Instant startedAt;
    private Instant terminatedAt;
    private Instant createdAt;
}
