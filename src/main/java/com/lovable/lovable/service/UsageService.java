package com.lovable.lovable.service;

import com.lovable.lovable.dtos.subscription.PlanLimitResponse;
import com.lovable.lovable.dtos.subscription.UsageTodayResponse;

import java.math.BigInteger;

public interface UsageService {
    UsageTodayResponse getTodaysUsage(BigInteger userId);

    PlanLimitResponse getCurrentSubscriptionLimits(BigInteger userId);
}
