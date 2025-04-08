package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.studentClass;

public class studentMain {
	
	private static studentClass arr[] = new studentClass[100];
	private static Scanner sc = new Scanner(System.in);
	private static int cnt=0;
	public static void main(String[] args) {
		 
		int choice;
		do {
			System.out.println("Enter your choice:->");
			System.out.println("Enter your choice");
			System.out.println("1. Add Student");
			System.out.println("2. Print Student by rollNo");
			System.out.println("3. Print All students Sorted by Marks");
			System.out.println("0. exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				addStudent();
				break;
			}
			case 2:{
				searchRollNO();
				break;
			}
			case 3:{
				sortStudent();
				break;
			}
			case 0:{
				System.out.println("Exit...");
				break;
			}
			default:{
				System.out.println("Invalid Choice...");
			}
			}
		}while(choice !=0);
	}
	private static void addStudent() {
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter Marks ");
		int marks = sc.nextInt();
		arr[cnt++]=new studentClass(name,marks);
		System.out.println("Student data added successful;y!");
	}
	private static void searchRollNO() {
		System.out.println("Enter roll no");
		int rn = sc.nextInt();
		boolean found = false;
		
		for(int i=0;i<cnt;i++){
			if(rn == arr[i].getRollNo()) {
				System.out.println(arr[i]);
				found =true;
			}
		}
		if(found != true) {
			System.out.println("The roll number not found..");
		}
	}
	private static void sortStudent() {
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<cnt-i-1;j++) {
				if(arr[j].getMarks()<arr[j+1].getMarks()) {
					studentClass temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i = 0; i < cnt; i++) {
			System.out.println(arr[i]);
		}
	}
}

