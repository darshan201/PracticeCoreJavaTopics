package com.first;

public class FactorialWithRecursion {

	static int factorial(int number) {

		if ((number == 1)){
			return number;
		}
		else {
			number = (number * factorial(number - 1));  // recursion means use same method inside same method

		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(factorial(3));

	}

}
