package com.lovable.lovable.controllers;

import com.lovable.lovable.auth_dtos.AuthResponse;
import com.lovable.lovable.auth_dtos.LoginRequest;
import com.lovable.lovable.auth_dtos.SignupRequest;
import com.lovable.lovable.auth_dtos.UserProfileResponse;
import com.lovable.lovable.services.AuthService;
import com.lovable.lovable.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest signupRequest)
    {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest)
    {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile()
    {
        Long userId=1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
