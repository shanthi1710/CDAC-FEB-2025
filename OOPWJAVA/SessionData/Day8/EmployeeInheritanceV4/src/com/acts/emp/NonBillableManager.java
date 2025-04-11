package com.acts.emp;

import java.util.Date;

public class NonBillableManager extends Employee{
	private String team;

	public NonBillableManager() {
		super();
	}
	
	public NonBillableManager(String name, String title, Date doj, String team) {
		super(name, title, doj);
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return super.toString() + "NonBillableManager [team=" + team + "]";
	}

}
