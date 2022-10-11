package com.first;



class Wrap{
	int i = 1;
	public String toString() {
		
		return Integer.toString(i);// wrraping to String as Object 
		
	}
	
	public String simple() {            
		return int.class.toString();
		
	}
}
public class Wrraper {

	public static void main(String[] args) {
		Wrap w = new Wrap();
		System.out.println(w.simple());
		System.out.println(w.toString());
		

	}

}
