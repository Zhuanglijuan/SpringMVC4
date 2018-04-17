package com.jxufe.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * Created by Zhuang on 2018/4/17.
 */

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/upload.do")
    public String doFileUpload(MultipartFile img,HttpSession session) throws IOException {
        String path = session.getServletContext().getRealPath("/images");
        //判断是否有文件
        if(img.getSize() > 0){
            //获取到上传文件的原始名称
            String fileName = img.getOriginalFilename();
            //对上传文件类型限制
            if(fileName.endsWith("jpg") || fileName.endsWith("png")) {
                File file = new File(path, fileName);
                img.transferTo(file);
                return "/success.jsp";
            }
            return "/error.jsp";
        }
        return "/error.jsp";
    }
}
