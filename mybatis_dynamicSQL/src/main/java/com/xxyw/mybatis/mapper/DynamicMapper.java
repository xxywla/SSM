package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicMapper {
    List<Emp> getEmpListByDynamic(Emp emp);

    List<Emp> getEmpListByChoose(Emp emp);

    void insertSomeEmp(@Param("empList") List<Emp> empList);

    void deleteSomeEmp(@Param("empIds") int[] empIds);

    List<Emp> getEmpList();
}
