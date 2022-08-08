package com.dzq.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //  请求到达Handler之前触发
        System.out.println("preHandle");
        // 返回为true，放行
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Handler单元返回ModelAndView后触发
        System.out.println("postHandle");
        Map<String, Object> model = modelAndView.getModel();
        String msg = (String) model.get("msg");
        String newMsg = msg.replaceAll("脏话","**");
        model.put("msg",newMsg);


    }

    // 无论是否发生异常，afterCompletion都会执行
    // 一般来说做资源释放工作
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 页面渲染完但未发给前端之前
        System.out.println("afterCompletion");
    }
}
