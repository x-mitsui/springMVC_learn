package com.dzq.service.Impl;

import com.dzq.mapper.UserMapper;
import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/3 - 08 - 03 - 20:37
 * @Description: com.dzq.service.Impl
 * @version: 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUser() {

        return userMapper.findAllUser();
    }

    public User findUser(String username, String password) {
        return userMapper.findUser(username, password);
    }
}
