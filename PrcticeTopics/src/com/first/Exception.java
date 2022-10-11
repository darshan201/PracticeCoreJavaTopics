package com.first;

public class Exception {

	public static void main(String[] args) {
		
		try {
		 throw new UserDefineExcaption("this is userdefined exception  ") ;
		}
		catch(UserDefineExcaption e) {
			System.out.println("inside catch exception  " + e);
		}
		System.out.println("this is code for output");
	}

}
