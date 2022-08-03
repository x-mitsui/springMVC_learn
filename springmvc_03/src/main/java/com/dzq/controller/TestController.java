package com.dzq.controller;

import com.dzq.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class TestController {
    /*
     * 使用POJO接收参数时,注意事项
     * 提交的参数名必须和POJO的属性名保持一致
     * springmvc底层通过反射给参数列表的属性赋值
     * 通过set方法设置属性值的,不是直接通过操作属性
     * POJO的属性一定要有set方法,要不然就会接收失败
     * */
    @RequestMapping(value = "/getDataByPojo",method = RequestMethod.POST)
    public String getPara(Person person){
        System.out.println(person);
        System.out.println(person.getPets());
        System.out.println(person.getFruit());

        return "successful!";
    }
}
