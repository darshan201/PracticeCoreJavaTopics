package com.first;

public class Practice extends Practice3 {

	public static void main(String[] args) {

		Practice3 p1 = new Practice();

		System.out.println(p1 instanceof Practice);
		p1.a();
	}
}
class Practice2 {
	public void a() {
		System.out.println("hello2");
	}
}
class Practice3 {
	public void a() {
		System.out.println("hello1");
	}
}