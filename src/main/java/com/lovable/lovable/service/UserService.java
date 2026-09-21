package com.lovable.lovable.service;

import com.lovable.lovable.dtos.auth.UserProfileResponse;


public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
