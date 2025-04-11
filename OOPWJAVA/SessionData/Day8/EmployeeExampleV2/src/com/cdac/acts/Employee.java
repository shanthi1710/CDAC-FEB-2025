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
	
	private static int idGenerator = 1000;
	
	public Employee(){
		this.empId = idGenerator++;
		this.name = "";
		this.salary = 0.0;
		this.doj = null;
		this.title = null;
	}
	
	public Employee(String name, double salary, Date doj, TitleEnum title) {
		this.empId = idGenerator++;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
		this.title = title;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	@Override
	public String toString() {
		return "Employee[empId=" + empId 
				+ " name=" + name 
				+ " doj=" + DateUtils.getFormattedDate(doj)
				+ " title=" + title.getValue()
				+ " salary=" + salary + "]";
	}
	
}
