package com.wordpress.hautudu.farm.spring.annotation;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FarmTest {
    public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(House.class);
	@SuppressWarnings("unused")
	BeanFactory factory = context;
	House house = (House) factory.getBean("house");
	Cat cat = (Cat) factory.getBean("cat");
	System.out.println(cat.makeSound());
	Dog dog = (Dog) factory.getBean("dog");
	System.out.println(dog.makeSound());

	System.out.println("Animal 1: " + house.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house.getAnimal2().makeSound());
	System.out.println(Arrays.asList(context.getBeanDefinitionNames()));
	ApplicationContext context2 = new AnnotationConfigApplicationContext(House2.class);
	BeanFactory factory2 = context2;
	House2 house2 = (House2) factory2.getBean("house2");
	System.out.println("Animal 1: " + house2.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house2.getAnimal2().makeSound());
	System.out.println(Arrays.asList(context2.getBeanDefinitionNames()));
	Dog dog2 = (Dog) factory2.getBean("dog");
	System.out.println(dog2.makeSound());
    }

}
