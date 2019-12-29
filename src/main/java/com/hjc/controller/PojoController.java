package com.hjc.controller;

import com.hjc.entity.Address;
import com.hjc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @ModelAttribute("user")
    public User testUser(){
        User user = new User();
        user.setPassword("1233211");
        return user;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String pojo(Model model){
        model.addAttribute("address", new Address());
        model.addAttribute("user", new User());
        return "userForm";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String testPojo(@ModelAttribute("user") @Valid User user, Errors bindingResult, Model model){
        if (bindingResult.hasErrors()){
            System.out.println("error! ");
            for (FieldError error : bindingResult.getFieldErrors()){
                System.out.println(error.getField() + " " + error.getDefaultMessage());
            }
            return "userForm";
        }
        System.out.println(user);
        return "hello";
    }

//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder){
//        webDataBinder.setDisallowedFields("age");
//    }

}