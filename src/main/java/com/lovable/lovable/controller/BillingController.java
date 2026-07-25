package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.subscription.*;
import com.lovable.lovable.service.PlanService;
import com.lovable.lovable.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BillingController {
    private final SubscriptionService subscriptionService;
    private final PlanService planService;

    @GetMapping("/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlaneDetails()
    {
        return ResponseEntity.ok(planService.geAllActivePlans());
    }

    @GetMapping("/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription()
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return ResponseEntity.ok(subscriptionService.getMySubscription(userId));
    }

    @PostMapping("/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest checkoutRequest
    )
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(userId,checkoutRequest));
    }

    @PostMapping("/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal()
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }
}
