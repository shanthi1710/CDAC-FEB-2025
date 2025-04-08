package com.cdac.acts.pgdac;
import java.util.Scanner;
import com.cdac.acts.employeeClass;  

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employeeClass[] earr = new employeeClass[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nPlease enter employee name and salary:");
            String name = sc.next();
            double salary = sc.nextDouble();
            earr[i] = new employeeClass(name, salary);
            earr[i].printData();
        }

        sc.close();
    }
}
