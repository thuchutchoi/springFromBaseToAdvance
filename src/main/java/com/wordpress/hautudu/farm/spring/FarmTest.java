package com.wordpress.hautudu.farm.spring;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FarmTest {
    public static void main(String[] args) {
	// Application context
	// ApplicationContext context = new ClassPathXmlApplicationContext("beanft.xml");//ok
	ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/beanft.xml");

	BeanFactory factory = context;
	House house = (House) factory.getBean("houseBean");

	System.out.println("Animal 1: " + house.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house.getAnimal2().makeSound());
	System.out.println(Arrays.asList(context.getBeanDefinitionNames()));

	// -----------------------------Bean factories---------------------
	Resource resource1 = new FileSystemResource("/Users/nghiant/Code/SpringDemo/springbase/AnimalFarmAutoWiring/src/main/resources/beanft.xml");
	BeanFactory beanFactory1 = new XmlBeanFactory(resource1);
	House house2 = (House) beanFactory1.getBean("houseBean");
	System.out.println("Animal 1: " + house2.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house2.getAnimal2().makeSound());

	Resource resource2 = new ClassPathResource("beanft.xml");
	BeanFactory beanFactory2 = new XmlBeanFactory(resource2);
	House house3 = (House) beanFactory2.getBean("houseBean");
	System.out.println("Animal 1: " + house3.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house3.getAnimal2().makeSound());
    }

}
