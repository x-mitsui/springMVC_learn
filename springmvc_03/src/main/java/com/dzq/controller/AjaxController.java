package com.dzq.controller;

import com.dzq.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/3 - 08 - 03 - 19:46
 * @Description: com.dzq.controller
 * @version: 1.0
 */
// RestController相当于@Controller+@ResponseBody
@Controller
public class AjaxController {
    /*
     * @ResponseBody
     * 1方法的返回值不在作为界面跳转依据,而已直接作为返回的数据
     * 2将方法的返回的数据自动使用ObjectMapper转换为JSON
     */
    @ResponseBody
    @RequestMapping("ajax01")
    public Pet test01(){
        Pet pet = new Pet("Tom", "black");
        return pet;
    }
}
