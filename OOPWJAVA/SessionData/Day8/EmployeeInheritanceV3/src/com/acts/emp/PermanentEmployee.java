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
	public PermanentEmployee(String name, String title,
			Date doj,double basicSal, double incetive,
			double specialAllowance) {
		super(name, title , doj);
		this.basicSal = basicSal;
		this.incetive = incetive;
		this.specialAllowance = specialAllowance;
		System.out.println("PermanentEmployee::PermanentEmployee(Param)");
	}

	
	//Extending behavior of parent by overriding method
	@Override
	public double calculateSalary() {
		System.out.println("perm salary");
		return basicSal + specialAllowance + incetive;
	}
	//Specific to Perm EMP but not present in Emp
	public double getBonus() {
		System.out.println("perm bonus");
		return (10 * basicSal)/100;
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
	
	public static int getCurrentEmpId() {
		//return EMP_ID_START;
		return 200;
	}

	@Override
	public String toString() {
		return  "PermanentEmployee [" + super.toString() + " basicSal=" + basicSal + ", incetive=" + incetive + ", specialAllowance="
				+ specialAllowance + "]";
	}
	
	
}
