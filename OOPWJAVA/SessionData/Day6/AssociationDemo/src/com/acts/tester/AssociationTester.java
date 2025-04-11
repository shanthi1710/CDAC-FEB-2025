package com.acts.tester;

import com.acts.Address;
import com.acts.Student;

public class AssociationTester {

	public static void main(String[] args) {

		Address address = new Address("401", "lane2", "Pashan", "411000");
		System.out.println(address.getString());
		
		
		Student student = new Student(1, "Shubham", "DAC", address);
		System.out.println(student.getString());
		
		Student student1 = new Student();
		student1.setRollNo(2);
		student1.setCourse("DAC");
		student1.setName("Deepak");
		student1.setAddress(address);
		
		System.out.println(student1.getString());
		
	}

}
