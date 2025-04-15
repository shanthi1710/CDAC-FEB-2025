package com.acts.comparators;

import java.util.Comparator;

import com.acts.Student;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
