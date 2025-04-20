package com.acts;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DataUtils {
	
	public static Set<Student> getStudentSet() {
		
		Set<Student> treeSet = new TreeSet<>();
		
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		LocalDate validDob2 = ValidationUtils.validateDob("2001-01-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 = ValidationUtils.getValidCourse("DESD");

		treeSet.add(new Student(124, "Ganesh", validDob1, validCourse1));
		treeSet.add(new Student(123, "Dinesh", validDob1, validCourse2));
		treeSet.add(new Student(126, "Rupesh", validDob2, validCourse1));
		treeSet.add(new Student(125, "Deepali", validDob2, validCourse2));
		treeSet.add(new Student(127, "Rupali", validDob2, validCourse1));
		return treeSet;
		
	}
	
public static Student findByRollNo(Set<Student> set, Integer rollNo) {
		
		for(Student s : set) {
			if( rollNo.equals(s.getRollNo())) {
				return s;
			}
		}
		return null;
	}

}
