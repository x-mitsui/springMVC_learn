package com.dzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestfulController {
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.POST)
    public String test1(@PathVariable("id") Integer id) {
        System.out.println("this is firstController id:" + id);
        return "post";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String test2(@PathVariable("id") Integer id) {
        System.out.println("this is firstController id:" + id);
        return "delete";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String test3(@PathVariable("id") Integer id) {
        System.out.println("this is firstController id:" + id);
        return "put";
    }
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String test4(@PathVariable("id") Integer id) {
        System.out.println("this is firstController id:" + id);
        return "get" +
                "";
    }
}