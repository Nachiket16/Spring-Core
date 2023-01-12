package com.nkspring.core.SpringCoreConcepts.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    //    @Autowired      //This will give the dependency on the class
//    @Qualifier("cat")   //Take the component with the assigned name and resolve the conflict
    Animal animal;
    Student student;

    //For constructor based injection use Qualifier in the constructor
//    @Autowired
//    public Person(@Qualifier("dog") Animal animal) {
//        this.animal = animal;
//    }

    //Constructor Based Injection
//    @Autowired
//    public Person(Animal animal, Student student){
//        System.out.println("calling constructor...autowiring");
//        this.animal = animal;
//        this.student=student;
//    }

    //SETTER Based Injection -> using Autowired on setter
    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    public void setAnimal(Animal animal) {
        System.out.println("using Autowired on setter Animal");
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

    @Autowired
    public void setStudent(Student student) {
        System.out.println("using Autowired on setter Animal");
        this.student = student;
    }

    public void playWithAnimal() {
        animal.play();
    }

    public void detailOfPerson() {
        student.detail();
    }

}
