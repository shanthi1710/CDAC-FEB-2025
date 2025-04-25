package com.acts;

import java.time.LocalDate;

public class JobSeeker implements Comparable<JobSeeker>{
	private Integer registrationId;
	private String name;
	private String email;
	private String password; 
	private LocalDate dateOfBirth; 
	private String aadharId;
	private String phoneNo;  
	private LocalDate graduationDate; 
	private DegreeEnum degree;
	private static Integer genReg = 100;
	
	public JobSeeker(String name, String email, String password, LocalDate dateOfBirth,
			String aadharId, String phoneNo, LocalDate graduationDate) {
		super();
		this.registrationId = genReg++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.aadharId = aadharId;
		this.phoneNo = phoneNo;
		this.graduationDate = graduationDate;
	}

	@Override
	public String toString() {
		return "JobSeeker [registrationId=" + registrationId + ", name=" + name + ", email=" + email + ", password="
				+ password + "\n"
						+ "dateOfBirth=" + dateOfBirth + ", aadharId=" + aadharId + ", \n"
								+ "phoneNo=" + phoneNo
				+ ", graduationDate=" + graduationDate + ", degree=" + degree + "]";
	}

	public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}

	public DegreeEnum getDegree() {
		return degree;
	}

	public void setDegree(DegreeEnum degree) {
		this.degree = degree;
	}
	
	@Override 
	public int compareTo(JobSeeker j) {
		return this.email.compareTo(j.email);
	}
	
	
	
	
	
}
