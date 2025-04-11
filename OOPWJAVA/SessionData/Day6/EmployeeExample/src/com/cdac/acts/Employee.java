package com.cdac.acts;

public class Employee {
	private int empId;
	private String name;
	private String dept;
	private double salary;
	
	private static int idGenerator = 1000;
	
	public Employee(){
		this.empId = idGenerator++;
		this.name = "";
		this.dept = "";
		this.salary = 0.0;
	}
	
	public Employee(String name, String dept, double salary){
		this.empId = idGenerator++;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	@Override
	public String toString() {
		return "Employee[empId=" + empId 
				+ " name=" + name + " dept=" + dept
				+ " salary=" + salary + "]";
	}
	
}
