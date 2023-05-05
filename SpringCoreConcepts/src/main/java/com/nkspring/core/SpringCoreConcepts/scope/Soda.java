package com.nkspring.core.SpringCoreConcepts.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Soda {

    public Soda(){
        System.out.println(" Creating SODA ");
    }
    public void drink(){
        System.out.println("Drinking SODA");
    }

}
