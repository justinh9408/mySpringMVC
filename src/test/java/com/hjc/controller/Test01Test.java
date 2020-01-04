package com.hjc.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
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

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testMGB() throws Exception {
        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
        File configFile = new File("/Users/Justin/IdeaProjects/mySpringMVC/src/main/resources/mbg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}