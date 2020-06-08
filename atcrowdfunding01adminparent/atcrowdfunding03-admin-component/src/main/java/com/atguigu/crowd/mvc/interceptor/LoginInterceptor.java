package com.atguigu.crowd.mvc.interceptor;

import com.atguigu.crowd.entity.Admin;
import com.ccctop.crowd.constant.CrowdConstant;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.rmi.AccessException;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.通过request对象获取session对象
        HttpSession session = request.getSession();
        // 2.尝试从Session中获取Admin对象
        Admin admin = (Admin) session.getAttribute(CrowdConstant.ATTR_NAME_LOGIN_ADMIN);
        // 3.判断admin是否为空
        if (admin == null) {
            // 4.抛出异常
            throw new AccessException(CrowdConstant.MESSAGE_ACCESS_FORBIDEN);
        }
        // 5.如果admin对象不为空,则返回true放行
        return true;
    }
}
