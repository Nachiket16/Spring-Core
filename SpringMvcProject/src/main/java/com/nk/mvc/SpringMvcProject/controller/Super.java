package com.nk.mvc.SpringMvcProject.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Super {


    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Inside the aboutRequestHandler");
        return "about";
    }

    @RequestMapping("/service")
    public String aboutService(){
        System.out.println("Inside the Services method");
        return "service";
    }
}
