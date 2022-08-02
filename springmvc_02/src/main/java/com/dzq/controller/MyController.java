package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//@RequestMapping("/msb")
//@RequestMapping("/dzq")
public class MyController {
    @RequestMapping(value = "/requestData", method = RequestMethod.GET)
    public String test1() {
        System.out.println("this is firstController");
        return "success";
    }
}