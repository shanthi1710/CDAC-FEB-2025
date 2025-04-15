package com.acts.containers.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.acts.Address;
import com.acts.Course;
import com.acts.DataUtils;
import com.acts.Student;
import com.acts.ValidationUtils;
import com.acts.comparators.CourseComparator;
import com.acts.comparators.NameComparator;

public class StudentListTester {

	public static void main(String[] args) {
		List<Student> studentsList = DataUtils.getStudentList();
		try ( Scanner sc = new Scanner(System.in)) {

			int choice;
			do {

				System.out.println("**********Menu********");
				System.out.println("1. Add Student");
				System.out.println("2. Print Students");
				System.out.println("3. Sort Students by Roll No");
				System.out.println("4. Sort Students by name");
				System.out.println("5. Sort Students by Course");
				System.out.println("6. Find Student");
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
						Address address = new Address(line1, line2, pin);
						Student student = new Student(rollNo, name, validDob, courseEnum, address);
						studentsList.add(student);
						System.out.println("Student added successfully");
					}

				} break;
				case 2: {
					for(Student student : studentsList) {
					System.out.println(student);
					}
					//System.out.println(studentsList);
				} break;
				case 3: {
					//passing list and criteria will be used from Comparable
					Collections.sort(studentsList);
				} break;
				case 4: {
					//passing list and criteria using Comparator
					Collections.sort(studentsList, new NameComparator());
				}break;
				case 5: {
					//passing list and criteria using Comparator
					Collections.sort(studentsList, new CourseComparator());
				}break;
				case 6: {
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
					boolean found = studentsList.contains(student);
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
