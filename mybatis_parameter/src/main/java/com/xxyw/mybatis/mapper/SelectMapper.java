package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    int getCount();

    Map<String, Object> getUserAsMap(@Param("id") int id);

    List<Map<String, Object>> getAllUserAsMap();

    @MapKey("id")
    Map<String, Object> getAllUserAsMap2();
}
