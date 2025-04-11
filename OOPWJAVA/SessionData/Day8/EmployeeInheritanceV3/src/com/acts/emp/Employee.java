package com.acts.emp;

import java.util.Date;

import com.acts.date.util.DateUtils;

public abstract class Employee implements Payable{
	private int empId;
	private String name;
	private TitleEnum title;
	private Date doj;
	
	private static int EMP_ID_START = 100;

	public Employee() {
		this.empId = EMP_ID_START++;
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
		this.empId = EMP_ID_START++;
		this.name = name;
		//SW_ENGG
		this.title = TitleEnum.valueOf(title);
		this.doj = doj;
	}

	public abstract double calculateSalary();
	
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
		//title.toString
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
	
	public static int getCurrentEmpId() {
		return EMP_ID_START;
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
