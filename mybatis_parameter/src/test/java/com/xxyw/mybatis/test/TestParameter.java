package com.xxyw.mybatis.test;

import com.xxyw.mybatis.mapper.UserMapper;
import com.xxyw.mybatis.pojo.User;
import com.xxyw.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestParameter {
    @Test
    public void testgetUserByName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName("xxyw");
        System.out.println("user = " + user);
    }

    @Test
    public void testCheckLoginIn() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginIn("xxyw", "123456");
        System.out.println("user = " + user);
    }

    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "xxyw");
        map.put("password", "123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println("user = " + user);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User(1, "juyoujing", "555", 2, "男", "444@163.com"));
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("xxyw", "123456");
        System.out.println("user = " + user);
    }
}
