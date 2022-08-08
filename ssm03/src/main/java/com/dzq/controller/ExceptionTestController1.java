package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ExceptionTestController1 {
    @RequestMapping("ExDemo1.action")
    public String demo1() {
        int m = 1 / 0;
        return "success.jsp";
    }

    @RequestMapping("ExDemo2.action")
    public String demo2() {
        String s = null;
        System.out.println(s.length());
        return "success.jsp";
    }
    // 仅仅处理当前Controller异常
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public ModelAndView HandleException(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("fail.jsp");
        return mv;
    }
}
