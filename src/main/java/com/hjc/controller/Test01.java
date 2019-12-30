package com.hjc.controller;

import com.hjc.Exception.Not24Exception;
import com.hjc.entity.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Classname Test01
 * @Description TODO
 * @Date 2019-12-24 14:57
 * @Created by Justin
 */
@SessionAttributes(value = "address",types = {Date.class})
@RequestMapping("/test01")
@Controller
public class Test01 {

    @ModelAttribute
    public void setTime(Model model){
        model.addAttribute("timeAtrr",new Date());
    }

    @RequestMapping(value = "/testExcptionHandler")
    public String testExcptionHandler(@RequestParam("i") Integer i){
        if (i == 24)
            throw new Not24Exception();
        int result = 10 / i;
        System.out.println(result);
        return "hello";
    }

    @RequestMapping(value = "/testSessionAttr")
    public String  testSessionAttr(Model modelAndView){
        Address address = new Address();
        address.setCity("foshan");
        address.setProvince("guangdong");
        modelAndView.addAttribute("address",address);
        return "hello";
    }

//    testModelAndView
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("time", new Date());

        return modelAndView;
    }

    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID", required = false) String cookieValue){
        System.out.println("cookie value: " + cookieValue);
        return "hello";
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "name") String n,
                                   @RequestParam(value = "age",required = false, defaultValue = "0") Integer age){
        System.out.println("param: name " + n + " age " + age);
        return "hello";
    }

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
