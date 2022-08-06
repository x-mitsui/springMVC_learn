package com.dzq;

import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/5 - 08 - 05 - 20:43
 * @Description: com.dzq
 * @version: 1.0
 */
@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class Test01 {
    @Autowired
    UserService userService;

    @Test
    public void testFindUser(){
        User user = userService.findUser("zs", "123456");
        System.out.println(user);
    }
}
