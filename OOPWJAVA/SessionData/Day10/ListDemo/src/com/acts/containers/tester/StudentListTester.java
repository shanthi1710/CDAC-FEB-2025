package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.List;

import com.acts.Address;
import com.acts.Student;

public class StudentListTester {

	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<>();
		//Create Student
		Address address = new Address("Acts", "CDAC", "pashan", "433401");
		Student s = new Student(1234, "Ganesh", "DAC", address);
		
		Address address1 = new Address("Acts", "CDAC", "pashan", "433401");
		Student s1 = new Student(1235, "Dinesh", "DAC", address);
		
		Address address2 = new Address("Acts", "CDAC", "pashan", "433401");
		Student s2 = new Student(1234, "Jignesh", "DAC", address);
		
		Address address3 = new Address("Acts", "CDAC", "pashan", "433401");
		Student s3 = new Student(1234, "Prathmesh", "DAC", address);
		
		//Add student
		//print student
		studentsList.add(s);
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		
		System.out.println(studentsList);

	}

}
