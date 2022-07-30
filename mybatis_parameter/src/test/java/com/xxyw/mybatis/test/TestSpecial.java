package com.xxyw.mybatis.test;

import com.xxyw.mybatis.mapper.SpecialMapper;
import com.xxyw.mybatis.pojo.User;
import com.xxyw.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSpecial {
    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> users = mapper.getUserListByLike("y");
        users.forEach(System.out::println);
    }

    @Test
    public void testDeleteMultiUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        mapper.deleteMultiUser("10,11");
    }

    @Test
    public void testGetByTableName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> users = mapper.getByTableName("t_user");
        users.forEach(System.out::println);
    }

    @Test
    public void testAddUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        User user = new User(null, "宫本武藏", "123321", 40, "男", "gongben@163.com");
        mapper.addUser(user);
        System.out.println("user = " + user);
    }
}
