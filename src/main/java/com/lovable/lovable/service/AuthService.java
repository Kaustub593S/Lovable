package com.lovable.lovable.service;

import com.lovable.lovable.dtos.auth.AuthResponse;
import com.lovable.lovable.dtos.auth.LoginRequest;
import com.lovable.lovable.dtos.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest signupRequest);

    AuthResponse login(LoginRequest loginRequest);
}
