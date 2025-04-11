package com.cdac;

import java.time.LocalDate;

import com.cdac.DeptEnum;

public class Employee {
	private int empId;
	private String name;
	private DeptEnum dept;
	private LocalDate dob;
	private LocalDate doj;
	
	
	public Employee(){
		this.empId = 0;
		this.name = "";
		this.dept = null;
		this.dob = null;
		this.doj = null;
	}	
	
	public Employee(int empId, String name, DeptEnum dept, LocalDate dob, LocalDate doj) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.dob = dob;
		this.doj = doj;
	}

	public LocalDate getDoj() {
		return doj;
	}
	
	public String getName()
	{
		return name;
	}	
}

