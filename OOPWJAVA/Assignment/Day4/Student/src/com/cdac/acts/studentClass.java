package com.cdac.acts;

public class studentClass {
		
	private int rollNo;
	private String name;
	private int marks;
	private static int baseRollNo=100;
	
	public studentClass() {
		this.rollNo =baseRollNo++;
		this.name = "";
		this.marks = 0;
	}
	
	public studentClass(String name, int marks) {
		this.rollNo = baseRollNo++;
		this.name = name;
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "studentClass [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public int getMarks() {
		return marks;
	}
	
	
}
