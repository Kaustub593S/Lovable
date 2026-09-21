package com.lovable.lovable.dtos.project;


import java.math.BigInteger;
import java.time.Instant;

public record ProjectSummaryResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt

) {
}
