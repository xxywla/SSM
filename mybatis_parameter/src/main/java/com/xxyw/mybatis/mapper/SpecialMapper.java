package com.xxyw.mybatis.mapper;

import com.xxyw.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialMapper {
    List<User> getUserListByLike(@Param("word") String word);

    void deleteMultiUser(@Param("ids") String ids);

    List<User> getByTableName(@Param("tableName") String tableName);

    void addUser(User user);
}
