package com.cdac.acts;

import java.time.LocalDate;

public class Account {
	private int accNo;
	private String accName;
	private LocalDate dateOfOpening;
	private double balance;
	
	public Account(int accNo,String accName,LocalDate dateOfOpeing,double balance){
		if(dateOfOpeing.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("\nDate of opening cannot be in the future");
		}
		if(balance<500) {
			throw new IllegalArgumentException("Initial balance must be more than 1000");
		}
		this.accNo=accNo;
		this.accName=accName;
		this.dateOfOpening = dateOfOpeing;
		this.balance=balance;
	}
	
	public int getAccNo() {
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
