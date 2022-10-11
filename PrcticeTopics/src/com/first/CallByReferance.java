package com.first;

public class CallByReferance {

	int i = 15;

//	int display(int i) {     // if we pass same value as arguments so it will NOT change the value 
//		return i = i + 100;
//	}

	int show (CallByReferance c) { // object passed as a arguments so it will change instance value 
		return c.i = c.i + 120;
		
	}
	public static void main(String[] args) {
		CallByReferance c= new CallByReferance();
		System.out.println(c.i);
		//System.out.println(c.display(20));
		//c.display(30);
		System.out.println(c.i);
		c.show(c);
		System.out.println(c.i);
		
	}

}
