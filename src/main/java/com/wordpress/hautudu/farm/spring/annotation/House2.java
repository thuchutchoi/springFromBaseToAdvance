package com.wordpress.hautudu.farm.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ Cat.class, Dog.class })
@Configuration
public class House2 {
    @Autowired
    private Cat animal1;
    @Autowired
    private Dog animal2;

    public Animal getAnimal1() {
	return animal1;
    }

    public Animal getAnimal2() {
	return animal2;
    }

    public void setAnimal1(Cat animal1) {
	this.animal1 = animal1;
    }

    public void setAnimal2(Dog animal2) {
	this.animal2 = animal2;
    }
}