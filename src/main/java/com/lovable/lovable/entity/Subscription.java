package com.lovable.lovable.entity;

import com.lovable.lovable.enums.SubscriptionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {

    private BigInteger id;

    private User userId;

    private Plan planId;

    private String stripeCustomerId;
    private String stripeSubscriptionId;

    private SubscriptionStatus status;

    private Instant currentPeriodStart;
    private Instant currentPeriodEnd;
    private Boolean cancelAtPeriodEnd;

    private Instant createdAt;
    private Instant updatedAt;


}
