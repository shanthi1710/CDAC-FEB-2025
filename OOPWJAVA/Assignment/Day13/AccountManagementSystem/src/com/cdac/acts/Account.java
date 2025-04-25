package com.cdac.acts;

import java.time.LocalDate;

public class Account implements Comparable<Account>{
	private Integer accNo;
	private String name;
	private LocalDate accOpeningDate;
	private Double balance;
	private static int baseAccNo = 100;
	
	public Account() {
		this.accNo = baseAccNo++;
		this.name = " ";
		this.accOpeningDate = null;
		this.balance = 0.00;
	}
	
	public Account(String name, LocalDate accOpeningDate, Double balance) {
		this.accNo = baseAccNo++;
		this.name = name;
		this.accOpeningDate = accOpeningDate;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accOpeningDate=" + accOpeningDate + ", Balance="
				+ balance + "]";
	}
	
	public Integer getAccNo() {
		return accNo;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance){
		this.balance = balance;
	}

	public LocalDate getDate() {
		return accOpeningDate;
	}
	
	@Override
	public int compareTo(Account o) {
		return this.accNo.compareTo(o.accNo);
	}
	
	
	
	
	

}
