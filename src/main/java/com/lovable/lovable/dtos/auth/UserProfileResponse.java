package com.lovable.lovable.dtos.auth;

import java.math.BigInteger;

public record UserProfileResponse(

        BigInteger id,
        String email,
        String name,
        String avatarUrl

) {
}
