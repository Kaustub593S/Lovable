package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.auth.AuthResponse;
import com.lovable.lovable.dtos.auth.LoginRequest;
import com.lovable.lovable.dtos.auth.SignupRequest;
import com.lovable.lovable.dtos.auth.UserProfileResponse;
import com.lovable.lovable.service.AuthService;
import com.lovable.lovable.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest signupRequest )
    {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest )
    {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile()
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return ResponseEntity.ok(userService.getProfile(userId));

    }
}
