package com.wordpress.hautudu.beanwiring;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
    private Address address;
    private int age;
    List<String> books;
    Properties hobbies;
    private String name;
    Map<String, Subject> timeTable;

    public Student() {
    }

    public Student(int age, String name, Address address) {
	this.age = age;
	this.name = name;
	this.address = address;
    }

    public Address getAddress() {
	return address;
    }

    public int getAge() {
	return age;
    }

    /*
     * Address address = new Address(); ... Student student = new Student(18, "Nguyen Van A", address);
     */
    public List<String> getBooks() {
	return books;
    }

    public Properties getHobbies() {
	return hobbies;
    }

    public String getName() {
	return name;
    }

    public Map<String, Subject> getTimeTable() {
	return timeTable;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public void setBooks(List<String> books) {
	this.books = books;
    }

    public void setHobbies(Properties hobbies) {
	this.hobbies = hobbies;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setTimeTable(Map<String, Subject> timeTable) {
	this.timeTable = timeTable;
    }
}
