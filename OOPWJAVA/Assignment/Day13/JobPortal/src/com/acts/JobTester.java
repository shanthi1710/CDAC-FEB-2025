package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JobTester {
	private static Scanner sc = new Scanner(System.in);
	private static Set<JobSeeker> jobPortal = new HashSet<JobSeeker>();

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("*******MENU*******");
			System.out.println("1.JobSeeker registration");
			System.out.println("2.Update email");
			System.out.println("3.Display all job seeker by their degree");
			System.out.println("4.Sort JobSeeker details as per email");
			System.out.println("5.Sort JobSeeker details as per dob");
			System.out.println("6.Sort JobSeeker details as per graduationDate");
			System.out.println("0.Exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: regJob(); break;
			case 2: updateEmail(); break;
			case 3: displayDegree(); break;
			case 4: sortMail(); break;
			case 5: sortDob(); break;
			case 6: sortGrad(); break;
			case 0: System.out.println("Exit"); break;
			default: System.out.println("Invalid input!");
			}
		} while(choice != 0);
		

	}

	private static void sortDob() {
		List<JobSeeker> sortedList = new ArrayList<>(jobPortal);
		Collections.sort(sortedList, new DobComparator());
		for(JobSeeker a: sortedList) {
			System.out.println(a);
		}
	}

	private static void sortGrad() {
		List<JobSeeker> sortedList = new ArrayList<>(jobPortal);
		Collections.sort(sortedList, new GradComparator());
		for(JobSeeker a: sortedList) {
			System.out.println(a);
		}
	}

	private static void sortMail() {
		List<JobSeeker> sortedList = new ArrayList<>(jobPortal);
		Collections.sort(sortedList);
		for(JobSeeker a: sortedList) {
			System.out.println(a);
		}
	}

	private static void displayDegree() {
	    System.out.println("Enter the degree (e.g., CS, ECNC, IT): ");
	    String degreeInput = sc.next().toUpperCase();

	    try {
	        DegreeEnum selectedDegree = DegreeEnum.valueOf(degreeInput);

	        boolean found = false;
	        for (JobSeeker a : jobPortal) {
	            if (a.getDegree() == selectedDegree) {
	                System.out.println(a);
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No job seekers found with degree: " + selectedDegree);
	        }

	    } catch (IllegalArgumentException e) {
	        System.out.println("Invalid degree entered.");
	    }
	}


	private static void updateEmail() {
		System.out.print("Enter your regirstration id: ");
		Integer id = sc.nextInt();
		Boolean found = false;
		for(JobSeeker j: jobPortal) {
			if(j.getRegistrationId() == id) {
				System.out.print("Enter new email id: ");
				String str = sc.next();
				j.setEmail(str);
			}
		}
		if(!found) {
			System.out.println("Account not found!");
		}
		
	}

	private static void regJob() {
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Email: ");
		String email = sc.nextLine();
		System.out.print("Enter Password: ");
		String password = sc.nextLine();
		System.out.print("Enter Date of birth: ");
		String dateOfBirth = sc.nextLine();
		LocalDate dob = LocalDate.parse(dateOfBirth);
		dob = ValidationUtils.validateDate(dob);
			System.out.print("Enter Aadhar ID: ");
			String aadharId = sc.nextLine();
			System.out.print("Enter Phone No: ");
			String phone = sc.nextLine();
			phone = ValidationUtils.validatePhone(phone);
				System.out.print("Enter Graduation Date: ");
				String date = sc.nextLine();
				LocalDate grad = LocalDate.parse(date);
				grad = ValidationUtils.validateDate(grad);
					System.out.println("Enter the degree (e.g., CS, ECNC, IT): ");
					String deg = sc.next().toUpperCase();
					DegreeEnum degree = DegreeEnum.valueOf(deg);
					System.out.println("The Graduation date is invalid!");

		if(dob != null && phone != null && grad != null) {
		jobPortal.add(new JobSeeker(name, email, password, dob, aadharId, phone, grad));
		} else {
			System.out.println("Invalid Input!");
		}
	}

}
