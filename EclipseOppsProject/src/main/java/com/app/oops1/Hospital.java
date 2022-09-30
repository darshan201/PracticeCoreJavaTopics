package com.app.oops1;

public class Hospital {

	public static void main(String[] args) {

		Departments d = new Departments();
		
		d.building();
		d.expence();
		Patient P = new ChildPatient();// upcasting
		P.details(1, "darshan");
		P.details(2, "juli",16);
	}

}
