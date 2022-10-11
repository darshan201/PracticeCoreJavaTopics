package com.first;

public class Constroctor {
	int id ;
	int jk;

	
	  Constroctor(){
	  
	  }
	 
	 Constroctor(int i ,int j){
		 id = i;
		 jk = j;
	 }
	 void display() {System.out.println(id + " " + jk );}

	public static void main(String[] args) {
		Constroctor c1= new Constroctor();
		Constroctor c2 = new Constroctor(8, 9);
		c1.display();
		c2.display();

	}

}
