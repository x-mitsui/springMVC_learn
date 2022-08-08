package com.dzq.service;

import com.dzq.pojo.User;

import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/3 - 08 - 03 - 20:35
 * @Description: com.dzq.service
 * @version: 1.0
 */
public interface UserService {
    User findUser(String username, String password);

    List<User> findAllUser();
}
