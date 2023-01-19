package com.nkspring.core.SpringCoreConcepts.scope;

import org.springframework.stereotype.Component;

@Component
public class Pepsi {

    public Pepsi(){
        System.out.println(" Creating PEPSI " );
    }

    public void drink(){
        System.out.println("Pepsi is really fizzy");
    }

}
