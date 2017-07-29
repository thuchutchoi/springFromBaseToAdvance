package com.wordpress.hautudu.farm.spring.annotation.resource;

import org.springframework.context.annotation.Configuration;

@Configuration("animal2")
public class Dog implements Animal {

    @Override
    public String makeSound() {
	return "Dog makes sound";
    }

}
