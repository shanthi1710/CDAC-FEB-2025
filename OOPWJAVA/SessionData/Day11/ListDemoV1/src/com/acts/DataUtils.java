package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {
	
	public static List<Student> getStudentList() {
		
		List<Student> list = new ArrayList<>();
		
		LocalDate validDob1 = ValidationUtils.validateDob("2000-01-01");
		LocalDate validDob2 = ValidationUtils.validateDob("2001-01-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 = ValidationUtils.getValidCourse("DESD");
		Address address1 = new Address("Pashan", "Pune", "411007");
		Address address2 = new Address("Pimpri", "Pune", "411061");
		
		list.add(new Student(124, "Ganesh", validDob1, validCourse1, address1));
		list.add(new Student(123, "Dinesh", validDob1, validCourse2, address1));
		list.add(new Student(126, "Rupesh", validDob2, validCourse1, address1));
		list.add(new Student(125, "Deepali", validDob2, validCourse2, address2));
		list.add(new Student(127, "Rupali", validDob2, validCourse1, address2));
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
