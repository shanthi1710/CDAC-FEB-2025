package com.acts;

public class Student {
	private int roll;
	private String name;
	private int age;
	private static int genRoll = 100;
	
	public Student(String name, int age) {
		super();
		this.roll = genRoll++;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
