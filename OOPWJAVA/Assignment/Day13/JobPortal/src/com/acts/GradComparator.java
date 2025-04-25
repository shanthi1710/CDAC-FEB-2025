package com.acts;

import java.util.Comparator;

public class GradComparator implements Comparator<JobSeeker> {

	@Override
	public int compare(JobSeeker o1, JobSeeker o2) {
		return o1.getGraduationDate().compareTo(o2.getGraduationDate());
	}

}
