package com.acts;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	public static final String EMPTY_STRING = "";
	
	private Integer rollNo;
	private String name;
	private Course course;
	//New feature java 8 (yyyy-MM-dd)
	private LocalDate dob;
	private Address address;
	
	public Student() {
		this.rollNo = 0;
		this.name = EMPTY_STRING;
		this.dob = null;
		this.course = null;
		this.address = new Address();
	}
	
	public Student(int rollNo, String name, LocalDate dob, Course course, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", dob=" + dob + ", address="
				+ address + "]";
	}

	@Override
	public int compareTo(Student o) {
		
//		if(this.rollNo > o.rollNo) {
//			return 1;
//		} else if (this.rollNo < o.rollNo) {
//			return -1;
//		} else {
//			return 0;
//		}
		
		//return this.name - o.name; prakash - akash = pr
		System.out.println("compareTO called");
		//return this.rollNo.compareTo(o.rollNo); // ASC
		return o.rollNo.compareTo(this.rollNo); // DSC
	}
	//CompareTo return 
	//> 0  if first is greater
	//< 0 if first is smaller
	//0 when both are equal
	
	  //Student to Object if we pass student
	  
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called");
		if( obj instanceof Student) {
			Student other = (Student) obj;
			return this.getRollNo() == other.getRollNo();
		} 
		return false;
	}

	//Method of Comparable implemented
//	@Override
//	public int compareTo(Student s) {
//		System.out.println("compareTo called");
//		int result = 0;
//		//this.rollNo == s.rollNo => 0
//		//this.rollNo < s.rollNo => -1
//		//this.rollNo > s.rollNo => 1
//		if(this.rollNo  < s.rollNo) {
//			result =  -1;
//		} else if(this.rollNo  > s.rollNo) {
//			result = 1;
//		}
//		return result;
//		
//	}
	
	

}
