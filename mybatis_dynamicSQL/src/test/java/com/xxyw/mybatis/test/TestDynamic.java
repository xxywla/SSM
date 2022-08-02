package com.xxyw.mybatis.test;

import com.xxyw.mybatis.mapper.DynamicMapper;
import com.xxyw.mybatis.pojo.Emp;
import com.xxyw.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDynamic {
    @Test
    public void testWhere() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        List<Emp> empList = mapper.getEmpListByDynamic(new Emp(null, "", 20, "男"));
        empList.forEach(System.out::println);
    }
}
