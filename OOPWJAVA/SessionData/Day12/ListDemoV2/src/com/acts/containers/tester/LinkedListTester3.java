package com.acts.containers.tester;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.acts.Course;
import com.acts.DataPrinter;
import com.acts.DataUtils;
import com.acts.Student;
import com.acts.ValidationUtils;

//04/10/2024
public class LinkedListTester3 {

	public static void main(String[] args) {

		//Create Linked list
		LinkedList<Student>  list = DataUtils.getStudentLinkedList();
		for(Student student : list) {
			System.out.println(student);
		}

		Student s1 = list.peek();
		System.out.println("Peek" +s1);
		for(Student student : list) {
			System.out.println(student);
		}


		Student s2 = list.poll();
		System.out.println("Poll" +s2);
		for(Student student : list) {
			System.out.println(student);
		}


	}

}
