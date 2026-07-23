package com.lovable.lovable.service;

import com.lovable.lovable.dtos.auth.UserProfileResponse;

import java.math.BigInteger;

public interface UserService {
    UserProfileResponse getProfile(BigInteger userId);
}
