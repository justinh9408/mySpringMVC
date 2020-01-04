package com.hjc.service;

import com.hjc.dao.EmployeeMapper;
import com.hjc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname EmployeeService
 * @Description TODO
 * @Date 2020-01-03 19:39
 * @Created by Justin
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmpById(Integer id){
        return employeeMapper.getEmpById(id);
    }
}
