package com.lovable.lovable.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatSession {
    private Project projectId;
    private User userId;
    private String title;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
