package com.lovable.lovable.dtos.auth;

import java.math.BigInteger;

public record UserProfileResponse(

        Long id,
        String email,
        String name,
        String avatarUrl

) {
}
