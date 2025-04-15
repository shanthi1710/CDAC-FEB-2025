package com.acts.comparators;

import java.util.Comparator;

import com.acts.Student;

public class DobComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getDob().compareTo(o2.getDob());
	}

}

