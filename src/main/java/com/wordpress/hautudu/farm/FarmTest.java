package com.wordpress.hautudu.farm;

public class FarmTest {
    public static void main(String[] args) {
	House house = new House();
	Animal animal1 = new Dog();// init object
	Animal animal2 = new Cat();// init
	house.setAnimal1(animal1);// gan tham chieu cho lop House
	house.setAnimal2(animal2);// gan
	/***
	 * lop House lien ket den hai doi tuong, lien ket trong java code,muon
	 * thay doi mot thanh phan lien ket, bien dich lai toan bo code. Spring
	 * giup khoi tao va lien ket cac doi tuong o file cau hinh xml.
	 *
	 *
	 **/
	System.out.println("Animal 1: " + house.getAnimal1().makeSound());
	System.out.println("Animal 2: " + house.getAnimal2().makeSound());
    }

}
