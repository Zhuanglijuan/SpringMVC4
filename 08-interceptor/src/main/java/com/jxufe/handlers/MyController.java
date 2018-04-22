package com.jxufe.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zhuang on 2018/4/14.
 */

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/some.do")
    public String doSome() {
        System.out.println("执行处理器的doSome()");
        return "/WEB-INF/jsp/welcome.jsp";
    }


}
