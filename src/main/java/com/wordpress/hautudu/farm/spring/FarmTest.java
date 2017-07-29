package com.wordpress.hautudu.farm.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FarmTest {
    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beanft.xml");
	BeanFactory factory = context;
	House house = (House) factory.getBean("houseBean");

	System.out.println("Animal 1: " + house.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house.getAnimal2().makeSound());
    }

}
