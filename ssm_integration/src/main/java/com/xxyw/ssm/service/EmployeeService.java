package com.xxyw.ssm.service;

import com.github.pagehelper.PageInfo;
import com.xxyw.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeList();

    void addNewEmployee(Employee employee);

    void deleteEmployeeById(Integer empId);

    Employee getEmployeeById(Integer empId);

    void updateEmployee(Employee employee);

    PageInfo<Employee> getEmployeeByPageNum(Integer pageNum);
}
