package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getDeptByStepTwo(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpById(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpStepOne(@Param("deptId") Integer deptId);
}
