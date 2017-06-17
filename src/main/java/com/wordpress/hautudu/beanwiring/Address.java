package com.wordpress.hautudu.beanwiring;

public class Address {

    private String district;

    private int houseNumber;
    private String street;

    public String getDistrict() {
	return district;
    }

    public int getHouseNumber() {
	return houseNumber;
    }

    public String getStreet() {
	return street;
    }

    public void setDistrict(String district) {
	this.district = district;
    }

    public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
	this.street = street;
    }

}
