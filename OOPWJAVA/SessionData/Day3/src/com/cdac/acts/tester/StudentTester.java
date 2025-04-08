package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.Student;
public class StudentTester {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		/*Student s = new Student();
		Student s1 = s;
		s.printData();		
		s1.printData();	
		System.out.println(Student.getBasePrn());
		Student s2 = new Student("Bunny", 100000.00);	
		s2.printData();*/
		
		
		
		/*System.out.println("\n Please enter name and fees");
		String name = sc.next();
		double fees = sc.nextDouble();
		Student s = new Student(name, fees);
		s.printData();*/
		Student []sarr;
		//sarr is ref
		//sarr is ref
		sarr = new Student[5];
		for( int i =0; i< 5 ; i++) {
		System.out.println("\n Please enter name and fees");
		String name = sc.next();
		double fees = sc.nextDouble();
		sarr[i] = new Student(name, fees);
		sarr[i].printData();
		}
		
		sc.close();
	}
}

