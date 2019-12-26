package com.hjc.controller;

import com.hjc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @Classname PojoController
 * @Description TODO
 * @Date 2019-12-26 11:33
 * @Created by Justin
 */
@Controller
@RequestMapping("/pojo")
public class PojoController {


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String pojo(){
        return "userForm";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String testPojo(@Valid User user, Errors bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println("error! " + bindingResult.getAllErrors());
            return "userForm";
        }
        System.out.println(user);
        return "hello";
    }

}