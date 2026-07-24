package com.lovable.lovable.controller;

import com.lovable.lovable.dtos.project.FileContentResponse;
import com.lovable.lovable.dtos.project.FileNode;
import com.lovable.lovable.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable BigInteger projectId)
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return ResponseEntity.ok(fileService.getFileTree(userId,projectId));
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable BigInteger projectId, @PathVariable String path)
    {
        BigInteger userId=new BigInteger(String.valueOf(100));
        return  ResponseEntity.ok(fileService.getFileContent(userId,projectId,path));
    }
}
