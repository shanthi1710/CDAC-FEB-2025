package com.cdac.acts;

import java.util.Date;

import com.cdac.acts.enums.TitleEnum;
import com.cdac.acts.utils.DateUtils;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private Date doj;
	private TitleEnum title;
	private Address permAddress;
	
	private static int idGenerator = 1000;
	
	public Employee(){
		this.empId = idGenerator++;
		this.name = "";
		this.salary = 0.0;
		this.doj = null;
		this.title = null;
		this.permAddress = null;
	}
	
	public Employee(String name, double salary,
			Date doj, TitleEnum title, Address permAddress) {
		this.empId = idGenerator++;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
		this.title = title;
		this.permAddress = permAddress;
	}
	
	
	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public TitleEnum getTitle() {
		return title;
	}

	public void setTitle(TitleEnum title) {
		this.title = title;
	}

	public Address getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(Address permAddress) {
		this.permAddress = permAddress;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Employee.idGenerator = idGenerator;
	}

	@Override
	public String toString() {
		return "Employee[empId=" + empId 
				+ " name=" + name 
				+ " doj=" + DateUtils.getFormattedDate(doj)
				+ " title=" + title.getValue()
				+ " salary=" + salary 
				+ permAddress.toString() +"]";
	}
	
}
