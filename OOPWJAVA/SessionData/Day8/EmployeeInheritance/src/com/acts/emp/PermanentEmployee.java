package com.acts.emp;

import java.util.Date;

public class PermanentEmployee extends Employee {

	private double basicSal;
	private double incetive;
	private double specialAllowance;

	public PermanentEmployee() {
		super();
		System.out.println("PermanentEmployee::PermanentEmployee()");
	}

	/**
	 * @param basicSal
	 * @param incetive
	 * @param specialAllowance
	 */
	public PermanentEmployee(int empId, String name, String title,
			Date doj,double basicSal, double incetive,
			double specialAllowance) {
		super(empId,name, title , doj);
		this.basicSal = basicSal;
		this.incetive = incetive;
		this.specialAllowance = specialAllowance;
		System.out.println("PermanentEmployee::PermanentEmployee(Param)");
	}

	@Override
	public double calculateSalary() {
		System.out.println("perm salary");
		return basicSal + specialAllowance + incetive;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getIncetive() {
		return incetive;
	}

	public void setIncetive(double incetive) {
		this.incetive = incetive;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	@Override
	public String toString() {
		return super.toString() + "\n PermanentEmployee [basicSal=" + basicSal + ", incetive=" + incetive + ", specialAllowance="
				+ specialAllowance + "]";
	}
	
	
}
