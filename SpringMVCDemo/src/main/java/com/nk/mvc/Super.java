package com.nk.mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class Super
{
    /*
        @RequestMapping is used for mapping the url with the method

     */

    @RequestMapping("/about")
    public String aboutRequestMapping(){
        System.out.println("Inside the Super class about Request Mapping method");
        return "About";
    }

}
