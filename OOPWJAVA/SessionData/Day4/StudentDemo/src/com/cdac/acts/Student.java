package com.cdac.acts;

public class Student {
	private long prn;
	private String name;
	private double fees;
	
	public Student() {
	}
	public Student(long prn, String name, double fees) {
		this.prn = prn;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [prn=" + prn +
				", name=" + name 
				+ ", fees=" + fees + "]";
	}
	
	
//	@Override
//	public String toString() {
//		return "Student [ "
//		+ "prn=" + prn 
//		+ " name=" +  name
//		+ " fees=" + fees  
//		+ "]";
//	}
	


}
