package com.wordpress.hautudu.beanwiring;

import java.util.Map.Entry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringTest {
    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beanswr.xml");
	BeanFactory factory = context;
	Student studentBean = (Student) factory.getBean("studentBean8");

	System.out.println("Student age: " + studentBean.getAge());
	System.out.println("Student name: " + studentBean.getName());
	System.out.println("Student district: " + studentBean.getAddress().getDistrict());
	System.out.println("Student street: " + studentBean.getAddress().getStreet());
	System.out.println("Student house number: " + studentBean.getAddress().getHouseNumber());

	System.out.println("Book list: ");
	for (String book : studentBean.getBooks()) {
	    System.out.println(book);
	}

	System.out.println("Time table: ");
	for (Entry<String, Subject> entry : studentBean.getTimeTable().entrySet()) {
	    System.out.println(entry.getKey() + " - " + entry.getValue().getName());
	}

	System.out.println("Hobbies: ");
	for (Object key : studentBean.getHobbies().keySet()) {
	    System.out.println(key + " - " + studentBean.getHobbies().getProperty((String) key));
	}
    }
}