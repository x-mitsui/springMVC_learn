package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/1 - 08 - 01 - 14:02
 * @Description: com.dzq.controller
 * @version: 1.0
 */
// 见到@Controller会将此类实例化
@Controller
public class MyController {
    @RequestMapping("/firstController.do")
    public String firstController(){
        System.out.println("first Controller");
        return "/first.jsp";
    }

    @RequestMapping("/secondController.do")
    public String secondController(){
        System.out.println("second Controller");
        return "/first.jsp";
    }
}
