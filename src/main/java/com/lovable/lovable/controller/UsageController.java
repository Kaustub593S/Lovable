package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.subscription.PlanLimitResponse;
import com.lovable.lovable.dtos.subscription.UsageTodayResponse;
import com.lovable.lovable.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/usage")
public class UsageController{
    private  final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodaysUsage()
    {
        Long userId=100L;
        return ResponseEntity.ok(usageService.getTodaysUsage(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getUsageLimit()
    {
        Long userId=100L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimits(userId));
    }


}
