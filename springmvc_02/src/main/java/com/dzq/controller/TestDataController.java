package com.dzq.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestDataController {
    @RequestMapping(value = "/getParambyArgName.do",method = RequestMethod.POST)
    public String test1(String username,int password) {
        System.out.println("username:"+username+",password:"+password);
        return "TestDataController";
    }

}