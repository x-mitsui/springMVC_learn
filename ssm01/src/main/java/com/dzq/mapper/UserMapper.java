package com.dzq.mapper;

import com.dzq.pojo.User;

import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/3 - 08 - 03 - 20:35
 * @Description: com.dzq.mapper
 * @version: 1.0
 */
public interface UserMapper {
    /**
     * Spring整合mapper思路，
     * 是由Mybatis生成的Mapper对象
     * UserMapper userMapper = SQLSession.getMapper(UserMapper.class)
     * 容器中存储这些Mapper对象，service层注入
     */
    User findUser(String username, String password);

    List<User> findAllUser();
}
