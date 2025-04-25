package com.acts.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.acts.Patient;
import com.acts.InPatient;
import com.acts.OutPatient;
import com.acts.EmergencyPatient;
import com.acts.patientEnum.PatientType;
import com.acts.exception.*;
public class Main {
	 @FunctionalInterface
	    interface BillCalculator {
	        double calculateBill(Patient patient);
	    }
	private static List<Patient> patients = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws PatientException {
		int choice = 0;
		//Menu driven program
		do {
			try {
				Display();
                choice = sc.nextInt();
                sc.nextLine(); 
                
                switch (choice) {
                    case 1:
                        addPatient();
                        break;
                    case 2:
                        dischargePatient();
                        break;
                    case 3:
                        displayAllPatients();
                        break;
                    case 4:
                        filterPatientsByDepartment();
                        break;
                    case 5:
                        generateBillingSummary();
                        break;
                    case 6:
                        System.exit(0);
                        sc.close();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();  
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
			
		}while(choice !=6);

	}
	
	 
	//filtered data based on  department
	private static void filterPatientsByDepartment() {
		 
		System.out.print("\nEnter Department to filter: ");
        String department = sc.nextLine();
        
        List<Patient> filteredPatients = patients.stream()
            .filter(p -> p.getDepartment().equalsIgnoreCase(department))
            .sorted(Comparator.comparing(Patient::getPatientName)
                   .thenComparingInt(Patient::getPatientAge))
            .collect(Collectors.toList());
            
        if (filteredPatients.isEmpty()) {
            System.out.println("No patients found in " + department + " department.");
        } else {
            System.out.println("\nPatients in " + department + " department (Sorted by Name then Age):");
            filteredPatients.forEach(System.out::println);
        }
	}

	//descahege to patient
	private static void dischargePatient() throws PatientException {
		displayAllPatients();
		System.out.print("\nEnter Patient ID to discharge: ");
	    int patientId;
	    try {
	        patientId = sc.nextInt();
	        sc.nextLine();  
	    } catch (InputMismatchException e) {
	        sc.nextLine(); 
	        throw new PatientException("Patient ID must be a number.");
	    }
	    
	    Optional<Patient> patientOpt = patients.stream()
	        .filter(p -> p.getPatientId() == patientId)
	        .findFirst();
	        
	    if (patientOpt.isEmpty()) {
	        throw new PatientException("Patient with ID " + patientId + " not found.");
	    }
		
	}
	
	//add new patient
	private static void addPatient() throws PatientException {
		System.out.println("\nAdd New Patient");
        System.out.print("Enter Patient Name: ");
        String patientName = sc.nextLine();
        
        System.out.print("Enter Patient Age: ");
        int patientAge = sc.nextInt();
        sc .nextLine();  
        
        LocalDate admissionDate = LocalDate.now();
        System.out.println("Admission Date set to: " + admissionDate);
        
        System.out.print("Enter Department (e.g., Cardiology, Neurology): ");
        String department = sc .nextLine();
        
        
        System.out.println("Select Patient Type:");
        for (PatientType type : PatientType.values()) {
            System.out.println((type.ordinal() + 1) + ". " + type);
        }
        System.out.print("Enter choice: ");
        int typeChoice = sc .nextInt();
        sc .nextLine();  
        
        if (typeChoice < 1 || typeChoice > PatientType.values().length) {
            throw new PatientException("Invalid patient type selected.");
        }
        PatientType patientType = PatientType.values()[typeChoice - 1];
        
         
        Patient patient;
        switch (patientType) {
            case IN_PATIENT:
                System.out.print("Enter Room Number: ");
                String roomNumber = sc .nextLine();
                patient = new InPatient(patientName, patientAge, admissionDate, department, roomNumber);
                break;
            case OUT_PATIENT:
                System.out.print("Enter Number of Visits: ");
                int numberOfVisits = sc.nextInt();
                sc .nextLine();  
                patient = new OutPatient( patientName, patientAge, admissionDate, department, numberOfVisits);
                break;
            case EMERGENCY:
                System.out.print("Enter Emergency Type: ");
                String emergencyType = sc.nextLine();
                patient = new EmergencyPatient(  patientName, patientAge, admissionDate, department, emergencyType);
                break;
            default:
                throw new PatientException("Invalid patient type.");
        }
        
        patients.add(patient);
        System.out.println("Patient added successfully!");
	}
	
	//display all patient
	private static void displayAllPatients() {
		 if (patients.isEmpty()) {
	            System.out.println("\nNo patients in the system.");
	            return;
	        }
	        
	        System.out.println("\nAll Patients (Sorted by Admission Date):");
	        patients.stream()
	            .sorted()
	            .forEach(System.out::println);
		
	}
	
	//menu function display
	private static void Display() {
		 System.out.println("\nHospital Patient Management System");
         System.out.println("1. Add a new patient");
         System.out.println("2. Discharge a patient");
         System.out.println("3. Display all patients");
         System.out.println("4. Filter patients by department");
         System.out.println("5. Generate billing summary");
         System.out.println("6. Exit");
         
	}
	//generate bill as per how many days
	private static void generateBillingSummary() {
	    if (patients.isEmpty()) {
	        System.out.println("\nNo patients in the system.");
	        return;
	    }
	    
	    System.out.println("\nBilling Summary:");
	    System.out.println("--------------------------------------------------");
	    System.out.printf("%-15s %-20s %-10s %-15s %-10s%n", 
	                     "Patient ID", "Name", "Type", "Days Stayed", "Amount Due");
	    System.out.println("--------------------------------------------------");
	    
	    patients.forEach(patient -> {
	        double amountDue = patient.calculateBill();
	        
	        System.out.printf("%-15s %-20s %-10s %-15d $%-10.2f%n",
	            patient.getPatientId(),
	            patient.getPatientName(),
	            patient.getPatientType(),
	            patient.getDaysStayed(),
	            amountDue);
	    });
	}


}
