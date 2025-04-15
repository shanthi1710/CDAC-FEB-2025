package com.cdac.acts;

public class Student {
	private String name;
	private String course;
	private Integer rollNo;
	
	public Student() {
		super();
	}

	public Student(String name, String course, Integer rollNo) {
		super();
		this.name = name;
		this.course = course;
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

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", rollNo=" + rollNo + "]";
	}
}
