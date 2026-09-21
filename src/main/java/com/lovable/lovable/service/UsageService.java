package com.lovable.lovable.service;

import com.lovable.lovable.dtos.subscription.PlanLimitResponse;
import com.lovable.lovable.dtos.subscription.UsageTodayResponse;


public interface UsageService {
    UsageTodayResponse getTodaysUsage(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimits(Long userId);
}
