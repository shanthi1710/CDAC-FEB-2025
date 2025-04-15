package com.acts.containers.tester;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.acts.Course;
import com.acts.DataPrinter;
import com.acts.DataUtils;
import com.acts.Student;
import com.acts.ValidationUtils;


public class LinkedListTester2 {

	public static void main(String[] args) {

		//Create Linked list
		LinkedList<Student>  list = DataUtils.getStudentLinkedList();
		for(Student student : list) {
			System.out.println(student);
			}
		
		//Get First Get Last add First Add Last
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");

		list.addFirst(new Student(129, "Malhar", validDob1, validCourse1));
		list.addLast(new Student(130, "Ravi", validDob1, validCourse1));
		System.out.println("*********************");

		for(Student student : list) {
			System.out.println(student);
			}
		Student s1 = list.getFirst();
		System.out.println("First" +s1);
		Student s2 = list.getLast();
		System.out.println("Last" +s2);
		
		 list.removeFirst();
		 list.removeLast();
		 System.out.println("*********************");

			for(Student student : list) {
				System.out.println(student);
				}

	}

}
