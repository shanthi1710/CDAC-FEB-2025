package com.acts.emp;

import java.util.Date;

import com.cdac.acts.benefits.Payable;

public class ContractEmployee extends Employee implements Payable{

	private double dailyRate;
	private int noOfDays;

	public ContractEmployee() {
		super();
		System.out.println("ContractEmployee::ContractEmployee()");
	}

	public ContractEmployee(String name, String title,
			Date doj,double dailyRate, int noOfDays) {
		super(name, title , doj);
		this.dailyRate = dailyRate;
		this.noOfDays = noOfDays;
		System.out.println("ContractEmployee::ContractEmployee(Param)");
	}


	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	@Override
	public double calculateSalary() {
		System.out.println("Contract salary");
		return dailyRate * noOfDays;
	}

	@Override
	public String toString() {
		return "ContractEmployee [" + super.toString() + " dailyRate=" + dailyRate + ", noOfDays=" + noOfDays + "]";
	}
	
}
