package com.hjc;

import com.hjc.Exception.Not24Exception;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Classname ExceptionAdvice
 * @Description TODO
 * @Date 2019-12-29 21:02
 * @Created by Justin
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({ArithmeticException.class})
    public String arithmeticExceptionHandler(Exception ex, Model model){
        model.addAttribute("msg", ex.getMessage());
        return "error";
    }

    @ExceptionHandler({Not24Exception.class})
    public String not24ExceptionHandler(Exception ex, Model model){
        model.addAttribute("msg", ex.getMessage());
        return "error";
    }

}
