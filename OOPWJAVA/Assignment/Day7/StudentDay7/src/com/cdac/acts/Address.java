package com.cdac.acts;

public class Address {
	private String city;
	private String state;
	private String pincode;
	
	public Address() {
		
		this.city = "";
		this.state = "";
		this.pincode = "";
	}
	
	public Address(String city, String state, String pincode) {
	
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public String getString() {
		
		return "\nAddress: " + "\nCity : " + city + "\nState : " + state + "\nPin-Code : " + pincode;
				
	}
	
}

