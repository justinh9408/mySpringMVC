package com.hjc.controller;

import com.hjc.dao.DepartmentMapper;
import com.hjc.entity.Department;
import com.hjc.entity.DepartmentExample;
import com.hjc.entity.Employee;
import com.hjc.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Classname PojoControllerTest
 * @Description TODO
 * @Date 2019-12-27 10:54
 * @Created by Justin
 */
@ContextConfiguration
        (
                {
                        "file:src/main/resources/spring/*.xml"
                }
        )
@RunWith(SpringJUnit4ClassRunner.class)
public class PojoControllerTest {

    @Autowired
    EmployeeService service;

    @Autowired
    DepartmentMapper departmentMapper;

    @Test
    public void testPojoFormOk() throws Exception {
        assertNotNull(service);
        PojoController pojoController = new PojoController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(pojoController).build();

        mockMvc.perform(MockMvcRequestBuilders.post("/pojo/user")
                .param("age","20")
                .param("name","hjc")
                .param("email","justinh9408@gmail.com")
                .param("address.city","foshan")
                .param("address.province","guangdong"))
                .andExpect(MockMvcResultMatchers.view().name("hello"))//userForm
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

    }

    @Test
    public void testPojoFormAgeFail() throws Exception {
        PojoController pojoController = new PojoController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(pojoController).build();

        mockMvc.perform(MockMvcRequestBuilders.post("/pojo/user")
                .param("age","2")
                .param("name","hjc")
                .param("email","justinh9408@gmail.com")
                .param("address.city","foshan")
                .param("address.province","guangdong"))
                .andExpect(MockMvcResultMatchers.view().name("userForm"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

    }

    @Test
    public void testPojoFormNameFail() throws Exception {
        PojoController pojoController = new PojoController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(pojoController).build();

        mockMvc.perform(MockMvcRequestBuilders.post("/pojo/user")
                .param("age","21")
                .param("name","")
                .param("email","justinh9408@gmail.com")
                .param("address.city","foshan")
                .param("address.province","guangdong"))
                .andExpect(MockMvcResultMatchers.view().name("userForm"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

    }

    @Test
    public void testPojoFormEmailFail() throws Exception {
        PojoController pojoController = new PojoController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(pojoController).build();

        mockMvc.perform(MockMvcRequestBuilders.post("/pojo/user")
                .param("age","21")
                .param("name","hjc")
                .param("email","justinh9408gmail.com")
                .param("address.city","foshan")
                .param("address.province","guangdong"))
                .andExpect(MockMvcResultMatchers.view().name("userForm"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

        mockMvc.perform(MockMvcRequestBuilders.post("/pojo/user")
                .param("age","21")
                .param("name","hjc")
                .param("email","@gmail.com")
                .param("address.city","foshan")
                .param("address.province","guangdong"))
                .andExpect(MockMvcResultMatchers.view().name("userForm"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

    }

    @Test
    public void testExample(){
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andDeptNameLike("de%");
        criteria.andIdBetween(1, 3);
        DepartmentExample.Criteria criteria2 = departmentExample.createCriteria();
        criteria2.andDeptNameLike("%es%");
        departmentExample.or(criteria2);
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        for (Department department : departments) {
            System.out.println(department);
        }
    }

}

//   @Size(min = 1, max = 20)
//    String name;   //用户名
//
//    @Min(value = 18)
//    Integer age;  //年龄
//
//    @org.hibernate.validator.constraints.NotBlank
//    @Email(message = "邮箱格式错误")
//    String email;  //邮箱
//
//    @NotNull
//    @Valid
//    Address address;