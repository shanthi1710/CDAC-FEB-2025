package com.acts;

import java.time.LocalDate;

import com.acts.patientEnum.PatientType;

public class OutPatient extends Patient {
    private static final double CONSULTATION_FEE = 200.0;
    private int numberOfVisits;

    public OutPatient(String patientName, int patientAge,LocalDate admissionDate, String department, int numberOfVisits) {
        super(  patientName, patientAge, admissionDate, department, PatientType.OUT_PATIENT);
        this.numberOfVisits = numberOfVisits;
    }
    @Override
    public double calculateBill() {
        return numberOfVisits * OUT_PATIENT_VISIT_RATE;
    }
    @Override
    public String getPatientSpecificDetails() {
        return String.format("Number of Visits: %d, Consultation Fee: ₹%.2f", numberOfVisits, CONSULTATION_FEE);
    }

    
    public static final BillCalculator BILL_CALCULATOR = patient -> {
        OutPatient outPatient = (OutPatient) patient;
        return outPatient.numberOfVisits * CONSULTATION_FEE;
    };
}

