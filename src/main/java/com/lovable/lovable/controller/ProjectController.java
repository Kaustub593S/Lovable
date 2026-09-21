package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.project.ProjectRequest;
import com.lovable.lovable.dtos.project.ProjectResponse;
import com.lovable.lovable.dtos.project.ProjectSummaryResponse;
import com.lovable.lovable.service.Implementation.ProjectServiceImpl;
import com.lovable.lovable.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private  final ProjectServiceImpl projectServiceImpl;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects()
    {
        Long userId=1L;
        return ResponseEntity.ok(projectServiceImpl.getUserProjects(userId));
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long projectId)
    {
        Long userId=1L;
        ProjectResponse project =
                projectServiceImpl.getUserProjectById(userId, projectId);

        return ResponseEntity.ok(project);
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest projectRequest)
    {
        Long userId=2L;
        return  ResponseEntity.status(HttpStatus.CREATED).body(projectServiceImpl.createProject(userId,projectRequest));
    }

    @PatchMapping("/projectId")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long projectId, @RequestBody ProjectRequest projectRequest)
    {
        Long userId=1L;
        return  ResponseEntity.ok(projectServiceImpl.updateProject(userId,projectId,projectRequest));
    }

    @DeleteMapping("/projectId")
    public ResponseEntity<Void> deleteProject(@PathVariable Long projectId)
    {
        Long userId=1L;
        projectServiceImpl.deleteProject(userId,projectId);
        return  ResponseEntity.ok().build();
    }
}
