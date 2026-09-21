package com.lovable.lovable.service;

import com.lovable.lovable.dtos.project.FileContentResponse;
import com.lovable.lovable.dtos.project.FileNode;


import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long userId, Long projectId);

    FileContentResponse getFileContent(Long userId, Long projectId, String path);
}
