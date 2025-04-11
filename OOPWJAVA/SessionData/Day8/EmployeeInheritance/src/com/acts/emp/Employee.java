package com.acts.emp;

import java.util.Date;

import com.acts.date.util.DateUtils;

public abstract class Employee{
	private int empId;
	private String name;
	private String title;
	private Date doj;

	public Employee() {
		System.out.println("Employee::Employee()");
		
	}

	/**
	 * @param empId
	 * @param name
	 * @param title
	 * @param doj
	 */
	public Employee(int empId, String name, String title, Date doj) {
		System.out.println("Employee::Employee(paramteres)");
		this.empId = empId;
		this.name = name;
		this.title = title;
		this.doj = doj;
	}

	abstract public double calculateSalary();
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
	 String strDoj = DateUtils.getFormattedDate(doj, DateUtils.DD_MM_YYYY);
		return "Employee [empId=" + empId 
				+ ", name=" + name 
				+ ", title=" + title
				+ ", doj=" + strDoj + "]";
	}
}
