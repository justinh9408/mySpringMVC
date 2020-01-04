package com.hjc.controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        InputStream inputStream = resourceAsStream;
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
//
//    @Test
//    public void testExampleCriteria() throws IOException {
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        SqlSession session = sqlSessionFactory.openSession();
//        try {
//            DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
//            DepartmentExample example = new DepartmentExample();
//            DepartmentExample.Criteria criteria = example.createCriteria();
//            criteria.andDeptNameIsNull();
//            criteria.andDeptNameIn(Arrays.asList("df","d"));
//            departmentMapper.selectByExample(example);
//
//        } finally {
//            session.close();
//        }
//    }


}