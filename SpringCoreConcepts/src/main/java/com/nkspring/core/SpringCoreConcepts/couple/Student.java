package com.nkspring.core.SpringCoreConcepts.couple;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(){
        System.out.println("Creating the student");
    }
    public void detail(){
        System.out.println("I am Student Method");
    }

}
