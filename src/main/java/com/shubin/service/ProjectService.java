package com.shubin.service;

import com.shubin.model.Project;

public interface ProjectService {

    void create(Project project);
    Project find(Long id);
    void update(Project project);
    void delete(Project project);
}
