package com.cdac.acts;

public class Student {
	private int rollNo;
	private String name;
	private String course;
	
	public Student() {
		this.rollNo =0;
		this.name = "";
		this.course = "";
	}

	public Student(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}

	public void printStudent() {
		System.out.println("\n*****Student Data starts******");
		System.out.println("Student Roll No : "+ rollNo);
		System.out.println("Student Name : "+ name);
		System.out.println("Student course : "+ course);
		System.out.println("*****Student Data ends******");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.printStudent();
		
		Student s2 = new Student(123, "Ram", "DAC");
		s2.printStudent();
	}

}
