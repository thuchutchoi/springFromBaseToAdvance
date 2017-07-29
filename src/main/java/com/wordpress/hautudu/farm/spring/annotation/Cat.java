package com.wordpress.hautudu.farm.spring.annotation;

import org.springframework.context.annotation.Configuration;

@Configuration("cat")
public class Cat implements Animal {
    @Override
    public String makeSound() {
	return "Cat makes sound";

    }

}
