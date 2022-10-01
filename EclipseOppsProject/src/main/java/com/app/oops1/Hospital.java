package com.app.oops1;

public class Hospital {

	public static void main(String[] args) {

		Departments d = new Departments();
		
		d.building();
		d.expence();
		Patient p = new ChildPatient();// upcasting
		p.details(1, "darshan");
		p.details(2, "juli",16);
	}

}
