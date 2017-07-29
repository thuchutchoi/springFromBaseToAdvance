package com.wordpress.hautudu.farm.spring.annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FarmTest {
    public static void main(String[] args) {
	// ApplicationContext context = new ClassPathXmlApplicationContext("beanft.xml");
	ApplicationContext context = new AnnotationConfigApplicationContext(House.class);
	@SuppressWarnings("unused")
	BeanFactory factory = context;
	House house = (House) factory.getBean("house");
	// Cat cat = (Cat) factory.getBean("catBean");
	// System.out.println(cat.makeSound());
	// Dog dog = (Dog) factory.getBean("dogBean");
	// System.out.println(dog.makeSound());

	System.out.println("Animal 1: " + house.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house.getAnimal2().makeSound());
    }

}
