package com.acts.emp;

import java.util.Date;

import com.acts.date.util.DateUtils;

public abstract class Employee {
	private int empId;
	private String name;
	private TitleEnum title;
	private Date doj;
	
	private static int idGenerator = 100;

	public Employee() {
		this.empId = idGenerator++;
		System.out.println("Employee::Employee()");
	}

	/**
	 * @param empId
	 * @param name
	 * @param title
	 * @param doj
	 */
	public Employee(String name, String title, Date doj) {
		System.out.println("Employee::Employee(paramteres)");
		this.empId = idGenerator++;
		this.name = name;
		//SW_ENGG
		this.title = TitleEnum.valueOf(title);
		this.doj = doj;
	}

	//public abstract double calculateSalary();
	
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
		return title.name();
	}

	public void setTitle(String title) {
		this.title = TitleEnum.valueOf(title);
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId 
				+ ", name=" + name 
				+ ", title=" + title
				+ ", doj=" + DateUtils.getFormattedDate(doj, DateUtils.DD_MM_YYYY) + "]";
	}
	
	
}
