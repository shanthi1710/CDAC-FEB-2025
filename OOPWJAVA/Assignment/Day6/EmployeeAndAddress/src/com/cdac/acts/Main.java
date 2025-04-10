package com.cdac.acts;
import com.cdac.acts.entities.Address;
import com.cdac.acts.entities.Employee;

public class Main {

	public static void main(String[] args) {
		Address empAddress = new Address("cdac it park","pune","MH","422003");
		
		Employee emp = new Employee("Shanthinath Shedbale",10002,empAddress);
		
		System.out.println(emp);
	}

}
