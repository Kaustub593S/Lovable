package com.lovable.lovable.service;

import com.lovable.lovable.dtos.subscription.PlanResponse;

import java.util.List;

public interface PlanService {

    List<PlanResponse> geAllActivePlans();
}
