package com.xxyw.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxyw.ssm.mapper.EmployeeMapper;
import com.xxyw.ssm.pojo.Employee;
import com.xxyw.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmployeeList() {
        return employeeMapper.getAllEmployee();
    }

    public void addNewEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    public void deleteEmployeeById(Integer empId) {
        employeeMapper.deleteEmployeeById(empId);
    }

    public Employee getEmployeeById(Integer empId) {
        return employeeMapper.getEmployeeById(empId);
    }

    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    public PageInfo<Employee> getEmployeeByPageNum(Integer pageNum) {

        PageHelper.startPage(pageNum, 3);

        List<Employee> employeeList = employeeMapper.getAllEmployee();

        PageInfo<Employee> pageInfo = new PageInfo<Employee>(employeeList, 5);

        return pageInfo;
    }
}
