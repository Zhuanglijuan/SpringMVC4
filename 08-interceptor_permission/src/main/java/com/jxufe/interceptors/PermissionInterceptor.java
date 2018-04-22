package com.jxufe.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Zhuang on 2018/4/22.
 */
public class PermissionInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("执行PermissionInterceptor ---- preHandle()-----");
        String user = (String) httpServletRequest.getSession().getAttribute("user");
        if("Zhuang".equals(user))
            return true;
        httpServletRequest.getRequestDispatcher("/fail.jsp").forward(httpServletRequest,httpServletResponse);
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("执行PermissionInterceptor ---- postHandle()-----");
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("执行PermissionInterceptor ---- afterCompletion()-----");
    }
}
