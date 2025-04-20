package com.acts.containers.tester;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import com.acts.Course;
import com.acts.DataUtils;
import com.acts.Student;
import com.acts.ValidationUtils;

public class LinkedStudentHashSetTester {

	public static void main(String[] args) {
		Set<Student> linkedHashSet = DataUtils.getStudentSet();
		try ( Scanner sc = new Scanner(System.in)) {

			int choice;
			do {

				System.out.println("**********Menu********");
				System.out.println("1. Add Student");
				System.out.println("2. Print Students");
				System.out.println("7. Find Student");
				System.out.println("0. Exit");
				
				System.out.println("Please enter your choice");
				
				choice = sc.nextInt();

				switch(choice) {
				case 1: {
					//Add Student in list
					//Get student data from user
					System.out.println("Please enter Roll No");
					int rollNo = sc.nextInt();
					System.out.println("Please enter name");
					String name = sc.next();
					System.out.println("Please enter dob in yyyy-mm-dd format");
					String dob = sc.next();
					System.out.println("Please enter course");
					String course = sc.next();

					//Get Address data from user
					System.out.println("Please enter line1");
					String line1 = sc.next();
					System.out.println("Please enter line2");
					String line2 = sc.next();
					System.out.println("Please enter pin");
					String pin = sc.next();


					LocalDate validDob = ValidationUtils.validateDob(dob);
					Course courseEnum = ValidationUtils.getValidCourse(course);

					if( null != validDob && null != courseEnum){
						Student student = new Student(rollNo, name, validDob, courseEnum);
						linkedHashSet.add(student);
						System.out.println("Student added successfully");
					}

				} break;
				case 2: {
					for(Student student : linkedHashSet) {
					System.out.println(student);
					}
				} break;
				case 7: {
					//Find student by RNo and Update Name
					System.out.println("Please enter Roll No");
					int rollNo = sc.nextInt();
//					Student s1 = DataUtils.findByRollNo(studentsList, rollNo);
//					System.out.println("Student Found please enter name to be updated");
//					String name = sc.next();
//					s1.setName(name);
					//Student is present or not
					
					Student student = new Student();
					student.setRollNo(rollNo);
					//Contains method internally call equals method
					boolean found = linkedHashSet.contains(student);
					System.out.println("Student found :" + found);
				}break;
				case 0: {System.exit(0);} break;
				} 

			} while(choice != 0);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
