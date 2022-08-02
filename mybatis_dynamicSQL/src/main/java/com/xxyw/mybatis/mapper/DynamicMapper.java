package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicMapper {
    List<Emp> getEmpListByDynamic(Emp emp);
}
