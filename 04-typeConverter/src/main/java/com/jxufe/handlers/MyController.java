package com.jxufe.handlers;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Zhuang on 2018/4/17.
 */

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping(value = "/register.do")
    public ModelAndView doRegister(int age, Date birthday) {
        System.out.println("age = " + age);
        System.out.println("birthday = " + birthday);
        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    //数据回显
    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView exceptionResolver(HttpServletRequest request,Exception e){
        ModelAndView mv = new ModelAndView();

        String age = request.getParameter("age");
        String birthday = request.getParameter("birthday");
        //捕获到的异常信息
        String errorMSG = e.getMessage();

        if(errorMSG.contains(age)){
            mv.addObject("ageErrors","年龄输入有误");
        }

        if(errorMSG.contains(birthday)){
            mv.addObject("birthdayErrors","日期输入有误");
        }

        mv.addObject("age",age);
        mv.addObject("birthday",birthday);
        mv.setViewName("/index.jsp");

        return mv;
    }
}
