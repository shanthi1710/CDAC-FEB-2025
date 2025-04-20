package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
	
	public static final String EMPTY_STRING = "";
	
	private Integer rollNo;
	private String name;
	private Course course;
	//New feature java 8 (yyyy-MM-dd)
	private LocalDate dob;
	
	public Student() {
		this.rollNo = 0;
		this.name = EMPTY_STRING;
		this.dob = null;
		this.course = null;
	}
	
	public Student(int rollNo, String name, LocalDate dob, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", dob=" + dob  + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo.compareTo(o.rollNo); // ASC
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		result = result * 31 + this.rollNo.hashCode(); 
		result = result * 31 + this.name.hashCode(); 
		return result;
	}
	
	//s1.equals(s2) should pass if both students are equal
	//s2.equals(e1) should fail
	@Override
	public boolean equals(Object obj) {
		//Check if passed obj is null;
		if( null == obj) {
			return false;
		}
		//Need to check about invoking object 
		//and passed object are of same type
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		//Self check
		if( this == obj) {
			return true;
		}
		
		//Actual comparison
		//Down casting
		Student s = (Student) obj;
		return (this.rollNo.equals(s.rollNo)) 
				&& this.name.equals(s.name);
	}
}
