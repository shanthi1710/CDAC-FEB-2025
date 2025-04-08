package com.cdac.acts;

class EmployeeClass {
	private long empNo;  
	private String empName;
	private double salary;
	private static long baseEmpNo = 100;

	public EmployeeClass() {
		this.empNo = baseEmpNo++;
		this.empName = "";
		this.salary = 1;
	}

	public EmployeeClass(int empNo, String empName, double salary) {
		this.empNo = baseEmpNo++;  
		this.empName = empName;
		this.salary = salary;
	}

	public void printData() {
		System.out.println("Employee [ "
				+ "EmpNo=" + empNo
				+ " EmpName=" + empName
				+ " Salary=" + salary
				+ " ]");
	}
}
