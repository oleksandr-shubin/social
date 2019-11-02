package com.shubin.service;

import com.shubin.config.RootConfig;
import com.shubin.model.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class)
public class ProjectServiceImplTest {

    @Autowired
    private ProjectService projectService;


    private Project getProjectInstance() {
        Project project = new Project();
        project.setName("Name");
        project.setDescription("Description");
        project.setRating(new Long(0));
        return project;
    }

    @Test
    public void testFindShouldReturnEqualWhenCreated() {
        Project project = getProjectInstance();
        projectService.create(project);

        Project retrievedProject  = projectService.find(project.getId());
        assertEquals(project, retrievedProject);
        projectService.delete(project);
    }

}