package com.dzq.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler1 {
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public ModelAndView HandleException(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("fail.jsp");
        return mv;
    }
}
