package com.acts.containers.tester;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.acts.Course;
import com.acts.Student;
import com.acts.ValidationUtils;

public class LinkedHashSetStudentTester {

	public static void main(String[] args) {
		
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		LocalDate validDob2 = ValidationUtils.validateDob("2001-01-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 = ValidationUtils.getValidCourse("DESD");
		
		//Create HashSet
		Set<Student> linkedHashSet = new LinkedHashSet<>();
		//Add elements
		
		Student s1 = new Student(124, "Ganesh", validDob1, validCourse1);
		Student s2 = new Student(124, "Ganesh", validDob1, validCourse2);
		Student s3 = new Student(123, "Dinesh", validDob1, validCourse2);
		Student s4 = new Student(126, "Rupesh", validDob2, validCourse1);
		Student s5 = new Student(125, "Deepali", validDob2, validCourse2);

		
		System.out.println("s1 hash =" + s1.hashCode());
		linkedHashSet.add(s1);
		System.out.println("s2 hash =" + s2.hashCode());
		linkedHashSet.add(s2);
		System.out.println("s3 hash =" + s3.hashCode());
		linkedHashSet.add(s3);
		System.out.println("s4 hash =" + s4.hashCode());
		linkedHashSet.add(s4);
		System.out.println("s5 hash =" + s5.hashCode());
		linkedHashSet.add(s5);
		
		System.out.println("*******Advanced for***********");
		for(Student student : linkedHashSet) {
			System.out.println(student); 
		}
	}

}
