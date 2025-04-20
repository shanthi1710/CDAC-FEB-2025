package com.acts.emp.tester;

import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.PermanentEmployee;
import com.acts.util.DataUtils;
import com.acts.util.DateUtils;

public class EmployeeTreeMapTester {
	public static void main(String[] args) throws ParseException {

		//Create menu driven program and  allow user to 
		//1. Register or add employee
		//2. for Printing emp with specific emp id
		//3. print all emp
		//4. Change name of emp with supplying empid
		//5. Print employee with same title

		Scanner scanner  = new Scanner(System.in);
		Map<Integer, Employee> map = DataUtils.getTreeMap();
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
				Employee e = new PermanentEmployee("Rajesh", 
						"SW_ENGG", date, 13000,1000, 1000);
				map.put(e.getEmpId(), e);

				System.out.println("Employee added successfuly");
			} break;
			case 2 : {
				//TODO get data from user and pass in ctor
				Date date = DateUtils.getDate("07/12/2007", DateUtils.DD_MM_YYYY);
				Employee e = new ContractEmployee("Bharti", 
						"TECH_LEAD", date, 1300,22);
				map.put(e.getEmpId(), e);

			} break;

			case 3 : {
				System.out.println("Please enter emp id:");
				int empId = scanner.nextInt();
				Employee e = map.get(empId);
				System.out.println(e);

			} break;
			case 4 : {
				System.out.println(map);

			} break;
			case 5 : {
				System.out.println("Please enter emp id:");
				int empId = scanner.nextInt();
				System.out.println("Please enter name:");
				String name = scanner.next();
				Employee e = map.get(empId);
				e.setName(name);
				System.out.println(e);

			} break;
			case 6 : {
				System.out.println("Please enter title:");
				String title = scanner.next();
				Collection<Employee> values = map.values();
				for(Employee emp : values) {
					if( emp.getTitle().equalsIgnoreCase(title)) {
						System.out.println("Empployee=" + emp);
					}
				}

			} break;
			case 0 : {
				System.exit(0);
			}
			}

		} while(choice != 0);


		scanner.close();
	}

}
