package accountHolderInformation;


import java.util.Scanner;

public class AccountHolderData {

	private String accountHolderName;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	private int accountnumber;

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public static double accountbalance = 10000;

	public double getAccountbalance() {
		return accountbalance;
	}

	public static Scanner Inputuser = new Scanner(System.in);

	public void username() {
		System.out.println("UserName : ");
		try {
			
			String Name = Inputuser.nextLine();
			setAccountHolderName(Name);
			

		} catch (NumberFormatException ElementException) {
			System.out.println("please enter valid Name in String ");
			
		}
		System.out.println(" WELCOME : " + getAccountHolderName().toUpperCase());

	}

	public void useraccountnumber() {
		try {
			System.out.println("Account NUmber : ");
			int number = Integer.parseInt(Inputuser.next());
			setAccountnumber(number);
			System.out.println("Account number is : " + getAccountnumber());
		} catch (NumberFormatException ElementException) {
			System.out.println("please enter valid number in integer");
			useraccountnumber();
		}
		
		

	}

	public void useraccountbalance() {

		System.out.println(getAccountbalance());

	}

}
