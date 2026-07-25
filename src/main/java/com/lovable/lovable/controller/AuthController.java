package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.auth.AuthResponse;
import com.lovable.lovable.dtos.auth.LoginRequest;
import com.lovable.lovable.dtos.auth.SignupRequest;
import com.lovable.lovable.dtos.auth.UserProfileResponse;
import com.lovable.lovable.service.AuthService;
import com.lovable.lovable.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest signupRequest )
    {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest )
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
