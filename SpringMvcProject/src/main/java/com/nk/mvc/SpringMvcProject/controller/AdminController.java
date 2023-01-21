package com.nk.mvc.SpringMvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping("/login")
    public String showLoginPage(){
        return "login";
    }
}
