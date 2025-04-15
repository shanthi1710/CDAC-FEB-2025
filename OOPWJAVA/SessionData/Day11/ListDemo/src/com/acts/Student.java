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


	
	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", address=" + address + "]";
	}
	

}
