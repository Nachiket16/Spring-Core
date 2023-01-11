package com.nkspring.core.SpringCoreConcepts.couple;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
