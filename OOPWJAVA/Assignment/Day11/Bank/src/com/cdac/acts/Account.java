package com.cdac.acts;
import java.time.LocalDate;

public class Account {
	private String accNo;
	private String accName;
	private LocalDate dateOfOpening;
	private double balance;
	
	public Account() {
		System.out.println("Default constructor ");
	}
	public Account(String accNo,String accName,LocalDate dateOfOpening,double balance) throws IllegalArgumentException {
		if(balance<500) {
			throw new IllegalArgumentException("Initial balance must be more than 1000");
		}
		this.accNo=accNo;
		this.accName=accName;
		this.dateOfOpening=dateOfOpening;
		this.balance=balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}
}
