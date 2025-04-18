package com.cdac.acts.key;
import java.util.Objects;

public class StudentKey {
	private String standard;
	private String division;
	private int rollNo;

	 

	public StudentKey(String standard, String division, int rollNo) {
		this.standard = standard;
		this.division = division;
		this.rollNo = rollNo;
	}

	public String getStandard() {
		 return standard;
	 }

	 public String getDivision() {
		 return division;
	 }

	 public int getRollNo() {
		 return rollNo;
	 }
	 
	 @Override
	public int hashCode() {
		return Objects.hash(division, rollNo, standard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentKey other = (StudentKey) obj;
		return Objects.equals(division, other.division) && rollNo == other.rollNo
				&& Objects.equals(standard, other.standard);
	}

	@Override
	 public String toString() {
		return "StudentKey [standard=" + standard + ", division=" + division + ", rollNo=" + rollNo + "]";
	 }
	    
}
