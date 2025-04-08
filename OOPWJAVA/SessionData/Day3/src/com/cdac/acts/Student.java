package com.cdac.acts;
public class Student {
	//Instnace members
	//DM
	private long prn;
	private String name;
	private double fees;
	private static long basePrn = 123456789100L;
	
	
	public Student() {
		System.out.println("\n Student()"); 
		this.prn = basePrn++;
		this.name = "";
		this.fees = 104000.00;
	}
	
	public Student(String name, double fees) {
		System.out.println("\n Student(String, double)");
		this.prn = basePrn++;
		this.name = name;
		this.fees = fees;
	}
	
	public static long getBasePrn(){
		return basePrn;
	}
		
	public void printData() {
		System.out.println("Student [ "
		+ "prn=" + prn 
		+ " name=" +  name
		+ " fees=" +  fees 
		+ "]");
	}
	
}