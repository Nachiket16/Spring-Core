package com.nkspring.core.SpringCoreConcepts;

import com.nkspring.core.SpringCoreConcepts.couple.Animal;
import com.nkspring.core.SpringCoreConcepts.couple.Cat;
import com.nkspring.core.SpringCoreConcepts.couple.Dog;
import com.nkspring.core.SpringCoreConcepts.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
//		Animal animal = new Dog();
		Animal animal = new Cat();
		Person p = new Person(animal);
		p.playWithAnimal();
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
