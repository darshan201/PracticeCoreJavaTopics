package com.app.oops1;

public class Patient {
	
  final long l = 15;
	void details(int a, String s) // method overloading
	{
		System.out.println("patient number : "+a + " ,patient name :" + s);
	}

	void details(int a, String s,long l) {
		System.out.println(a + "," + s + "," + l);
	}
}

class Patient1 extends Patient {
	void details(int a, String s) // methodoverridding
	{
		System.out.println("new patient number : " + a + ", new patient name :" + s + ","+l);
	}
}
