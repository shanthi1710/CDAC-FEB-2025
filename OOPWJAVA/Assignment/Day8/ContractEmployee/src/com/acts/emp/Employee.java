package com.acts.emp;
import java.util.Date;
import com.acts.date.DateUtils;

public abstract class Employee {
	
	private int empId;
	private String name;
	private TitleEnum title;
	private Date doj;
	private static int baseEmpId = 1;
	
	public Employee() {
		this.empId=baseEmpId++;
		System.out.println("Employee:Employee");
	}
	public Employee(String name, String title, Date doj) {
		super();
		this.empId = baseEmpId++;
		this.name = name;
		this.title = TitleEnum.valueOf(title);
		this.doj = doj;
	}
	
	public abstract double calculateSalary();
	@Override
	public String toString() {
		String strDoj = DateUtils.getFormattedDate(doj,DateUtils.DD_MM_YYYY);
		return "Employee [empId=" + empId + ", name=" + name + ", title=" + title + ", doj=" + strDoj + "]";
	}

}
