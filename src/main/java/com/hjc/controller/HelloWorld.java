package com.hjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HelloWorld
 * @Description TODO
 * @Date 2019-12-24 13:22
 * @Created by Justin
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World!");
        return "hello";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
