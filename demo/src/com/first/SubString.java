package com.first;

import java.util.Arrays;

public class SubString {

	public static void main(String[] args) {
		String s1 = "darshankumar patel";
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(7, 12));
		String[] sentence = s1.split("\\.");
		System.out.println(Arrays.toString(sentence));
		
		
		
	}

}
