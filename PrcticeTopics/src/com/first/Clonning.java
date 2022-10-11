package com.first;
import java.lang.Cloneable;

public class Clonning {
	
	
	public static void main(String[] args) {
		try { 
        clone c1 = new clone(1,"das");
        System.out.println(c1.id + c1.name);
        clone c2 = (clone)c1.clone();
        System.out.println(c2.id + c2.name);
    
       
        
	}catch ( CloneNotSupportedException e ) {
		System.out.println(e);
	}
	}

}

class clone implements Cloneable {
	int id;
	String name;

	clone(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public  Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

}
