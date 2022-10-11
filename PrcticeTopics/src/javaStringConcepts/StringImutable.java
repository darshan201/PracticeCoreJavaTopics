package javaStringConcepts;

public class StringImutable {

	public static void main(String[] args) {
		String name =  "darshankumar ";
		name.concat("patel");      //  only concat method used and String not changed bcz not changed in SCPool
		System.out.println(name);
		name = name.concat("patel");
		System.out.println(name);

		String fullname = name.concat(" patel"); // create a new object (fullname) and store new value in 
		System.out.println(fullname); 

	}

}
