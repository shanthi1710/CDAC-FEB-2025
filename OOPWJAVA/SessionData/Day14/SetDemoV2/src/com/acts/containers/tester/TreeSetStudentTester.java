package com.acts.containers.tester;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.acts.Course;
import com.acts.Student;
import com.acts.ValidationUtils;

public class TreeSetStudentTester {

	public static void main(String[] args) {
		
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		LocalDate validDob2 = ValidationUtils.validateDob("2001-01-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 = ValidationUtils.getValidCourse("DESD");
		
		//Create TreeSet
		Set<Student> hashSet = new HashSet<>();
		//Add elements
		Student s1 = new Student(124, "Ganesh", validDob1, validCourse1);
		Student s2 = new Student(124, "Ganesh", validDob1, validCourse2);
		Student s3 = new Student(123, "Dinesh", validDob1, validCourse2);
		Student s4 = new Student(126, "Rupesh", validDob2, validCourse1);
		Student s5 = new Student(125, "Deepali", validDob2, validCourse2);

		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		hashSet.add(s4);
		hashSet.add(s5);
		
		System.out.println("*******Advanced for***********");
		for(Student student : hashSet) {
			System.out.println(student); 
		}
		
		
		Set<Student> sortedSet = new TreeSet<Student>(
				new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}
		});
		
		sortedSet.addAll(hashSet);
		
		System.out.println("*******Advanced for***********");
		for(Student student : sortedSet) {
			System.out.println(student); 
		}
	}

}
