package com.app.Oops2;

import java.util.Scanner;

public class Rooms extends Information {
	
	public void A1() {
		int a[] = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people require room??" + '\n' + "maximum 4 people allowed");
		System.out.println("please enter here :: ");
		int c = sc.nextInt();

		try {    // try and catch method //Exception handling 

			int b = a[c];

			for (int i = 0; i <= b; i++) // for loop 
				{
				if (i == 1) {
					System.out.println(" Room number 1 and rent is 500$ per month for one person" + '\n');
				} else if (i == 2) {
					System.out.println(" Room number 2 and rent is 600$ per month for one person" + '\n');
				} else if (i == 3) {
					System.out.println(" Room number 3 and rent is 700$ per month for two person" + '\n');
				} else if (i == 4) {
					System.out.println(" Room number 4 and rent is 800$ per month for two person" + '\n');
				} else if (i == 5) {
					System.out.println(" Room number 5 and rent is 900$ per month for two person" + '\n');
				}

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" plese enter valid  NUMBER of people" + '\n');
		}

		System.out.println("you can choose any Room from above list " + '\n' + " Thank you " + '\n'
				+ " please contact 226--- 8989");
	}
	public void B1() {
		System.out.println('\n'+"THANK YOU FOR CHOOSING OUR SERVICE "); // abstract method body

	}
}
