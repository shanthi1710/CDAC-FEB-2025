package com.acts.emp;

import java.util.Date;

public class ContractEmployee extends Employee{
	
	private double dailyRate;
	private int noOfDays;
	
	
	public ContractEmployee() {
		super();
		System.out.println("ContractEmployee::ContractEmployee()");
	}
	
	public ContractEmployee(String name,String title,Date doj,double dailyRate, int noOfDays) {
		super(name,title,doj);
		this.dailyRate = dailyRate;
		this.noOfDays = noOfDays;
	}
	
	@Override
	public double calculateSalary() {
		System.out.println("Contract Salary");
		return dailyRate*noOfDays;
	}

	@Override
	public String toString() {
		return "ContractEmployee [dailyRate=" + dailyRate + ", noOfDays=" + noOfDays + "]";
	}
	
}
