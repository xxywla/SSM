package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptStepOne(@Param("empId") Integer empId);

    List<Emp> getDeptAndEmpStepTwo(@Param("deptId") Integer deptId);
}
