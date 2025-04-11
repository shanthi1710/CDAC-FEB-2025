package com.cdac;
import java.time.LocalDate;

public class Person {
	private String aadharNo;
	private String name;
	private LocalDate dob;
	private Address address;
	
	public Person() {
		this.aadharNo =  "";
		this.name = "";
		this.dob = null;
		this.address = null;
	}
	
	public Person(String aadharNo, String name, LocalDate dob, Address address) {
		this.aadharNo = aadharNo;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [aadharNo=" + aadharNo + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public String getName() {
		return name;
	}


	
}
