package com.acts.emp.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import com.acts.date.util.DateUtils;
import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.Payable;
import com.acts.emp.PermanentEmployee;

public class EmployeeMenuTester {
	public static void main(String[] args) throws ParseException {

		//Create menu driven program and  allow user to 
		//1. Register or add employee
		//2. for Printing emp with specific emp id
		//3. print all emp
		//4. Change name of emp with supplying empid
		//5. Print employee with same title

		Scanner scanner  = new Scanner(System.in);
		//Create an array of size 10
		Payable[] empArr = new Payable[10];
		int currentCount = 0;
		int choice = 0;
		do {

			System.out.println("1. Register or add Perm employee"
					+ "\n2. Register or add Contract employee"
					+ "\n3. for Printing emp with specific emp id"
					+ "\n4. print all emp"
					+ "\n5. Change name of emp with supplying empid"
					+ "\n6. Print employee with same title"
					+ "\n0. Exit");
			choice = scanner.nextInt();

			switch( choice){
			case 1 : {

				//TODO get data from user and pass in ctor
				Date date = DateUtils.getDate("07/12/2007", DateUtils.DD_MM_YYYY);
				empArr[currentCount++] = new PermanentEmployee("Praful", 
						"SW_ENGG", date, 13000,1000, 1000);


				System.out.println("Employee added successfuly");
			} break;
			case 2 : {
				//TODO get data from user and pass in ctor
				Date date = DateUtils.getDate("07/12/2007", DateUtils.DD_MM_YYYY);
				empArr[currentCount++] = new ContractEmployee("Praful", 
						"TECH_LEAD", date, 1300,22);

			} break;

			case 3 : {
				System.out.println("Please ennter emp id");
				int searchEmpId = scanner.nextInt();
				for (int i = 0; i < currentCount ; i++ ) {
					
					if( empArr[i]  instanceof Employee) {
						Employee employee = (Employee) empArr[i];
						if( searchEmpId == employee.getEmpId()) {
							System.out.println(empArr[i]);
						}
					}
				}

			} break;
			case 4 : {
				System.out.println(Arrays.toString(empArr));

			} break;
			case 0 : {
				System.exit(0);
			}
			}

		} while(choice != 0);



		//		
		System.out.println("Please enter date in DD/MM/YYYY format");
		String strDate = scanner.next();
		Date date = DateUtils.getDate(strDate, DateUtils.DD_MM_YYYY);
		//		ContractEmployee ce1 = new ContractEmployee("Deepak", 
		//				"CEO", date,6000, 22);
		//		
		//		System.out.println(ce1);
		//		System.out.println(ce1.calculateSalary());


		//Parent class ref is referring to child class object
		//		Employee empRef = ce1;
		//		
		//		System.out.println(empRef.calculateSalary());
		//		Employee empRef1 =  new ContractEmployee("Nishant", 
		//				"Developer", date,6000, 22);
		//		System.out.println(empRef1.calculateSalary());

		Employee empRef2 =  null;
		//empRef2.calculateSalary();

		empRef2 = new PermanentEmployee("Nisha", 
				"Developer", date, 25000,1000, 1000);
		System.out.println(empRef2.calculateSalary());

		empRef2 =  new ContractEmployee("Deepak", 
				"CEO", date,6000, 22);
		System.out.println(empRef2.calculateSalary());


		scanner.close();
	}

}
