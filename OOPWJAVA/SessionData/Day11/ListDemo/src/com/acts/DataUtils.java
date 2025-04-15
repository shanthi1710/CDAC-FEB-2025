package com.acts;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {
	
	public static List<Student> getStudentList() {
		List<Student> list = new ArrayList<>();
		Address address1 = new Address("ACTS","Pashan", "Pune", "411007");
		Address address2 = new Address("ACTS", "Pimpri", "Pune", "411061");
		Student s1 = new Student(124, "Ganesh", "DAC", address1);
		list.add(s1);
		list.add(new Student(123, "Dinesh", "DAC", address1));
		list.add(new Student(126, "Rupesh", "DESD", address1));
		list.add(new Student(125, "Deepali", "DESD", address2));
		list.add(new Student(127, "Rupali", "DESD", address2));
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
