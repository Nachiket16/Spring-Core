package com.nkspring.core.SpringCoreConcepts;

import com.nkspring.core.SpringCoreConcepts.couple.Animal;
import com.nkspring.core.SpringCoreConcepts.couple.Cat;
import com.nkspring.core.SpringCoreConcepts.couple.Dog;
import com.nkspring.core.SpringCoreConcepts.couple.Person;
import com.nkspring.core.SpringCoreConcepts.test.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"",""})
@ComponentScan(basePackages = {"com.nkspring.core","test"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		//about the Bean
		//@Component

		// Dependencies
		//@Autowired

		// Location -> Where to scan for the Beans
		//com.nkspring.core.couple
		//@SpringBootApplication -> This will Scan the available component inside the child pkg & SubPkg.
		//@ComponentScan(basePackages = {"",""}) -> This call other pkg as per the requirement

		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person peronBean = context.getBean(Person.class);
		peronBean.playWithAnimal();

		Test testBean = context.getBean(Test.class);
		testBean.testing();

		//Get from the Context
		Animal cat = context.getBean("cat", Animal.class);
		Animal dog = context.getBean("dog", Animal.class);
		cat.play();
		dog.play();

	}

}
