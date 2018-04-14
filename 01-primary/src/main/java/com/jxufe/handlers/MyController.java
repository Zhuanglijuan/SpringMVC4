package com.jxufe.handlers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Zhuang on 2018/4/14.
 */
public class MyController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("message","hello SpringMVC World");
        mv.setViewName("welcome");
        return mv;
    }
}
