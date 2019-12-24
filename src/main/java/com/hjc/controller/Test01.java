package com.hjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Classname Test01
 * @Description TODO
 * @Date 2019-12-24 14:57
 * @Created by Justin
 */
@RequestMapping("/test01")
@Controller
public class Test01 {


    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRestDele(@PathVariable("id") Integer id){
        System.out.println("rest: delete id " + id);
        return "hello";
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable("id") Integer id){
        System.out.println("rest: put id " + id);
        return "hello";
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRest(){
        System.out.println("rest: post");
        return "hello";
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRest(@PathVariable("id") Integer id){
        System.out.println("rest: get id " + id);
        return "hello";
    }


    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println("testPathVariable  " + id);
        return "hello";
    }

    @RequestMapping("/ctlmap")
    public String testControllerMapping(){
        System.out.println("test01/ctlmap");
        return "index";
    }

    @RequestMapping("/*/ant")
    public String testAntPath(){
        System.out.println("test ant path");
        return "hello";
    }

    @RequestMapping(value = {"testParamAndHeader","testParamAndHeader1"}, params = {"age=10"})
    public String testParamAndHeader(){
        System.out.println("testParamAndHeader");
        return "hello";
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("test Method");
        return "index";
    }
}
