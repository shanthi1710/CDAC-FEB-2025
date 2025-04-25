package com.acts;

import java.time.LocalDate;
import com.acts.patientEnum.PatientType;

 
@FunctionalInterface
interface BillCalculator {
    double calculateBill(Patient patient);
}

 
public abstract class Patient implements Comparable<Patient> {
	
	 protected static final double IN_PATIENT_DAILY_RATE = 500.0;
	    protected static final double OUT_PATIENT_VISIT_RATE = 200.0;
	    protected static final double EMERGENCY_BASE_FEE = 1000.0;
	    
    private int patientId;
    private String patientName;
    private int patientAge;
    private LocalDate admissionDate;
    private String department;
    private PatientType patientType;
    private boolean isDischarged;
    private static int genID=1;
    
    public Patient( ) {
    	this.patientId = genID++;
        System.out.println("Default consructor....");
    }
    public Patient(String patientName, int patientAge, LocalDate admissionDate, String department, PatientType patientType) {
    	this.patientId = genID++;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.admissionDate = admissionDate;
        this.department = department;
        this.patientType = patientType;
        this.isDischarged = false;
    }

  
    public int getPatientId() { 
    	return patientId; 
    }
    
    public String getPatientName() { 
    	return patientName; 
    }
    public int getPatientAge() { 
    	return patientAge; 
    }
    public LocalDate getAdmissionDate() {
    	return admissionDate; 
    }

    public String getDepartment() { 
    	return department; 
    }
    public PatientType getPatientType() {
    	return patientType; 
    }
    
    public boolean isDischarged() { 
    	return isDischarged; 
    }

    
    public void discharge() {
        this.isDischarged = true;
    }

   
    public long getDaysStayed() {
        
        LocalDate currentDate = LocalDate.now();
        
        long admissionEpochDay = admissionDate.toEpochDay();
        long currentEpochDay = currentDate.toEpochDay();
        
        return currentEpochDay - admissionEpochDay;
    }

    
    public abstract String getPatientSpecificDetails();

     
    @Override
    public int compareTo(Patient other) {
        return this.admissionDate.compareTo(other.admissionDate);
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %s, Name: %s, Age: %d, Admission Date: %s, Department: %s, Type: %s, Status: %s%n%s",
            patientId, patientName, patientAge, admissionDate, department, patientType,
            isDischarged ? "Discharged" : "Admitted", getPatientSpecificDetails());
    }
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
}

