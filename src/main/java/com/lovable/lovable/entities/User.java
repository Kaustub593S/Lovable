package com.lovable.lovable.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
@FieldDefaults(level = AccessLevel.PRIVATE) //creates all fields private so no need to write private while declaring variables
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger userId;

    @Email //in spring boot validator dependency
    String email;

    String passwordHash;

    String name;

    String avatarUrl;

    Instant createdAt;

    Instant updatedAt;

    Instant deletedAt;

}
