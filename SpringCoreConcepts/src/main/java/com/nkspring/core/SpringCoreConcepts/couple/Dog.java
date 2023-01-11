package com.nkspring.core.SpringCoreConcepts.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")   // == @Component("dog") [If component name is not given]
//@Primary
public class Dog implements Animal{

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
