package com.wordpress.hautudu.farm.spring.annotation.resource;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ Cat.class, Dog.class })
@Configuration
public class House {

    @Resource // by name
    private Animal animal1;
    @Resource // by name
    private Animal animal2;

    public Animal getAnimal1() {
	return animal1;
    }

    public Animal getAnimal2() {
	return animal2;
    }

    public void setAnimal1(Animal animal1) {
	this.animal1 = animal1;
    }

    public void setAnimal2(Animal animal2) {
	this.animal2 = animal2;
    }
}