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
	//Student has Addresses one to many Aggregation/Assocaiation
	//Egar init
	//private List<Address> addressList = new ArrayList<Address>();
	private List<Address> addressList;
	
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

	public List<Address> getAddresses() {
		return addressList;
	}

	public void addAddress(Address address) {
		if(null == addressList) {
			//Lazy creattion of List
			this.addressList = new ArrayList<Address>();
		}
		this.addressList.add(address);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", dob=" + dob + ", address="
				+ addressList + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo.compareTo(o.rollNo); // ASC
		//return o.rollNo.compareTo(this.rollNo); // DSC
	}
	
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
