package com.acts.emp.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import com.acts.date.util.DateUtils;
import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.NonBillableManager;
import com.acts.emp.PermanentEmployee;
import com.cdac.acts.benefits.Payable;

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
		Employee[] empArr = new Employee[10];
		int currentCount = 0;
		int choice = 0;
		do {

			System.out.println("1. Register or add Perm employee"
					+ "\n2. Register or add Contract employee"
					+ "\n3. Register or add Non Billable Manager"
					+ "\n4. for Printing emp with specific emp id"
					+ "\n5. print all emp"
					+ "\n6. Change name of emp with supplying empid"
					+ "\n7. Print employee with same title"
					+ "\n0. Exit");
			choice = scanner.nextInt();

			switch( choice){
			case 1 : {

				//TODO get data from user and pass in ctor
				Date date = DateUtils.getDate("07/12/2007", DateUtils.DD_MM_YYYY);
				empArr[currentCount++] = new PermanentEmployee("Rajesh", 
						"SW_ENGG", date, 13000,1000, 1000);


				System.out.println("Employee added successfuly");
			} break;
			case 2 : {
				//TODO get data from user and pass in ctor
				Date date = DateUtils.getDate("07/12/2007", DateUtils.DD_MM_YYYY);
				empArr[currentCount++] = new ContractEmployee("Ganesh", 
						"TECH_LEAD", date, 1300,22);

			} break;
			
			case 3 : {
				//TODO get data from user and pass in ctor
				Date date = DateUtils.getDate("07/12/2007", DateUtils.DD_MM_YYYY);
				empArr[currentCount++] = new NonBillableManager("Deepak", 
						"TECH_LEAD", date, "project team");

			} break;

			case 4 : {
				System.out.println("Please enter emp id");
				int searchEmpId = scanner.nextInt();
				for (int i = 0; i < currentCount ; i++ ) {
					if( searchEmpId == empArr[i].getEmpId()) {
						System.out.println(empArr[i]);
						
						if(empArr[i] instanceof Payable) {
							Payable pemp = (Payable) empArr[i];
							System.out.println("Salary=" + pemp.calculateSalary());
							System.out.println("Bonus=" + pemp.getBonus());
						}
					}
				}

			} break;
			case 5 : {
				System.out.println(Arrays.toString(empArr));

			} break;
			case 0 : {
				System.exit(0);
			}
			}

		} while(choice != 0);
		scanner.close();
	}

}
