package com.hjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Classname fileUploadController
 * @Description TODO
 * @Date 2019-12-29 14:58
 * @Created by Justin
 */
@Controller("uploadFile")
public class fileUploadController {

    @RequestMapping(method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file")MultipartFile file){
        System.out.println(file.getOriginalFilename() + " uploaded");
        return "hello";
    }
}
