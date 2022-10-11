package com.first;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 1 ; i<= 10; i++) {
			System.out.println(i);
			if(i==6) {
			break;
			}
		}
		for (int i = 1 ; i<= 10; i++) {
			if(i==6) {
			continue;
			}
			System.out.println(i);

		}

	}
	

}
