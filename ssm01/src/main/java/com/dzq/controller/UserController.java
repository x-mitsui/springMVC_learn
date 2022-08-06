package com.dzq.controller;

import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/3 - 08 - 03 - 20:35
 * @Description: com.dzq.controller
 * @version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("login.do")
    public String login(String username, String password) {
        String view;
        User user = userService.findUser(username, password);
        if (null == user) {
            view = "fail.jsp";
        } else {
            view = "success.jsp";
        }
        return view;
    }

    @ResponseBody
    @RequestMapping("findAllUser.do")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
