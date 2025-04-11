package com.cdac;

public class Address {
	private String street;
	private String city;
	private String pinCode;
	
	public Address() {
		this.street = " ";
		this.city = " ";
		this.pinCode = "000-000 ";
	}
	
	public Address(String street, String city, String pinCode) {
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return  street + ", " + city + ", "+ pinCode ;
	}
}

