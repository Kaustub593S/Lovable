package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.project.ProjectRequest;
import com.lovable.lovable.dtos.project.ProjectResponse;
import com.lovable.lovable.dtos.project.ProjectSummaryResponse;
import com.lovable.lovable.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private  final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects()
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ProjectResponse>> getProjectById(@PathVariable BigInteger projectId)
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return ResponseEntity.ok(projectService.getProjectById(userId,projectId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest projectRequest)
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return  ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(userId,projectRequest));
    }

    @PatchMapping("/id")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable BigInteger projectId, @RequestBody ProjectRequest projectRequest)
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return  ResponseEntity.ok(projectService.updateProject(userId,projectId,projectRequest));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteProject(@PathVariable BigInteger projectId)
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return  ResponseEntity.ok(projectService.deleteProject(userId,projectId));
    }
}
