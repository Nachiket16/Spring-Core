package com.nkspring.core.SpringCoreConcepts.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("student16")
public class Student {

    public Student(){
        System.out.println("Creating STUDENT from the LIFECYCLE PKG");
    }

    @PostConstruct      //When Bean is created then this will run automatically by the Bean LifeCycle
    public void postConstruct(){
        System.out.println("Student Bean is created: created()");
    }

    @PreDestroy     //Called just Before the closing/ destroy it will call this method. eg-> To close the connection
    public void preDestroy(){
        System.out.println("BYE BYE StudentBean !!!!");
    }


}
