package com.acts;

import java.time.LocalDate;

import com.acts.patientEnum.PatientType;

public class EmergencyPatient extends Patient {
    private static final double EMERGENCY_FEE = 1000.0;
    private String emergencyType;

    public EmergencyPatient(String patientName, int patientAge, LocalDate admissionDate, String department, String emergencyType) {
        super(patientName, patientAge, admissionDate, department, PatientType.EMERGENCY);
        this.emergencyType = emergencyType;
    }

    @Override
    public double calculateBill() {
        return EMERGENCY_BASE_FEE;
    }
    @Override
    public String getPatientSpecificDetails() {
        return String.format("Emergency Type: %s, Emergency Fee: ₹%.2f", emergencyType, EMERGENCY_FEE);
    }
    
    public static final BillCalculator BILL_CALCULATOR = patient -> {
        long days = patient.getDaysStayed();
        return EMERGENCY_FEE + (days * 200.0);  
    };
}
