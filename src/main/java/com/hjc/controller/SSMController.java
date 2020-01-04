package com.hjc.controller;

import com.hjc.entity.Employee;
import com.hjc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname SSMController
 * @Description TODO
 * @Date 2020-01-03 19:37
 * @Created by Justin
 */
@Controller()
@RequestMapping("/ssm")
public class SSMController {


    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/emp/{id}")
    public String getEmpById(@PathVariable("id") Integer id, Model model){
        Employee emp = employeeService.getEmpById(id);
        model.addAttribute("emp", emp);
        return "emp";
    }
}
