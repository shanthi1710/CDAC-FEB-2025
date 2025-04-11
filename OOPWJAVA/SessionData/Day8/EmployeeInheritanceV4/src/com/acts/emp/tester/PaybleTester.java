package com.acts.emp.tester;

import com.acts.emp.ContractEmployee;
import com.acts.emp.PermanentEmployee;
import com.cdac.acts.benefits.Payable;

public class PaybleTester {
	public static void main(String[] args) {
		Payable payable = null;
		Payable permEmpPayable = new PermanentEmployee();
		System.out.println(permEmpPayable.calculateSalary());
		Payable contractPayable = new ContractEmployee();
		System.out.println(contractPayable.calculateSalary());
	}
}
