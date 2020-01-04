package com.hjc.dao;

import com.hjc.entity.Employee;

/**
 * @Classname EmployeeMapper
 * @Description TODO
 * @Date 2020-01-03 19:31
 * @Created by Justin
 */
public interface EmployeeMapper {
    Employee getEmpById(Integer id);
}
