package com.lovable.lovable.service;

import com.lovable.lovable.dtos.subscription.CheckoutRequest;
import com.lovable.lovable.dtos.subscription.CheckoutResponse;
import com.lovable.lovable.dtos.subscription.SubscriptionResponse;

import java.math.BigInteger;

public interface SubscriptionService {
    SubscriptionResponse getMySubscription(BigInteger userId);

    CheckoutResponse createCheckoutSessionUrl(BigInteger userId, CheckoutRequest checkoutRequest);

    PortalResponse openCustomerPortal(BigInteger userId);
}
