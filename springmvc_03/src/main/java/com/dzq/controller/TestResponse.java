package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/3 - 08 - 03 - 16:45
 * @Description: com.dzq.controller
 * @version: 1.0
 */
@Controller
public class TestResponse {
    @RequestMapping("/demo2")
    //public String testDemo2(){
    //    return "forward:/forwardPage.jsp";
    //}
    //后端处理分发
    //forward可以省略
    public String testDemo2(){
        return "/forwardPage.jsp";
    }

    //前端处理重定向
    @RequestMapping("/demo3")
    public String testDemo3(){
        return "redirect:/redirectPage.jsp";
    }
}
