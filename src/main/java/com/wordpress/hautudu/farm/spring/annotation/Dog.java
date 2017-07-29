package com.wordpress.hautudu.farm.spring.annotation;

import org.springframework.context.annotation.Configuration;

@Configuration("dog")
public class Dog implements Animal {

    @Override
    public String makeSound() {
	return "Dog makes sound";
    }

}
