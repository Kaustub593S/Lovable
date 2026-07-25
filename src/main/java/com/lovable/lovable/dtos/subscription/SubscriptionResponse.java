package com.lovable.lovable.dtos.subscription;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse planResponse,
        String status,
        Instant periodEnd,
        Integer tokensUsedThisCycle
) {
}
