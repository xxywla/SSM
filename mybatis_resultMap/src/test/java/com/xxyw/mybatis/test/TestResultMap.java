package com.xxyw.mybatis.test;

import com.xxyw.mybatis.mapper.DeptMapper;
import com.xxyw.mybatis.mapper.EmpMapper;
import com.xxyw.mybatis.pojo.Dept;
import com.xxyw.mybatis.pojo.Emp;
import com.xxyw.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestResultMap {
    @Test
    public void testGetEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println("emp = " + emp);
    }

    @Test
    public void testGetEmpAndDeptByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println("emp = " + emp);
    }

    @Test
    public void testGetEmpAndDeptStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptStepOne(2);
        System.out.println("emp = " + emp);
    }

    @Test
    public void testGetDeptAndEmpList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpById(2);
        System.out.println("dept = " + dept);
    }

    @Test
    public void testGetDeptAndEmpListStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpStepOne(2);
        System.out.println("dept = " + dept.getDeptName());
    }
}
