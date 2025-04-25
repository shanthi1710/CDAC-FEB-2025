package com.acts;

import java.time.LocalDate;

import com.acts.patientEnum.PatientType;

public class InPatient extends Patient {
	
    private static final double DAILY_RATE = 500.0;
    
    private String roomNumber;

    public InPatient(String patientName, int patientAge, LocalDate admissionDate, String department, String roomNumber) {
        
    	super(patientName, patientAge, admissionDate, department, PatientType.IN_PATIENT);
        this.roomNumber = roomNumber;
    }
    @Override
    public double calculateBill() {
        return getDaysStayed() * IN_PATIENT_DAILY_RATE;
    }
    @Override
    public String getPatientSpecificDetails() {
        return String.format("Room Number: %s, Daily Rate: ₹%.2f", roomNumber, DAILY_RATE);
    }

   
    public static final BillCalculator BILL_CALCULATOR = patient -> {
        long days = patient.getDaysStayed();
        return days * DAILY_RATE;
    };
}