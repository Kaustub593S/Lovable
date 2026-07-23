package com.lovable.lovable.service;

import com.lovable.lovable.dtos.project.ProjectRequest;
import com.lovable.lovable.dtos.project.ProjectResponse;
import com.lovable.lovable.dtos.project.ProjectSummaryResponse;

import java.math.BigInteger;
import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(BigInteger userId);

    List<ProjectResponse> getProjectById(BigInteger userId, BigInteger projectId);

    ProjectResponse createProject(BigInteger userId, ProjectRequest projectRequest);

    ProjectResponse updateProject(BigInteger userId, BigInteger projectId, ProjectRequest projectRequest);

    Void deleteProject(BigInteger userId, BigInteger projectId);
}
