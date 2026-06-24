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
@Table(name="chat_session")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {

   CharSessionId sessionId;

    String title;

    Instant createdAt;

    Instant updatedAt;

    Instant deletedAt;

}
