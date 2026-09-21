package com.lovable.lovable.service;

import com.lovable.lovable.dtos.subscription.CheckoutRequest;
import com.lovable.lovable.dtos.subscription.CheckoutResponse;
import com.lovable.lovable.dtos.subscription.PortalResponse;
import com.lovable.lovable.dtos.subscription.SubscriptionResponse;



public interface SubscriptionService {
    SubscriptionResponse getMySubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(Long userId, CheckoutRequest checkoutRequest);

    PortalResponse openCustomerPortal(Long userId);
}
