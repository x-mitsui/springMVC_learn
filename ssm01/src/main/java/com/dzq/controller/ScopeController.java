package com.dzq.controller;

import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ScopeController {
    @Autowired
    UserService userService;
    @RequestMapping("/setData")
    public String setDate(HttpServletRequest req, HttpSession session){
        List<User> userList = userService.findAllUser();

        // 请求域传参
        req.setAttribute("message","HttpServletRequest");
        req.setAttribute("users",userList);

        // session域传参
        session.setAttribute("message","HttpServletRequest");
        session.setAttribute("users",userList);

        // 应用域传参
        ServletContext application = req.getServletContext();
        application.setAttribute("message","HttpServletRequest");
        application.setAttribute("users",userList);

        return "forward:/setDataPage.jsp";
    }
}
