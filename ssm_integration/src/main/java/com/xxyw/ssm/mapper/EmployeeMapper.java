package com.xxyw.ssm.mapper;

import com.xxyw.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> getAllEmployee();

    void addEmployee(Employee employee);

    void deleteEmployeeById(Integer empId);

    Employee getEmployeeById(Integer empId);

    void updateEmployee(Employee employee);

}
