package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
@Controller
//@RequestMapping("/msb")
//@RequestMapping("/dzq")
public class MyController {
    @RequestMapping("/myCon.do")
    public String test1() {
        System.out.println("this is firstController");
        return "success";
    }
}