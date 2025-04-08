package com.cdac.acts;

public class employee {
	private int empId;
	private String name;
	private double salary;
	private static int baseEmpId = 1001;
	
	public employee(){
		super();
		this.empId = baseEmpId++;
		this.name = "";
		this.salary = 0;
	}
	
	public employee(String name, double salary) {
		super();
		this.empId = baseEmpId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
