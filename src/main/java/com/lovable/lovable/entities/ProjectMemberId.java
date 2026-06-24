package com.lovable.lovable.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProjectMemberId {

    @ManyToOne
    @JoinColumn(name = "project_id")
    Project project;


    @ManyToOne
    @JoinColumn(name = "user_user_id")
    User user;
}
