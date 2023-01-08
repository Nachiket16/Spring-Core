package com.nkspring.core.SpringCoreConcepts.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired      //This will give the dependency on the class
    Animal animal ;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){
        animal.play();
    }

}
