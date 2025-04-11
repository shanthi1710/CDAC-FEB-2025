package com.acts.emp.tester;

import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.PermanentEmployee;

public class AbstractTester {
	public static void main(String[] args) {
		Employee e1 = null;
		//Error //Employee e2 = new Employee();
		Employee e3 = new PermanentEmployee();
		Employee e4 = new ContractEmployee();
	}

}
