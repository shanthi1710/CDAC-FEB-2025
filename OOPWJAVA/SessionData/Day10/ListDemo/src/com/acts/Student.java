package com.acts;

public class Student {
	
	public static final String EMPTY_STRING = "";
	
	private int rollNo;
	private String name;
	private String course;
	private Address address;
	
	public Student() {
		this.rollNo = 0;
		this.name = EMPTY_STRING;
		this.course = EMPTY_STRING;
		this.address = new Address();
	}
	
	
	
	
	public Student(int rollNo, String name, String course, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", address=" + address + "]";
	}
	

}
