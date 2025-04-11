package com.cdac.acts;

import java.time.LocalDate;

public class student {
	
	private int rollNo;
	private String name;
	private CourseEnum course;
	private Address address;
	private LocalDate DOB;
	
	public student() {
		this.rollNo=0;
		this.name="";
		this.course=null;
		this.address=null;
		this.DOB=null;
	}
	
	public student(int rollNo, String name,CourseEnum course, Address address, LocalDate DOB) {
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		this.address=address;
		this.DOB=DOB;
	}
	
	 public LocalDate getDOB() {
	        return DOB;
	}
	 public LocalDate getDateOfBirth() {
			return DOB;
	}
	public String getString() {
		
		return "\nStudent Info : " + "\nRollNo : "+ rollNo + "\nName : " 
		+name+ "\nCourse Info :" + course 
		+ "\nAddress Info : " + address.getString()
		+ "\nDate of Birth : "+ DOB;
	}
}
