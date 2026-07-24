package com.lovable.lovable.service;

import com.lovable.lovable.dtos.project.FileContentResponse;
import com.lovable.lovable.dtos.project.FileNode;

import java.math.BigInteger;
import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(BigInteger userId, BigInteger projectId);

    FileContentResponse getFileContent(BigInteger userId, BigInteger projectId, String path);
}
