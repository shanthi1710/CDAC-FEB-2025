package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
	
	public static final String EMPTY_STRING = "";
	
	private Integer rollNo;
	private String name;
	private Course course;
	//New feature java 8 (yyyy-MM-dd)
	private LocalDate dob;
	
	public Student() {
		this.rollNo = 0;
		this.name = EMPTY_STRING;
		this.dob = null;
		this.course = null;
	}
	
	public Student(int rollNo, String name, LocalDate dob, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", dob=" + dob  + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo.compareTo(o.rollNo); // ASC
		//return o.rollNo.compareTo(this.rollNo); // DSC
	}


//	@Override
//	public int hashCode() {
//		int result = 1;
//		result = 31 * result + (null == rollNo ? 0 : rollNo.hashCode());
//		result = 31 * result + (null == name ? 0 : name.hashCode());
//		result = 31 * result + (null == course ? 0 : course.hashCode());
//		result = 31 * result + (null == dob ? 0 : dob.hashCode());
//		System.out.println("hashCode");
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equals");
//		//4 checks to be done
//		//1. null check
//		//s1.equals(null)
//		if( null == obj) {
//			return false;
//		}
//			
//		//2. Type or class check
//		//s1.equals("Test");
//		if(this.getClass() != obj.getClass()) {
//			return false;
//		}
//		
//		//3. Self check
//		//s1.equals(s1);
//		if( this == obj) {
//			return true;
//		}
//		//4. content check
//		//s1.equals(s2)
//		Student student = ( Student) obj;
//		if(this.rollNo.equals(student.getRollNo()) 
//				&& this.name.equals(student.getName())
//				&& this.course.equals(student.getCourse())
//				&& this.dob.equals(student.getDob())
//				) {
//			return true;
//		}
//		
//		return false;
//	}
	
	
	
	
	@Override
	public int hashCode() {
		 int readyHash = Objects.hash(course, dob, name, rollNo);
		 System.out.println("Ready hash "+ name + "" + readyHash);
        return readyHash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && Objects.equals(dob, other.dob) && Objects.equals(name, other.name)
				&& Objects.equals(rollNo, other.rollNo);
	}

	
	
	
}
