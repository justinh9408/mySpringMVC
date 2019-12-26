package com.hjc.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Classname Test01Test
 * @Description TODO
 * @Date 2019-12-25 16:03
 * @Created by Justin
 */
public class Test01Test {

    private MockMvc mvc;

    @Before
    public void setup(){
        this.mvc = MockMvcBuilders.standaloneSetup(new Test01()).build();
    }

    @Test
    public void testHello() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders.get("/test01/ctlmap"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view()
                .name("index"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}