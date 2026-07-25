package com.lovable.lovable.dtos.subscription;

import java.math.BigInteger;

public record PlanResponse(
        BigInteger id,
        String name,
        String stripePriceId,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Integer maxPreviews,
        Boolean unlimitedAi,
        String features,
        Boolean active
) {
}
