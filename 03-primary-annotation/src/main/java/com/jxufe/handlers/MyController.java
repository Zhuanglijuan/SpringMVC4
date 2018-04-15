package com.jxufe.handlers;

import com.jxufe.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Zhuang on 2018/4/14.
 */

@Controller                 //表示当前类是一个处理器
@RequestMapping("/test")    //命名空间
public class MyController {

    //校正请求参数名
    /*@RequestMapping("/register.do")
    public ModelAndView doRegister(@RequestParam("pname") String name, int age) {
        System.out.println();
        System.out.println(name + " " + age);

        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }*/

    @RequestMapping("/register.do")
    public ModelAndView doRegister(Student student) {
        System.out.println();
        System.out.println(student.getName() + " " + student.getAge());

        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("student", student);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping(value = {"/welcome.do", "/hello.do"}, method = RequestMethod.POST) //对请求提交方式的定义
    public ModelAndView doFirst(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("message", "执行doFirst()");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping(value = "/second.do", params = {"name", "age"}) //定义请求中必须携带的参数的要求
    public ModelAndView doSecond(HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("message", "执行doSecond()");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/third*.do") //资源名称必须以third开头
    public ModelAndView doThird(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("message", "执行doSecond()");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*fourth.do") //资源名称必须以fourth结尾
    public ModelAndView doFourth(HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("message", "执行doSecond()");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*/fifth.do") //路径级数的绝对匹配，即要求在test与fifth.do之间必须要有一级路径
    public ModelAndView doFifth(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("message", "执行doSecond()");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/**/sixth.do") //要求在test与sixth.do之间可以包含多级路径，也可以没有其他路径
    public ModelAndView doSixth(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        //其底层执行的是request.setAttribute()
        mv.addObject("message", "执行doSecond()");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }
}
