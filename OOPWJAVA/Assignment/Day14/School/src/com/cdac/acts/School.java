package com.cdac.acts;

import java.util.Objects;

public class School {
    private int rollNo;
    private String name;
    private String standard;
    private String division;

    public School() {
        System.out.println("Default constructor");
    }

    public School(int rollNo, String name, String standard, String division) {
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
        this.division = division;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getStandard() {
        return standard;
    }

    public String getDivision() {
        return division;
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + 
               ", Standard: " + standard + ", Division: " + division + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(division, name, rollNo, standard);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        School other = (School) obj;
        return Objects.equals(division, other.division) && 
               Objects.equals(name, other.name) && 
               rollNo == other.rollNo &&
               Objects.equals(standard, other.standard);
    }
}