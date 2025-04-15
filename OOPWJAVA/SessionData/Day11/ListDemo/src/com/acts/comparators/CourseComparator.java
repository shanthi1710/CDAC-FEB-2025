package com.acts.comparators;

import java.util.Comparator;

import com.acts.Student;

public class CourseComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCourse().compareTo(o2.getCourse());
	}

}
