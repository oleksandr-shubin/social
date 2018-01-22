package com.shubin.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class ProjectControllerTest {

    @Test
    public void testIndex() throws Exception {
        ProjectController controller = new ProjectController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/project"))
                .andExpect(view().name("project/index"));
    }

}