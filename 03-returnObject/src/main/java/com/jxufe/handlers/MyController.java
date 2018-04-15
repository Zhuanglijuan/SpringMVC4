package com.jxufe.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Zhuang on 2018/4/14.
 */

@Controller                 //表示当前类是一个处理器
@RequestMapping("/test")    //命名空间
public class MyController {

    @RequestMapping(value = "/myAjax.do",produces = "text/html;charset=utf-8")
    @ResponseBody //将返回的数据放入到响应体中
    public Object doAjax() {
        System.out.println("!!!!!!!!!!!!!!!!");
        return "China北京";
    }
}
