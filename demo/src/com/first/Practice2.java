package com.first;

class Practice extends Practice3 {

	 public static void a1(Practice3 p) {
		if (p instanceof Practice3) {
			Practice p2 = (Practice) p;
			System.out.println("downcasting works");
		}

	}
}

public class Practice2 {

	public static void main(String[] args) {
		Practice p1 = new Practice();
		p1.a1(p1);;

	}
}

class Practice3 {
	public void a() {
		System.out.println("hello1");
	}
}