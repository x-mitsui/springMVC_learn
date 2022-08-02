package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PathController {
    @RequestMapping(value = "/testPath/{id}/{username}", method = RequestMethod.GET)
    public String test1(@PathVariable("id") Integer a,@PathVariable("username") String b) {
        System.out.println("this is firstController a:"+a+",b:"+b);
        return "success";
    }
}