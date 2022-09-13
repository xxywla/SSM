package com.xxyw.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.xxyw.ssm.pojo.Employee;
import com.xxyw.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getEmployeeByPageNum(@PathVariable("pageNum") Integer pageNum, Model model) {
        PageInfo<Employee> empPageInfo = employeeService.getEmployeeByPageNum(pageNum);
        model.addAttribute("empPageInfo", empPageInfo);
        return "employee-list-page";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {

        List<Employee> employeeList = employeeService.getEmployeeList();

        model.addAttribute("employeeList", employeeList);

        return "employee-list";
    }

    @RequestMapping(value = "/to/add", method = RequestMethod.GET)
    public String toAdd() {
        return "employee-add";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addNewEmployee(Employee employee) {
        System.out.println("新员工的信息 " + employee);
        employeeService.addNewEmployee(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("empId") Integer empId) {

        employeeService.deleteEmployeeById(empId);

        return "redirect:/employee";
    }

    @RequestMapping(value = "/to/edit/{empId}", method = RequestMethod.GET)
    public String toEditEmployee(@PathVariable("empId") Integer empId, Model model) {

        Employee employee = employeeService.getEmployeeById(empId);

        System.out.println("根据Id查询到的员工信息 " + employee);

        model.addAttribute("toEditEmp", employee);

        return "employee-edit";
    }

    // 修改员工信息 PUT请求
    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String editEmployee(Employee employee) {

        System.out.println("修改后的员工信息 " + employee);

        employeeService.updateEmployee(employee);

        return "redirect:/employee";
    }

}
