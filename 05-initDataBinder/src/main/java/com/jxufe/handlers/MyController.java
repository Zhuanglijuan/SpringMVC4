package com.jxufe.handlers;

import com.jxufe.editors.MyDateEidtor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

    /*
    //一种日期格式
    @InitBinder
    public void initBinder(WebDataBinder binder){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(df,true));
    }
    */

    //多种日期格式
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new MyDateEidtor());
    }
}
