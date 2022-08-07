package com.dzq.controller;

import com.dzq.pojo.User;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ScopeController {
    @Autowired
    UserService userService;
    @RequestMapping("/setData")
    public String setDate(HttpServletRequest req, HttpSession session){
        List<User> userList = userService.findAllUser();

        // 请求域传参
        req.setAttribute("message","HttpServletRequest");
        req.setAttribute("users",userList);

        // session域传参，可以直接访问.../setDataPage.jsp，通过删除cookie测试
        session.setAttribute("message","HttpServletRequest");
        session.setAttribute("users",userList);

        // 应用域传参
        ServletContext application = req.getServletContext();
        application.setAttribute("message","HttpServletRequest");
        application.setAttribute("users",userList);

        return "forward:/setDataPage.jsp";
    }

    /**
     *
     * 利用model对象的addAttribute
     * 主要是针对请求域传递数据进行了api的封装，（所以redirect不行）
     * 加了一层，解耦了controller和servlet
     *
     * 重定向下，无法使用model传递域中的数据
     * model中的字符串类型的键值对信息转换为请求参数，转发给目标地址
     */
    @RequestMapping("setData2")
    public String setData2(Model model){
        List<User> users = userService.findAllUser();
        model.addAttribute("message","reqMessage");
        model.addAttribute("users",users);
        return "/setDataPage.jsp";
    }

    @RequestMapping("setData3")
    public ModelAndView setData3(){
        List<User> users = userService.findAllUser();
        ModelAndView mv = new ModelAndView();
        Map<String, Object> model = mv.getModel();
        model.put("message","reqMessage");
        model.put("users",users);

        mv.setViewName("setDataPage.jsp");

        return mv;
    }
}
