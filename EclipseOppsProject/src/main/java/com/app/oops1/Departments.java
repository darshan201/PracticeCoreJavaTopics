package com.app.oops1;

import java.util.Scanner;

public class Departments {
	public void building() {
		Scanner s = new Scanner(System.in);

		char number = s.next().charAt(0);

		switch (number) {
		case 'A':
			System.out.println("[emergency department]");
			break;
		case 'B':
			System.out.println("[operation theatre]");
			break;
		case 'C':
			System.out.println("[walking clinics ]");
			break;
		default:
			System.out.println("**plese go to emergency department or call 911 or child problem  ");
		}
		System.out.println("");
		while (number == 'D') // while loop
		{
			System.out.println("[THIS IS CHILD CARE CENTER] ");
			number++;

		}
	}

	public void expence() {
		System.out.println("");
		System.out.println("For total expences enter how many days you stay in hospital");
		Scanner i = new Scanner(System.in);
		System.out.println("enter days : ");
		int a = i.nextInt();

		int k = a * 100;// local variable
		System.out.println(" ");
		System.out.println("Total expences : " + k + "$");
	}

	void Department() // constructor
	{
		System.out.println("plese enter department (A,B,C,D)  : ");
	}
}
