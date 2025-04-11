package com.cdac.acts.tester;
import com.cdac.acts.Address;
import com.cdac.acts.CourseEnum;
import com.cdac.acts.student;
import java.time.LocalDate;
import java.util.Scanner;

public class studentTester {

	private static Scanner sc = new Scanner(System.in);
	private static student[] s = new student[10];
	private static int cnt = 0;
	
	public static void main(String[] args) {
		/*
		Address address = new Address("Pune", "Maharashtra", "416-410");
		student student1 = new student(1,"Samru",CourseEnum.PG_DAC, address,LocalDate.of(2000,5,15));
		System.out.println(student1.getString());
		*/
		 int choice;
		 do {
			 	System.out.println("\n1. Add Student \n2. Sort student basis on Date of Birth \n3. Display student \n Enter your choice : ");
			 	choice = sc.nextInt();
			 	switch(choice) {
			 		
			 		case 1:{
			 			addStudent();
			 			break;
			 		}
			 	
			 		case 2: {
			 			sortStudentByDOB();
			 			break;
			 		}
			 			
			 		case 3: {
			 			displayStudent();
			 			break;
			 		}
			 			
			 		default :
			 			System.out.println("Invalid choice...!");
			 		}
		 }while(choice != 3);
		
	}
	
	public static void addStudent() {
		if(cnt>=s.length) {
			System.out.println("Student array is full!");
			return;
		}
		System.out.println("\n=== Add New Student ===");
		
		System.out.println("Enter roll number:->");
		int rollNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Name: ");
        String name = sc.nextLine();
		
        System.out.println("Available Courses:");
        
        for(CourseEnum c:CourseEnum.values()) {
        	System.out.println(c.name()+" - "+c.getValue());
        }
        System.out.print("Enter Course: ");
        String courseInput = sc.nextLine().toUpperCase();
        CourseEnum c = CourseEnum.valueOf(courseInput);
        
        System.out.println("\nEnter Address Details:");
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Pin Code: ");
        String pinCode = sc.nextLine();
        
        Address address = new Address(city,state,pinCode);
        
        System.out.println("\nEnter  Date of birth (YYYY-MM-DD)");
        String dob = sc.nextLine();
        LocalDate dob1 = LocalDate.parse(dob);
        
        s[cnt++] = new student(rollNo, name, c, address, dob1);
	}
	
	
	public static void sortStudentByDOB() {
		if(cnt ==0) {
			System.out.println("No Student to dispaly!");
			return;
		}
		for(int i=0;i<cnt-1;i++) {
			for(int j=0;j<cnt - i-1;j++) {
				if(s[j].getDateOfBirth().isAfter(s[j+1].getDateOfBirth())) {
					 	student temp = s[j];
		                s[j] = s[j + 1];
		                s[j + 1] = temp;
				}
			}
		}
		System.out.println("Students sorted by Date of Birth (ascending)!");
	}
	
	public static void displayStudent() {
		if(cnt ==0) {
			System.out.println("No Student to dispaly!");
			return;
		}
		System.out.println("\\n=== All Students ===");
		for(int i=0;i<cnt;i++) {
			System.out.println(s[i].getString());
		}
	}
	
}


