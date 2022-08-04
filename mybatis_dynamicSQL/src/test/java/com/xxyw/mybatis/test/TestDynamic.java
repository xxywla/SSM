package com.xxyw.mybatis.test;

import com.xxyw.mybatis.mapper.DynamicMapper;
import com.xxyw.mybatis.pojo.Emp;
import com.xxyw.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDynamic {
    @Test
    public void testWhere() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        List<Emp> empList = mapper.getEmpListByDynamic(new Emp(null, "", 20, "男"));
        empList.forEach(System.out::println);
    }

    @Test
    public void testChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        List<Emp> empList = mapper.getEmpListByChoose(new Emp(null, "", null, "男"));
        empList.forEach(System.out::println);
    }

    @Test
    public void testInsertSome() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(null, "不知火", 18, "女"));
        empList.add(new Emp(null, "不知火2", 18, "女"));
        mapper.insertSomeEmp(empList);
    }

    @Test
    public void testDeleteSome() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        mapper.deleteSomeEmp(new int[]{5, 6});
    }

    @Test
    public void testInclude() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        List<Emp> empList = mapper.getEmpList();
        empList.forEach(System.out::println);
    }
}
