# MyBatis

MyBatis的核心配置文件为mybatis-config.xml。

## 配置jdbc

```xml
<properties resource="jdbc.properties"/>
```

引入jdbc配置文件

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <properties resource="jdbc.properties"/>

    <!--设置连接数据库的环境-->
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}"/>
                <property name="url" value="${jdbc.url}"/>
                <property name="username" value="${jdbc.username}"/>
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
        </environment>
    </environments>
    <!--引入映射文件-->
    <mappers>
        <mapper resource="mappers/UserMapper.xml"/>
    </mappers>
</configuration>
```

property标签中的value值使用 `${}` 引用jdbc.properties中的值。

## 别名

3种设置别名的方法

第一种，在properties标签后使用typeAliases标签

```xml
<typeAliases>
    <typeAlias type="com.xxyw.mybatis.pojo.User" alias="abc"/>
</typeAliases>
```

在mapper.xml中的select标签的resultType可以使用别名。

```xml
<select id="getAllUser" resultType="abc">
    select * from t_user
</select>
```

第二种，typeAliases标签中不设置alias，默认别名是类名，不区分大小写。

```xml
<typeAlias type="com.xxyw.mybatis.pojo.User"/>
```

在mapper.xml中使用默认别名。

```xml
<select id="getAllUser" resultType="User">
    select * from t_user
</select>
```

第三种，在typeAliases中使用package标签。

```xml
<package name="com.xxyw.mybatis.pojo"/>
```

该包下的所有类都使用类名作为别名，不区分大小写。

## 配置mapper文件

```xml
<mappers>
    <mapper resource="mappers/UserMapper.xml"/>
</mappers>
```

可以在configuration标签里面通过mappers标签配置mapper.xml文件。

也可以使用package标签

```xml
<mappers>
    <package name="com.xxyw.mybatis.mapper"/>
</mappers>
```

此时要保证接口UserMapper.java和UserMapper.xml同名且所在包名相同。
即java文件在java目录的com.xxyw.mybatis.mapper目录下，同名的xml文件在resources目录的com.xxyw.mybatis.mapper目录下。

# Spring

## xml管理Bean

### 获取Bean的3中方式

