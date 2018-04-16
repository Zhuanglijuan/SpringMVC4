package com.jxufe.handlers;

import com.jxufe.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhuang on 2018/4/14.
 */

@Controller                 //表示当前类是一个处理器
@RequestMapping("/test")    //命名空间
public class MyController {

    /*
    //返回字符串对象
    @RequestMapping(value = "/myAjax.do",produces = "text/html;charset=utf-8")
    @ResponseBody //将返回的数据放入到响应体中
    public Object doAjax() {
        System.out.println("!!!!!!!!!!!!!!!!");
        return "China北京";
    }*/

    /*//返回自定义型对象
    @RequestMapping(value = "/myAjax.do")
    @ResponseBody //将返回的数据放入到响应体中
    public Object doAjax() {
        return new Student("张三", 23);
    }
    */


    /*//返回map集合
    @RequestMapping(value = "/myAjax.do")
    @ResponseBody //将返回的数据放入到响应体中
    public Object doAjax() {
        Map<String,Student> map = new HashMap<String,Student>();
        map.put("student1",new Student("张三",23));
        map.put("student2",new Student("李四",24));
        return map;
    }*/

    //返回list集合
    @RequestMapping(value = "/myAjax.do")
    @ResponseBody //将返回的数据放入到响应体中
    public Object doAjax() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        return list;
    }
}
