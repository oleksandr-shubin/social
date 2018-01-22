package com.shubin.service;

import com.shubin.repository.ProjectRepository;
import com.shubin.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public void create(Project project) {
        projectRepository.save(project);
    }

    @Override
    public Project find(Long id) {
        Optional<Project> optional = projectRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public void update(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void delete(Project project) {
        projectRepository.delete(project);
    }
}
