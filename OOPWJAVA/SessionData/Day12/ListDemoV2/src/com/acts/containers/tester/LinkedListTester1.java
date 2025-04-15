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


public class LinkedListTester1 {

	public static void main(String[] args) {

		//Create Linked list
		LinkedList<Student>  linkedList = DataUtils.getStudentLinkedList();
		for(Student student : linkedList) {
			System.out.println(student);
			}
		
		//Push Pop
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");
		Course validCourse1 = ValidationUtils.getValidCourse("DAC");

		linkedList.push(new Student(129, "Malhar", validDob1, validCourse1));
		linkedList.push(new Student(130, "Ravi", validDob1, validCourse1));
		System.out.println("*********************");

		for(Student student : linkedList) {
			System.out.println(student);
			}
		Student s = linkedList.pop();
		linkedList.push(s);
		linkedList.pop();
		linkedList.pop();
		linkedList.pop();
		linkedList.pop();
		linkedList.pop();
		linkedList.pop();
		linkedList.pop();
		linkedList.pop();
		System.out.println("Popped" +s);

	}

}
