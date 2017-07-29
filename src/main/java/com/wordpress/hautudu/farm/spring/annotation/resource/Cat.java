package com.wordpress.hautudu.farm.spring.annotation.resource;

import org.springframework.context.annotation.Configuration;

@Configuration("animal1")
public class Cat implements Animal {
    @Override
    public String makeSound() {
	return "Cat makes sound";

    }

}
