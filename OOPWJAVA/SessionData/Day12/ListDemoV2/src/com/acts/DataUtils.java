package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataUtils {
	
	public static List<Student> getStudentList() {
		
		List<Student> list = new LinkedList<>();
		
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		LocalDate validDob2 = ValidationUtils.validateDob("2001-01-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 = ValidationUtils.getValidCourse("DESD");

		list.add(new Student(124, "Ganesh", validDob1, validCourse1));
		list.add(new Student(123, "Dinesh", validDob1, validCourse2));
		list.add(new Student(126, "Rupesh", validDob2, validCourse1));
		list.add(new Student(125, "Deepali", validDob2, validCourse2));
		list.add(new Student(127, "Rupali", validDob2, validCourse1));
		return list;
		
	}
	
	
public static LinkedList<Student> getStudentLinkedList() {
		
		LinkedList<Student> list = new LinkedList<>();
		
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		LocalDate validDob2 = ValidationUtils.validateDob("2001-01-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 = ValidationUtils.getValidCourse("DESD");

		list.add(new Student(124, "Ganesh", validDob1, validCourse1));
		list.add(new Student(123, "Dinesh", validDob1, validCourse2));
		list.add(new Student(126, "Rupesh", validDob2, validCourse1));
		list.add(new Student(125, "Deepali", validDob2, validCourse2));
		list.add(new Student(127, "Rupali", validDob2, validCourse1));
		return list;
		
	}
	
public static Student findByRollNo(List<Student> list, Integer rollNo) {
		
		for(Student s : list) {
			if( rollNo.equals(s.getRollNo())) {
				return s;
			}
		}
		return null;
	}

}
