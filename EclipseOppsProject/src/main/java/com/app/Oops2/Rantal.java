package com.app.Oops2;

public class Rantal extends PasscodeKey{

	public static void main(String[] args) {
		Rooms r1 = new Rooms();
		r1.A1();
		r1.B1();
		PasscodeKey p1 = new PasscodeKey();
		System.out.println( "entry key is : " + p1.getName()); // getter method 
		
	}

}
