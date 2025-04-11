package com.acts.emp.tester;

import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.PermanentEmployee;

public class StaticTester {

	public static void main(String[] args) {
		System.out.println(Employee.getCurrentEmpId());
		System.out.println(PermanentEmployee.getCurrentEmpId());
		System.out.println(ContractEmployee.getCurrentEmpId());

	}

}
