package com.lovable.lovable.service;

import com.lovable.lovable.dtos.project.ProjectRequest;
import com.lovable.lovable.dtos.project.ProjectResponse;
import com.lovable.lovable.dtos.project.ProjectSummaryResponse;


import java.util.List;

public interface ProjectService {

    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long userId, Long projectId);

    ProjectResponse createProject(Long userId, ProjectRequest projectRequest);

    ProjectResponse updateProject(Long userId, Long projectId, ProjectRequest projectRequest);

    void deleteProject(Long userId, Long projectId);
}
