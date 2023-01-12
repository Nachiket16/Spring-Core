package com.nkspring.core.SpringCoreConcepts.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

//    @Autowired      //This will give the dependency on the class
//    @Qualifier("cat")   //Take the component with the assigned name and resolve the conflict
    Animal animal ;

    //For constructor based injection use Qualifier in the constructor
//    @Autowired
//    public Person(@Qualifier("dog") Animal animal) {
//        this.animal = animal;
//    }

    //Constructor Based Injection
    @Autowired
    public Person(Animal animal){
        System.out.println("calling constructor...autowiring");
        this.animal = animal;
    }

    public void playWithAnimal(){
        animal.play();
    }

}
