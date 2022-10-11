package javaStringConcepts;

public class Compare {

	public static void main(String[] args) {
	String s1 = "darshan";
	String s2 = "darshan";
	String s3 = new String("darshan");
	String s4 = "patel";
	// equal() ,equalIgnoreCase()  , == , compareTo()
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s2.equals(s4));
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1.compareTo(s4));
	System.out.println(s2.compareTo(s3));
	System.out.println(s4.compareTo(s1));
	}

}
