package com.lovable.lovable.entities;

import com.lovable.lovable.enums.ChatMessageRole;
import jakarta.persistence.*;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger chatMessageId;

    @ManyToOne
    @JoinColumn(name = "session_id")
    ChatSession session;

    ChatMessageRole role;

    String content;

    String tool_calls;

    String toolCallId;

    Integer tokensUsed;

    Instant createdAt;


}
