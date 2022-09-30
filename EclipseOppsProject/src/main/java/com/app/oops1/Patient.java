package com.app.oops1;

public class Patient {

	final long l = 15;

	String details(int a, String s) // method overloading
	{
		return "patient number : " + a + " ,patient name :" + s;
	}

	String details(int a, String s, long l) {
		return a + "," + s + "," + l;
	}
}


