package com.wordpress.hautudu.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringTest {
    public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	BeanFactory beanFactory = applicationContext;
	LaptopStore laptopStore = (LaptopStore) beanFactory.getBean("laptopStore");
	LaptopStore2 laptopStore2 = (LaptopStore2) beanFactory.getBean("laptopStore2");
	LaptopStore3 laptopStore3 = (LaptopStore3) beanFactory.getBean("laptopStore3");
	LaptopStore4 laptopStore4 = (LaptopStore4) beanFactory.getBean("laptopStore4");

	System.out.println("Laptop1's trade mark: " + laptopStore.getLaptop1().showTradeMark());
	System.out.println("Laptop2's trade mark: " + laptopStore.getLaptop2().showTradeMark());
	System.out.println("Laptop1's trade mark2: " + laptopStore2.getLaptop1().showTradeMark());
	System.out.println("Laptop2's trade mark2: " + laptopStore2.getLaptop2().showTradeMark());
	System.out.println("Laptop1's trade mark3: " + laptopStore3.getLaptop1().showTradeMark());
	System.out.println("Laptop2's trade mark3: " + laptopStore3.getLaptop2().showTradeMark());
	System.out.println("Laptop1's trade mark4: " + laptopStore4.getLaptop1().showTradeMark());
	System.out.println("Laptop2's trade mark4: " + laptopStore4.getLaptop2().showTradeMark());
    }
}