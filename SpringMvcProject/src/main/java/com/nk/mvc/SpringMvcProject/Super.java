package com.nk.mvc.SpringMvcProject;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class Super {


    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Inside the aboutRequestHandler");
        return "about";
    }

    public String aboutService(){
        System.out.println("Inside the Services method");
        return "service";
    }
}
