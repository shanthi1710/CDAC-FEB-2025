package com.acts;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DataUtils {
	
	public static Set<Student> getStudentSet() {
		
		Set<Student> hashSet = new LinkedHashSet<>();
		
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		LocalDate validDob2 = ValidationUtils.validateDob("2001-01-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 = ValidationUtils.getValidCourse("DESD");

		hashSet.add(new Student(124, "Ganesh", validDob1, validCourse1));
		hashSet.add(new Student(123, "Dinesh", validDob1, validCourse2));
		hashSet.add(new Student(126, "Rupesh", validDob2, validCourse1));
		hashSet.add(new Student(125, "Deepali", validDob2, validCourse2));
		hashSet.add(new Student(127, "Rupali", validDob2, validCourse1));
		return hashSet;
		
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
