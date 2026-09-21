package com.lovable.lovable.entity;

import com.lovable.lovable.enums.MessageRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatMessage {
    private Long id;
    private ChatSession chatSessionId;
    private MessageRole role;
    private String content;
    private String toolCalls;
    private Integer tokensUsed;
    private Instant createdAt;
}
