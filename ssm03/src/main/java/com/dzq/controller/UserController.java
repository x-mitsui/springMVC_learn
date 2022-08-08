package com.dzq.controller;

import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("login.action")
    public ModelAndView login(String username, String password) {
        ModelAndView mv = new ModelAndView();
        Map<String, Object> model = mv.getModel();
        model.put("msg","脏话");

        User user = userService.findUser(username, password);
        if (null == user) {
            mv.setViewName("fail.jsp");
        } else {
            mv.setViewName("success.jsp");
        }
        return mv;
    }

    @ResponseBody
    @RequestMapping("findAllUser.do")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
